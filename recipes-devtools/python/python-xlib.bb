SUMMARY = "The Python X Library."
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc178bcd425090939a8b634d1d6a9594"

SRC_URI = " \
	git://github.com/python-xlib/python-xlib.git;protocol=https \
"

DEPENDS = " \
	python3-wheel-native \
	python3-pip-native \
"

RDEPENDS:${PN} = " \
	python3 \	
	python3-six \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.31"
SRCREV = "${PV}"

