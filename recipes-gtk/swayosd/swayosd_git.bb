SUMMARY = "A OSD window for common actions like volume and capslock."
HOMEPAGE = "https://github.com/ErikReider/SwayOSD"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = "glib-2.0 gtk+3 gtk-layer-shell pango pulseaudio"

SRC_URI = " \
    git://github.com/ErikReider/SwayOSD.git;protocol=https;branch=main \
    crate://crates.io/anyhow/1.0.66 \
    crate://crates.io/atk-sys/0.15.1 \
    crate://crates.io/atk/0.15.1 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/cairo-rs/0.15.12 \
    crate://crates.io/cairo-sys-rs/0.15.1 \
    crate://crates.io/cascade/1.0.1 \
    crate://crates.io/cfg-expr/0.11.0 \
    crate://crates.io/either/1.8.0 \
    crate://crates.io/field-offset/0.3.4 \
    crate://crates.io/futures-channel/0.3.25 \
    crate://crates.io/futures-core/0.3.25 \
    crate://crates.io/futures-executor/0.3.25 \
    crate://crates.io/futures-io/0.3.25 \
    crate://crates.io/futures-task/0.3.25 \
    crate://crates.io/futures-util/0.3.25 \
    crate://crates.io/gdk-pixbuf-sys/0.15.10 \
    crate://crates.io/gdk-pixbuf/0.15.11 \
    crate://crates.io/gdk-sys/0.15.1 \
    crate://crates.io/gdk/0.15.4 \
    crate://crates.io/gio-sys/0.15.10 \
    crate://crates.io/gio/0.15.12 \
    crate://crates.io/glib-macros/0.15.11 \
    crate://crates.io/glib-sys/0.15.10 \
    crate://crates.io/glib/0.15.12 \
    crate://crates.io/gobject-sys/0.15.10 \
    crate://crates.io/gtk-layer-shell-sys/0.4.4 \
    crate://crates.io/gtk-layer-shell/0.4.4 \
    crate://crates.io/gtk-sys/0.15.3 \
    crate://crates.io/gtk/0.15.5 \
    crate://crates.io/gtk3-macros/0.15.4 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/itertools/0.8.2 \
    crate://crates.io/libc/0.2.137 \
    crate://crates.io/libpulse-binding/2.26.0 \
    crate://crates.io/libpulse-sys/1.19.3 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/once_cell/1.16.0 \
    crate://crates.io/pango-sys/0.15.10 \
    crate://crates.io/pango/0.15.10 \
    crate://crates.io/pest/2.4.1 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.26 \
    crate://crates.io/proc-macro-crate/1.2.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.47 \
    crate://crates.io/pulsectl-rs/0.3.2 \
    crate://crates.io/quote/1.0.21 \
    crate://crates.io/rustc_version/0.3.3 \
    crate://crates.io/semver-parser/0.10.2 \
    crate://crates.io/semver/0.11.0 \
    crate://crates.io/serde/1.0.147 \
    crate://crates.io/shrinkwraprs/0.3.0 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/syn/1.0.103 \
    crate://crates.io/system-deps/6.0.3 \
    crate://crates.io/thiserror-impl/1.0.37 \
    crate://crates.io/thiserror/1.0.37 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/ucd-trie/0.1.5 \
    crate://crates.io/unicode-ident/1.0.5 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
"

S = "${WORKDIR}/git"
PV = "0.1"
SRCREV = "d0d70720a1af3dfa6c4298c8db2807a37f143056"

inherit cargo pkgconfig features_check
