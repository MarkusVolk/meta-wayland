SUMMARY = "Raw wayland greeter for greetd, to be run under sway or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/wlgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "wayland wayland-protocols wayland-native"

inherit cargo pkgconfig

SRC_URI = "git://git.sr.ht/~kennylevinsen/wlgreet;protocol=https;branch=master"

S = "${WORKDIR}/git"
PV = "0.3"
SRCREV = "8517e578cb64a8fb3bd8f8a438cdbe46f208b87c"

SRC_URI += " \
    crate://crates.io/approx/0.3.2 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/calloop/0.9.1 \
    crate://crates.io/cc/1.0.72 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/dlib/0.5.0 \
    crate://crates.io/downcast-rs/1.2.0 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/greetd_ipc/0.8.0 \
    crate://crates.io/itoa/0.4.8 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.108 \
    crate://crates.io/libloading/0.7.2 \
    crate://crates.io/log/0.4.14 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/memmap2/0.3.1 \
    crate://crates.io/memoffset/0.6.4 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/nix/0.15.0 \
    crate://crates.io/nix/0.22.2 \
    crate://crates.io/nom/7.1.0 \
    crate://crates.io/num-integer/0.1.44 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/once_cell/1.8.0 \
    crate://crates.io/ordered-float/1.1.1 \
    crate://crates.io/os_pipe/0.8.2 \
    crate://crates.io/pkg-config/0.3.22 \
    crate://crates.io/proc-macro2/1.0.32 \
    crate://crates.io/quote/1.0.10 \
    crate://crates.io/rusttype/0.7.9 \
    crate://crates.io/rusttype/0.8.3 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/scoped-tls/1.0.0 \
    crate://crates.io/serde/1.0.130 \
    crate://crates.io/serde_derive/1.0.130 \
    crate://crates.io/serde_json/1.0.71 \
    crate://crates.io/smallvec/1.7.0 \
    crate://crates.io/smithay-client-toolkit/0.15.2 \
    crate://crates.io/stb_truetype/0.3.1 \
    crate://crates.io/syn/1.0.81 \
    crate://crates.io/thiserror-impl/1.0.30 \
    crate://crates.io/thiserror/1.0.30 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/toml/0.5.8 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/version_check/0.9.3 \
    crate://crates.io/void/1.0.2 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wayland-client/0.29.1 \
    crate://crates.io/wayland-commons/0.29.1 \
    crate://crates.io/wayland-cursor/0.29.1 \
    crate://crates.io/wayland-protocols/0.29.1 \
    crate://crates.io/wayland-scanner/0.29.1 \
    crate://crates.io/wayland-sys/0.29.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/xcursor/0.3.4 \
    crate://crates.io/xml-rs/0.8.4 \
"

