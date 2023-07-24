SUMMARY = "Output management utility for sway Wayland compositor, inspired by wdisplays and wlay."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2e53cad864b84be468b2fc0b511942ce"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-displays.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = "\
	gtk-layer-shell \
	python3 \
	python3-pygobject \
	python-i3ipc \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.3.7"
SRCREV = "1fa84c1d0ad899f8c7c3154733fdbff228af0d8a"

do_install:append() {
	install -d ${D}${datadir}/pixmaps ${D}${datadir}/applications
	install -m 644 ${S}/nwg-displays.desktop ${D}${datadir}/applications
	install -m 644 ${S}/nwg-displays.svg ${D}${datadir}/pixmaps
}

