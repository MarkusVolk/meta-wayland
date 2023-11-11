
SUMMARY = "A Wayland WM"
HOMEPAGE = "https://hyprland.org/"
SECTION = "graphics"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a08367f3a4cd5301ba8b88eded36b8fd"

REQUIRED_DISTRO_FEATURES = "wayland opengl"

DEPENDS += " \
	virtual/egl \
	cairo \
	wayland \
	wayland-native \
	jq-native \
	pango \
	pixman \
	libdrm \
	libxkbcommon \
	libinput \
	udis86 \
	wlroots \
"

RRECOMMENDS:${PN} ?= " \
	foot \
	jq \
	grim \
	slurp \
	wl-clipboard \
	hyprland-contrib \
"

SRC_URI = " \
	gitsm://github.com/hyprwm/Hyprland.git;protocol=https;branch=main \
	file://meson-build.patch \
"

SRCREV = "eab279984285250bd544de40868888186a8edeb7"
PV = "0.32.2"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd xwayland vulkan', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled,Dsystemd=disabled,systemd"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,libxcb xcb-util-wm xcb-util-renderutil xwayland,xwayland"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"

FILES:${PN} += "${datadir}"

do_install:append() {
	install -m 0644 ${S}/src/version.h ${D}${includedir}/hyprland/src
}
