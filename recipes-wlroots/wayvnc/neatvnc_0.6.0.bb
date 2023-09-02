SUMMARY = "Neatvnc vnc c library"
DESCRIPTION = "This is a liberally licensed VNC server library that's intended to be fast and neat."
HOMEPAGE = "https://github.com/any1/neatvnc"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=94fc374e7174f41e3afe0f027ee59ff7 \
                    "

SRC_URI = "https://github.com/any1/${BPN}/archive/refs/tags/v${PV}.tar.gz \
           "

SRC_URI[sha256sum] = "20c5ff0d0a7d4dff404619d653b465df08e5e856eb7faec34ffd5624b8fa653a"


inherit meson pkgconfig

EXTRA_OEMESON = "-Dtls=enabled"

DEPENDS = " libdrm pixman aml gnutls"

RDEPENDS:${PN} += "pixman libturbojpeg"
