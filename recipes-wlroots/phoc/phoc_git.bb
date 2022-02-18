
SUMMARY = "wlroots based Phone compositor as used on the Librem5."
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/phoc"
SECTION = "graphics"
LICENSE = "GPL-3.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	glib-2.0 \
	gnome-desktop \
	libinput \
	libxkbcommon \
	pixman \
	seatd \
	systemd \
	wayland \
	wayland-native \
	wayland-protocols \
"
#needed to build wlroots as a subproject
DEPENDS += " \
	ffmpeg \
	git-native \
	libdrm \
	libcap \
	virtual/libgbm \
	virtual/libgles2 \
	libpng \
	systemd \
"

RDEPENDS:${PN} = "mutter"

SRC_URI = " \
	gitsm://gitlab.gnome.org/World/Phosh/phoc.git;protocol=https;branch=master \
"

SRCREV = "eb62bea7cfb3ca0a4fe417811a868e3ac95b81c5"
PV = "0.12.0"
S = "${WORKDIR}/git"

inherit features_check gsettings meson pkgconfig

EXTRA_OEMESON += "-Dembed-wlroots=enabled"

PACKAGECONFIG[x11] = ",,libxcb xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-wm"

PACKAGECONFIG ?= ""

FILES:${PN} += "${datadir}"

