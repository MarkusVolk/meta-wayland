SUMMARY = "geopy is a Python client for several popular geocoding web services."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b246754361f75980923b7feebfe71c15"

SRC_URI = " \
	git://github.com/geopy/geopy.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	python3 \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "2.2.0"
SRCREV = "ade9c1b68c83a1fc76d90bc0ff603f6b34dfbbbf"

