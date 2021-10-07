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

SRC_URI = "git://github.com/wmww/gtk-layer-shell.git;protocol=https"

S = "${WORKDIR}/git"
PV = "0.6.0+${SRCREV}"
SRCREV = "b5e0bbc7f2ac632a65db29193fa384baeb23a96c"

inherit meson pkgconfig features_check gobject-introspection

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} = "${datadir} ${libdir}"

BBCLASSEXTEND = ""

