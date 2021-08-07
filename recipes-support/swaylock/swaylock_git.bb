SUMMARY = "swaylock is a screen locking utility for Wayland compositors."
HOMEPAGE = "https://github.com/swaywm/swaylock"
BUGTRACKER = "https://github.com/swaywm/swaylock/issues"
SECTION = "base/wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b53d9ec16b9125995437ac9efab1b450"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
            cairo \
            libxkbcommon \
            wayland \
            wayland-native \
            wayland-protocols \
"

SRC_URI = " \
	git://github.com/swaywm/swaylock.git;protocol=https \
"

S = "${WORKDIR}/git"
PV = "1.5"
SRCREV = "${PV}"

PACKAGECONFIG[pam] = ",,libpam"
PACKAGECONFIG[gdk-pixbuf] = ",,gdk-pixbuf"
PACKAGECONFIG[man-pages] = ",,scdoc-native"

PACKAGECONFIG ?= " \
	gdk-pixbuf \
	pam \
"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

