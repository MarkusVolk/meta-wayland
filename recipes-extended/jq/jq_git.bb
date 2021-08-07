  
SUMMARY = "jq is a lightweight and flexible command-line JSON processor."
HOMEPAGE = "https://github.com/stedolan/jq"
BUGTRACKER = "https://github.com/stedolan/jq/issues"
SECTION = "dev"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=31752b4a8edd3fb9ddba1cb90fada74d"

SRC_URI = " \
	git://github.com/stedolan/jq;protocol=https;nobranch=1 \
"

S = "${WORKDIR}/git"
PV = "1.6"
SRCREV = "jq-${PV}"

inherit autotools

do_configure:prepend() {
	autoreconf -f
}
