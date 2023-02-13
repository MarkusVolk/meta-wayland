SUMMARY = "For true players only: vlc, mpv, RhythmBox, web browsers, cmus, mpd, spotify and others."
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/altdesktop/playerctl.git;protocol=https;branch=master"

RDEPENDS:${PN} = "glib-2.0"

inherit meson pkgconfig gobject-introspection

EXTRA_OEMESON += "--buildtype=release -Dbash-completions=true -Dgtk-doc=false"

S = "${WORKDIR}/git"
PV = "2.4.1"
SRCREV = "e5304e9dc9a0c0c32b3689c3f141cf266d27f59c"

FILES:${PN} += "${datadir}"

