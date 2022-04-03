SUMMARY = "Pulseaudio command line mixer."
HOMEPAGE = "https://github.com/cdemoulins/pamixer"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	git://github.com/cdemoulins/pamixer.git;protocol=https;nobranch=1 \
"

DEPENDS = "pulseaudio cxxopts"

S = "${WORKDIR}/git"
PV = "1.6"
SRCREV = "af5e13eafdb00ba342625d7d2131bec4729d2bc3"

inherit meson pkgconfig
	
