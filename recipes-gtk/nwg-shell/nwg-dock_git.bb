SUMMARY = "GTK3-based dock for wlroots based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"

GO_IMPORT = "github.com/nwg-piotr/nwg-dock.git"

SRC_URI = "git://${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.2.2"
SRCREV = "204582169596597095109727302fec51f930c91e"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	# remove precompiled x86 binaries
	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}/bin
	rm -rf ${D}${libdir}/go/pkg/mod/github.com/dlasky/gotk3-layershell*/example
}

do_compile[network] = "1"

