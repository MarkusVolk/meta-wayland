SUMMARY = "libgom - GObject Data Mapper."
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

GNOMEBASEBUILDCLASS = "meson"

DEPENDS = "sqlite3 glib-2.0 gdk-pixbuf python3-pygobject-native"

inherit gnomebase pkgconfig gobject-introspection
GIR_MESON_OPTION = ""

SRC_URI = "https://download.gnome.org/sources/gom/${PV}/gom-${PV}.tar.xz;name=archive"
SRC_URI[archive.sha256sum] = "68d08006aaa3b58169ce7cf1839498f45686fba8115f09acecb89d77e1018a9d"

FILES:${PN} += "${datadir} ${libdir}"

