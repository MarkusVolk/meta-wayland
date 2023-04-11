SUMMARY = "A lightweight overlay volume/backlight/progress/anything bar for wlroots based Wayland compositors."
HOMEPAGE = "https://github.com/francma/wob"
SECTION = "Wayland"
LICENSE = "ISC"

LIC_FILES_CHKSUM = "file://LICENSE;md5=07d60638be9414ee4e38ed68e642ba25"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \
	git://github.com/francma/wob.git;protocol=https;branch=master \
"

DEPENDS = " \
	libinih \
	wayland \
	wayland-native \
	wayland-protocols \
"

inherit meson pkgconfig features_check

PACKAGECONFIG[seccomp] = "-Dseccomp=enabled,-Dseccomp=disabled,libseccomp"
PACKAGECONFIG[man-pages] = "-Dman-pages=enabled,-Dman-pages=disabled,scdoc-native"

PACKAGECONFIG ??= ""

S = "${WORKDIR}/git"
PV = "0.14.2"
SRCREV = "19318a308033ee5ea626ba61068af408392a6251"

EXTRA_OEMESON += "--buildtype release"

do_install:append() {
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -d ${D}${systemd_user_unitdir}/sockets.target.wants ${D}${systemd_user_unitdir}/graphical-session.target.wants
        install -m 0644 ${S}/contrib/systemd/* ${D}${systemd_user_unitdir}
        ln -fs ${systemd_user_unitdir}/wob.socket ${D}${systemd_user_unitdir}/sockets.target.wants
        ln -fs ${systemd_user_unitdir}/wob.service ${D}${systemd_user_unitdir}/graphical-session.target.wants
    fi
}

FILES:${PN} += "${systemd_user_unitdir}"
