SUMMARY = "A modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable, unopinionated modules for building a \
Wayland compositor; or about 50,000 lines of code you were \
going to write anyway."
HOMEPAGE = "https://gitlab.freedesktop.org/wlroots"
BUGTRACKER = "https://gitlab.freedesktop.org/wlroots/wlroots/-/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7578fad101710ea2d289ff5411f1b818"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libxkbcommon \
	pixman \
	seatd \
	virtual/libgbm \
	wayland \
	wayland-native \
	wayland-protocols \
"

PACKAGECONFIG[examples] = "-Dexamples=true,-Dexamples=false"
PACKAGECONFIG[gles] = ",,virtual/egl virtual/libgles2"
PACKAGECONFIG[libdrm] = ",,libdrm"
PACKAGECONFIG[libinput] = ",,libinput"
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang glslang-native"
PACKAGECONFIG[x11] = ",,xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xserver-xorg xcb-util-wm"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'vulkan', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)} \
	libinput \
"

SRC_URI = "git://gitlab.freedesktop.org/wlroots/wlroots.git;branch=master;protocol=https"
SRCREV = "9f41627aa10a94d9427bc315fa3d363a61b94d7c"
PV = "0.15.0"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

