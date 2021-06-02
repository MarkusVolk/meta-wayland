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
	cairo \
	jpeg \	
	wayland \
	wayland-native \
	wayland-protocols \
           "

SRC_URI = "git://github.com/emersion/grim.git;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

