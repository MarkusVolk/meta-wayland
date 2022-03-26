
SUMMARY = "wlroots based Phone compositor as used on the Librem5."
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/phoc"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	glib-2.0 \
	gnome-desktop \
	libinput \
	libxkbcommon \
	pixman \
	seatd \
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
"

RDEPENDS:${PN} = "mutter"

SRC_URI = " \
	gitsm://gitlab.gnome.org/World/Phosh/phoc.git;protocol=https;branch=master \
"

SRCREV = "cbcfdcb7de84863010827c01b0c47781adb13f74"
PV = "0.13.0"
S = "${WORKDIR}/git"

inherit features_check gsettings meson pkgconfig

PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev elogind"
PACKAGECONFIG[x11] = ",,libxcb xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-wm"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
"

EXTRA_OEMESON += "-Dembed-wlroots=enabled --buildtype=release"

FILES:${PN} += "${datadir}"

