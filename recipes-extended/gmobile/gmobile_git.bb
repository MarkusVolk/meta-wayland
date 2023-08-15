SUMMARY = "gmobile carries some helpers for GNOME on mobile devices"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://src/gm-cutout.c;beginline=1;endline=5;md5=fdd1e77039fe571c0c9aa6280a7e7903"

inherit meson pkgconfig

DEPENDS = "glib-2.0 json-glib"

SRC_URI = " \
	git://gitlab.gnome.org/guidog/gmobile.git;protocol=https;nobranch=1 \
	file://0001-meson.build-create-a-pkgconfig-.pc-file.patch \
"
S = "${WORKDIR}/git"
SRCREV = "f1b50f0f90604e0f125412932dae9b1e08d57ddc"
PV = "0.0.3"

do_install:append() {
	install -m 0644 ${B}/gm-config.h ${D}${includedir}
}
