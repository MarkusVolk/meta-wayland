SUMMARY = "A Wayland virtual keyboard"
DESCRIPTION = "Squeekboard is a virtual keyboard supporting Wayland, built \
primarily for the Librem 5 phone. \
It squeaks because some Rust got inside."
HOMEPAGE = "https://developer.puri.sm/projects/squeekboard/"
BUGTRACKER = "https://gitlab.gnome.org/World/Phosh/squeekboard/-/issues"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
                    file://debian/copyright;md5=03d0c6e3f2e8ec62fb33c983433ce7e5"

DEPENDS = "\
    feedbackd \
    glib-2.0 \
    glib-2.0-native \
    gnome-desktop \
    gtk+3 \
    libxkbcommon \
    wayland \
    wayland-native \
    wayland-protocols \
    "

SRC_URI = "\
    git://gitlab.gnome.org/World/Phosh/squeekboard.git;protocol=https;branch=${BRANCH} \
    file://0001-Pass-additional-arguments-to-cargo.patch \
    file://0001-Skip-build-tests-if-not-enabled.patch \
    crate://crates.io/atk-sys/0.9.1 \
    crate://crates.io/atk/0.7.0 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/cairo-rs/0.7.1 \
    crate://crates.io/cairo-sys-rs/0.9.2 \
    crate://crates.io/cc/1.0.72 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/dtoa/0.4.8 \
    crate://crates.io/fragile/0.3.0 \
    crate://crates.io/gdk-pixbuf-sys/0.9.1 \
    crate://crates.io/gdk-pixbuf/0.7.0 \
    crate://crates.io/gdk-sys/0.9.1 \
    crate://crates.io/gdk/0.11.0 \
    crate://crates.io/gio-sys/0.9.1 \
    crate://crates.io/gio/0.7.0 \
    crate://crates.io/glib-sys/0.9.1 \
    crate://crates.io/glib/0.8.2 \
    crate://crates.io/gobject-sys/0.9.1 \
    crate://crates.io/gtk-sys/0.9.2 \
    crate://crates.io/gtk/0.7.0 \
    crate://crates.io/hashbrown/0.8.1 \
    crate://crates.io/indexmap/1.5.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.107 \
    crate://crates.io/linked-hash-map/0.5.4 \
    crate://crates.io/maplit/1.0.2 \
    crate://crates.io/memmap/0.7.0 \
    crate://crates.io/pango-sys/0.9.1 \
    crate://crates.io/pango/0.7.0 \
    crate://crates.io/pkg-config/0.3.22 \
    crate://crates.io/proc-macro2/1.0.32 \
    crate://crates.io/quote/1.0.10 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.3.9 \
    crate://crates.io/serde/1.0.130 \
    crate://crates.io/serde_derive/1.0.130 \
    crate://crates.io/serde_yaml/0.8.21 \
    crate://crates.io/syn/1.0.81 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/xkbcommon/0.4.0 \
    crate://crates.io/yaml-rust/0.4.5 \
    "

# Modify these as desired
PV = "1.17.1"
SRCREV = "2faa98d85f1142383ec8ad1487616c1a7ad1882f"
BRANCH = "1.17"

S = "${WORKDIR}/git"

inherit cargo meson rust pkgconfig

EXTRA_OEMESON = "\
    -Dcargo-flags=[\'--target\',\'${HOST_SYS}\',\'-v\'] \
    -Dtests=false \
    -Ddepdatadir=${datadir} \
    -Donline=false \
"

export CARGO_FEATURE_STD = "1"

do_configure() {
    cargo_common_do_configure
    meson_do_configure
}

do_compile() {
    oe_cargo_fix_env
    export RUSTFLAGS="${RUSTFLAGS}"
    export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
    meson_do_compile
}

do_install() {
    oe_cargo_fix_env
    export RUSTFLAGS="${RUSTFLAGS}"
    export RUST_TARGET_PATH="${RUST_TARGET_PATH}"
    meson_do_install

    install -d ${D}${sysconfdir}/xdg/autostart
    cp ${D}${datadir}/applications/sm.puri.Squeekboard.desktop ${D}${sysconfdir}/xdg/autostart
}
