SUMMARY = "A simple library for font loading and glyph rasterization using FontConfig, FreeType and pixman."
HOMEPAGE = "https://codeberg.org/dnkl/fcft"
BUGTRACKER = "https://codeberg.org/dnkl/fcft/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

DEPENDS = " \
	fontconfig \
	freetype \
	harfbuzz \
	pixman \
	tllist \
	scdoc-native \
"

SRC_URI = " \
	git://codeberg.org/dnkl/fcft.git;protocol=https \
"

S = "${WORKDIR}/git"
PV = "2.4.0"
SRCREV = "${PV}"

inherit meson pkgconfig

BBCLASSEXTEND = ""

