SUMMARY = "Go version of the psuinfo python script."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=22ed6cb3c33862e689e075b45066a779"

GO_IMPORT = "github.com/nwg-piotr/gopsuinfo.git"

SRC_URI = "git://${GO_IMPORT};branch=main;protocol=https"

SRCREV = "838b4893f48924bb03f5124701754836562d090a"

inherit go go-mod

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	# remove precompiled x86 binary
	rm -r ${D}${libdir}/go/src/${GO_IMPORT}/bin
}

do_compile[network] = "1"

