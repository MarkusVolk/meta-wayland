SUMMARY = "a pure wayland shell for mobile devices like Purism's Librem 5."
HOMEPAGE = "https://source.puri.sm/Librem5/feedbackd"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

REQUIRED_DISTRO_FEATURES = "wayland polkit pam pulseaudio"

DEPENDS = " \
    callaudiod \
    feedbackd \
    fribidi \
    gcr \
    git-native \
    glib-2.0 \
    gnome-desktop \
    gtk+3 \
    libgudev \
    libhandy \
    libpam \
    libsecret \
    networkmanager \
    polkit \
    pulseaudio \
    upower \
    wayland \
    wayland-native \
    wayland-protocols \
"

RDEPENDS:${PN} = " \
    gnome-control-center \
    gnome-session \
    gnome-settings-daemon \
    gsettings-desktop-schemas \
    phoc \
    squeekboard \
"

PACKAGECONFIG[tests] = "-Dtests=true,-Dtests=false"
PACKAGECONFIG[tools] = "-Dtools=true,-Dtools=false"
# install systemd service files ?
PACKAGECONFIG[systemd] = "-Dsystemd=true,-Dsystemd=false"

PACKAGECONFIG ?= " \
	${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
	tools \
"

inherit features_check gsettings meson pkgconfig

SRC_URI = " \
    gitsm://gitlab.gnome.org/World/Phosh/phosh.git;protocol=https;nobranch=1 \
    file://phosh.pam \
"

S = "${WORKDIR}/git"
PV = "0.17.0"
SRCREV = "e9651c72a6c3033597d40b135c230262a2bf4cb6"

EXTRA_OEMESON += "--buildtype=release"

do_install:append() {
    install -Dm 644 ${WORKDIR}/phosh.pam ${D}${sysconfdir}/pam.d/phosh
}

FILES:${PN} += "${datadir} ${libdir}"

