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
	jpeg \
	libdrm \
	libevdev \
	libinput \
	libpng \
	libxkbcommon \
	libxml2 \
	mesa \
	pango \
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
	wf-config \
	wf-utils \
	wf-touch \
"

RRECOMMENDS:${PN} += " \
	wcm \
	wf-config \
	wf-touch \
	wf-utils \
	wf-recorder \
	wf-shell \
"

PACKAGECONFIG[gles32] = "-Denable_gles32=true,-Denable_gles32=false"
PACKAGECONFIG[use_system_wfconfig] = "-Duse_system_wfconfig=enabled,-Duse_system_wfconfig=disabled,wf-config"
PACKAGECONFIG[use_system_wlroots] = "-Duse_system_wlroots=enabled,-Duse_system_wlroots=disabled,wlroots"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled"

PACKAGECONFIG ?= " \
	gles32 \
	use_system_wfconfig \
	use_system_wlroots \
"

SRC_URI = " \
	git://github.com/WayfireWM/wayfire.git;protocol=https;branch=0.7.x \
	file://0001-meson.build-build-with-system-wf-touch-and-wf-utils.patch \
"

SRCREV = "835a7bf9bde4e78796f9fd9f14021476084a9728"
PV = "0.7.2"
S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

