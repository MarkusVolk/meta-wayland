SUMMARY = "Sirula (simple rust launcher) is an app launcher for wayland"
HOMEPAGE = "https://github.com/DorianRudolph/sirula.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e49f4652534af377a713df3d9dec60cb"

SRC_URI += " \
    git://github.com/DorianRudolph/sirula.git;protocol=https;nobranch=1 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/anyhow/1.0.44 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/atk-sys/0.15.1 \
    crate://crates.io/atk/0.15.1 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitvec/0.19.5 \
    crate://crates.io/cairo-rs/0.15.12 \
    crate://crates.io/cairo-sys-rs/0.15.1 \
    crate://crates.io/cfg-expr/0.10.3 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/field-offset/0.3.4 \
    crate://crates.io/freedesktop_entry_parser/1.2.0 \
    crate://crates.io/funty/1.1.0 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-macro/0.3.21 \
    crate://crates.io/futures-sink/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/futures/0.3.21 \
    crate://crates.io/fuzzy-matcher/0.3.7 \
    crate://crates.io/gdk-pixbuf-sys/0.15.10 \
    crate://crates.io/gdk-pixbuf/0.15.11 \
    crate://crates.io/gdk-sys/0.15.1 \
    crate://crates.io/gdk/0.15.4 \
    crate://crates.io/getrandom/0.2.7 \
    crate://crates.io/gio-sys/0.15.10 \
    crate://crates.io/gio/0.15.12 \
    crate://crates.io/glib-macros/0.15.11 \
    crate://crates.io/glib-sys/0.15.10 \
    crate://crates.io/glib/0.15.12 \
    crate://crates.io/gobject-sys/0.15.10 \
    crate://crates.io/gtk-layer-shell-sys/0.4.1 \
    crate://crates.io/gtk-layer-shell/0.4.1 \
    crate://crates.io/gtk-sys/0.15.3 \
    crate://crates.io/gtk/0.15.5 \
    crate://crates.io/gtk3-macros/0.15.4 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/itertools/0.8.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lexical-core/0.7.6 \
    crate://crates.io/libc/0.2.126 \
    crate://crates.io/locale-types/0.4.0 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/memoffset/0.6.4 \
    crate://crates.io/nom/6.1.2 \
    crate://crates.io/once_cell/1.8.0 \
    crate://crates.io/osstrtools/0.2.2 \
    crate://crates.io/pango-sys/0.15.10 \
    crate://crates.io/pango/0.15.10 \
    crate://crates.io/pest/2.1.3 \
    crate://crates.io/pin-project-lite/0.2.7 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.20 \
    crate://crates.io/proc-macro-crate/1.1.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.40 \
    crate://crates.io/quote/1.0.10 \
    crate://crates.io/radium/0.5.3 \
    crate://crates.io/redox_syscall/0.2.13 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-syntax/0.6.27 \
    crate://crates.io/regex/1.6.0 \
    crate://crates.io/rustc_version/0.3.3 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/semver-parser/0.10.2 \
    crate://crates.io/semver/0.11.0 \
    crate://crates.io/serde/1.0.138 \
    crate://crates.io/serde_derive/1.0.138 \
    crate://crates.io/slab/0.4.4 \
    crate://crates.io/smallvec/1.9.0 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/syn/1.0.98 \
    crate://crates.io/system-deps/6.0.2 \
    crate://crates.io/tap/1.0.1 \
    crate://crates.io/thiserror-impl/1.0.30 \
    crate://crates.io/thiserror/1.0.30 \
    crate://crates.io/thread_local/1.1.3 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/ucd-trie/0.1.3 \
    crate://crates.io/unicode-ident/1.0.1 \
    crate://crates.io/version-compare/0.1.0 \
    crate://crates.io/version_check/0.9.3 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/wyz/0.2.0 \
    crate://crates.io/xdg/2.4.1 \
"

DEPENDS = " \
    gtk-layer-shell \
    gdk-pixbuf \
    glib-2.0 \
    cairo \
    pango \
    gtk+3 \
"

inherit cargo pkgconfig

SRCREV = "70b5ce1936c819f4e5c8674e90145e5e7badcfa8"
S = "${WORKDIR}/git"
PV = "1.0.1"
