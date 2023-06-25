
SUMMARY = "wlroots based Phone compositor as used on the Librem5."
HOMEPAGE = "https://gitlab.gnome.org/World/Phosh/phoc"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	glib-2.0 \
	gmobile \
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

SRC_URI = "gitsm://gitlab.gnome.org/World/Phosh/phoc.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "0.28.0"
SRCREV = "ec5e24da547e60ee76df8166e27ea77db5865da5"

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

