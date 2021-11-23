SUMMARY = "dmenu for wayland"
HOMEPAGE = "https://github.com/nyyManni/dmenu-wayland.git"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1b51aaede0be292f946ef75b6759e6c"


SRC_URI = "git://github.com/nyyManni/dmenu-wayland.git;protocol=https;branch=master \
"

DEPENDS = " \
	cairo \
	pango \
	wayland \
	wayland-native \
	libxkbcommon \
"

S = "${WORKDIR}/git"
PV = "0.1+${SRCREV}"
SRCREV = "304c8e917651ee02b16ebf0b7097a5c53fa2236b"

inherit meson pkgconfig

