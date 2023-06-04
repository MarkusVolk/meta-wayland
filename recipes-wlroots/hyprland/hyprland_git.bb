
SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a08367f3a4cd5301ba8b88eded36b8fd"

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
	libdisplay-info \
	pango \
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

SRCREV = "51a930f802c71a0e67f05e7b176ded74e8e95f87"
PV = "0.26.0"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland vulkan', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled,Dsystemd=disabled,systemd"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"

FILES:${PN} += "${datadir}"

