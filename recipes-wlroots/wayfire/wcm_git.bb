SUMMARY = "Wayfire Config Manager"
HOMEPAGE = "https://github.com/WayfireWM/wcm"
BUGTRACKER = "https://github.com/WayfireWM/wcm/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=ccb736ab917abd09ce6915fbf9a0f887"
DEPENDS = " \
	wayfire \
	wayland \
	wayland-native \
	wayland-protocols \
	gtkmm3 \
	wf-shell \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "gitsm://github.com/WayfireWM/wcm.git;protocol=https;nobranch=1"
SRCREV = "4dff0dfdd840429054b3c1cc10fbf6702227dea9"
S = "${WORKDIR}/git"
PV = "0.7.5"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${prefix}"

BBCLASSEXTEND = ""

