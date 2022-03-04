SUMMARY = "The sd-bus library, extracted from systemd."
HOMEPAGE = "https://sr.ht/~emersion/basu"
SECTION = "base"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://git.sr.ht/~emersion/basu;protocol=https;branch=master"

DEPENDS += "gperf-native libcap"

S = "${WORKDIR}/git"
PV = "0.2.0"
SRCREV = "5fa970e868f25ebc79ccca9b1d9df4c030d97661"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release"

