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

inherit setuptools3 useradd

S = "${WORKDIR}/git"
PV = "0.1.6"
SRCREV = "13dcb00ebbf7f4d9d16374cfb5c7272212a762e3"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system  --no-create-home --shell /bin/bash greeter"

do_install:append() {
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ nwg-hello-default.json
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ nwg-hello-default.css
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ hyprland.conf
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ sway-config
	install -D -m 644 -t ${D}${sysconfdir}/nwg-hello/ README
	install -D -m 644 -t ${D}${datadir}/nwg-hello/ nwg.jpg
	install -D -m 644 -t ${D}${datadir}/nwg-hello/ img/*

	install -d ${D}${localstatedir}/nwg-hello
	install -D -m 644 -t ${D}${localstatedir}/nwg-hello cache.json -o greeter
}
