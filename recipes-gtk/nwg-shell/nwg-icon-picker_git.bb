SUMMARY = "This program is intended to work as the icon picker for nwg-panel, but it may be used standalone."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2e53cad864b84be468b2fc0b511942ce"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-icon-picker.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	python3 \
	python3-pygobject \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.0.1"
SRCREV = "cd32e72ffb3c2fb41a3f7189981376cdad6af976"

