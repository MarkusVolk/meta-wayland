SUMMARY = "Font Awesome"

HOMEPAGE = "https://fontawesome.com/"
SECTION = "base/fonts"

LICENSE = "CC-BY-4.0 & OFL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4186e0f8172f263065437f80932efbe1"

SRC_URI = " \
	git://github.com/FortAwesome/Font-Awesome.git;protocol=https;branch=6.x \
"

S = "${WORKDIR}/git"
PV = "6.4.0"
SRCREV = "0698449d50f2b95517562295a59d414afc68b369"


do_install () {
	install -d ${D}${datadir}/fonts/opentype
	for font in ${S}/otfs/*.otf; do
		install -m 0644  "$font" ${D}${datadir}/fonts/opentype
	done
}

FILES:${PN} = " \
	${datadir}/fonts \
"

