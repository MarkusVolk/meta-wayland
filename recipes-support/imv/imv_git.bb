SUMMARY = "imv - X11/Wayland Image Viewer"
DESCRIPTION = "imv is a command line image viewer intended for use with tiling window managers."
HOMEPAGE = "https://github.com/eXeC64/imv"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=dcea6b87dbecf6c482d399a15ff8ba49"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += " \
	glib-2.0 \
	libxkbcommon \
	pango \
	cairo \
	icu \
	inih \
	wayland \
	wayland-native \
	wayland-protocols \
	virtual/egl \
"

PACKAGECONFIG[x11] = "-Dwindows=all,-Dwindows=wayland,libx11 libglu xcb-util-renderutil"
PACKAGECONFIG[tiff] = ",,tiff"
PACKAGECONFIG[png] = ",,libpng"
PACKAGECONFIG[jpeg] = ",,libjpeg-turbo"
PACKAGECONFIG[rsvg] = ",,librsvg"
PACKAGECONFIG[doc] = ",,asciidoc-native"

PACKAGECONFIG ?= " \
	jpeg \
	png \
	tiff \
	rsvg \
"

SRC_URI = "git://github.com/eXeC64/imv.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "4.3.0"
SRCREV = "f58e81288b2138d1b532cf11fb95bbcbac362a4e"

inherit meson pkgconfig mime-xdg features_check

BBCLASSEXTEND = ""
