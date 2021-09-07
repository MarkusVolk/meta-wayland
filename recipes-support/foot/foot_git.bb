SUMMARY = "A fast, lightweight and minimalistic Wayland terminal emulator."
HOMEPAGE = "https://codeberg.org/dnkl/foot"
BUGTRACKER = "https://codeberg.org/dnkl/foot/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
	fcft \
	fontconfig \
	freetype \
	libxkbcommon \
	pixman \
	wayland \
	wayland-native \
"

RRECOMMENDS:${PN} = "xdg-utils"

SRC_URI = " \
	git://codeberg.org/dnkl/foot.git;protocol=https \
"

S = "${WORKDIR}/git"
PV = "1.9.0"
SRCREV = "${PV}"

PACKAGECONFIG[terminfo] = "-Dterminfo=enabled,-Dterminfo=disabled,ncurses-native"
PACKAGECONFIG[grapheme-clustering] = "-Dgrapheme-clustering=enabled,-Dgrapheme-clustering=disabled,utf8proc"
PACKAGECONFIG[docs] = "-Ddocs=enabled,-Ddocs=disabled,scdoc-native"

PACKAGECONFIG ?= " \
	grapheme-clustering \
"

# Hack! tic from ncurses-native fails to generate the terminfo files. Use hosts tic instead. 
# ncurses-bin needs to be installed.
do_install:append() {
	install -d ${D}${datadir}/foot/terminfo
	/usr/bin/tic -o ${D}${datadir}/foot/terminfo -x -e foot,foot-direct ${S}/foot.info
}

inherit meson pkgconfig features_check

FILES:${PN} = " \
	${bindir} \
	${datadir} \
"

BBCLASSEXTEND = ""

