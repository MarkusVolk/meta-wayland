SUMMARY = "A library to write GTK applications that use Layer Shell"
HOMEPAGE = "https://github.com/wmww/gtk-layer-shell"
BUGTRACKER = "https://github.com/www/gtk-layer-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c10fc088fd05226381f6a90310ef75b5"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

DEPENDS += " \
	gtk4 \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = " \
	git://github.com/wmww/gtk4-layer-shell.git;protocol=https;branch=main \
"

S = "${WORKDIR}/git"
PV = "1.0.1"
SRCREV = "98c693d0a7ea74620e3cec1115bbc66d33d8b843"

inherit meson pkgconfig features_check gobject-introspection vala

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} = "${datadir} ${libdir}"

BBCLASSEXTEND = ""

