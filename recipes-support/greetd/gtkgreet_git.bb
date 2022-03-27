SUMMARY = "GTK based greeter for greetd, to be run under cage or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/gtkgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "gtk+3 json-c"

PACKAGECONFIG[layershell] = "-Dlayershell=enabled,-Dlayershell=disabled,gtk-layer-shell"

PACKAGECONFIG ?= "layershell"

inherit meson pkgconfig

SRC_URI = "git://git.sr.ht/~kennylevinsen/gtkgreet;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "1.3.2"
SRCREV = "c09696f6a27aa0e4769fd3f707f27be4407ec95d"

EXTRA_OEMESON += " \
    --buildtype release \
    -Dman-pages=disabled \
"


