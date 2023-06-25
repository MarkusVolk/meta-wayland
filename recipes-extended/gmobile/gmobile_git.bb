SUMMARY = "gmobile carries some helpers for GNOME on mobile devices"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://src/gm-cutout.c;beginline=1;endline=5;md5=fdd1e77039fe571c0c9aa6280a7e7903"

inherit meson pkgconfig

DEPENDS = "glib-2.0 json-glib"

SRC_URI = "git://gitlab.gnome.org/guidog/gmobile.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
SRCREV = "52f8c0f7970bb997ecc960b61bef4aa07eeaa92c"
PV = "0.0.1"
