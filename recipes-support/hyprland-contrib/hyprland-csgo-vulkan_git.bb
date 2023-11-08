SUMMARY = "Fix for CS:GO with -vulkan."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

require hyprland-plugins.inc

DEPENDS = " \
    pixman \
    libdrm \
    hyprland \
"

S = "${WORKDIR}/git/csgo-vulkan-fix"

inherit meson pkgconfig

FILES:${PN} += "${libdir}/libcsgo-vulkan-fix.so"
FILES:${PN}-dev = ""
