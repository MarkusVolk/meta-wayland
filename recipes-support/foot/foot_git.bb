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
	scdoc-native \
"

RRECOMMENDS_${PN} = "xdg-utils"

SRC_URI = " \
	git://codeberg.org/dnkl/foot.git;protocol=https \
"

S = "${WORKDIR}/git"
PV = "1.8.0"
SRCREV = "${PV}"

PACKAGECONFIG[terminfo] = "-Dterminfo=enabled,-Dterminfo=disabled,ncurses-native"
PACKAGECONFIG[grapheme-clustering] = "-Dgrapheme-clustering=enabled,-Dgrapheme-clustering=disabled,utf8proc"

PACKAGECONFIG ?= " \
	grapheme-clustering \
"

inherit meson pkgconfig features_check

FILES_${PN} = " \
	${bindir} \
	${datadir} \
"

BBCLASSEXTEND = ""

