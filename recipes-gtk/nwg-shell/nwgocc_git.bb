SUMMARY = "nwg Control Center is a highly customisable, GTK-based GUI, intended for use with window managers."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
"

RRECOMMENDS:${PN} = " \
	light \
	playerctl \
"

GO_IMPORT = "github.com/nwg-piotr/nwgocc.git"

SRC_URI = "git://${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.0.1"
SRCREV = "782a37014de40f63115825c0b5bd343dee2ba668"

inherit go go-mod pkgconfig gtk-icon-cache

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	install -d \
		${D}${datadir}/nwgocc/icons_light ${D}${datadir}/nwgocc/icons_dark \
		${D}${datadir}/applications ${D}${datadir}/icons/hicolor/scalable/apps
	install -m 644 ${S}/src/${GO_IMPORT}/nwgocc.desktop ${D}${datadir}/applications
	install -m 644 ${S}/src/${GO_IMPORT}/nwgocc.svg ${D}${datadir}/icons/hicolor/scalable/apps
	for file in ${S}/src/${GO_IMPORT}/configs/*; do
		install -m 644 $file ${D}${datadir}/nwgocc
	done
	for file in ${S}/src/${GO_IMPORT}/icons_light/*; do
		install -m 644 $file ${D}${datadir}/nwgocc/icons_light
	done
	for file in ${S}/src/${GO_IMPORT}/icons_dark/*; do
		install -m 644 $file ${D}${datadir}/nwgocc/icons_dark
	done
}

FILES:${PN} += "${datadir}"

do_compile[network] = "1"

