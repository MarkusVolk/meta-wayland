SUMMARY = "gmobile carries some helpers for GNOME on mobile devices"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://src/gm-cutout.c;beginline=1;endline=5;md5=fdd1e77039fe571c0c9aa6280a7e7903"

inherit meson pkgconfig

DEPENDS = "glib-2.0 json-glib"

SRC_URI = " \
	git://gitlab.gnome.org/World/Phosh/gmobile.git;protocol=https;branch=main \
	file://0001-meson.build-create-a-pkgconfig-.pc-file.patch \
"
S = "${WORKDIR}/git"
SRCREV = "d5ed9ed758bf0deeb050d861fb08518295a42767"
PV = "0.0.4"

do_install:append() {
	install -m 0644 ${B}/gm-config.h ${D}${includedir}
}
