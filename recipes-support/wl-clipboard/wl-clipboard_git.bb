SUMMARY = "Wayland clipboard utilities"
DESCRIPTION = "This project implements two command-line Wayland clipboard utilities, wl-copy and wl-paste, that let you easily copy data between the clipboard and Unix pipes, sockets, files and so on."
HOMEPAGE = "https://github.com/bugaevc/wl-clipboard"
BUGTRACKER = "https://github.com/bugaevc/wl-clipboard/issues"
SECTION = "base/shell"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/bugaevc/wl-clipboard.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "2.0+${SRCREV}"
SRCREV = "d2c32f2b4d469f53070e8c4052dea6f412de3916"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

