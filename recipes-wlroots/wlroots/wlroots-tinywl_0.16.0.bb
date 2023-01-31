LICENSE = "CCO-1.0"
LIC_FILES_CHKSUM = "file://tinywl/LICENSE;md5=d957da0415f5b0b974bfc6063afab2b5"

SRC_URI = "\
    https://gitlab.freedesktop.org/wlroots/wlroots/-/archive/${PV}/wlroots-${PV}.tar.gz \
    file://Makefile \
"
SRC_URI[sha256sum] = "cb867d0285cdc797ec6d127decd54a68b7166445632313b685f08ea016931044"

DEPENDS += "\
    libxkbcommon \
    wayland \
    wayland-native \
    wlroots-0.16 \
"

S = "${WORKDIR}/wlroots-${PV}"

inherit pkgconfig

EXTRA_OEMAKE = "\
    'CC=${CC}' \
    'CFLAGS=${CFLAGS}' \
    'LDFLAGS=${LDFLAGS}' \
    'WAYLAND_SCANNER=${STAGING_BINDIR_NATIVE}/wayland-scanner' \
    'WAYLAND_PROTOCOLS=${STAGING_DATADIR}/wayland-protocols' \
"

do_compile() {
    cp ${WORKDIR}/Makefile ${S}/tinywl/

    cd ${S}/tinywl
    oe_runmake ${EXTRA_OEMAKE} tinywl VERBOSE=1
}

do_install() {
    install -Dm0755 ${S}/tinywl/tinywl ${D}${bindir}/tinywl
}
