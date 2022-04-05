SUMMARY = "A phone dialer and call handler."
LICENSE = "GPL-3.0-or-later"
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

SRC_URI[archive.sha256sum] = "784bbc4a1347965d4bdbd0d552bd4a4a88aa0f9370c10e6c2f1297e889611f9a"

FILES:${PN} += "${datadir}"

