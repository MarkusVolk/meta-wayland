
SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ab256c90ee222b54a77ff64a58006db"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	virtual/egl \
	virtual/libgles2 \
	virtual/libgbm \
	cairo \
	wayland \
	wayland-native \
	wayland-protocols \
	jq-native \
	pixman \
	libdrm \
	libxkbcommon \
	seatd \
	hwdata-native \
	libinput \
"

RDEPENDS:${PN} ?= ""

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
"

SRC_URI = "gitsm://github.com/hyprwm/Hyprland.git;protocol=https;branch=main"

SRCREV = "431c74f111285eab41c17d724f335a324b5c833a"
PV = "v0.22-beta"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland vulkan', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled,Dsystemd=disabled,systemd"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"

FILES:${PN} += "${datadir}"

