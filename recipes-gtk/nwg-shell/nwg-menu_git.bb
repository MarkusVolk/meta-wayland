SUMMARY = "MenuStart plugin to nwg-panel."
DESCRIPTION = "This code provides the MenuStart plugin to nwg-panel. It \
also may be used standalone with a little help from command line arguments."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"

RRECOMMENDS:${PN} = " \
	thunar \
	foot \
"

GO_IMPORT = "github.com/nwg-piotr/nwg-menu.git"

SRC_URI = "git://${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.1.1"
SRCREV = "b76362d971490cb8279b40d9c2d543c5e69232ef"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	# remove precompiled x86 binary
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
}

do_compile[network] = "1"

