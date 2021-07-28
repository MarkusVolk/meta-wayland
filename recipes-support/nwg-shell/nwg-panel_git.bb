SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https \
"

RDEPENDS_${PN} = "\
	light \
	python3 \
	python3-pygobject \
	python3-psutil \
	python-i3ipc \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.3.3"
SRCREV = "v${PV}"

INSANE_SKIP_${PN} = "file-rdeps"

