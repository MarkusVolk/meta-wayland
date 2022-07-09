SUMMARY = "Graphical console greeter for greetd"
HOMEPAGE = "https://github.com/apognu/tuigreet.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = " \
    git://github.com/apognu/tuigreet.git;protocol=https;nobranch=1 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/async-trait/0.1.53 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/bytes/1.1.0 \
    crate://crates.io/cassowary/0.3.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/cpufeatures/0.2.2 \
    crate://crates.io/crossterm/0.23.2 \
    crate://crates.io/crossterm_winapi/0.9.0 \
    crate://crates.io/dashmap/5.3.3 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dlv-list/0.3.0 \
    crate://crates.io/find-crate/0.6.3 \
    crate://crates.io/fluent-bundle/0.15.2 \
    crate://crates.io/fluent-langneg/0.13.0 \
    crate://crates.io/fluent-syntax/0.11.0 \
    crate://crates.io/fluent/0.16.0 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-macro/0.3.21 \
    crate://crates.io/futures-sink/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/futures/0.3.21 \
    crate://crates.io/generic-array/0.14.5 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.2.6 \
    crate://crates.io/greetd_ipc/0.8.0 \
    crate://crates.io/hashbrown/0.12.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/i18n-config/0.4.2 \
    crate://crates.io/i18n-embed-fl/0.6.4 \
    crate://crates.io/i18n-embed-impl/0.8.0 \
    crate://crates.io/i18n-embed/0.13.4 \
    crate://crates.io/intl-memoizer/0.5.1 \
    crate://crates.io/intl_pluralrules/7.0.1 \
    crate://crates.io/itoa/1.0.1 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.125 \
    crate://crates.io/locale_config/0.3.0 \
    crate://crates.io/lock_api/0.4.7 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/mio/0.8.3 \
    crate://crates.io/nix/0.24.1 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.13.1 \
    crate://crates.io/objc-foundation/0.1.1 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/objc_id/0.1.1 \
    crate://crates.io/once_cell/1.10.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/ordered-multimap/0.4.3 \
    crate://crates.io/parking_lot/0.12.0 \
    crate://crates.io/parking_lot_core/0.9.3 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.38 \
    crate://crates.io/pure-rust-locales/0.5.6 \
    crate://crates.io/quote/1.0.18 \
    crate://crates.io/redox_syscall/0.2.13 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.5.5 \
    crate://crates.io/rust-embed-impl/6.2.0 \
    crate://crates.io/rust-embed-utils/7.2.0 \
    crate://crates.io/rust-embed/6.4.0 \
    crate://crates.io/rust-ini/0.18.0 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/ryu/1.0.9 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/self_cell/0.10.2 \
    crate://crates.io/serde/1.0.137 \
    crate://crates.io/serde_derive/1.0.137 \
    crate://crates.io/serde_json/1.0.81 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/signal-hook-mio/0.2.3 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/signal-hook/0.3.13 \
    crate://crates.io/slab/0.4.6 \
    crate://crates.io/smallvec/1.8.0 \
    crate://crates.io/smart-default/0.6.0 \
    crate://crates.io/smawk/0.3.1 \
    crate://crates.io/socket2/0.4.5 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.92 \
    crate://crates.io/textwrap/0.15.0 \
    crate://crates.io/thiserror-impl/1.0.31 \
    crate://crates.io/thiserror/1.0.31 \
    crate://crates.io/time/0.1.43 \
    crate://crates.io/tinystr/0.3.4 \
    crate://crates.io/tokio-macros/1.7.0 \
    crate://crates.io/tokio/1.18.2 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/tui/0.18.0 \
    crate://crates.io/type-map/0.4.0 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/unic-langid-impl/0.9.0 \
    crate://crates.io/unic-langid/0.9.0 \
    crate://crates.io/unicode-linebreak/0.1.2 \
    crate://crates.io/unicode-segmentation/1.9.0 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.2.3 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.36.1 \
    crate://crates.io/windows_aarch64_msvc/0.36.1 \
    crate://crates.io/windows_i686_gnu/0.36.1 \
    crate://crates.io/windows_i686_msvc/0.36.1 \
    crate://crates.io/windows_x86_64_gnu/0.36.1 \
    crate://crates.io/windows_x86_64_msvc/0.36.1 \
    crate://crates.io/zeroize/1.5.5 \
"

inherit cargo rust

SRCREV = "599d8d5d3657e6c25b3877f84a09979a79256600"
S = "${WORKDIR}/git"
PV = "0.7.3"

