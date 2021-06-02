SUMMARY = "A Wayland Screen Recorder"
HOMEPAGE = "https://github.com/ammen99/wf-recorder"
BUGTRACKER = "https://github.com/ammen99/wf-recorder/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=dd7ed145448eb375bc1d98e5169ae84e"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	ffmpeg \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	https://github.com/ammen99/wf-recorder/releases/download/v${PV}/wf-recorder-${PV}.tar.xz \
"

SRC_URI[sha256sum] = "bfe51f4f88ba755ac0ad993d00da706496f84e60b53de0ae24fe1c654cfaa376"

S = "${WORKDIR}/${PN}-${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"
GIR_EXTRA_LIBS_PATH="${WORKDIR}"

FILES_${PN} += "${prefix}"

BBCLASSEXTEND = ""

