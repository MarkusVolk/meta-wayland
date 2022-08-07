
SUMMARY = "clay is a wayland compositor that does whatever I want my wayland compositor to do. Its features follows my mood."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/clay" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=715a99d2dd552e6188e74d4ed2914d5a" 

DEPENDS = " \
    wayland-native \
    wayland \
    wayland-protocols \
    wlroots \
    pixman \
    libxkbcommon \
    libinput \
"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	gitsm://git.sr.ht/~kennylevinsen/clay;branch=master;protocol=https \
	file://0001-meson.build-build-with-system-wlroots.patch \
	file://0002-meson.build-add-libinput-dependency.patch \
"

SRCREV = "74cdbeb68e5292ae9e718e81926109c1b0b42e94"
S = "${WORKDIR}/git"

