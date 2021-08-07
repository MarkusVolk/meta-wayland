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
	spdlog \
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

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'bluetooth', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'sysvinit', d)} \
    network \
    gtk-layer-shell \
    date \
"

RRECOMMENDS:${PN} += " \
	font-awesome-otf \
"

SRC_URI = "git://github.com/Alexays/Waybar.git;protocol=https"

S = "${WORKDIR}/git"
PV = "0.9.7+${SRCREV}"
SRCREV = "91cdf80c65dcecf16922e4ac724f37471cbad529"

inherit meson pkgconfig features_check

PACKAGES += "${PN}-systemd"

FILES:${PN}-systemd += "${libdir}/systemd"

BBCLASSEXTEND = ""

