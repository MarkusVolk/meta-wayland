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
	wayland \
	wayland-native \
	wayland-protocols \
"

PACKAGECONFIG[examples] = "-Dexamples=true,-Dexamples=false,libpng ffmpeg"
PACKAGECONFIG[gles] = ",,virtual/egl virtual/libgles2 virtual/libgbm"
PACKAGECONFIG[libdrm] = ",,libdrm"
PACKAGECONFIG[libinput] = ",,libinput"
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev elogind"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang glslang-native"
PACKAGECONFIG[x11] = ",,xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-wm"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd sysvinit vulkan x11 xwayland', d)} \
	${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles', 'libdrm', d)} \
	libinput \
"

SRC_URI = "git://gitlab.freedesktop.org/wlroots/wlroots.git;branch=master;protocol=https"
SRCREV = "c20468cfa292e99357fd504fc5b5884f6078ca96"
PV = "0.15.1"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

