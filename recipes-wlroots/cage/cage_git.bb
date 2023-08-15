SUMMARY = "Cage: a Wayland kiosk"
HOMEPAGE = "https://www.hjdskes.nl/projects/cage/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3d06ce025701c9a0b391f15902ce8ed"

DEPENDS = " \
    wayland-native \
    wayland \
    wayland-protocols \
    wlroots-0.16 \
    pixman \
    libxkbcommon \
"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://github.com/cage-kiosk/cage;branch=master;protocol=https"
SRCREV = "83ffc574be860527814c595756a558c228a3475d"
PV = "0.1.5"
S = "${WORKDIR}/git"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'xwayland', d)}"
PACKAGECONFIG[xwayland] = "-Dxwayland=true,-Dxwayland=false,xserver-xorg,xwayland"
