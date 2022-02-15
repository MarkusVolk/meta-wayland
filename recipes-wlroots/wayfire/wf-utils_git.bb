SUMMARY = "Contains utility classes for Wayfire"
HOMEPAGE = "https://github.com/WayfireWM/wf-utils"
BUGTRACKER = "https://github.com/WayfireWM/wf-utils/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a5edde5b0aa2298140a914608a192560"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/WayfireWM/wf-utils.git;branch=master;protocol=https \
	file://0001-meson.build-add-missing-header.patch \
"

SRCREV = "889fdafa7b09fc6ce70313fd3f067cfc8c21a2ac"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

