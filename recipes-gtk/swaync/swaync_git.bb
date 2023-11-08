SUMMARY = "A simple notification daemon with a GTK gui for notifications and the control center."
HOMEPAGE = "https://github.com/ErikReider/SwayNotificationCenter"
BUGTRACKER = "github.com/ErikReider/SwayNotificationCenter"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"


DEPENDS = " \
            gtk+3 \
            gtk-layer-shell \
            json-glib \
            libhandy \
            libgee \
            pulseaudio \
"

SRC_URI = " \
	git://github.com/ErikReider/SwayNotificationCenter.git;protocol=https;nobranch=1 \
"

S = "${WORKDIR}/git"
PV = "0.9.0"
SRCREV = "deaf9a68b7425e0a0945a029bcbac767a7a72ae4"

PACKAGECONFIG[bash] = "-Dbash-completions=true,-Dbash-completions=false"
PACKAGECONFIG[fish] = "-Dfish-completions=true,-Dfish-completions=false"
PACKAGECONFIG[man-pages] = "-Dman-pages=true,-Dman-pages=false,scdoc-native"
PACKAGECONFIG[scripting] = "-Dscripting=true,-Dscripting=false"
PACKAGECONFIG[systemd] = "-Dsystemd-service=true,-Dsystemd-service=false"
PACKAGECONFIG[zsh] = "-Dzsh-completions=true,-Dzsh-completions=false"

PACKAGECONFIG ?= " \
	bash \
"

inherit meson pkgconfig vala

VALA_MESON_OPTION = ""

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

