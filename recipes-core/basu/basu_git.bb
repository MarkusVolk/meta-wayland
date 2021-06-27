SUMMARY = "The sd-bus library, extracted from systemd."
HOMEPAGE = "https://github.com/emersion/basu.git"
SECTION = "base"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/emersion/basu.git;protocol=https"

DEPENDS += "gperf-native libcap"

S = "${WORKDIR}/git"
PV = "0.2.0"
SRCREV = "v${PV}"

inherit meson

EXTRA_OEMESON += "--buildtype release"

