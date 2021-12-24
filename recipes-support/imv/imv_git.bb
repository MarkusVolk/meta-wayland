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

RDEPENDS:${PN} = "bash"

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

SRC_URI = "git://git.sr.ht/~exec64/imv;protocol=https;branch=v4.3-fixes"

S = "${WORKDIR}/git"
PV = "4.3.1"
SRCREV = "ad33be2999558a8c53c86b3e632581e5208fa580"

inherit meson pkgconfig mime-xdg features_check

BBCLASSEXTEND = ""
