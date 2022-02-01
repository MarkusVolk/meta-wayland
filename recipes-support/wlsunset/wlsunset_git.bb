SUMMARY = "Day/night gamma adjustments for Wayland compositors supporting wlr-gamma-control-unstable-v1."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/wlsunset"
BUGTRACKER = "https://git.sr.ht/~kennylevinsen/wlsunset/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=715a99d2dd552e6188e74d4ed2914d5a"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://git.sr.ht/~kennylevinsen/wlsunset;protocol=https;nobranch=1"

PACKAGECONFIG[man-pages] = ",,scdoc-native"


S = "${WORKDIR}/git"
PV = "0.2.0"
SRCREV = "2e7d793bb6b0e21319940d476ca27242f60e3cd6"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

