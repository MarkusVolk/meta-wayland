SUMMARY = "nwg-launchers written in c++"
HOMEPAGE = "https://github.com/nwg-piotr/nwg-launchers"
BUGTRACKER = "https://github.com/nwg-piotr/nwg-launchers/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += " \
	gtkmm3 \
	nlohmann-json \
"

PACKAGECONFIG[bar] = "-Dbar=true,-Dbar=false"
PACKAGECONFIG[dmenu] = "-Ddmenu=true,-Ddmenu=false"
PACKAGECONFIG[grid] = "-Dgrid=true,-Dgrid=false"
PACKAGECONFIG[layer-shell] = "-Dlayer-shell=enabled,-Dlayer-shell=disabled,gtk-layer-shell"
PACKAGECONFIG[gdk-x11] = "-Dgdk-x11=enabled,-Dgdk-x11=disabled"

PACKAGECONFIG ?= " \
	bar \
	dmenu \
	grid \
	layer-shell \
"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-launchers.git;protocol=https;branch=master \
"
SRCREV = "eb007dd3e583a007e0055973453c8ec149ec0b01"
PV = "0.6.3"

S = "${WORKDIR}/git"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	sed -i '/-gtk-icon-style/d' ${D}${datadir}/nwg-launchers/nwgbar/style.css
}

BBCLASSEXTEND = ""

