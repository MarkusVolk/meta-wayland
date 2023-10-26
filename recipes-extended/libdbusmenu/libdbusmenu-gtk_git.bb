SUMMARY = "This is a small library designed to make sharing and displaying of menu structures over DBus simple and easy to use."
HOMEPAGE = "https://github.com/AyatanaIndicators/libdbusmenu"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

DEPENDS = "glib-2.0 json-glib dbus gtk+3 libdbusmenu-glib intltool-native"
RDEPENDS:${PN} = "libdbusmenu-glib"

SRC_URI = "git://github.com/AyatanaIndicators/libdbusmenu.git;protocol=https;branch=master"
S = "${WORKDIR}/git"
PV = "16.0.4"
SRCREV = "4d03141aea4e2ad0f04ab73cf1d4f4bcc4a19f6c"

EXTRA_OECONF += "--disable-dumper --disable-gtk-doc"

inherit autotools pkgconfig gettext gobject-introspection vala gtk-doc

CFLAGS += "-Wno-error"

do_install:append () {
	rm -rf ${D}${includedir}/libdbusmenu-glib-0.4
	rm -rf ${D}${libdir}/girepository-1.0/Dbusmenu-0.4.typelib
	rm -rf ${D}${libdir}/libdbusmenu-glib* ${D}${libdir}/libdbusmenu-jsonloader* ${D}${libdir}/pkgconfig/dbusmenu-glib-0.4.pc ${D}${libdir}/pkgconfig/dbusmenu-jsonloader-0.4.pc
	rm -rf ${D}${libexecdir}/dbusmenu-testapp
	rm -rf ${D}${datadir}/doc
	rm -rf ${D}${datadir}/vala/vapi/Dbusmenu-0.4.vapi
	rm -rf ${D}${datadir}/gir-1.0/Dbusmenu-0.4.gir
	rm -rf ${D}${datadir}/libdbusmenu/json
}

FILES:${PN} += "${datadir}"
