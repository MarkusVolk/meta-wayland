SUMMARY = "Modular status panel for X11 and Wayland."
HOMEPAGE = "https://codeberg.org/dnkl/yambar"
BUGTRACKER = "https://codeberg.org/dnkl/yambar/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=00b01b6aa1e1a7130832b0178f8d7485"

SRC_URI = " \
	git://codeberg.org/dnkl/yambar.git;protocol=https;branch=master \
"

DEPENDS = " \
	bison-native \
	libyaml \
	fcft \
	fmt \
	tllist \
	pixman \
	alsa-lib \
	scdoc-native \
"

RRECOMMENDS:${PN} += "font-awesome-otf"

inherit meson pkgconfig

S = "${WORKDIR}/git"
PV = "1.10.0"
SRCREV = "9a111a52f5312fe2bd7d9dbd5326d52895a165ee"

PACKAGECONFIG[wayland] = "-Dbackend-wayland=enabled,-Dbackend-wayland=disabled,wayland wayland-native wayland-protocols"
PACKAGECONFIG[x11] = "-Dbackend-x11=enabled -Dplugin-x11-xkb=enabled,-Dbackend-x11=disabled -Dplugin-x11-xkb=disabled,xcb-util xcb-util-cursor xcb-util-wm libxcb"
PACKAGECONFIG[mpd] = "-Dplugin-mpd=enabled,-Dplugin-mpd=disabled,libmpdclient"
PACKAGECONFIG[shared-plugins] = "-Dcore-plugins-as-shared-libraries=true,-Dcore-plugins-as-shared-libraries=false"
PACKAGECONFIG[alsa] = "-Dplugin-alsa=enabled,-Dplugin-alsa=disabled,alsa-lib"
PACKAGECONFIG[pulseaudio] = "-Dplugin-pulse=enabled,-Dplugin-pulse=disabled,pulseaudio"
PACKAGECONFIG[pipewire] = "-Dplugin-pipewire=enabled,-Dplugin-pipewire=disabled,pipewire"
PACKAGECONFIG[sway] = "-Dplugin-i3=enabled -Dplugin-sway-xkb=enabled,-Dplugin-i3=disabled -Dplugin-sway-xkb=disabled,json-c"
PACKAGECONFIG[cpu] = "-Dplugin-cpu=enabled,-Dplugin-cpu=disabled"
PACKAGECONFIG[mem] = "-Dplugin-mem=enabled,-Dplugin-mem=disabled"
PACKAGECONFIG[backlight] = "-Dplugin-backlight=enabled,-Dplugin-backlight=disabled,udev"
PACKAGECONFIG[clock] = "-Dplugin-clock=enabled,-Dplugin-clock=disabled"
PACKAGECONFIG[battery] = "-Dplugin-battery=enabled,-Dplugin-battery=disabled"
PACKAGECONFIG[disk-io] = "-Dplugin-disk-io=enabled,-Dplugin-disk-io=disabled"
PACKAGECONFIG[network] = "-Dplugin-network=enabled,-Dplugin-network=disabled"
PACKAGECONFIG[script] = "-Dplugin-script=enabled,-Dplugin-script=disabled"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11 pulseaudio alsa pipewire', d)} \
	shared-plugins cpu mem disk-io battery clock network script sway \
"

CFLAGS += "-Wno-format-truncation"

EXTRA_OEMESON += "--buildtype release"

PACKAGES += "${PN}-zsh-completion"
FILES:${PN}-zsh-completion = "${datadir}/zsh"

BBCLASSEXTEND = ""

