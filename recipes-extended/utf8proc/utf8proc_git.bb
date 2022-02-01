SUMMARY = "A small, clean C library that provides Unicode normalization, case-folding, and other operations for data in the UTF-8 encoding."
HOMEPAGE = "https://github.com/JuliaStrings/utf8proc"
BUGTRACKER = "https://github.com/JuliaStrings/utf8proc/issues"
SECTION = "base/shell"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=96d5a3ba306e0f24fb289427af484408"

SRC_URI = " \
	git://github.com/JuliaStrings/utf8proc.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "2.7.0"
SRCREV = "8ca6144c85c165987cb1c5d8395c7314e13d4cd7"

EXTRA_OEMAKE = "prefix=${prefix}"

inherit autotools-brokensep pkgconfig

BBCLASSEXTEND = ""

