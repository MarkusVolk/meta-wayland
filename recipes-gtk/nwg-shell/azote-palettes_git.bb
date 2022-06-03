SUMMARY = "This tool creates a palette of up to 36 colours out of a jpg or png image."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
	git://github.com/nwg-piotr/azote-palettes.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	python3 \
	python3-pygobject \
	python3-pillow \
	python3-colorthief \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "1.0.1"
SRCREV = "b5aaf3ecc0df3809c6b0f07c6b7bf8376f017a5b"

