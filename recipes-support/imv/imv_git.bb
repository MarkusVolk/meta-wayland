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
#librsvg shipped in oe-core is too old ... requires v2.44
PACKAGECONFIG[rsvg] = ",,librsvg"

PACKAGECONFIG ?= " \
	jpeg \
	png \
	tiff \
"

SRC_URI = "git://github.com/eXeC64/imv.git;protocol=https"

S = "${WORKDIR}/git"
PV = "4.2.0"
SRCREV = "v${PV}"

inherit meson pkgconfig mime-xdg features-check

BBCLASSEXTEND = ""
