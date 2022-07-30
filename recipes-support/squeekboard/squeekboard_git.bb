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
    git://gitlab.gnome.org/World/Phosh/squeekboard.git;protocol=https;nobranch=1 \
    file://0001-Pass-additional-arguments-to-cargo.patch \
    file://0001-Skip-build-tests-if-not-enabled.patch \
    crate://crates.io/anyhow/1.0.58 \
    crate://crates.io/async-io/1.7.0 \
    crate://crates.io/atk-sys/0.14.0 \
    crate://crates.io/atk/0.14.0 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/cache-padded/1.2.0 \
    crate://crates.io/cairo-rs/0.14.9 \
    crate://crates.io/cairo-sys-rs/0.14.9 \
    crate://crates.io/cc/1.0.73 \
    crate://crates.io/cfg-expr/0.8.1 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/3.1.18 \
    crate://crates.io/clap_lex/0.2.4 \
    crate://crates.io/concurrent-queue/1.2.4 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/either/1.7.0 \
    crate://crates.io/enumflags2/0.6.4 \
    crate://crates.io/enumflags2_derive/0.6.4 \
    crate://crates.io/fastrand/1.7.0 \
    crate://crates.io/field-offset/0.3.4 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-lite/1.12.0 \
    crate://crates.io/futures-macro/0.3.21 \
    crate://crates.io/futures-sink/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/futures/0.3.21 \
    crate://crates.io/gdk-pixbuf-sys/0.14.0 \
    crate://crates.io/gdk-pixbuf/0.14.0 \
    crate://crates.io/gdk-sys/0.14.0 \
    crate://crates.io/gdk/0.14.3 \
    crate://crates.io/gio-sys/0.14.0 \
    crate://crates.io/gio/0.14.8 \
    crate://crates.io/glib-macros/0.14.1 \
    crate://crates.io/glib-sys/0.14.0 \
    crate://crates.io/glib/0.14.8 \
    crate://crates.io/gobject-sys/0.14.0 \
    crate://crates.io/gtk-sys/0.14.0 \
    crate://crates.io/gtk/0.14.3 \
    crate://crates.io/gtk3-macros/0.14.0 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/indexmap/1.8.2 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/itertools/0.10.3 \
    crate://crates.io/libc/0.2.126 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/maplit/1.0.2 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memmap/0.7.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/nb-connect/1.2.0 \
    crate://crates.io/nix/0.22.3 \
    crate://crates.io/once_cell/1.13.0 \
    crate://crates.io/os_str_bytes/6.2.0 \
    crate://crates.io/pango-sys/0.14.0 \
    crate://crates.io/pango/0.14.8 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/pest/2.2.1 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.25 \
    crate://crates.io/polling/2.2.0 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.1.3 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.40 \
    crate://crates.io/quote/1.0.20 \
    crate://crates.io/rustc_version/0.3.3 \
    crate://crates.io/ryu/1.0.10 \
    crate://crates.io/scoped-tls/1.0.0 \
    crate://crates.io/semver-parser/0.10.2 \
    crate://crates.io/semver/0.11.0 \
    crate://crates.io/serde/1.0.137 \
    crate://crates.io/serde_derive/1.0.137 \
    crate://crates.io/serde_repr/0.1.8 \
    crate://crates.io/serde_yaml/0.8.24 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/1.9.0 \
    crate://crates.io/socket2/0.4.4 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strum/0.21.0 \
    crate://crates.io/strum_macros/0.21.1 \
    crate://crates.io/syn/1.0.98 \
    crate://crates.io/system-deps/3.2.0 \
    crate://crates.io/textwrap/0.15.0 \
    crate://crates.io/thiserror-impl/1.0.31 \
    crate://crates.io/thiserror/1.0.31 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/ucd-trie/0.1.4 \
    crate://crates.io/unicode-ident/1.0.1 \
    crate://crates.io/unicode-segmentation/1.9.0 \
    crate://crates.io/version-compare/0.0.11 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/wepoll-ffi/0.1.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/xkbcommon/0.4.0 \
    crate://crates.io/yaml-rust/0.4.5 \
    crate://crates.io/zbus/1.9.3 \
    crate://crates.io/zbus_macros/1.9.3 \
    crate://crates.io/zvariant/2.10.0 \
    crate://crates.io/zvariant_derive/2.10.0 \
    "

# Modify these as desired
PV = "1.19.0"
SRCREV = "9f4c5e2264404c6caf1a6e2ca708d090806487ea"

S = "${WORKDIR}/git"

inherit cargo meson rust pkgconfig

EXTRA_OEMESON = "\
    -Dcargo-flags=[\'--target\',\'${HOST_SYS}\',\'-v\'] \
    -Dtests=false \
    -Ddepdatadir=${datadir} \
    -Donline=false \
    -Dnewer=true \
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
