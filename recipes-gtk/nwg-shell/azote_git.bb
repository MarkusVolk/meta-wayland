SUMMARY = "Azote is a GTK+3 based frontend for swaybg."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
	git://github.com/nwg-piotr/azote.git;protocol=https;branch=master \
"

RDEPENDS:${PN} = " \
	azote-palettes \
	python3 \
	gtk+3 \
	python3-pygobject \
	python3-pycairo \
	python3-pillow \
	python3-pkg-resources \
	python3-send2trash \
	imagemagick \
	grim \
	slurp \
	swaybg \
	wlr-randr \
"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "1.12.3"
SRCREV = "4952f35141eddf5c64693b2faf25a76a485372bb"

do_configure:prepend() {
	[ -d ${S}/dist ] && mv ${S}/dist ${S}/distrib
}

do_install:append() {
	install -d ${D}${bindir} ${D}${datadir}/azote ${D}${datadir}/pixmaps ${D}${datadir}/applications
	install -m 755 ${S}/distrib/azote ${D}${bindir}
	install -m 644 ${S}/distrib/azote.desktop ${D}${datadir}/applications
	install -m 644 ${S}/distrib/azote.svg ${D}${datadir}/pixmaps
	install -m 644 ${S}/distrib/indicator_active.png ${D}${datadir}/azote
	install -m 644 ${S}/distrib/indicator_attention.png ${D}${datadir}/azote
}

FILES:${PN}:append = " \
	${datadir} \
	${bindir} \
"
