SUMMARY = "nwg-bar for wlroots based compositors."
DESCRIPTION = "The nwg-bar command creates a button bar on the basis of a JSON template placed in the ~/.config/nwg-bar/ folder."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=dcdbccfd08fcfd7002d16ca7fa5ad5cb"

DEPENDS = " \
	gtk+3 \
	gtk-layer-shell \
"
RDEPENDS:${PN} = "go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-bar.git"

SRC_URI = "git://${GO_IMPORT};nobranch=1;protocol=https"

PV = "0.1.3"
SRCREV = "822e1d04ecc9d48fc68d9bd6269a4f5cd109f82a"

inherit go go-mod pkgconfig

GO_INSTALL = "${GO_IMPORT}"

do_compile[network] = "1"

PRIVATE_LIBS:${PN}:append = " libstd.so"
