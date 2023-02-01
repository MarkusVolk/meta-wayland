
SUMMARY = "Labwc stands for Lab Wayland Compositor"
HOMEPAGE = "https://github.com/labwc/labwc"
SECTION = "graphics"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libxml2 \
	glib-2.0 \
	cairo \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
	libdrm \
	libxkbcommon \
	libinput \
	wlroots-0.16 \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	grim \
	slurp \
	wl-clipboard \
	labwc-tweaks \
	swaybg \
"

SRC_URI = "git://github.com/labwc/labwc.git;protocol=https;branch=master"

SRCREV = "a3fff9f87b0dd05f2e2c8036c4c231f8ec40ed98"
PV = "0.6.1"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check gettext

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'xwayland', d)}"

PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"

FILES:${PN} += "${datadir}"

