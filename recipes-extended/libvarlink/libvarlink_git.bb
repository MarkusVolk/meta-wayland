SUMMARY = "varlink is an interface description format and protocol accessible to both humans and machines."
HOMEPAGE = "https://varlink.org"
LICENSE = "Apache-2.0 & BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

SRC_URI = " \
	git://github.com/varlink/libvarlink.git;protocol=https;branch=master \
"

inherit meson

S = "${WORKDIR}/git"
PV = "23"
SRCREV = "d377218338b706ce3ff517a80fc0f1b1cfd8fe80"

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

