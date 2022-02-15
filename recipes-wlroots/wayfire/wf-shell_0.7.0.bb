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
	wf-config \
	pulseaudio \
	libnotify3 \
"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	https://github.com/WayfireWM/wf-shell/releases/download/v${PV}/wf-shell-${PV}.tar.xz \
"

SRC_URI[sha256sum] = "7495c690a1c021e0c82ba304513b3e7870cb329f7f0bf88df3bc5f46535d5ec7"

S = "${WORKDIR}/${PN}-${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

FILES:${PN} += "${datadir}"

BBCLASSEXTEND = ""

