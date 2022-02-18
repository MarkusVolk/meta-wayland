SUMMARY = "A phone dialer and call handler."
LICENSE="GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

GNOMEBASEBUILDCLASS = "meson"

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
    sofia-sip \
"

inherit gnomebase vala pkgconfig mime-xdg

SRC_URI[archive.sha256sum] = "0ddbe9aa6fce409988cafd0d2fcb6d96dd0034eabbaf8400bc9fc8a6bf33bb07"

FILES:${PN} += "${datadir}"

