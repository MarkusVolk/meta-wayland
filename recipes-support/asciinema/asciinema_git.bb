SUMMARY = "Terminal session recorder and the best companion of asciinema.org."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	git://github.com/asciinema/asciinema.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	python3 \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "2.1.0"
SRCREV = "e08109f99a589d7d6e7ecf68fd93f731976ed61f"

