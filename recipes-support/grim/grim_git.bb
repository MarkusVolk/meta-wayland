SUMMARY = "Image Grabber For Wayland"
DESCRIPTION = "Grab images from a Wayland compositor. Works great with slurp and with sway"
AUTHOR = ""
HOMEPAGE = "https://github.com/emersion/grim"
BUGTRACKER = "https://github.com/emersion/grim/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	pixman \
	libpng \
	jpeg \	
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://git.sr.ht/~emersion/grim;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "1.4.0"
SRCREV = "89e02e663fabc534b7e7039514f60a8c5d70070d"

inherit meson pkgconfig features_check

EXTRA_OEMESON = "--buildtype release"

BBCLASSEXTEND = ""

