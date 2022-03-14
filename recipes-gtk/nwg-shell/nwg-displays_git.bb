SUMMARY = "Output management utility for sway Wayland compositor, inspired by wdisplays and wlay."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://nwg_displays/main.py;md5=5604a7194822e27daaf115292855fdb8"

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
PV = "0.1.0"
SRCREV = "898560f07941285f33792579d9b9c0ff759d706e"

do_install:append() {
	install -d ${D}${datadir}/pixmaps ${D}${datadir}/applications
	install -m 644 ${S}/nwg-displays.desktop ${D}${datadir}/applications
	install -m 644 ${S}/nwg-displays.svg ${D}${datadir}/pixmaps
}

