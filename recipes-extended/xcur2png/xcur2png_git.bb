DESCRIPTION = "xcur2png is a program which let you take PNG image from X cursor, and generate config-file which is reusable by xcursorgen."
HOMEPAGE = "https://github.com/eworm-de/xcur2png"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "libxcursor libpng"

S = "${WORKDIR}/git"
SRCREV = "f582d648f37a9ed2de0c8650947487af8a54d3ad"
PV = "0.7.1"

SRC_URI = "git://github.com/eworm-de/xcur2png.git;protocol=https;branch=master"

inherit autotools pkgconfig

