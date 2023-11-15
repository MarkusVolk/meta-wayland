SUMMARY = "GTK-based lockscreen for Wayland."
HOMEPAGE = "https://github.com/jovanlanik/gtklock"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

REQUIRED_DISTRO_FEATURES = "wayland pam"

DEPENDS = " \
	glib-2.0-native \
	gtk+3 \
	gtk-layer-shell \
	libpam \
	scdoc-native \
	wayland \
	wayland-native \
	wayland-protocols \
"

SRC_URI = "git://github.com/jovanlanik/gtklock.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "2.1.0"
SRCREV = "3b2ae2b087aea30e464eed92e2cd011984a9b051"

inherit autotools-brokensep pkgconfig features_check

EXTRA_OEMAKE += "PREFIX=${prefix}"
