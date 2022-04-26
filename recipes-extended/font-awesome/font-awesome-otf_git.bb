SUMMARY = "Font Awesome"

HOMEPAGE = "https://fontawesome.com/"
SECTION = "base/fonts"

LICENSE = "CC-BY-4.0 & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=57f9201afe70f877988912a7b233de47"

SRC_URI = " \
	git://github.com/FortAwesome/Font-Awesome.git;protocol=https;branch=6.x \
"

S = "${WORKDIR}/git"
PV = "6.1.1"
SRCREV = "28e297f07af26f148c15e6cbbd12cea3027371d3"


do_install () {
	install -d ${D}${datadir}/fonts/opentype
	for font in ${S}/otfs/*.otf; do
		install -m 0644  "$font" ${D}${datadir}/fonts/opentype
	done
}

FILES:${PN} = " \
	${datadir}/fonts \
"

