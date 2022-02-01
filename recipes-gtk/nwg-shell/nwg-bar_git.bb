SUMMARY = "nwg-bar for wlroots based compositors."
DESCRIPTION = "The nwg-bar command creates a button bar on the basis of a JSON template placed in the ~/.config/nwg-bar/ folder."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"

GO_IMPORT = "github.com/nwg-piotr/nwg-bar.git"

SRC_URI = "git://${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.0.1"
SRCREV = "7dd7df3cd9a9e78fe477e88e0f3cb97309d50ff5"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	# remove precompiled x86 binary
	rm -r ${D}${libdir}/go/src/${GO_IMPORT}/bin
}

do_compile[network] = "1"

