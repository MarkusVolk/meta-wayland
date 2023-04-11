SUMMARY = "Lightweight notification daemon for wlroots-based Wayland compositors."
HOMEPAGE = "https://codeberg.org/dnkl/fnott"
BUGTRACKER = "https://codeberg.org/dnkl/fnott/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fnott.git;protocol=https;branch=release/1.4 \
"

DEPENDS = " \
	dbus \
	fcft \
	libpng \
	pixman \
	scdoc-native \
	tllist \
	wayland \
	wayland-native \
	wayland-protocols \
"

RDEPENDS:${PN} = " \
	fontconfig \
	freetype \
	wlroots \
"

inherit meson pkgconfig features_check

S = "${WORKDIR}/git"
PV = "1.4.0"
SRCREV = "f728d986ffac89db3bae63459b09f049720e7051"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES:${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""
