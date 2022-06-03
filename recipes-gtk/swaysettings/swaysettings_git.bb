SUMMARY = "A GUI for configuring your sway desktop"
HOMEPAGE = "https://github.com/ErikReider/SwaySettings"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"


DEPENDS = " \
	accountsservice \
	glib-2.0 \
	granite \
	gtk+3 \
	gtk-layer-shell \
	json-glib \
	libgee \
	libhandy \
	libxml2 \
	xkeyboard-config \
"

SRC_URI = "git://github.com/ErikReider/SwaySettings.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "0.3.0"
SRCREV = "8c7ac50f78eadd65086b68c662514f95e02f8559"

inherit meson pkgconfig vala

FILES:${PN} += "${datadir}"
