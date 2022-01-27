
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
RDEPENDS:${PN} ?= "swaybg python3 python-i3ipc"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
"

SRC_URI = " \
	git://github.com/swaywm/sway.git;protocol=https;branch=v1.7 \
"

SRCREV = "5543acff06981639086bc9a0fc9b608796a23e84"
PV = "1.7"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG[basu] = "-Dsd-bus-provider=basu,,basu"
PACKAGECONFIG[default-wallpaper] = "-Ddefault-wallpaper=true,-Ddefault-wallpaper=false"
PACKAGECONFIG[elogind] = "-Dsd-bus-provider=libelogind,,elogind"
PACKAGECONFIG[gdk-pixbuf] = "-Dgdk-pixbuf=enabled,-Dgdk-pixbuf=disabled,gdk-pixbuf"
PACKAGECONFIG[swaybar] = "-Dswaybar=true,-Dswaybar=false"
PACKAGECONFIG[swaynag] = "-Dswaynag=true,-Dswaynag=false"
PACKAGECONFIG[systemd] = "-Dsd-bus-provider=libsystemd,,systemd"
PACKAGECONFIG[tray] = "-Dtray=enabled,-Dtray=disabled"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	default-wallpaper \
	gdk-pixbuf \
"

# Reproducibility issue. Fix me!
CFLAGS:append = " -Wno-error=date-time"
EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	install -m 755 ${S}/contrib/grimshot ${D}${bindir}
	install -m 755 ${S}/contrib/autoname-workspaces.py ${D}${bindir}
	install -m 755 ${S}/contrib/inactive-windows-transparency.py ${D}${bindir}
}

FILES:${PN}:append = " \
	${datadir} \
"

BBCLASSEXTEND = ""

