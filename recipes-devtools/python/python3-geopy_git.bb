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
PV = "2.4.1"
SRCREV = "f495974c32a7a7b1eb433e7b8c87166e96375c32"

