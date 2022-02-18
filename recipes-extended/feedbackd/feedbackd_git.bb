SUMMARY = "A daemon to provide haptic, led and audio feedback triggered by application events."
HOMEPAGE = "https://source.puri.sm/Librem5/feedbackd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

DEPENDS = " \
    gsound \
    libgudev \
    glib-2.0 \
    json-glib \
"

GIR_MESON_OPTION = ""

inherit meson pkgconfig features_check gobject-introspection vala

SRC_URI = " \
    git://source.puri.sm/Librem5/feedbackd.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "0.0.0+git20220208"
SRCREV = "74b178a363f1e0e4b84309f2a1b1c1c41bf97248"

EXTRA_OEMESON += "-Dtests=false"

FILES:${PN} += "${datadir}"

