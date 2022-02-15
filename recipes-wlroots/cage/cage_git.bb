
SUMMARY = "Cage: a Wayland kiosk"
HOMEPAGE = "https://www.hjdskes.nl/projects/cage/" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3d06ce025701c9a0b391f15902ce8ed" 

DEPENDS = " \
    wayland-native \
    wayland \
    wayland-protocols \
    wlroots \
    pixman \
    libxkbcommon \
"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "git://github.com/Hjdskes/${BPN}.git;branch=master;protocol=https"
SRCREV = "f71844ab54dbb3192d8c2f0a1db84d50e18536d9"
PV = "0.1.4"
S = "${WORKDIR}/git"

PACKAGECONFIG ??= ""
PACKAGECONFIG[xwayland] = "-Dxwayland=true,-Dxwayland=false,xserver-xorg,xwayland"

