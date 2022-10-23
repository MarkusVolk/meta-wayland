SUMMARY = "A lightweight notification daemon for Wayland."
HOMEPAGE = "github.com/emersion/mako"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/emersion/mako.git;protocol=https;branch=master \
"

DEPENDS = " \
	pango \
	cairo \
	libpng \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = "dbus"

RRECOMMENDS:${PN} = "jq"

inherit meson pkgconfig features_check

PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,elogind"
PACKAGECONFIG[man-pages] = ",,scdoc-native"
PACKAGECONFIG[icons] = ",,gdk-pixbuf"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
	icons \
	man-pages \	
"

S = "${WORKDIR}/git"
PV = "1.7.1"
SRCREV = "51ad133d3e9ebca27e7af25f86dcbf67b7f25f11"

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

