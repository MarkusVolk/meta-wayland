SUMMARY = "dmenu for wayland"
HOMEPAGE = "https://github.com/nyyManni/dmenu-wayland.git"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1b51aaede0be292f946ef75b6759e6c"


SRC_URI = "git://github.com/nyyManni/dmenu-wayland.git;protocol=https \
"

DEPENDS = " \
	cairo \
	pango \
	wayland \
	wayland-native \
	libxkbcommon \
"

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "${SRCPV}"

inherit meson pkgconfig

