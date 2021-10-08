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
PACKAGECONFIG[x11] = "-Dbackends=x11,,xcb-util-renderutil"
PACKAGECONFIG[xwayland] = "-Dxwayland=enabled,-Dxwayland=disabled,xserver-xorg xcb-util-wm"
PACKAGECONFIG[examples] = "-Dexamples=true,-Dexamples=false"

PACKAGECONFIG ?= " \
	gles2 \
"

SRC_URI = "git://github.com/swaywm/wlroots.git;branch=master;protocol=https"
SRCREV = "13cdb84ee8df248db3b303fd4d1c0e3e75db2794"
PV = "0.14.1+${SRCREV}"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} = "${bindir} \
               ${libdir} \
              "

FILES:${PN}-dev = "${includedir} \
                   ${libdir}/libwlroots.so \
"

BBCLASSEXTEND = ""

