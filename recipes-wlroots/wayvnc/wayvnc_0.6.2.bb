SUMMARY = "wayvnc"
DESCRIPTION = "a VNC server for wlroots-based Wayland compositors"
HOMEPAGE = "https://github.com/any1/${BPN}/"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=94fc374e7174f41e3afe0f027ee59ff7 \
                    "

SRC_URI = "https://github.com/any1/${BPN}/archive/refs/tags/v${PV}.tar.gz \
           "

SRC_URI[sha256sum] = "f1af176e0e98ac01306a0ba266249eeac40a9c38c349d20cbeaba48cf4558a63"


inherit meson pkgconfig

EXTRA_OEMESON += "-Dtests=false"
EXTRA_OEMESON += "-Dpam=enabled"

DEPENDS =         "pixman aml neatvnc libdrm jansson libxkbcommon libpam wayland-native"
RDEPENDS:${PN} += "pixman aml libdrm neatvnc jansson libxkbcommon libpam"