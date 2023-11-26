SUMMARY = "A Wayland WM"
HOMEPAGE = "https://github.com/WayfireWM/wayfire"
BUGTRACKER = "https://github.com/WayfireWM/wayfire/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=14e4594093363e3c3a530e9b54cb5285"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	cairo \
	freetype \
	glm \
	hwdata-native \
	jpeg \
	libdrm \
	libevdev \
	libinput \
	libpng \
	libxkbcommon \
	libxml2 \
	mesa \
	nlohmann-json \
	pango \
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
"

RRECOMMENDS:${PN} += " \
	wcm \
	wf-recorder \
	wf-shell \
"

PACKAGECONFIG[gles32] = "-Denable_gles32=true,-Denable_gles32=false"
PACKAGECONFIG[use_system_wfconfig] = "-Duse_system_wfconfig=enabled,-Duse_system_wfconfig=disabled,wf-config"
PACKAGECONFIG[use_system_wlroots] = "-Duse_system_wlroots=enabled,-Duse_system_wlroots=disabled,wlroots-0.17"
PACKAGECONFIG[x11] = "-Dxwayland=enabled,-Dxwayland=disabled,xwayland xcb-util-renderutil xcb-util-wm"
PACKAGECONFIG[vulkan] = ",,vulkan-loader vulkan-headers glslang-native"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'vulkan x11', d)} \
	gles32 \
	use_system_wlroots \
	use_system_wfconfig \
"

SRC_URI = "gitsm://github.com/WayfireWM/wayfire.git;protocol=https;nobranch=1"

SRCREV = "97e6702ec65e73b4659087a63c71495cf70dccd8"
PV = "0.8.0"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	rm -rf ${D}${prefix}/man
}

FILES:${PN} += "${datadir} ${libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig ${libdir}/libwlroots.so ${libdir}/libwf-utils.so ${libdir}/libwf-config.so"

