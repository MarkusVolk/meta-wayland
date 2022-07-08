SUMMARY = "Terminal session recorder and the best companion of asciinema.org."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	git://github.com/asciinema/asciinema.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	python3 \
"

inherit python_setuptools_build_meta

S = "${WORKDIR}/git"
PV = "2.2.0"
SRCREV = "f3af768f569e0b363bcced11d266d4ed857e21e7"
