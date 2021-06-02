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
	wf-config \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "https://github.com/WayfireWM/wcm/releases/download/v${PV}/wcm-${PV}.tar.xz"
SRC_URI[sha256sum] = "924a9682dc2f632bad8b6914a8927ad5dcee4b6698f75e89251f1647ad0beaa7"

S = "${WORKDIR}/${PN}-${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES_${PN} += "${prefix}"

BBCLASSEXTEND = ""

