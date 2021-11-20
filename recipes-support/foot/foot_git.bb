SUMMARY = "A fast, lightweight and minimalistic Wayland terminal emulator."
HOMEPAGE = "https://codeberg.org/dnkl/foot"
BUGTRACKER = "https://codeberg.org/dnkl/foot/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

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
PV = "1.10.0"
SRCREV = "31966f5494ed82268c414b04b63b20e88d4fff16"

PACKAGECONFIG[grapheme-clustering] = "-Dgrapheme-clustering=enabled,-Dgrapheme-clustering=disabled,utf8proc"
PACKAGECONFIG[docs] = "-Ddocs=enabled,-Ddocs=disabled,scdoc-native"
PACKAGECONFIG[themes] = "-Dthemes=true,-Dthemes=false"

PACKAGECONFIG ?= " \
	grapheme-clustering \
	themes \
"

EXTRA_OEMESON += "--buildtype=release -Dterminfo=disabled"


# Hack! tic from ncurses-native fails to generate the terminfo files. Use hosts tic instead. 
# ncurses-bin needs to be installed.
# TODO: ncurses 6.3 has included foot terminfo files. Remove Hack for builds newer than honister.
do_install:append() {
	sed -i "s|@default_terminfo@|foot|" ${S}/foot.info
	sed -i "s|@default_terminfo-direct@|foot-direct|" ${S}/foot.info
	install -d ${D}${datadir}/terminfo
	/usr/bin/tic -o ${D}${datadir}/terminfo -x -e foot,foot-direct ${S}/foot.info
}

inherit meson pkgconfig

FILES:${PN} = " \
	${bindir} \
	${datadir} \
"

BBCLASSEXTEND = ""

