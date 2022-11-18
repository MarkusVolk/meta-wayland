SUMMARY = "Modern IRC client written in GTK."
HOMEPAGE = "https://github.com/SrainApp/srain"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d42081fffd0d03da6e4a8ee09ae1a18"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

DEPENDS = " \
    gtk+3 \
    cairo \
    gdk-pixbuf \
    glib-2.0 \
    libconfig \
    libsoup-2.4 \
    openssl \
    libsecret \
"

GIR_MESON_OPTION = ""

inherit meson gtk-icon-cache mime-xdg pkgconfig features_check gobject-introspection

SRC_URI = " \
    git://github.com/SrainApp/srain.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
PV = "1.5.0"
SRCREV = "ed438ea0d60e71f98dcac4c49dcbba837e283e16"

EXTRA_OEMESON += " \
    --buildtype release \
    -Ddoc_builders= \
"

FILES:${PN} += "${datadir}/metainfo"

