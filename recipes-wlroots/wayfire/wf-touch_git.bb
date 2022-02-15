SUMMARY = "Touchscreen gesture library"
HOMEPAGE = "https://github.com/WayfireWM/wf-touch"
BUGTRACKER = "https://github.com/WayfireWM/wf-touch/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=a5edde5b0aa2298140a914608a192560"

DEPENDS = "glm"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/WayfireWM/wf-touch.git;branch=master;protocol=https \
	file://0001-meson.build-create-.pc-file.patch \
"

SRCREV = "8974eb0f6a65464b63dd03b842795cb441fb6403"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

