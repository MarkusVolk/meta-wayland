
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
	pcre2 \
	pixman \
	virtual/libgles2 \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = "swaybg python3 python-i3ipc"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
	sway-contrib \
"

SRC_URI = "git://github.com/swaywm/sway.git;protocol=https;branch=master"

SRCREV = "3d5ae9813d390ea747462fc0026ee43b7c77d0f2"
PV = "1.9-dev"
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
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland', d)} \
	default-wallpaper \
	gdk-pixbuf \
"

EXTRA_OEMESON += "--buildtype release"

FILES:${PN}:append = " \
	${datadir} \
"

BBCLASSEXTEND = ""
