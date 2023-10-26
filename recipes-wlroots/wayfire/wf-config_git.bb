SUMMARY = "A library for managing configuration files, written for wayfire "
HOMEPAGE = "https://github.com/WayfireWM/wf-config"
BUGTRACKER = "https://github.com/WayfireWM/wf-config/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=e165ae90e5190201fda9741b611f9378"

DEPENDS = " \
	glm \
	libevdev \
	libxml2 \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://github.com/WayfireWM/wf-config.git;protocol=https;branch=master"
SRCREV = "8d96a30a4def766ddb45c5620234ebf76788ccd4"
PV = "0.8.0"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""
