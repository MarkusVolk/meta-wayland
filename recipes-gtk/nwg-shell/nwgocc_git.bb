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

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"

do_compile[network] = "1"

