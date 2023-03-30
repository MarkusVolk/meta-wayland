SUMMARY = "Lightweight KMS plane library."
HOMEPAGE = "https://gitlab.freedesktop.org/emersion/libliftoff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=706cd9899438a9385250ab6773c1fa53"

SRC_URI = "git://gitlab.freedesktop.org/emersion/libliftoff.git;branch=v0.4;protocol=https"

DEPENDS = "libdrm"

S = "${WORKDIR}/git"
PV = "0.4.1"
SRCREV = "e045589f37835d66e3ffe8130a597bb4eb9ee08f"

inherit meson pkgconfig
