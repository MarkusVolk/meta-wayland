SUMMARY = "Font Awesome"

HOMEPAGE = "https://fontawesome.com/"
SECTION = "base/fonts"

LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2e3494502db283e8891d4886fe445912"

SRCREV = "${AUTOREV}"

SRC_URI = " \
	https://github.com/FortAwesome/Font-Awesome/archive/${PV}.tar.gz \
"
SRC_URI[sha256sum] = "ce8d6225c59c2fedab03658144d896807e58d7d5082da7c9655301a44c5cb3d2"

S = "${WORKDIR}/Font-Awesome-${PV}"
SRCREV = "${AUTOREV}"


do_install () {
	install -d ${D}${datadir}/fonts/opentype
	for font in ${S}/otfs/*.otf; do
		install -m 0644  "$font" ${D}${datadir}/fonts/opentype
	done
}

FILES_${PN} = " \
	${datadir}/fonts \
"

