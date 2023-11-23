SUMMARY = "Nwg-look is a GTK3 settings editor, designed to work properly in wlroots-based Wayland environment."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=453b3e96b1052c0e1d1460b0134b9287"

DEPENDS = "xcur2png gtk+3"
RDEPENDS:${PN} = "xcur2png go-runtime"

GO_IMPORT = "github.com/nwg-piotr/nwg-look"

SRC_URI = "git://${GO_IMPORT};branch=main;protocol=https"
SRCREV = "ff457607d8c09dbcfc5b8cc3ceab086c0cf2aba9"
PV = "0.2.5"

inherit go go-mod pkgconfig gtk-icon-cache

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	install -d ${D}${datadir}/nwg-look/langs ${D}${datadir}/applications ${D}${datadir}/pixmaps
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/main.glade ${D}${datadir}/nwg-look
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/nwg-look.desktop ${D}${datadir}/applications
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/nwg-look.svg ${D}${datadir}/pixmaps
	install -m 0644 ${S}/src/${GO_IMPORT}/langs/en_US.json ${D}${datadir}/nwg-look/langs
}

FILES:${PN} += "${datadir}"

do_compile[network] = "1"

PRIVATE_LIBS:${PN}:append = " libstd.so"
