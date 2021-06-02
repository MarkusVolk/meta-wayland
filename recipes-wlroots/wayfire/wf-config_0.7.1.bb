SUMMARY = "A Wayland WM"
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

SRC_URI = "https://github.com/WayfireWM/wf-config/releases/download/v${PV}/wf-config-${PV}.tar.xz"
SRC_URI[sha256sum] = "7d2285adeaca0ff6e36e6ef450564ab02c8e26ba5da3b169257c5bf061f7e5f0"

S = "${WORKDIR}/${PN}-${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"


BBCLASSEXTEND = ""

