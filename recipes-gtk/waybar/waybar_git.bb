SUMMARY = "Wayland bar for Wlroots based compositors"
DESCRIPTION = "Highly customizable Wayland bar for Sway and Wlroots based compositors."
AUTHOR = ""
HOMEPAGE = "https://github.com/Alexays/Waybar"
BUGTRACKER = "https://github.com/Alexays/Waybar/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=98f7e9dc79966298d76caf1b0a6d35c1"

REQUIRED_DISTRO_FEATURES = "wayland gobject-introspection-data"

SRC_URI = " \
	git://github.com/Alexays/Waybar.git;protocol=https;branch=master \
	file://waybar.service \
"

S = "${WORKDIR}/git"
PV = "0.9.17"
SRCREV = "f0bead34d4f3a36cb9c94d60152d22dc6a773d60"

DEPENDS += " \
	date \
	fmt \
	glib-2.0-native \
	gtkmm3 \
	jsoncpp \
	libsigc++-3 \
	libxkbcommon \
	gtk+3 \
	gobject-introspection \
	spdlog \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check

PACKAGECONFIG[libcxx] = "-Dlibcxx=true,-Dlibcxx=false,libcxx clang-tidy"
PACKAGECONFIG[evdev] = "-Dlibevdev=enabled,-Dlibevdev=disabled,libevdev"
PACKAGECONFIG[experimental] = "-Dexperimental=true,-Dexperimental=false"
PACKAGECONFIG[gtk-layer-shell] = "-Dgtk-layer-shell=enabled,-Dgtk-layer-shell=disabled,gtk-layer-shell"
PACKAGECONFIG[jack] = "-Djack=enabled,-Djack=disabled,pipewire"
PACKAGECONFIG[libinput] = "-Dlibinput=enabled,-Dlibinput=disabled,libinput"
PACKAGECONFIG[logind] = "-Dlogind=enabled,-Dlogind=disabled,systemd"
PACKAGECONFIG[mpd] = "-Dman_pages=enabled,-Dman_pages=disabled,scdoc-native"
PACKAGECONFIG[mpd] = "-Dmpd=enabled,-Dmpd=disabled,libmpdclient"
PACKAGECONFIG[mpris] = "-Dmpris=enabled,-Dmpris=disabled,playerctl"
PACKAGECONFIG[network] = "-Dlibnl=enabled,-Dlibnl=disabled,libnl"
PACKAGECONFIG[pulseaudio] = "-Dpulseaudio=enabled,-Dpulseaudio=disabled,pulseaudio"
PACKAGECONFIG[rfkill] = "-Drfkill=enabled,-Drfkill=disabled"
PACKAGECONFIG[systemd] = "-Dsystemd=enabled,-Dsystemd=disabled,systemd"
PACKAGECONFIG[tests] = "-Dtests=enabled,-Dtests=disabled,catch2"
PACKAGECONFIG[udev] = "-Dlibudev=enabled,-Dlibudev=disabled"
PACKAGECONFIG[upower_glib] = "-Dupower_glib=enabled,-Dupower_glib=disabled,upower"
PACKAGECONFIG[wireplumber] = "-Dwireplumber=enabled,-Dwireplumber=disabled,wireplumber"

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd logind udev', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pipewire', 'wireplumber', '', d)} \
    evdev \
    gtk-layer-shell \
    libinput  \
    mpris \
    network \
    rfkill \
    upower_glib \
"

do_install:append() {
	install -m 0644 ${WORKDIR}/waybar.service ${D}${systemd_user_unitdir}
}

FILES:${PN} += "${systemd_user_unitdir}"

RRECOMMENDS:${PN} += "font-awesome-otf"
