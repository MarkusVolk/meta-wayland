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
PV = "1.1.0"
SRCREV = "8dcb0725c73eee9e350f41a921faf0bcd2ab9920"

inherit meson pkgconfig

BBCLASSEXTEND = ""

