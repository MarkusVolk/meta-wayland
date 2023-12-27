SUMMARY = "nwg-hello is a GTK3-based greeter for the greetd daemon, written in python."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/nwg-piotr/nwg-hello.git;protocol=https;branch=main"

RDEPENDS:${PN} = " \
	python3 \
	greetd \
	gtk+3 \
	gtk-layer-shell \
"

RRECOMMENDS:${PN} = "gnome-themes-extra"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "0.1.4"
SRCREV = "0f11425c1d9ccbc6de4073b8b95c42e37cbfa606"

