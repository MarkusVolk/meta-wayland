SUMMARY = "Day/night gamma adjustments for Wayland compositors supporting wlr-gamma-control-unstable-v1."
HOMEPAGE = "https://github.com/kennylevinsen/wlsunset"
BUGTRACKER = "https://github.com/kennylevinsen/wlsunset/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=715a99d2dd552e6188e74d4ed2914d5a"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/kennylevinsen/wlsunset.git;protocol=https;branch=master"

PACKAGECONFIG[man-pages] = ",,scdoc-native"


S = "${WORKDIR}/git"
PV = "0.2.0"
SRCREV = "${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

