SUMMARY = "GTK3-based panel for wayland."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-panel.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	light \
	python3 \
	python3-pygobject \
	python3-psutil \
	python-i3ipc \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.5.0"
SRCREV = "v${PV}"

do_install:append() {
	rm  ${D}${libdir}/python*/site-packages/nwg_panel/executors/arch_updates.py
}

INSANE_SKIP:${PN} = "file-rdeps"

