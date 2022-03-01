SUMMARY = "An improved Python library to control i3wm and sway."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3961efb54421653518521529853444c4"

RDEPENDS:${PN} = " \
	python3 \
	python-xlib \
"

inherit setuptools3 pypi

PV = "2.2.1"

SRC_URI[sha256sum] = "e880d7d7147959ead5cb34764f08b97b41385b36eb8256e8af1ce163dbcccce8"
