SUMMARY = "A small, clean C library that provides Unicode normalization, case-folding, and other operations for data in the UTF-8 encoding."
HOMEPAGE = "https://github.com/JuliaStrings/utf8proc"
BUGTRACKER = "https://github.com/JuliaStrings/utf8proc/issues"
SECTION = "base/shell"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=97fe1c51de5d175e7564531e7955381d"

SRC_URI = " \
	git://github.com/JuliaStrings/utf8proc.git;protocol=https \
"

S = "${WORKDIR}/git"
PV = "2.6.1"
SRCREV = "v${PV}"

EXTRA_OEMAKE = "prefix=${prefix}"

inherit autotools-brokensep pkgconfig

BBCLASSEXTEND = ""

