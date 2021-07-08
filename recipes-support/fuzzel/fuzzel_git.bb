SUMMARY = "Fuzzel is a Wayland-native application launcher."
HOMEPAGE = "https://codeberg.org/dnkl/fuzzel"
BUGTRACKER = "https://codeberg.org/dnkl/fuzzel/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fuzzel.git;protocol=https;branch=releases/1.6 \
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
PV = "1.6.1"
SRCREV = "${PV}"

inherit meson pkgconfig features_check

PACKAGECONFIG[cairo] = "-Denable-cairo=enabled,-Denable-cairo=disabled,cairo"
PACKAGECONFIG[png] = "-Denable-png=enabled,-Denable-png=disabled,libpng"
PACKAGECONFIG[svg] = "-Denable-svg=enabled,-Denable-svg=disabled,librsvg"

PACKAGECONFIG ?= " \
	cairo \
	png \
	svg \
"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES_${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""
