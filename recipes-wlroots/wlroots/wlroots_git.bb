SUMMARY = "A modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable, unopinionated modules for building a \
               Wayland compositor; or about 50,000 lines of code you were \
               going to write anyway"
HOMEPAGE = "https://github.com/swaywm/wlroots"
BUGTRACKER = "https://github.com/swaywm/wlroots/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7578fad101710ea2d289ff5411f1b818"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	libdrm \
	libinput \
	libxkbcommon \
	pixman \
	seatd \
	virtual/libgbm \
	wayland \
	wayland-native \
	wayland-protocols \
"

PACKAGECONFIG[gles2] = "-Drenderers=gles2"
PACKAGECONFIG[systemd] = ",,systemd"
PACKAGECONFIG[sysvinit] = ",,eudev elogind"
PACKAGECONFIG[x11-backend] = "-Dx11-backend=enabled,-Dx11-backend=disabled,xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xserver-xorg xcb-util-wm"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
	gles2 \
"

SRC_URI = "git://github.com/swaywm/wlroots.git;protocol=https"
SRCREV = "c85789a3a9f6f851e6fbc900495057ba91b3e255"
PV = "0.13+${SRCREV}"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES_${PN} = "${bindir} \
               ${libdir} \
              "

FILES_${PN}-dev = "${includedir} \
                   ${libdir}/libwlroots.so \
"

BBCLASSEXTEND = ""

