SUMMARY = "Adds simple title bars to windows."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

require hyprland-plugins.inc

DEPENDS = " \
    libinput \
    udev \
    pixman \
    libdrm \
    hyprland \
    wayland-native \
"

S = "${WORKDIR}/git/hyprbars"

inherit meson pkgconfig

FILES:${PN} += "${libdir}/libhyprbars.so"
FILES:${PN}-dev = ""
