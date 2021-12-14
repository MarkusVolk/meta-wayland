SUMMARY = "kanshi allows you to define output profiles that are automatically enabled and disabled on hotplug."
HOMEPAGE = "https://git.sr.ht/~emersion/kanshi"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=706cd9899438a9385250ab6773c1fa53"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://git.sr.ht/~emersion/kanshi;protocol=https;branch=master \
"

DEPENDS = "wayland wayland-native"

inherit meson pkgconfig features_check

PACKAGECONFIG[ipc] = "-Dipc=enabled,-Dipc=disabled,libvarlink"
PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"

PACKAGECONFIG ?= " \
	ipc \
"

S = "${WORKDIR}/git"
PV = "1.2.0"
SRCREV = "992c1954a6a00a3f66882c9eb75d74c2dbcbe25c"

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

