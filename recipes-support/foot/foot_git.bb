SUMMARY = "A fast, lightweight and minimalistic Wayland terminal emulator."
HOMEPAGE = "https://codeberg.org/dnkl/foot"
BUGTRACKER = "https://codeberg.org/dnkl/foot/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
	fcft \
	fontconfig \
	freetype \
	libxkbcommon \
	pixman \
	wayland \
	wayland-native \
"

SRC_URI = " \
	git://codeberg.org/dnkl/foot.git;protocol=https \
	file://0001-meson.build-avoid-scdoc-dependency.patch \
"

S = "${WORKDIR}/git"
PV = "1.7.2"
SRCREV = "${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "-Dterminfo=disabled"

FILES_${PN} = " \
	${bindir} \
	${datadir} \
"

BBCLASSEXTEND = ""

