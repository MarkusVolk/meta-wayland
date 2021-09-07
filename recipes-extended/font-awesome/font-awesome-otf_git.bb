SUMMARY = "Font Awesome"

HOMEPAGE = "https://fontawesome.com/"
SECTION = "base/fonts"

LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2e3494502db283e8891d4886fe445912"

SRC_URI = " \
	git://github.com/FortAwesome/Font-Awesome.git;protocol=https \
"

S = "${WORKDIR}/git"
PV = "5.15.4"
SRCREV = "${PV}"


do_install () {
	install -d ${D}${datadir}/fonts/opentype
	for font in ${S}/otfs/*.otf; do
		install -m 0644  "$font" ${D}${datadir}/fonts/opentype
	done
}

FILES:${PN} = " \
	${datadir}/fonts \
"

