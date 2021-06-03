SUMMARY = "A minimal seat management daemon, and a universal seat management library."
DESCRIPTION = "Seat management takes care of mediating access to shared devices (graphics, input), without requiring the applications needing access to be root."
AUTHOR = "kennylevinsen"
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/seatd"
SECTION = "libs"
LICENSE = "BSD-0-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=715a99d2dd552e6188e74d4ed2914d5a"

SRC_URI = "git://git.sr.ht/~kennylevinsen/seatd;protocol=https"

PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,elogind"

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
"

S = "${WORKDIR}/git"
PV = "0.5.0"
SRCREV = "${PV}"

inherit meson

EXTRA_OEMESON += "--buildtype release"

