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
PV = "0.3.9"
SRCREV = "2d510b573cd335023f767a4a7ced3f9dd5ca8e97"

