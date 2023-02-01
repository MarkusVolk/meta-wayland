SUMMARY = "iwgtk is a wireless networking GUI for Linux with supported functionality similar to that of iwctl."
HOMEPAGE = "https://github.com/J-Lentz/iwgtk"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = " \
    gtk4 \
    qrencode \
    scdoc-native \
"

inherit meson gtk-icon-cache pkgconfig

SRC_URI = "git://github.com/J-Lentz/iwgtk.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.9"
SRCREV = "008a2a26b6e7d266d190ab85d6c25cf4b8a7bd06"

FILES:${PN} += "${systemd_user_unitdir}/iwgtk.service"

# for working dbus communication in iwd default configuration the user either needs
# to be in group 'wheel' or 'netdev'. See /usr/share/dbus-1/system.d/iwd-dbus.conf
 
RDEPENDS:${PN} = "gtk4 iwd dbus"
