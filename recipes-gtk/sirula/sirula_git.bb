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

SRC_URI[aho-corasick-0.7.18.sha256sum] = "1e37cfd5e7657ada45f742d6e99ca5788580b5c529dc78faf11ece6dc702656f"
SRC_URI[anyhow-1.0.44.sha256sum] = "61604a8f862e1d5c3229fdd78f8b02c68dcf73a4c4b05fd636d12240aaa242c1"
SRC_URI[arrayvec-0.5.2.sha256sum] = "23b62fc65de8e4e7f52534fb52b0f3ed04746ae267519eef2a83941e8085068b"
SRC_URI[atk-sys-0.15.1.sha256sum] = "58aeb089fb698e06db8089971c7ee317ab9644bade33383f63631437b03aafb6"
SRC_URI[atk-0.15.1.sha256sum] = "2c3d816ce6f0e2909a96830d6911c2aff044370b1ef92d7f267b43bae5addedd"
SRC_URI[autocfg-1.0.1.sha256sum] = "cdb031dd78e28731d87d56cc8ffef4a8f36ca26c38fe2de700543e627f8a464a"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitvec-0.19.5.sha256sum] = "8942c8d352ae1838c9dda0b0ca2ab657696ef2232a20147cf1b30ae1a9cb4321"
SRC_URI[cairo-rs-0.15.12.sha256sum] = "c76ee391b03d35510d9fa917357c7f1855bd9a6659c95a1b392e33f49b3369bc"
SRC_URI[cairo-sys-rs-0.15.1.sha256sum] = "3c55d429bef56ac9172d25fecb85dc8068307d17acd74b377866b7a1ef25d3c8"
SRC_URI[cfg-expr-0.10.3.sha256sum] = "0aacacf4d96c24b2ad6eb8ee6df040e4f27b0d0b39a5710c30091baa830485db"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[dirs-sys-0.3.7.sha256sum] = "1b1d1d91c932ef41c0f2663aa8b0ca0342d444d842c06914aa0a7e352d0bada6"
SRC_URI[dirs-4.0.0.sha256sum] = "ca3aa72a6f96ea37bbc5aa912f6788242832f75369bdfdadcb0e38423f100059"
SRC_URI[either-1.6.1.sha256sum] = "e78d4f1cc4ae33bbfc157ed5d5a5ef3bc29227303d595861deb238fcec4e9457"
SRC_URI[field-offset-0.3.4.sha256sum] = "1e1c54951450cbd39f3dbcf1005ac413b49487dabf18a720ad2383eccfeffb92"
SRC_URI[freedesktop_entry_parser-1.2.0.sha256sum] = "347aa21b13048c0a0a4dc3118b661eb89d73ea675eca95b6a0f11e698ff66ec1"
SRC_URI[funty-1.1.0.sha256sum] = "fed34cd105917e91daa4da6b3728c47b068749d6a62c59811f06ed2ac71d9da7"
SRC_URI[futures-channel-0.3.21.sha256sum] = "c3083ce4b914124575708913bca19bfe887522d6e2e6d0952943f5eac4a74010"
SRC_URI[futures-core-0.3.21.sha256sum] = "0c09fd04b7e4073ac7156a9539b57a484a8ea920f79c7c675d05d289ab6110d3"
SRC_URI[futures-executor-0.3.21.sha256sum] = "9420b90cfa29e327d0429f19be13e7ddb68fa1cccb09d65e5706b8c7a749b8a6"
SRC_URI[futures-io-0.3.21.sha256sum] = "fc4045962a5a5e935ee2fdedaa4e08284547402885ab326734432bed5d12966b"
SRC_URI[futures-macro-0.3.21.sha256sum] = "33c1e13800337f4d4d7a316bf45a567dbcb6ffe087f16424852d97e97a91f512"
SRC_URI[futures-sink-0.3.21.sha256sum] = "21163e139fa306126e6eedaf49ecdb4588f939600f0b1e770f4205ee4b7fa868"
SRC_URI[futures-task-0.3.21.sha256sum] = "57c66a976bf5909d801bbef33416c41372779507e7a6b3a5e25e4749c58f776a"
SRC_URI[futures-util-0.3.21.sha256sum] = "d8b7abd5d659d9b90c8cba917f6ec750a74e2dc23902ef9cd4cc8c8b22e6036a"
SRC_URI[futures-0.3.21.sha256sum] = "f73fe65f54d1e12b726f517d3e2135ca3125a437b6d998caf1962961f7172d9e"
SRC_URI[fuzzy-matcher-0.3.7.sha256sum] = "54614a3312934d066701a80f20f15fa3b56d67ac7722b39eea5b4c9dd1d66c94"
SRC_URI[gdk-pixbuf-sys-0.15.10.sha256sum] = "140b2f5378256527150350a8346dbdb08fadc13453a7a2d73aecd5fab3c402a7"
SRC_URI[gdk-pixbuf-0.15.11.sha256sum] = "ad38dd9cc8b099cceecdf41375bb6d481b1b5a7cd5cd603e10a69a9383f8619a"
SRC_URI[gdk-sys-0.15.1.sha256sum] = "32e7a08c1e8f06f4177fb7e51a777b8c1689f743a7bc11ea91d44d2226073a88"
SRC_URI[gdk-0.15.4.sha256sum] = "a6e05c1f572ab0e1f15be94217f0dc29088c248b14f792a5ff0af0d84bcda9e8"
SRC_URI[getrandom-0.2.7.sha256sum] = "4eb1a864a501629691edf6c15a593b7a51eebaa1e8468e9ddc623de7c9b58ec6"
SRC_URI[gio-sys-0.15.10.sha256sum] = "32157a475271e2c4a023382e9cab31c4584ee30a97da41d3c4e9fdd605abcf8d"
SRC_URI[gio-0.15.12.sha256sum] = "68fdbc90312d462781a395f7a16d96a2b379bb6ef8cd6310a2df272771c4283b"
SRC_URI[glib-macros-0.15.11.sha256sum] = "25a68131a662b04931e71891fb14aaf65ee4b44d08e8abc10f49e77418c86c64"
SRC_URI[glib-sys-0.15.10.sha256sum] = "ef4b192f8e65e9cf76cbf4ea71fa8e3be4a0e18ffe3d68b8da6836974cc5bad4"
SRC_URI[glib-0.15.12.sha256sum] = "edb0306fbad0ab5428b0ca674a23893db909a98582969c9b537be4ced78c505d"
SRC_URI[gobject-sys-0.15.10.sha256sum] = "0d57ce44246becd17153bd035ab4d32cfee096a657fc01f2231c9278378d1e0a"
SRC_URI[gtk-layer-shell-sys-0.4.1.sha256sum] = "e33369d2f611525af872de2ffb690ee6464774df67aec021331bad0e5f95a656"
SRC_URI[gtk-layer-shell-0.4.1.sha256sum] = "a703030a7226291a0f9bf25947122ff194990e369f05cacb596b6730f31ef9b8"
SRC_URI[gtk-sys-0.15.3.sha256sum] = "d5bc2f0587cba247f60246a0ca11fe25fb733eabc3de12d1965fc07efab87c84"
SRC_URI[gtk-0.15.5.sha256sum] = "92e3004a2d5d6d8b5057d2b57b3712c9529b62e82c77f25c1fecde1fd5c23bd0"
SRC_URI[gtk3-macros-0.15.4.sha256sum] = "24f518afe90c23fba585b2d7697856f9e6a7bbc62f65588035e66f6afb01a2e9"
SRC_URI[heck-0.4.0.sha256sum] = "2540771e65fc8cb83cd6e8a237f70c319bd5c29f78ed1084ba5d50eeac86f7f9"
SRC_URI[itertools-0.8.2.sha256sum] = "f56a2d0bc861f9165be4eb3442afd3c236d8a98afd426f65d92324ae1091a484"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lexical-core-0.7.6.sha256sum] = "6607c62aa161d23d17a9072cc5da0be67cdfc89d3afb1e8d9c842bebc2525ffe"
SRC_URI[libc-0.2.126.sha256sum] = "349d5a591cd28b49e1d1037471617a32ddcda5731b99419008085f72d5a53836"
SRC_URI[locale-types-0.4.0.sha256sum] = "02be1c159bff06af0fdec8942a4f3a9242cc2ecebdfccb0d29d3c100ca5e7a97"
SRC_URI[memchr-2.4.1.sha256sum] = "308cc39be01b73d0d18f82a0e7b2a3df85245f84af96fdddc5d202d27e47b86a"
SRC_URI[memoffset-0.6.4.sha256sum] = "59accc507f1338036a0477ef61afdae33cde60840f4dfe481319ce3ad116ddf9"
SRC_URI[nom-6.1.2.sha256sum] = "e7413f999671bd4745a7b624bd370a569fb6bc574b23c83a3c5ed2e453f3d5e2"
SRC_URI[once_cell-1.8.0.sha256sum] = "692fcb63b64b1758029e0a96ee63e049ce8c5948587f2f7208df04625e5f6b56"
SRC_URI[osstrtools-0.2.2.sha256sum] = "f328dada9eee3ab878d2d367d8bf323c12b20f881c5566ae6e6708b3862dcaba"
SRC_URI[pango-sys-0.15.10.sha256sum] = "d2a00081cde4661982ed91d80ef437c20eacaf6aa1a5962c0279ae194662c3aa"
SRC_URI[pango-0.15.10.sha256sum] = "22e4045548659aee5313bde6c582b0d83a627b7904dd20dc2d9ef0895d414e4f"
SRC_URI[pest-2.1.3.sha256sum] = "10f4872ae94d7b90ae48754df22fd42ad52ce740b8f370b03da4835417403e53"
SRC_URI[pin-project-lite-0.2.7.sha256sum] = "8d31d11c69a6b52a174b42bdc0c30e5e11670f90788b2c471c31c1d17d449443"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.20.sha256sum] = "7c9b1041b4387893b91ee6746cddfc28516aff326a3519fb2adf820932c5e6cb"
SRC_URI[proc-macro-crate-1.1.0.sha256sum] = "1ebace6889caf889b4d3f76becee12e90353f2b8c7d875534a71e5742f8f6f83"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.40.sha256sum] = "dd96a1e8ed2596c337f8eae5f24924ec83f5ad5ab21ea8e455d3566c69fbcaf7"
SRC_URI[quote-1.0.10.sha256sum] = "38bc8cc6a5f2e3655e0899c1b848643b2562f853f114bfec7be120678e3ace05"
SRC_URI[radium-0.5.3.sha256sum] = "941ba9d78d8e2f7ce474c015eea4d9c6d25b6a3327f9832ee29a4de27f91bbb8"
SRC_URI[redox_syscall-0.2.13.sha256sum] = "62f25bc4c7e55e0b0b7a1d43fb893f4fa1361d0abe38b9ce4f323c2adfe6ef42"
SRC_URI[redox_users-0.4.3.sha256sum] = "b033d837a7cf162d7993aded9304e30a83213c648b6e389db233191f891e5c2b"
SRC_URI[regex-syntax-0.6.27.sha256sum] = "a3f87b73ce11b1619a3c6332f45341e0047173771e8b8b73f87bfeefb7b56244"
SRC_URI[regex-1.6.0.sha256sum] = "4c4eb3267174b8c6c2f654116623910a0fef09c4753f8dd83db29c48a0df988b"
SRC_URI[rustc_version-0.3.3.sha256sum] = "f0dfe2087c51c460008730de8b57e6a320782fbfb312e1f4d520e6c6fae155ee"
SRC_URI[ryu-1.0.5.sha256sum] = "71d301d4193d031abdd79ff7e3dd721168a9572ef3fe51a1517aba235bd8f86e"
SRC_URI[semver-parser-0.10.2.sha256sum] = "00b0bef5b7f9e0df16536d3961cfb6e84331c065b4066afb39768d0e319411f7"
SRC_URI[semver-0.11.0.sha256sum] = "f301af10236f6df4160f7c3f04eec6dbc70ace82d23326abad5edee88801c6b6"
SRC_URI[serde-1.0.138.sha256sum] = "1578c6245786b9d168c5447eeacfb96856573ca56c9d68fdcf394be134882a47"
SRC_URI[serde_derive-1.0.138.sha256sum] = "023e9b1467aef8a10fb88f25611870ada9800ef7e22afce356bb0d2387b6f27c"
SRC_URI[slab-0.4.4.sha256sum] = "c307a32c1c5c437f38c7fd45d753050587732ba8628319fbdf12a7e289ccc590"
SRC_URI[smallvec-1.9.0.sha256sum] = "2fd0db749597d91ff862fd1d55ea87f7855a744a8425a64695b6fca237d1dad1"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[syn-1.0.98.sha256sum] = "c50aef8a904de4c23c788f104b7dddc7d6f79c647c7c8ce4cc8f73eb0ca773dd"
SRC_URI[system-deps-6.0.2.sha256sum] = "a1a45a1c4c9015217e12347f2a411b57ce2c4fc543913b14b6fe40483328e709"
SRC_URI[tap-1.0.1.sha256sum] = "55937e1799185b12863d447f42597ed69d9928686b8d88a1df17376a097d8369"
SRC_URI[thiserror-impl-1.0.30.sha256sum] = "aa32fd3f627f367fe16f893e2597ae3c05020f8bba2666a4e6ea73d377e5714b"
SRC_URI[thiserror-1.0.30.sha256sum] = "854babe52e4df1653706b98fcfc05843010039b406875930a70e4d9644e5c417"
SRC_URI[thread_local-1.1.3.sha256sum] = "8018d24e04c95ac8790716a5987d0fec4f8b27249ffa0f7d33f1369bdfb88cbd"
SRC_URI[toml-0.5.9.sha256sum] = "8d82e1a7758622a465f8cee077614c73484dac5b836c02ff6a40d5d1010324d7"
SRC_URI[ucd-trie-0.1.3.sha256sum] = "56dee185309b50d1f11bfedef0fe6d036842e3fb77413abef29f8f8d1c5d4c1c"
SRC_URI[unicode-ident-1.0.1.sha256sum] = "5bd2fe26506023ed7b5e1e315add59d6f584c621d037f9368fea9cfb988f368c"
SRC_URI[version-compare-0.1.0.sha256sum] = "fe88247b92c1df6b6de80ddc290f3976dbdf2f5f5d3fd049a9fb598c6dd5ca73"
SRC_URI[version_check-0.9.3.sha256sum] = "5fecdca9a5291cc2b8dcf7dc02453fee791a280f3743cb0905f8822ae463b3fe"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[wyz-0.2.0.sha256sum] = "85e60b0d1b5f99db2556934e21937020776a5d31520bf169e851ac44e6420214"
SRC_URI[xdg-2.4.1.sha256sum] = "0c4583db5cbd4c4c0303df2d15af80f0539db703fa1c68802d4cbbd2dd0f88f6"

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
