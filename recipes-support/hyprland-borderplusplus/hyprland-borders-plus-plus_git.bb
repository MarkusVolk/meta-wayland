SUMMARY = "Allows you to add one or two additional borders to your windows."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = " \
	git://github.com/hyprwm/hyprland-plugins.git;protocol=https;branch=main \
"

DEPENDS = " \
    pixman \
    libdrm \
    hyprland \
"

S = "${WORKDIR}/git/borders-plus-plus"
SRCREV = "e368bd15e4bfd560baa9333ad47415340c563458"

inherit meson pkgconfig

FILES:${PN} += "${libdir}/libborders-plus-plus.so"
FILES:${PN}-dev = ""
