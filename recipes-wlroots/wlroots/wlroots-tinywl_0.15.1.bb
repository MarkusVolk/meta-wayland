LICENSE = "CCO-1.0"
LIC_FILES_CHKSUM = "file://tinywl/LICENSE;md5=d957da0415f5b0b974bfc6063afab2b5"

SRC_URI = "\
    https://gitlab.freedesktop.org/wlroots/wlroots/-/archive/${PV}/wlroots-${PV}.tar.gz \
    file://Makefile \
"
SRC_URI[md5sum] = "d847f52dd4be602918fdfa25e00aef27"

DEPENDS += "\
    libxkbcommon \
    wayland \
    wayland-native \
    wlroots \
"

S = "${WORKDIR}/wlroots-${PV}"

inherit pkgconfig

EXTRA_OEMAKE = "\
    'CC=${CC}' \
    'CFLAGS=${CFLAGS}' \
    'LDFLAGS=${LDFLAGS}' \
"

do_compile() {
    cp ${WORKDIR}/Makefile ${S}/tinywl/

    cd ${S}/tinywl
    oe_runmake ${EXTRA_OEMAKE} tinywl VERBOSE=1
}

do_install() {
    install -Dm0755 ${S}/tinywl/tinywl ${D}${bindir}/tinywl
}
