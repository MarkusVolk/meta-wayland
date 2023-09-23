SUMMARY = "Udis86 is a disassembler for the x86 and x86-64 class of instruction set architectures"
HOMEPAGE = "https://github.com/vmt/udis86"
SECTION = "libs"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab079829a9e47b6d81dab3bf5da3f638"

SRC_URI = "git://github.com/canihavesomecoffee/udis86.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "1.7.2"
SRCREV = "5336633af70f3917760a6d441ff02d93477b0c86"

inherit autotools-brokensep  pkgconfig python3native

EXTRA_OECONF += "--enable-shared"

do_configure:prepend() {
	cd ${S} && ./autogen.sh
}


