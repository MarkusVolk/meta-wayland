SUMMARY = "A modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable, unopinionated modules for building a \
Wayland compositor; or about 50,000 lines of code you were \
going to write anyway."
HOMEPAGE = "https://gitlab.freedesktop.org/wlroots"
BUGTRACKER = "https://gitlab.freedesktop.org/wlroots/wlroots/-/issues"
SECTION = "graphics"
LICENSE = "MIT & CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7578fad101710ea2d289ff5411f1b818"
LIC_FILES_CHKSUM += "file://tinywl/LICENSE;md5=d957da0415f5b0b974bfc6063afab2b5"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	hwdata-native \
	libdisplay-info \
	libdrm \
	libliftoff \
	libxkbcommon \
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
"

PACKAGECONFIG[opengl] = ",,virtual/egl virtual/libgles2"
PACKAGECONFIG[gbm] = ",,virtual/libgbm"
PACKAGECONFIG[libinput] = ",,libinput"
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev elogind"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"
PACKAGECONFIG[x11] = ",,xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-wm,xwayland"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd vulkan x11 xwayland opengl', d)} \
	libinput \
"

SRC_URI = "git://gitlab.freedesktop.org/wlroots/wlroots.git;branch=master;protocol=https"
SRCREV = "47a250ae12008035ee42008b3a8b426e9b96fe11"
PV = "0.17.0-dev"

S = "${WORKDIR}/git"


inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/tinywl/tinywl ${D}${bindir}
}
