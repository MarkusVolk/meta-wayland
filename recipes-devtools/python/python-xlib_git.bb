SUMMARY = "The Python X Library."
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc178bcd425090939a8b634d1d6a9594"

SRC_URI = " \
	git://github.com/python-xlib/python-xlib.git;protocol=https;branch=master \
"

DEPENDS = " \
	python3-wheel-native \
	python3-setuptools-scm-native \
"


RDEPENDS:${PN} = " \
	python3 \	
	python3-six \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.31"
SRCREV = "a734526ed33fe446396e32649e8895dde679f52c"

