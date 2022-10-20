SUMMARY = "nwg-launchers written in c++"
HOMEPAGE = "https://github.com/nwg-piotr/nwg-launchers"
BUGTRACKER = "https://github.com/nwg-piotr/nwg-launchers/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += " \
	gtkmm3 \
	librsvg \
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
	file://0001-meson.build.patch \
"
SRCREV = "7cc3ad0bcd142f25efb5251941aec9d25366cb3a"
PV = "0.7.0"

S = "${WORKDIR}/git"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
	sed -i '/-gtk-icon-style/d' ${D}${datadir}/nwg-launchers/nwgbar/style.css
}

BBCLASSEXTEND = ""

