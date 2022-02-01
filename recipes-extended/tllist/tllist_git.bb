SUMMARY = "A C header file only implementation of a typed linked list."
HOMEPAGE = "https://codeberg.org/dnkl/tllist"
BUGTRACKER = "https://codeberg.org/dnkl/tllist/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

SRC_URI = " \
	git://codeberg.org/dnkl/tllist.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "1.0.5"
SRCREV = "f2d806fe3e63a4f8b2da45883764c79696380e51"

inherit meson pkgconfig

BBCLASSEXTEND = ""

