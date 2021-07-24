
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
	jq \
	grim \
	slurp \
	wl-clipboard \
"

SRC_URI = " \
	git://github.com/swaywm/sway.git;protocol=https;branch=v1.6 \
"

SRCREV = "${PV}"
PV = "1.6.1"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG[default-wallpaper] = "-Ddefault-wallpaper=true,-Ddefault-wallpaper=false"
PACKAGECONFIG[gdk-pixbuf] = "-Dgdk-pixbuf=enabled,-Dgdk-pixbuf=disabled,gdk-pixbuf"
PACKAGECONFIG[systemd] = "-Dsd-bus-provider=libsystemd,,systemd"
PACKAGECONFIG[elogind] = "-Dsd-bus-provider=libelogind,,elogind"
PACKAGECONFIG[basu] = "-Dsd-bus-provider=basu,,basu"
PACKAGECONFIG[tray] = "-Dtray=enabled,-Dtray=disabled"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	default-wallpaper \
	gdk-pixbuf \
"

EXTRA_OEMESON += "--buildtype release"

do_install_append() {
	install -m 755 ${S}/contrib/grimshot ${D}${bindir}
}

FILES_${PN}_append = " \
	${datadir} \
"

BBCLASSEXTEND = ""

