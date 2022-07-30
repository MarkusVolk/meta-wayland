SUMMARY = "A phone dialer and call handler."
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS = " \
    callaudiod \
    evolution-data-server \
    feedbackd \
    folks \
    glib-2.0 \
    glibmm \
    gom \
    gstreamer1.0 \
    gstreamer1.0-plugins-good \
    libhandy \
    libpeas \
    libsecret \
    libsoup-2.4 \
    libxml2 \
    modemmanager \
    openldap \
    python3-docutils-native \
    sofia-sip \
"

SRC_URI = "gitsm://gitlab.gnome.org/GNOME/calls.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
SRCREV = "3d7c671034e01756b685d7b3048b1da01d4307bf"
PV = "43_alpha.2"

inherit meson vala pkgconfig mime-xdg

FILES:${PN} += "${datadir}"

