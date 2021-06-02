SUMMARY = "Wayland bar for Wlroots based compositors"
DESCRIPTION = "Highly customizable Wayland bar for Sway and Wlroots based compositors."
AUTHOR = ""
HOMEPAGE = "https://github.com/Alexays/Waybar"
BUGTRACKER = "https://github.com/Alexays/Waybar/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=98f7e9dc79966298d76caf1b0a6d35c1"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

DEPENDS += " \
	glib-2.0-native \
	gtkmm3 \
	jsoncpp \
	libsigc++-3 \
	fmt \
	spdlog \
	gtk+3 \
	gobject-introspection \
	wayland \
	wayland-native \
	wayland-protocols \
"

PACKAGECONFIG[bluetooth] = "-Drfkill=enabled,-Drfkill=disabled"
PACKAGECONFIG[date] = ",,date"
PACKAGECONFIG[pulseaudio] = ",,pulseaudio"
PACKAGECONFIG[gtk-layer-shell] = ",,gtk-layer-shell"
PACKAGECONFIG[mpd] = ",,libmpdclient"
PACKAGECONFIG[network] = ",,libnl"
PACKAGECONFIG[sysvinit] = ",,eudev"
PACKAGECONFIG[systemd] = ",,systemd"
# this would rdepend on a bunch of libindicator recipes we dont provide
PACKAGECONFIG[tray] = ",,libdbusmenu"

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'bluetooth', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
    network \
    gtk-layer-shell \
    date \
"

RRECOMMENDS_${PN} += " \
	font-awesome-otf \
"

SRC_URI = "git://github.com/Alexays/Waybar.git;protocol=https"
SRCREV = "c21dc681c95361bcdbc1b4b998d2b2b9370f337c"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

PACKAGES += "${PN}-systemd"

FILES_${PN}-systemd += "${libdir}/systemd"

BBCLASSEXTEND = ""

