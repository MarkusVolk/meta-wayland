SUMMARY = "A program to control backlights (and other hardware lights) in GNU/Linux."
HOMEPAGE = "https://github.com/haikarainen/light"
SECTION = "libs"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	git://github.com/haikarainen/light.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "1.2.2"
SRCREV = "9faa9ae075f9e857aecb3eee8a028fc93108f1c2"

CFLAGS += " -fcommon"

inherit autotools pkgconfig

