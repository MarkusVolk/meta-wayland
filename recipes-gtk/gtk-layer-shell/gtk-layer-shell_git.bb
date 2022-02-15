SUMMARY = "A library to write GTK applications that use Layer Shell"
HOMEPAGE = "https://github.com/wmww/gtk-layer-shell"
BUGTRACKER = "https://github.com/www/gtk-layer-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE_MIT.txt;md5=d015f272ca1521139fd99ea64d6e5e23"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

DEPENDS += " \
	gtk+3 \
	wayland \
	wayland-native \
"

SRC_URI = "git://github.com/wmww/gtk-layer-shell.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.7.0"
SRCREV = "ca37ef1baa623302dda5fcea200d04e0d9a10578"

inherit meson pkgconfig features_check gobject-introspection vala

EXTRA_OEMESON += "--buildtype release -Dvapi=true"

FILES:${PN} = "${datadir} ${libdir}"

BBCLASSEXTEND = ""

