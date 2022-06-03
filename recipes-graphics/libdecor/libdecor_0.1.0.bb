SUMMARY = "libdecor - A client-side decorations library for Wayland clients"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7ae2be7fb1637141840314b51970a9f7"

SRC_URI = "git://gitlab.gnome.org/jadahl/libdecor.git;protocol=https;branch=master"

DEPENDS = " \
	cairo \
	libxkbcommon \
	pango \
	wayland \
	wayland-native \
	wayland-protocols \
"

S = "${WORKDIR}/git"
SRCREV = "3ec3fadd59a21835079fbb3046d2bec6c649d6fa"

PACKAGECONFIG ?= "dbus"

PACKAGECONFIG[dbus] = "-Ddbus=enabled,-Ddbus=disabled,dbus"
PACKAGECONFIG[demo] = "-Ddemo=true,-Ddemo=false,virtual/libgl"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = "native nativesdk"
