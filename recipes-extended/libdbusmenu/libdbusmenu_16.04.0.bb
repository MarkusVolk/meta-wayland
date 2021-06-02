DESCRIPTION = "Ayatana dbus indicator helper library"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"
DEPENDS = "intltool-native glib-2.0-native json-glib dbus gtk+3"

SRC_URI = "https://launchpad.net/libdbusmenu/16.04/16.04.0/+download/libdbusmenu-${PV}.tar.gz"

SRC_URI[sha256sum] = "b9cc4a2acd74509435892823607d966d424bd9ad5d0b00938f27240a1bfa878a"

inherit autotools pkgconfig gobject-introspection features_check

DEPENDS_append_class-target = " gobject-introspection-native qemu-native"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

# this requires gtk+2
EXTRA_OECONF += "--disable-dumper"

# dont treat warnings as errors
CFLAGS_append += "-Wno-error"

do_compile_prepend() {
	export GIR_EXTRA_LIBS_PATH="${B}/libdbusmenu-glib/.libs:${B}/libdbusmenu-gtk/.libs"
}

