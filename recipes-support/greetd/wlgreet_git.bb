SUMMARY = "Raw wayland greeter for greetd, to be run under sway or similar."
HOMEPAGE = "https://git.sr.ht/~kennylevinsen/wlgreet"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "wayland wayland-protocols wayland-native"
RDEPENDS:${PN} = "greetd"

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

SRC_URI[approx-0.3.2.sha256sum] = "f0e60b75072ecd4168020818c0107f2857bb6c4e64252d8d3983f6263b40a5c3"
SRC_URI[autocfg-1.0.1.sha256sum] = "cdb031dd78e28731d87d56cc8ffef4a8f36ca26c38fe2de700543e627f8a464a"
SRC_URI[bitflags-1.2.1.sha256sum] = "cf1de2fe8c75bc145a2f577add951f8134889b4795d47466a54a5c846d691693"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[calloop-0.9.1.sha256sum] = "42dcfbd723aa6eff9f024cfd5ad08b11144d79b2d8d37b4a31a006ceab255c77"
SRC_URI[cc-1.0.72.sha256sum] = "22a9137b95ea06864e018375b72adfb7db6e6f68cfc8df5a04d00288050485ee"
SRC_URI[cfg-if-0.1.10.sha256sum] = "4785bdd1c96b2a846b2bd7cc02e86b6b3dbf14e7e53446c4f54c92a361040822"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.19.sha256sum] = "670ad68c9088c2a963aaa298cb369688cf3f9465ce5e2d4ca10e6e0098a1ce73"
SRC_URI[dlib-0.5.0.sha256sum] = "ac1b7517328c04c2aa68422fc60a41b92208182142ed04a25879c26c8f878794"
SRC_URI[downcast-rs-1.2.0.sha256sum] = "9ea835d29036a4087793836fa931b08837ad5e957da9e23886b29586fb9b6650"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[greetd_ipc-0.8.0.sha256sum] = "80ef4898e4031d4a6133082ec838df029bfe33ae6c74a55c575e363576cc4cb7"
SRC_URI[itoa-0.4.8.sha256sum] = "b71991ff56294aa922b450139ee08b3bfc70982c6b2c7562771375cf73542dd4"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.108.sha256sum] = "8521a1b57e76b1ec69af7599e75e38e7b7fad6610f037db8c79b127201b5d119"
SRC_URI[libloading-0.7.2.sha256sum] = "afe203d669ec979b7128619bae5a63b7b42e9203c1b29146079ee05e2f604b52"
SRC_URI[log-0.4.14.sha256sum] = "51b9bbe6c47d51fc3e1a9b945965946b4c44142ab8792c50835a980d362c2710"
SRC_URI[memchr-2.4.1.sha256sum] = "308cc39be01b73d0d18f82a0e7b2a3df85245f84af96fdddc5d202d27e47b86a"
SRC_URI[memmap2-0.3.1.sha256sum] = "00b6c2ebff6180198788f5db08d7ce3bc1d0b617176678831a7510825973e357"
SRC_URI[memoffset-0.6.4.sha256sum] = "59accc507f1338036a0477ef61afdae33cde60840f4dfe481319ce3ad116ddf9"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[nix-0.15.0.sha256sum] = "3b2e0b4f3320ed72aaedb9a5ac838690a8047c7b275da22711fddff4f8a14229"
SRC_URI[nix-0.22.2.sha256sum] = "d3bb9a13fa32bc5aeb64150cd3f32d6cf4c748f8f8a417cce5d2eb976a8370ba"
SRC_URI[nom-7.1.0.sha256sum] = "1b1d11e1ef389c76fe5b81bcaf2ea32cf88b62bc494e19f493d0b30e7a930109"
SRC_URI[num-integer-0.1.44.sha256sum] = "d2cc698a63b549a70bc047073d2949cce27cd1c7b0a4a862d08a8031bc2801db"
SRC_URI[num-traits-0.2.14.sha256sum] = "9a64b1ec5cda2586e284722486d802acf1f7dbdc623e2bfc57e65ca1cd099290"
SRC_URI[once_cell-1.8.0.sha256sum] = "692fcb63b64b1758029e0a96ee63e049ce8c5948587f2f7208df04625e5f6b56"
SRC_URI[ordered-float-1.1.1.sha256sum] = "3305af35278dd29f46fcdd139e0b1fbfae2153f0e5928b39b035542dd31e37b7"
SRC_URI[os_pipe-0.8.2.sha256sum] = "81e8dfa4c69d7bde595e9a940fcf1d7f60966d3fce8a8c4cad67c60e35ea2a11"
SRC_URI[pkg-config-0.3.22.sha256sum] = "12295df4f294471248581bc09bef3c38a5e46f1e36d6a37353621a0c6c357e1f"
SRC_URI[proc-macro2-1.0.32.sha256sum] = "ba508cc11742c0dc5c1659771673afbab7a0efab23aa17e854cbab0837ed0b43"
SRC_URI[quote-1.0.10.sha256sum] = "38bc8cc6a5f2e3655e0899c1b848643b2562f853f114bfec7be120678e3ace05"
SRC_URI[rusttype-0.7.9.sha256sum] = "310942406a39981bed7e12b09182a221a29e0990f3e7e0c971f131922ed135d5"
SRC_URI[rusttype-0.8.3.sha256sum] = "9f61411055101f7b60ecf1041d87fb74205fb20b0c7a723f07ef39174cf6b4c0"
SRC_URI[ryu-1.0.5.sha256sum] = "71d301d4193d031abdd79ff7e3dd721168a9572ef3fe51a1517aba235bd8f86e"
SRC_URI[scoped-tls-1.0.0.sha256sum] = "ea6a9290e3c9cf0f18145ef7ffa62d68ee0bf5fcd651017e586dc7fd5da448c2"
SRC_URI[serde-1.0.130.sha256sum] = "f12d06de37cf59146fbdecab66aa99f9fe4f78722e3607577a5375d66bd0c913"
SRC_URI[serde_derive-1.0.130.sha256sum] = "d7bc1a1ab1961464eae040d96713baa5a724a8152c1222492465b54322ec508b"
SRC_URI[serde_json-1.0.71.sha256sum] = "063bf466a64011ac24040a49009724ee60a57da1b437617ceb32e53ad61bfb19"
SRC_URI[smallvec-1.7.0.sha256sum] = "1ecab6c735a6bb4139c0caafd0cc3635748bbb3acf4550e8138122099251f309"
SRC_URI[smithay-client-toolkit-0.15.2.sha256sum] = "210cf40de565aaaa085face1d860b17f6aee9f76f9d2816307ea2cc45eeb64f3"
SRC_URI[stb_truetype-0.3.1.sha256sum] = "f77b6b07e862c66a9f3e62a07588fee67cd90a9135a2b942409f195507b4fb51"
SRC_URI[syn-1.0.81.sha256sum] = "f2afee18b8beb5a596ecb4a2dce128c719b4ba399d34126b9e4396e3f9860966"
SRC_URI[thiserror-impl-1.0.30.sha256sum] = "aa32fd3f627f367fe16f893e2597ae3c05020f8bba2666a4e6ea73d377e5714b"
SRC_URI[thiserror-1.0.30.sha256sum] = "854babe52e4df1653706b98fcfc05843010039b406875930a70e4d9644e5c417"
SRC_URI[time-0.1.44.sha256sum] = "6db9e6914ab8b1ae1c260a4ae7a49b6c5611b40328a735b21862567685e73255"
SRC_URI[toml-0.5.8.sha256sum] = "a31142970826733df8241ef35dc040ef98c679ab14d7c3e54d827099b3acecaa"
SRC_URI[unicode-width-0.1.9.sha256sum] = "3ed742d4ea2bd1176e236172c8429aaf54486e7ac098db29ffe6529e0ce50973"
SRC_URI[unicode-xid-0.2.2.sha256sum] = "8ccb82d61f80a663efe1f787a51b16b5a51e3314d6ac365b08639f52387b33f3"
SRC_URI[version_check-0.9.3.sha256sum] = "5fecdca9a5291cc2b8dcf7dc02453fee791a280f3743cb0905f8822ae463b3fe"
SRC_URI[void-1.0.2.sha256sum] = "6a02e4885ed3bc0f2de90ea6dd45ebcbb66dacffe03547fadbb0eeae2770887d"
SRC_URI[wasi-0.10.0+wasi-snapshot-preview1.sha256sum] = "1a143597ca7c7793eff794def352d41792a93c481eb1042423ff7ff72ba2c31f"
SRC_URI[wayland-client-0.29.1.sha256sum] = "9108ec1c37f4774d0c2937ba1a6c23d1786b2152c4a13bd9fdb20e42d16e8841"
SRC_URI[wayland-commons-0.29.1.sha256sum] = "265ef51b3b3e5c9ef098f10425c39624663f459c3821dcaacc4748be975f1beb"
SRC_URI[wayland-cursor-0.29.1.sha256sum] = "6c19bb6628daf4097e58b7911481e8371e13318d5a60894779901bd3267407a7"
SRC_URI[wayland-protocols-0.29.1.sha256sum] = "7b3b6f1dc0193072ef4eadcb144da30d58c1f2895516c063804d213310703c8e"
SRC_URI[wayland-scanner-0.29.1.sha256sum] = "eaaf2bc85e7b9143159af96bd23d954a5abe391c4376db712320643280fdc6f4"
SRC_URI[wayland-sys-0.29.1.sha256sum] = "ba9e06acb775b3007f8d3094438306979e572d1d3b844d7a71557a84b055d959"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[xcursor-0.3.4.sha256sum] = "463705a63313cd4301184381c5e8042f0a7e9b4bb63653f216311d4ae74690b7"
SRC_URI[xml-rs-0.8.4.sha256sum] = "d2d7d3948613f75c98fd9328cfdcc45acc4d360655289d0a7d4ec931392200a3"
