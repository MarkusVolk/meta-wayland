SUMMARY = "A minimal seat management daemon, and a universal seat management library."
DESCRIPTION = "Seat management takes care of mediating access to shared devices (graphics, input), without requiring the applications needing access to be root."
AUTHOR = "kennylevinsen"
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/seatd"
SECTION = "libs"
LICENSE = "BSD-0-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=715a99d2dd552e6188e74d4ed2914d5a"

SRC_URI = "git://git.sr.ht/~kennylevinsen/seatd;protocol=https"

# On systems without logind/elogind, you need to suid the sway binary.
# Sway will drop root permissions shortly after startup.
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[elogind] = ",,elogind"
PACKAGECONFIG[standalone] = "-Dbuiltin=enabled,-Dbuiltin=disabled"
PACKAGECONFIG[man-pages] = ",,scdoc-native"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
"

S = "${WORKDIR}/git"
PV = "0.5.0+${SRCREV}"
SRCREV = "fc97206df9b8fbba09de8b320fab6f75235a5c7f"

inherit meson

EXTRA_OEMESON += "--buildtype release"

