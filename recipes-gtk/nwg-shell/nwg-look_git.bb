SUMMARY = "Nwg-look is a GTK3 settings editor, designed to work properly in wlroots-based Wayland environment."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=2e53cad864b84be468b2fc0b511942ce"

DEPENDS = "xcur2png gtk+3"
RDEPENDS:${PN} = "xcur2png"

GO_IMPORT = "github.com/nwg-piotr/nwg-look.git"

SRC_URI = "git://${GO_IMPORT};branch=main;protocol=https"
SRCREV = "36b6d80f20244d6886efd6e1f1fcff75bc3281c2"
PV = "0.1.2"

inherit go go-mod pkgconfig gtk-icon-cache

GO_INSTALL = "${GO_IMPORT}"

do_install:append() {
	install -d ${D}${datadir}/nwg-look ${D}${datadir}/applications ${D}${datadir}/icons/hicolor/scalable/apps
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/main.glade ${D}${datadir}/nwg-look
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/nwg-look.desktop ${D}${datadir}/applications
	install -m 0644 ${S}/src/${GO_IMPORT}/stuff/nwg-look.svg ${D}${datadir}/icons/hicolor/scalable/apps
}

FILES:${PN} += "${datadir}"

do_compile[network] = "1"

