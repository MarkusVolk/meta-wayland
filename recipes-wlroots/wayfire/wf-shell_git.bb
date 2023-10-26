SUMMARY = "A GTK3-based panel for wayfire"
HOMEPAGE = "https://github.com/WayfireWM/wf-shell"
BUGTRACKER = "https://github.com/WayfireWM/wf-shell/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=36b5a4f8bf9f782fbab2099fdeb44369"

DEPENDS = " \
	wayland \
	wayland-native \
	wayland-protocols \
	wayfire \
	gtkmm3 \
	gtk-layer-shell \
	pulseaudio \
	libnotify3 \
	libdbusmenu-gtk \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = "gitsm://github.com/WayfireWM/wf-shell.git;protocol=https;branch=0.8.x"
SRCREV = "65ae2efc5eb27b9b2edb750b676c9ea53cdfeb8a"
S = "${WORKDIR}/git"
PV = "0.8.0"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

