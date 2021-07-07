SUMMARY = "Lightweight notification daemon for wlroots-based Wayland compositors."
HOMEPAGE = "https://codeberg.org/dnkl/fnott"
BUGTRACKER = "https://codeberg.org/dnkl/fnott/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fnott.git;protocol=https;branch=releases/1.1 \
"

DEPENDS = " \
	dbus \
	fcft \
	libpng \
	pixman \
	scdoc-native \
	tllist \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS_${PN} = " \
	fontconfig \
	freetype \
	wlroots \
"

inherit meson pkgconfig features_check

S = "${WORKDIR}/git"
PV = "1.1.0"
SRCREV = "${PV}"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES_${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""
