SUMMARY = "A window switcher, Application launcher and dmenu replacement"
HOMEPAGE = "https://github.com/davatorium/rofi"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://COPYING;md5=782be4e4ace584538170389380b2d61e"

DEPENDS = " \
	bison-native \
	glib-2.0 \
	cairo \
	pango \
	libxkbcommon \
	gdk-pixbuf \
	xcb-util \
	xcb-util-wm \
	xcb-util-cursor \
	startup-notification \
"

SRC_URI = "gitsm://github.com/davatorium/rofi.git;protocol=https;branch=next"

S = "${WORKDIR}/git"
PV = "1.7.5"
SRCREV = "9963df114bc2de0d452a4751d8b250118ca6b20a"

inherit meson pkgconfig

FILES:${PN} += "${datadir}"
