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

SRC_URI = "gitsm://github.com/WayfireWM/wcm.git;protocol=https;branch=master"
SRCREV = "5a82f0a0c76c7878f8a5e78dd02dc563202547a0"
S = "${WORKDIR}/git"
PV = "0.8.0"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${prefix}"

BBCLASSEXTEND = ""

