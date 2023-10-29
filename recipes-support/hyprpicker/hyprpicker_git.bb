SUMMARY = "A wlroots-compatible Wayland color picker that does not suck."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=936078e4e67b0e1e1bd1e862d4ffbc25"

SRC_URI = "git://github.com/hyprwm/hyprpicker.git;protocol=https;branch=main"

PV = "0.2.0"
S = "${WORKDIR}/git"
SRCREV = "8a7799ae20f3e2e2e716271c21fc9213319ca2a4"

DEPENDS = " \
	cairo \
	fribidi \
	jpeg \
	libxdmcp \
	libxkbcommon \
	pango \
	pcre \
	util-linux \
	wayland \
	wayland-native \
	wayland-protocols \
	wlroots \
"

RDEPENDS:${PN} = "wl-clipboard"

REQUIRED_DISTRO_FEATURES = "wayland"

EXTRA_OEMAKE = "\
    WAYLAND_SCANNER=${STAGING_BINDIR_NATIVE}/wayland-scanner \
    WAYLAND_PROTOCOLS=${STAGING_DATADIR}/wayland-protocols \
"

do_configure:prepend() {
    sed -i -e '$ainstall(TARGETS hyprpicker)' ${S}/CMakeLists.txt
}

do_compile:prepend() {
    cd ${S} && oe_runmake protocols
}

do_install() {
    install -d ${D}${bindir}
    install -m0755 ${B}/hyprpicker ${D}${bindir}
}

inherit cmake pkgconfig features_check
