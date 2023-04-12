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

RDEPENDS:${PN} = "greetd"

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

SRC_URI[arc-swap-0.4.6.sha256sum] = "b585a98a234c46fc563103e9278c9391fde1f4e6850334da895d27edb9580f62"
SRC_URI[async-trait-0.1.31.sha256sum] = "26c4f3195085c36ea8d24d32b2f828d23296a9370a28aa39d111f6f16bef9f3b"
SRC_URI[autocfg-1.0.1.sha256sum] = "cdb031dd78e28731d87d56cc8ffef4a8f36ca26c38fe2de700543e627f8a464a"
SRC_URI[bitflags-1.2.1.sha256sum] = "cf1de2fe8c75bc145a2f577add951f8134889b4795d47466a54a5c846d691693"
SRC_URI[bytes-1.0.1.sha256sum] = "b700ce4376041dcd0a327fd0097c41095743c4c8af8887265942faf1100bd040"
SRC_URI[cc-1.0.53.sha256sum] = "404b1fe4f65288577753b17e3b36a04596ee784493ec249bf81c7f2d2acd751c"
SRC_URI[cfg-if-0.1.10.sha256sum] = "4785bdd1c96b2a846b2bd7cc02e86b6b3dbf14e7e53446c4f54c92a361040822"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[enquote-1.0.3.sha256sum] = "2ec878a5d2f3b6e9eaee72373dd23414cfc7d353104741471bec712ef241a66e"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[itoa-0.4.5.sha256sum] = "b8b7a7c0c47db5545ed3fef7468ee7bb5b74691498139e4b3f6a20685dc6dd8e"
SRC_URI[libc-0.2.112.sha256sum] = "1b03d17f364a3a042d5e5d46b053bbbf82c92c9430c592dd4c064dc6ee997125"
SRC_URI[log-0.4.8.sha256sum] = "14b6052be84e6b71ab17edffc2eeabf5c2c3ae1fdb464aae35ac50c67a44e1f7"
SRC_URI[memchr-2.3.3.sha256sum] = "3728d817d99e5ac407411fa471ff9800a778d88a24685968b36824eaf4bee400"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[mio-0.7.7.sha256sum] = "e50ae3f04d169fcc9bde0b547d1c205219b7157e07ded9c5aff03e0637cb3ed7"
SRC_URI[miow-0.3.6.sha256sum] = "5a33c1b55807fbed163481b5ba66db4b2fa6cde694a5027be10fb724206c5897"
SRC_URI[nix-0.20.2.sha256sum] = "f5e06129fb611568ef4e868c14b326274959aa70ff7776e9d55323531c374945"
SRC_URI[ntapi-0.3.4.sha256sum] = "7a31937dea023539c72ddae0e3571deadc1414b300483fa7aaec176168cfa9d2"
SRC_URI[once_cell-1.5.2.sha256sum] = "13bd41f508810a131401606d54ac32a467c97172d74ba7662562ebba5ad07fa0"
SRC_URI[pam-sys-0.5.6.sha256sum] = "cd4858311a097f01a0006ef7d0cd50bca81ec430c949d7bf95cbefd202282434"
SRC_URI[pin-project-lite-0.2.4.sha256sum] = "439697af366c49a6d0a010c56a0d97685bc140ce0d377b13a2ea2aa42d64a827"
SRC_URI[proc-macro2-1.0.12.sha256sum] = "8872cf6f48eee44265156c111456a700ab3483686b3f96df4cf5481c89157319"
SRC_URI[quote-1.0.5.sha256sum] = "42934bc9c8ab0d3b273a16d8551c8f0fcff46be73276ca083ec2414c15c4ba5e"
SRC_URI[rpassword-5.0.0.sha256sum] = "d755237fc0f99d98641540e66abac8bc46a0652f19148ac9e21de2da06b326c9"
SRC_URI[ryu-1.0.4.sha256sum] = "ed3d612bc64430efeb3f7ee6ef26d590dce0c43249217bddc62112540c7941e1"
SRC_URI[serde-1.0.110.sha256sum] = "99e7b308464d16b56eba9964e4972a3eee817760ab60d88c3f86e1fecb08204c"
SRC_URI[serde_derive-1.0.110.sha256sum] = "818fbf6bfa9a42d3bfcaca148547aa00c7b915bec71d1757aa2d44ca68771984"
SRC_URI[serde_json-1.0.53.sha256sum] = "993948e75b189211a9b31a7528f950c6adc21f9720b6438ff80a7fa2f864cea2"
SRC_URI[signal-hook-registry-1.2.0.sha256sum] = "94f478ede9f64724c5d173d7bb56099ec3e2d9fc2774aac65d34b8b890405f41"
SRC_URI[socket2-0.3.19.sha256sum] = "122e570113d28d773067fab24266b66753f6ea915758651696b6e35e49f88d6e"
SRC_URI[syn-1.0.21.sha256sum] = "4696caa4048ac7ce2bcd2e484b3cef88c1004e41b8e945a277e2c25dc0b72060"
SRC_URI[thiserror-impl-1.0.17.sha256sum] = "e63c1091225b9834089b429bc4a2e01223470e3183e891582909e9d1c4cb55d9"
SRC_URI[thiserror-1.0.17.sha256sum] = "467e5ff447618a916519a4e0d62772ab14f434897f3d63f05d8700ef1e9b22c1"
SRC_URI[tokio-macros-1.0.0.sha256sum] = "42517d2975ca3114b22a16192634e8241dc5cc1f130be194645970cc1c371494"
SRC_URI[tokio-1.0.2.sha256sum] = "0ca04cec6ff2474c638057b65798f60ac183e5e79d3448bb7163d36a39cff6ec"
SRC_URI[unicode-width-0.1.7.sha256sum] = "caaa9d531767d1ff2150b9332433f32a24622147e5ebb1f26409d5da67afd479"
SRC_URI[unicode-xid-0.2.0.sha256sum] = "826e7639553986605ec5979c7dd957c7895e93eabed50ab2ffa7f6128a75097c"
SRC_URI[users-0.11.0.sha256sum] = "24cc0f6d6f267b73e5a2cadf007ba8f9bc39c6a6f9666f8cf25ea809a153b032"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.8.sha256sum] = "8093091eeb260906a183e6ae1abdba2ef5ef2257a21801128899c3fc699229c6"

do_configure:prepend() {
    sed -i "s|abort|unwind|" ${S}/Cargo.toml
}

