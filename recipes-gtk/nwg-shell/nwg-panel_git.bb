SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcdbccfd08fcfd7002d16ca7fa5ad5cb"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	bash \
	light \
	python3 \
	python-i3ipc \
	python3-psutil \
	python3-pygobject \
	python3-requests \
	swaync \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.9.11"
SRCREV = "0053515ceed3ab895264d5e87e50495938dc958c"

