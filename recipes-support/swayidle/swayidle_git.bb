SUMMARY = "This is sway's idle management daemon."
HOMEPAGE = "https://github.com/swaywm/swayidle"
BUGTRACKER = "https://github.com/swaywm/swayidle/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=42c09cdd4a8d20e68711825e20cba37e"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
            wayland \
            wayland-native \
            wayland-protocols \
"

SRC_URI = " \
	git://github.com/swaywm/swayidle.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "1.7.1"
SRCREV = "081d61670387da8fd36bad630d8ced5e48a5fcf0"

inherit meson pkgconfig features_check

PACKAGECONFIG[systemd] = "-Dlogind-provider=systemd,,systemd"
PACKAGECONFIG[sysvinit] = "-Dlogind-provider=elogind,,elogind"
PACKAGECONFIG[man-pages] = ",,scdoc-native"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
"

# Reproducibility issue. Fix me!
CFLAGS:append = " -Wno-error=date-time"

FILES:${PN} += "${datadir}"

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

