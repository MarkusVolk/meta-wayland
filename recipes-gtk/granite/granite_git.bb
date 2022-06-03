SUMMARY = "Granite is a companion library for GTK and GLib."
HOMEPAGE = "https://github.com/elementary/granite"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"


DEPENDS = " \
	gtk+3 \
	glib-2.0 \
	libgee \
"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

SRC_URI = "git://github.com/elementary/granite.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "6.2.0"
SRCREV = "4ab145c28bb3db6372fe519e8bd79c645edfcda3"

inherit meson pkgconfig gobject-introspection vala features_check

FILES:${PN} += "${datadir}"
