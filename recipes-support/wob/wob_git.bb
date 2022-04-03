SUMMARY = "A lightweight overlay volume/backlight/progress/anything bar for wlroots based Wayland compositors."
HOMEPAGE = "https://github.com/francma/wob"
SECTION = "Wayland"
LICENSE = "ISC"

LIC_FILES_CHKSUM = "file://LICENSE;md5=07d60638be9414ee4e38ed68e642ba25"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/francma/wob.git;protocol=https;branch=master \
"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check

PACKAGECONFIG[seccomp] = "-Dseccomp=enabled,-Dseccomp=disabled,libseccomp"
PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"

PACKAGECONFIG ??= ""

S = "${WORKDIR}/git"
PV = "0.13"
SRCREV = "79724fa53f536e8aa23cfb72611983e87351b6e9"

EXTRA_OEMESON += "--buildtype release"

