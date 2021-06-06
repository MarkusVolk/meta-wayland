SUMMARY = "A Wayland WM"
HOMEPAGE = "https://github.com/swaywm/sway"
BUGTRACKER = "https://github.com/swaywm/sway/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=dfc67e5b1fa10ebb4b70eb0c0ca67bea"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	wlroots \
	cairo \
	libevdev \
	json-c \
	libdrm \
	libinput \
	libxkbcommon \
	pango \
	pcre \
	pixman \
	virtual/libgles2 \
	wayland \
	wayland-native \
	wayland-protocols \
"
# sways default config makes use of it
RDEPENDS_${PN} ?= "swaybg"

RRECOMMENDS_${PN} ?= " \
	foot \
"

SRC_URI = " \
	git://github.com/swaywm/sway.git;protocol=https \
"

SRCREV = "7c74f01f0ae9d5b3f92d3e6fc64cb9abe95b4c52"
PV = "1.6+${SRCREV}"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG[default-wallpaper] = "-Ddefault-wallpaper=true,-Ddefault-wallpaper=false"
PACKAGECONFIG[gdk-pixbuf] = "-Dgdk-pixbuf=enabled,-Dgdk-pixbuf=disabled,gdk-pixbuf"
PACKAGECONFIG[systemd] = "-Dsd-bus-provider=libsystemd,,systemd"
PACKAGECONFIG[sysvinit] = "-Dsd-bus-provider=libelogind,,eudev elogind"
PACKAGECONFIG[tray] = "-Dtray=enabled,-Dtray=disabled"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
	default-wallpaper \
	gdk-pixbuf \
"

EXTRA_OEMESON += "--buildtype release"

FILES_${PN}_append = " \
	${datadir} \
"

BBCLASSEXTEND = ""

