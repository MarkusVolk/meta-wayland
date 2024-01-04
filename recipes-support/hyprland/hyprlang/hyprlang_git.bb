SUMMARY = "The hypr configuration language is an extremely efficient, yet easy to work with, configuration language for linux applications."
HOMEPAGE = "https:/github.com/hyprwm/hyprlang"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
	git://github.com/hyprwm/hyprlang.git;protocol=https;branch=main \
	file://0001-hyprlang.pc.in-fix-include-path.patch \
"

S = "${WORKDIR}/git"
SRCREV = "6624f2bb66d4d27975766e81f77174adbe58ec97"
PV = "0.2.1"

inherit cmake

FILES:${PN} += "${libdir} ${datadir}"
FILES:${PN}-dev = "${includedir}"
