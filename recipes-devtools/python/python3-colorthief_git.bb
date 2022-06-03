SUMMARY = "This tool creates a palette of up to 36 colours out of a jpg or png image."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6cb8301ba6bf08f7e489fbd9061cb78"

SRC_URI = " \
	git://github.com/fengsp/color-thief-py.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "python3-pillow"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.2.1"
SRCREV = "3e96a52abfa34323c798a691b2970c6df3059fda"

