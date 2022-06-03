SUMMARY = "This program is intended to work as the icon picker for nwg-panel, but it may be used standalone."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=532a46f3ba72a0575ece8ba24fe0d776"

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
SRCREV = "8d913d20dd58da2655a136d2bc5f62e0a9fd6fb2"

