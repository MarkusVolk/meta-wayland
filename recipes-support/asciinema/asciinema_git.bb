SUMMARY = "Terminal session recorder and the best companion of asciinema.org."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	git://github.com/asciinema/asciinema.git;protocol=https;nobranch=1 \
"

RDEPENDS:${PN} = " \
	python3 \
	python3-fcntl \
"

inherit python_setuptools_build_meta

S = "${WORKDIR}/git"
PV = "2.3.0"
SRCREV = "791916d87d06b25ded09fefde33288d5c069c96d"
