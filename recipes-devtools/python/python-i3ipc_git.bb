SUMMARY = "An improved Python library to control i3wm and sway."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3961efb54421653518521529853444c4"

SRC_URI = " \
	git://github.com/altdesktop/i3ipc-python.git;protocol=https \
"

RDEPENDS:${PN} = " \
	python3 \
	python-xlib \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "2.2.1"
SRCREV = "v${PV}"

