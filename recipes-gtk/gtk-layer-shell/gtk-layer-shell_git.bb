SUMMARY = "A library to write GTK applications that use Layer Shell"
HOMEPAGE = "https://github.com/wmww/gtk-layer-shell"
BUGTRACKER = "https://github.com/www/gtk-layer-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE_MIT.txt;md5=ffeb3391e5dace600b84c757688b9f1b"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

DEPENDS += " \
	gtk+3 \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = " \
	git://github.com/wmww/gtk-layer-shell.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "0.8.1"
SRCREV = "0ed957ce262c1063a011b16b59cda5c5de4b3b47"

inherit meson pkgconfig features_check gobject-introspection vala

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} = "${datadir} ${libdir}"

BBCLASSEXTEND = ""

