SUMMARY = "callaudiod is a daemon for dealing with audio routing during phone calls."
HOMEPAGE = "https://gitlab.com/mobian1/callaudiod"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "glib-2.0 alsa-lib pulseaudio"
RDEPENDS:${PN} += "pulseaudio-server"

inherit meson pkgconfig

SRC_URI = "git://gitlab.com/mobian1/callaudiod.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.1.7"
SRCREV = "92cf20a93903fe3d7969f4002643b011011243f7"

FILES:${PN} += "${datadir}"

