SUMMARY = "Go version of the psuinfo python script."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=22ed6cb3c33862e689e075b45066a779"

GO_IMPORT = "github.com/nwg-piotr/gopsuinfo.git"

SRC_URI = "git://${GO_IMPORT};branch=main;protocol=https"
PV = "0.1.2"
SRCREV = "8380a5bd8e200b14badb8e75762bf84a25ab1dd9"

inherit go go-mod

GO_INSTALL = "${GO_IMPORT}"

do_compile[network] = "1"

