SUMMARY = "Fuzzel is a Wayland-native application launcher."
HOMEPAGE = "https://codeberg.org/dnkl/fuzzel"
BUGTRACKER = "https://codeberg.org/dnkl/fuzzel/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fuzzel.git;protocol=https;branch=releases/1.8 \
"

DEPENDS = " \
	fcft \
	libxkbcommon \
	pixman \
	scdoc-native \
	tllist \
	wayland \
	wayland-native \
	wayland-protocols \
"

S = "${WORKDIR}/git"
PV = "1.8.0"
SRCREV = "d012346fc36802ba01161a2b31d13209f27077d4"

inherit meson pkgconfig features_check

PACKAGECONFIG[cairo] = "-Denable-cairo=enabled,-Denable-cairo=disabled,cairo"
PACKAGECONFIG[png] = "-Dpng-backend=libpng,-Dpng-backend=none,libpng"
PACKAGECONFIG[librsvg] = "-Dsvg-backend=librsvg,-Dsvg-backend=nanosvg,librsvg"

PACKAGECONFIG ?= " \
	cairo \
	png \
	librsvg \
"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES:${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""
