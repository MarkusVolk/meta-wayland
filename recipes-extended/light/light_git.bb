SUMMARY = "A program to control backlights (and other hardware lights) in GNU/Linux."
HOMEPAGE = "https://github.com/haikarainen/light"
SECTION = "libs"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	git://github.com/haikarainen/light.git \
"

S = "${WORKDIR}/git"
PV = "1.2.2"
SRCREV = "v${PV}"

CFLAGS += " -fcommon"

inherit autotools pkgconfig

