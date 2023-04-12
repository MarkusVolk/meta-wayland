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

SRC_URI[anyhow-1.0.66.sha256sum] = "216261ddc8289130e551ddcd5ce8a064710c0d064a4d2895c67151c92b5443f6"
SRC_URI[atk-sys-0.15.1.sha256sum] = "58aeb089fb698e06db8089971c7ee317ab9644bade33383f63631437b03aafb6"
SRC_URI[atk-0.15.1.sha256sum] = "2c3d816ce6f0e2909a96830d6911c2aff044370b1ef92d7f267b43bae5addedd"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[cairo-rs-0.15.12.sha256sum] = "c76ee391b03d35510d9fa917357c7f1855bd9a6659c95a1b392e33f49b3369bc"
SRC_URI[cairo-sys-rs-0.15.1.sha256sum] = "3c55d429bef56ac9172d25fecb85dc8068307d17acd74b377866b7a1ef25d3c8"
SRC_URI[cascade-1.0.1.sha256sum] = "d499b43edbf784dd81e16f0395f5b4350a35b477da8a074251087adefc11cb52"
SRC_URI[cfg-expr-0.11.0.sha256sum] = "b0357a6402b295ca3a86bc148e84df46c02e41f41fef186bda662557ef6328aa"
SRC_URI[either-1.8.0.sha256sum] = "90e5c1c8368803113bf0c9584fc495a58b86dc8a29edbf8fe877d21d9507e797"
SRC_URI[field-offset-0.3.4.sha256sum] = "1e1c54951450cbd39f3dbcf1005ac413b49487dabf18a720ad2383eccfeffb92"
SRC_URI[futures-channel-0.3.25.sha256sum] = "52ba265a92256105f45b719605a571ffe2d1f0fea3807304b522c1d778f79eed"
SRC_URI[futures-core-0.3.25.sha256sum] = "04909a7a7e4633ae6c4a9ab280aeb86da1236243a77b694a49eacd659a4bd3ac"
SRC_URI[futures-executor-0.3.25.sha256sum] = "7acc85df6714c176ab5edf386123fafe217be88c0840ec11f199441134a074e2"
SRC_URI[futures-io-0.3.25.sha256sum] = "00f5fb52a06bdcadeb54e8d3671f8888a39697dcb0b81b23b55174030427f4eb"
SRC_URI[futures-task-0.3.25.sha256sum] = "2ffb393ac5d9a6eaa9d3fdf37ae2776656b706e200c8e16b1bdb227f5198e6ea"
SRC_URI[futures-util-0.3.25.sha256sum] = "197676987abd2f9cadff84926f410af1c183608d36641465df73ae8211dc65d6"
SRC_URI[gdk-pixbuf-sys-0.15.10.sha256sum] = "140b2f5378256527150350a8346dbdb08fadc13453a7a2d73aecd5fab3c402a7"
SRC_URI[gdk-pixbuf-0.15.11.sha256sum] = "ad38dd9cc8b099cceecdf41375bb6d481b1b5a7cd5cd603e10a69a9383f8619a"
SRC_URI[gdk-sys-0.15.1.sha256sum] = "32e7a08c1e8f06f4177fb7e51a777b8c1689f743a7bc11ea91d44d2226073a88"
SRC_URI[gdk-0.15.4.sha256sum] = "a6e05c1f572ab0e1f15be94217f0dc29088c248b14f792a5ff0af0d84bcda9e8"
SRC_URI[gio-sys-0.15.10.sha256sum] = "32157a475271e2c4a023382e9cab31c4584ee30a97da41d3c4e9fdd605abcf8d"
SRC_URI[gio-0.15.12.sha256sum] = "68fdbc90312d462781a395f7a16d96a2b379bb6ef8cd6310a2df272771c4283b"
SRC_URI[glib-macros-0.15.11.sha256sum] = "25a68131a662b04931e71891fb14aaf65ee4b44d08e8abc10f49e77418c86c64"
SRC_URI[glib-sys-0.15.10.sha256sum] = "ef4b192f8e65e9cf76cbf4ea71fa8e3be4a0e18ffe3d68b8da6836974cc5bad4"
SRC_URI[glib-0.15.12.sha256sum] = "edb0306fbad0ab5428b0ca674a23893db909a98582969c9b537be4ced78c505d"
SRC_URI[gobject-sys-0.15.10.sha256sum] = "0d57ce44246becd17153bd035ab4d32cfee096a657fc01f2231c9278378d1e0a"
SRC_URI[gtk-layer-shell-sys-0.4.4.sha256sum] = "ff60230d690445577655416055dbd279d05631b03ab07f935e39f5fe81084c0a"
SRC_URI[gtk-layer-shell-0.4.4.sha256sum] = "4316ff523ae445bd6efaf253f217598dd074619fe67b9199b5b0cd5ff99144da"
SRC_URI[gtk-sys-0.15.3.sha256sum] = "d5bc2f0587cba247f60246a0ca11fe25fb733eabc3de12d1965fc07efab87c84"
SRC_URI[gtk-0.15.5.sha256sum] = "92e3004a2d5d6d8b5057d2b57b3712c9529b62e82c77f25c1fecde1fd5c23bd0"
SRC_URI[gtk3-macros-0.15.4.sha256sum] = "24f518afe90c23fba585b2d7697856f9e6a7bbc62f65588035e66f6afb01a2e9"
SRC_URI[heck-0.4.0.sha256sum] = "2540771e65fc8cb83cd6e8a237f70c319bd5c29f78ed1084ba5d50eeac86f7f9"
SRC_URI[itertools-0.8.2.sha256sum] = "f56a2d0bc861f9165be4eb3442afd3c236d8a98afd426f65d92324ae1091a484"
SRC_URI[libc-0.2.137.sha256sum] = "fc7fcc620a3bff7cdd7a365be3376c97191aeaccc2a603e600951e452615bf89"
SRC_URI[libpulse-binding-2.26.0.sha256sum] = "17be42160017e0ae993c03bfdab4ecb6f82ce3f8d515bd8da8fdf18d10703663"
SRC_URI[libpulse-sys-1.19.3.sha256sum] = "991e6bd0efe2a36e6534e136e7996925e4c1a8e35b7807fe533f2beffff27c30"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[num-derive-0.3.3.sha256sum] = "876a53fff98e03a936a674b29568b0e605f06b29372c2489ff4de23f1949743d"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[once_cell-1.16.0.sha256sum] = "86f0b0d4bf799edbc74508c1e8bf170ff5f41238e5f8225603ca7caaae2b7860"
SRC_URI[pango-sys-0.15.10.sha256sum] = "d2a00081cde4661982ed91d80ef437c20eacaf6aa1a5962c0279ae194662c3aa"
SRC_URI[pango-0.15.10.sha256sum] = "22e4045548659aee5313bde6c582b0d83a627b7904dd20dc2d9ef0895d414e4f"
SRC_URI[pest-2.4.1.sha256sum] = "a528564cc62c19a7acac4d81e01f39e53e25e17b934878f4c6d25cc2836e62f8"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.26.sha256sum] = "6ac9a59f73473f1b8d852421e59e64809f025994837ef743615c6d0c5b305160"
SRC_URI[proc-macro-crate-1.2.1.sha256sum] = "eda0fc3b0fb7c975631757e14d9049da17374063edb6ebbcbc54d880d4fe94e9"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.47.sha256sum] = "5ea3d908b0e36316caf9e9e2c4625cdde190a7e6f440d794667ed17a1855e725"
SRC_URI[pulsectl-rs-0.3.2.sha256sum] = "06a988bceed1981b2c5fc4a3da0e4e073fdaff8e6bd022b089f54bc573dc3cfc"
SRC_URI[quote-1.0.21.sha256sum] = "bbe448f377a7d6961e30f5955f9b8d106c3f5e449d493ee1b125c1d43c2b5179"
SRC_URI[rustc_version-0.3.3.sha256sum] = "f0dfe2087c51c460008730de8b57e6a320782fbfb312e1f4d520e6c6fae155ee"
SRC_URI[semver-parser-0.10.2.sha256sum] = "00b0bef5b7f9e0df16536d3961cfb6e84331c065b4066afb39768d0e319411f7"
SRC_URI[semver-0.11.0.sha256sum] = "f301af10236f6df4160f7c3f04eec6dbc70ace82d23326abad5edee88801c6b6"
SRC_URI[serde-1.0.147.sha256sum] = "d193d69bae983fc11a79df82342761dfbf28a99fc8d203dca4c3c1b590948965"
SRC_URI[shrinkwraprs-0.3.0.sha256sum] = "e63e6744142336dfb606fe2b068afa2e1cca1ee6a5d8377277a92945d81fa331"
SRC_URI[slab-0.4.7.sha256sum] = "4614a76b2a8be0058caa9dbbaf66d988527d86d003c11a94fbd335d7661edcef"
SRC_URI[smallvec-1.10.0.sha256sum] = "a507befe795404456341dfab10cef66ead4c041f62b8b11bbb92bffe5d0953e0"
SRC_URI[syn-1.0.103.sha256sum] = "a864042229133ada95abf3b54fdc62ef5ccabe9515b64717bcb9a1919e59445d"
SRC_URI[system-deps-6.0.3.sha256sum] = "2955b1fe31e1fa2fbd1976b71cc69a606d7d4da16f6de3333d0c92d51419aeff"
SRC_URI[thiserror-impl-1.0.37.sha256sum] = "982d17546b47146b28f7c22e3d08465f6b8903d0ea13c1660d9d84a6e7adcdbb"
SRC_URI[thiserror-1.0.37.sha256sum] = "10deb33631e3c9018b9baf9dcbbc4f737320d2b576bac10f6aefa048fa407e3e"
SRC_URI[toml-0.5.9.sha256sum] = "8d82e1a7758622a465f8cee077614c73484dac5b836c02ff6a40d5d1010324d7"
SRC_URI[ucd-trie-0.1.5.sha256sum] = "9e79c4d996edb816c91e4308506774452e55e95c3c9de07b6729e17e15a5ef81"
SRC_URI[unicode-ident-1.0.5.sha256sum] = "6ceab39d59e4c9499d4e5a8ee0e2735b891bb7308ac83dfb4e80cad195c9f6f3"
SRC_URI[version-compare-0.1.1.sha256sum] = "579a42fc0b8e0c63b76519a339be31bed574929511fa53c1a3acae26eb258f29"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"

S = "${WORKDIR}/git"
PV = "0.1"
SRCREV = "d0d70720a1af3dfa6c4298c8db2807a37f143056"

inherit cargo pkgconfig features_check
