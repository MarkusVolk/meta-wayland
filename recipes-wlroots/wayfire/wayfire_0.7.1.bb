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
	pixman \
	seatd \
	wayland \
	wayland-native \
	wayland-protocols \
"

RRECOMMENDS_${PN} += " \
	wlroots \
	wcm \
	wf-config \
	wf-recorder \
	wf-shell \
"

PACKAGECONFIG[gles32] = "-Denable_gles32=true,-Denable_gles32=false"
PACKAGECONFIG[use_system_wfconfig] = "-Duse_system_wfconfig=enabled,-Duse_system_wfconfig=disabled,wlroots"
PACKAGECONFIG[use_system_wlroots] = "-Duse_system_wlroots=enabled,-Duse_system_wlroots=disabled,wf-config"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled"

PACKAGECONFIG ?= " \
	use_system_wfconfig \
	use_system_wlroots \
"

SRC_URI = "git://github.com/WayfireWM/wayfire.git;protocol=https"
SRCREV = "be207f693675d0b48e79d7a5f4adb6f46cd228e2"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

