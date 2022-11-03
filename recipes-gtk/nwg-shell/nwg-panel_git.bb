SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cf35eed17e1e2850ef025a633885d45f"

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
PV = "0.7.14"
SRCREV = "518ac0a2beeaea293c586125a6da7c9bb3bfac2d"

