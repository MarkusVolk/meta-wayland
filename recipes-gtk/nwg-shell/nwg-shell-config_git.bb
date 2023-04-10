SUMMARY = "nwg-shell config utility."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-shell-config.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	python3 \
	python3-geopy \
	python-i3ipc \
	python3-pygobject \
	swaync \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.4.21"
SRCREV = "cb67dcbc805d60a262a6aaa4c9128d489f1de7e5"

