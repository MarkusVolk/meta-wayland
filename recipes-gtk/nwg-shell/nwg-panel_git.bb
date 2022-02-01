SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	bash \
	light \
	python3 \
	python3-pygobject \
	python3-psutil \
	python-i3ipc \
	swaync \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.6.0"
SRCREV = "221342b252c6608c30147a3cec5bc06eae28ab40"

