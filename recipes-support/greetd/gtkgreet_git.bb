SUMMARY = "GTK based greeter for greetd, to be run under cage or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/gtkgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "gtk+3 json-c"
RDEPENDS:${PN} = "greetd"

PACKAGECONFIG[layershell] = "-Dlayershell=enabled,-Dlayershell=disabled,gtk-layer-shell"

PACKAGECONFIG ?= "layershell"

inherit meson pkgconfig

SRC_URI = "git://git.sr.ht/~kennylevinsen/gtkgreet;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.7"
SRCREV = "a90223c6b9c1d33a0f5d9b48d24d336300b5fe6b"

EXTRA_OEMESON += " \
    --buildtype release \
    -Dman-pages=disabled \
"

CFLAGS += "-Wno-deprecated-declarations"
