SUMMARY = "ddcpopup allows to control basic settings of external (not laptop built-in) monitors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/README.md;md5=63b79d68c363846305e6bb4fbf116a35"

DEPENDS = " \
	ddcutil \
	gtk+3 \
	gtk-layer-shell \
"

RDEPENDS:${PN} = "ddcutil"

GO_IMPORT = "github.com/nwg-piotr/ddcpopup.git"

SRC_URI = "git://${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.1"
SRCREV = "8fab5132e49e08a1eeaa7a0dd3350d06f4399200"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"

do_compile[network] = "1"

do_install:append() {
	mv ${D}${bindir}/main ${D}${bindir}/ddcpopup
}
