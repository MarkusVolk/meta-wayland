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
PV = "0.6.2"
SRCREV = "f5622e1a35e63840fb1826a2ef35a8edb9dfcbc2"

