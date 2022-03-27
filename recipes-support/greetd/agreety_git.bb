SUMMARY = "agreety"
HOMEPAGE = "https://kl.wtf/projects/agreety"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI += "git://git.sr.ht/~kennylevinsen/greetd;protocol=https;nobranch=1"
SRCREV = "d70030962341a3ae7a88ecf2f7af748a5a6296d1"
S = "${WORKDIR}/git"
PV = "0.8.0"

inherit cargo

CARGO_SRC_DIR = "agreety"

SRC_URI += " \
    crate://crates.io/arc-swap/0.4.6 \
    crate://crates.io/async-trait/0.1.31 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/bytes/1.0.1 \
    crate://crates.io/cc/1.0.53 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/enquote/1.0.3 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/itoa/0.4.5 \
    crate://crates.io/libc/0.2.112 \
    crate://crates.io/log/0.4.8 \
    crate://crates.io/memchr/2.3.3 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/mio/0.7.7 \
    crate://crates.io/miow/0.3.6 \
    crate://crates.io/nix/0.20.2 \
    crate://crates.io/ntapi/0.3.4 \
    crate://crates.io/once_cell/1.5.2 \
    crate://crates.io/pam-sys/0.5.6 \
    crate://crates.io/pin-project-lite/0.2.4 \
    crate://crates.io/proc-macro2/1.0.12 \
    crate://crates.io/quote/1.0.5 \
    crate://crates.io/rpassword/5.0.0 \
    crate://crates.io/ryu/1.0.4 \
    crate://crates.io/serde/1.0.110 \
    crate://crates.io/serde_derive/1.0.110 \
    crate://crates.io/serde_json/1.0.53 \
    crate://crates.io/signal-hook-registry/1.2.0 \
    crate://crates.io/socket2/0.3.19 \
    crate://crates.io/syn/1.0.21 \
    crate://crates.io/thiserror-impl/1.0.17 \
    crate://crates.io/thiserror/1.0.17 \
    crate://crates.io/tokio-macros/1.0.0 \
    crate://crates.io/tokio/1.0.2 \
    crate://crates.io/unicode-width/0.1.7 \
    crate://crates.io/unicode-xid/0.2.0 \
    crate://crates.io/users/0.11.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.8 \
"

do_configure:prepend() {
    sed -i "s|abort|unwind|" ${S}/Cargo.toml
}

