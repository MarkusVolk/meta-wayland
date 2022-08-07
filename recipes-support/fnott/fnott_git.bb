SUMMARY = "Lightweight notification daemon for wlroots-based Wayland compositors."
HOMEPAGE = "https://codeberg.org/dnkl/fnott"
BUGTRACKER = "https://codeberg.org/dnkl/fnott/issues"
SECTION = "Wayland"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://codeberg.org/dnkl/fnott.git;protocol=https;branch=releases/1.3 \
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
PV = "1.3.0"
SRCREV = "ca03bf5a697b1e392790c62b4fbddb4b1e68bd73"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES:${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""
