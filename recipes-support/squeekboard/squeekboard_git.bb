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

SRC_URI[anyhow-1.0.58.sha256sum] = "bb07d2053ccdbe10e2af2995a2f116c1330396493dc1269f6a91d0ae82e19704"
SRC_URI[async-io-1.7.0.sha256sum] = "e5e18f61464ae81cde0a23e713ae8fd299580c54d697a35820cfd0625b8b0e07"
SRC_URI[atk-sys-0.14.0.sha256sum] = "badcf670157c84bb8b1cf6b5f70b650fed78da2033c9eed84c4e49b11cbe83ea"
SRC_URI[atk-0.14.0.sha256sum] = "a83b21d2aa75e464db56225e1bda2dd5993311ba1095acaa8fa03d1ae67026ba"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[cache-padded-1.2.0.sha256sum] = "c1db59621ec70f09c5e9b597b220c7a2b43611f4710dc03ceb8748637775692c"
SRC_URI[cairo-rs-0.14.9.sha256sum] = "33b5725979db0c586d98abad2193cdb612dd40ef95cd26bd99851bf93b3cb482"
SRC_URI[cairo-sys-rs-0.14.9.sha256sum] = "b448b876970834fda82ba3aeaccadbd760206b75388fc5c1b02f1e343b697570"
SRC_URI[cc-1.0.73.sha256sum] = "2fff2a6927b3bb87f9595d67196a70493f627687a71d87a0d692242c33f58c11"
SRC_URI[cfg-expr-0.8.1.sha256sum] = "b412e83326147c2bb881f8b40edfbf9905b9b8abaebd0e47ca190ba62fda8f0e"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[clap-3.1.18.sha256sum] = "d2dbdf4bdacb33466e854ce889eee8dfd5729abf7ccd7664d0a2d60cd384440b"
SRC_URI[clap_lex-0.2.4.sha256sum] = "2850f2f5a82cbf437dd5af4d49848fbdfc27c157c3d010345776f952765261c5"
SRC_URI[concurrent-queue-1.2.4.sha256sum] = "af4780a44ab5696ea9e28294517f1fffb421a83a25af521333c838635509db9c"
SRC_URI[derivative-2.2.0.sha256sum] = "fcc3dd5e9e9c0b295d6e1e4d811fb6f157d5ffd784b8d202fc62eac8035a770b"
SRC_URI[either-1.7.0.sha256sum] = "3f107b87b6afc2a64fd13cac55fe06d6c8859f12d4b14cbcdd2c67d0976781be"
SRC_URI[enumflags2-0.6.4.sha256sum] = "83c8d82922337cd23a15f88b70d8e4ef5f11da38dd7cdb55e84dd5de99695da0"
SRC_URI[enumflags2_derive-0.6.4.sha256sum] = "946ee94e3dbf58fdd324f9ce245c7b238d46a66f00e86a020b71996349e46cce"
SRC_URI[fastrand-1.7.0.sha256sum] = "c3fcf0cee53519c866c09b5de1f6c56ff9d647101f81c1964fa632e148896cdf"
SRC_URI[field-offset-0.3.4.sha256sum] = "1e1c54951450cbd39f3dbcf1005ac413b49487dabf18a720ad2383eccfeffb92"
SRC_URI[futures-channel-0.3.21.sha256sum] = "c3083ce4b914124575708913bca19bfe887522d6e2e6d0952943f5eac4a74010"
SRC_URI[futures-core-0.3.21.sha256sum] = "0c09fd04b7e4073ac7156a9539b57a484a8ea920f79c7c675d05d289ab6110d3"
SRC_URI[futures-executor-0.3.21.sha256sum] = "9420b90cfa29e327d0429f19be13e7ddb68fa1cccb09d65e5706b8c7a749b8a6"
SRC_URI[futures-io-0.3.21.sha256sum] = "fc4045962a5a5e935ee2fdedaa4e08284547402885ab326734432bed5d12966b"
SRC_URI[futures-lite-1.12.0.sha256sum] = "7694489acd39452c77daa48516b894c153f192c3578d5a839b62c58099fcbf48"
SRC_URI[futures-macro-0.3.21.sha256sum] = "33c1e13800337f4d4d7a316bf45a567dbcb6ffe087f16424852d97e97a91f512"
SRC_URI[futures-sink-0.3.21.sha256sum] = "21163e139fa306126e6eedaf49ecdb4588f939600f0b1e770f4205ee4b7fa868"
SRC_URI[futures-task-0.3.21.sha256sum] = "57c66a976bf5909d801bbef33416c41372779507e7a6b3a5e25e4749c58f776a"
SRC_URI[futures-util-0.3.21.sha256sum] = "d8b7abd5d659d9b90c8cba917f6ec750a74e2dc23902ef9cd4cc8c8b22e6036a"
SRC_URI[futures-0.3.21.sha256sum] = "f73fe65f54d1e12b726f517d3e2135ca3125a437b6d998caf1962961f7172d9e"
SRC_URI[gdk-pixbuf-sys-0.14.0.sha256sum] = "f097c0704201fbc8f69c1762dc58c6947c8bb188b8ed0bc7e65259f1894fe590"
SRC_URI[gdk-pixbuf-0.14.0.sha256sum] = "534192cb8f01daeb8fab2c8d4baa8f9aae5b7a39130525779f5c2608e235b10f"
SRC_URI[gdk-sys-0.14.0.sha256sum] = "0e091b3d3d6696949ac3b3fb3c62090e5bfd7bd6850bef5c3c5ea701de1b1f1e"
SRC_URI[gdk-0.14.3.sha256sum] = "b9d749dcfc00d8de0d7c3a289e04a04293eb5ba3d8a4e64d64911d481fa9933b"
SRC_URI[gio-sys-0.14.0.sha256sum] = "c0a41df66e57fcc287c4bcf74fc26b884f31901ea9792ec75607289b456f48fa"
SRC_URI[gio-0.14.8.sha256sum] = "711c3632b3ebd095578a9c091418d10fed492da9443f58ebc8f45efbeb215cb0"
SRC_URI[glib-macros-0.14.1.sha256sum] = "2aad66361f66796bfc73f530c51ef123970eb895ffba991a234fcf7bea89e518"
SRC_URI[glib-sys-0.14.0.sha256sum] = "1c1d60554a212445e2a858e42a0e48cece1bd57b311a19a9468f70376cf554ae"
SRC_URI[glib-0.14.8.sha256sum] = "7c515f1e62bf151ef6635f528d05b02c11506de986e43b34a5c920ef0b3796a4"
SRC_URI[gobject-sys-0.14.0.sha256sum] = "aa92cae29759dae34ab5921d73fff5ad54b3d794ab842c117e36cafc7994c3f5"
SRC_URI[gtk-sys-0.14.0.sha256sum] = "8c14c8d3da0545785a7c5a120345b3abb534010fb8ae0f2ef3f47c027fba303e"
SRC_URI[gtk-0.14.3.sha256sum] = "2eb51122dd3317e9327ec1e4faa151d1fa0d95664cd8fb8dcfacf4d4d29ac70c"
SRC_URI[gtk3-macros-0.14.0.sha256sum] = "21de1da96dc117443fb03c2e270b2d34b7de98d0a79a19bbb689476173745b79"
SRC_URI[hashbrown-0.11.2.sha256sum] = "ab5ef0d4909ef3724cc8cce6ccc8572c5c817592e9285f5464f8e86f8bd3726e"
SRC_URI[heck-0.3.3.sha256sum] = "6d621efb26863f0e9924c6ac577e8275e5e6b77455db64ffa6c65c904e9e132c"
SRC_URI[indexmap-1.8.2.sha256sum] = "e6012d540c5baa3589337a98ce73408de9b5a25ec9fc2c6fd6be8f0d39e0ca5a"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[itertools-0.10.3.sha256sum] = "a9a9d19fa1e79b6215ff29b9d6880b706147f16e9b1dbb1e4e5947b5b02bc5e3"
SRC_URI[libc-0.2.126.sha256sum] = "349d5a591cd28b49e1d1037471617a32ddcda5731b99419008085f72d5a53836"
SRC_URI[linked-hash-map-0.5.6.sha256sum] = "0717cef1bc8b636c6e1c1bbdefc09e6322da8a9321966e8928ef80d20f7f770f"
SRC_URI[log-0.4.17.sha256sum] = "abb12e687cfb44aa40f41fc3978ef76448f9b6038cad6aef4259d3c095a2382e"
SRC_URI[maplit-1.0.2.sha256sum] = "3e2e65a1a2e43cfcb47a895c4c8b10d1f4a61097f9f254f183aee60cad9c651d"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memmap-0.7.0.sha256sum] = "6585fd95e7bb50d6cc31e20d4cf9afb4e2ba16c5846fc76793f11218da9c475b"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[nb-connect-1.2.0.sha256sum] = "b1bb540dc6ef51cfe1916ec038ce7a620daf3a111e2502d745197cd53d6bca15"
SRC_URI[nix-0.22.3.sha256sum] = "e4916f159ed8e5de0082076562152a76b7a1f64a01fd9d1e0fea002c37624faf"
SRC_URI[once_cell-1.13.0.sha256sum] = "18a6dbe30758c9f83eb00cbea4ac95966305f5a7772f3f42ebfc7fc7eddbd8e1"
SRC_URI[os_str_bytes-6.2.0.sha256sum] = "648001efe5d5c0102d8cea768e348da85d90af8ba91f0bea908f157951493cd4"
SRC_URI[pango-sys-0.14.0.sha256sum] = "2367099ca5e761546ba1d501955079f097caa186bb53ce0f718dca99ac1942fe"
SRC_URI[pango-0.14.8.sha256sum] = "546fd59801e5ca735af82839007edd226fe7d3bb06433ec48072be4439c28581"
SRC_URI[parking-2.0.0.sha256sum] = "427c3892f9e783d91cc128285287e70a59e206ca452770ece88a76f7a3eddd72"
SRC_URI[pest-2.2.1.sha256sum] = "69486e2b8c2d2aeb9762db7b4e00b0331156393555cff467f4163ff06821eef8"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.25.sha256sum] = "1df8c4ec4b0627e53bdf214615ad287367e482558cf84b109250b37464dc03ae"
SRC_URI[polling-2.2.0.sha256sum] = "685404d509889fade3e86fe3a5803bca2ec09b0c0778d5ada6ec8bf7a8de5259"
SRC_URI[proc-macro-crate-0.1.5.sha256sum] = "1d6ea3c4595b96363c13943497db34af4460fb474a95c43f4446ad341b8c9785"
SRC_URI[proc-macro-crate-1.1.3.sha256sum] = "e17d47ce914bf4de440332250b0edd23ce48c005f59fab39d3335866b114f11a"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.40.sha256sum] = "dd96a1e8ed2596c337f8eae5f24924ec83f5ad5ab21ea8e455d3566c69fbcaf7"
SRC_URI[quote-1.0.20.sha256sum] = "3bcdf212e9776fbcb2d23ab029360416bb1706b1aea2d1a5ba002727cbcab804"
SRC_URI[rustc_version-0.3.3.sha256sum] = "f0dfe2087c51c460008730de8b57e6a320782fbfb312e1f4d520e6c6fae155ee"
SRC_URI[ryu-1.0.10.sha256sum] = "f3f6f92acf49d1b98f7a81226834412ada05458b7364277387724a237f062695"
SRC_URI[scoped-tls-1.0.0.sha256sum] = "ea6a9290e3c9cf0f18145ef7ffa62d68ee0bf5fcd651017e586dc7fd5da448c2"
SRC_URI[semver-parser-0.10.2.sha256sum] = "00b0bef5b7f9e0df16536d3961cfb6e84331c065b4066afb39768d0e319411f7"
SRC_URI[semver-0.11.0.sha256sum] = "f301af10236f6df4160f7c3f04eec6dbc70ace82d23326abad5edee88801c6b6"
SRC_URI[serde-1.0.137.sha256sum] = "61ea8d54c77f8315140a05f4c7237403bf38b72704d031543aa1d16abbf517d1"
SRC_URI[serde_derive-1.0.137.sha256sum] = "1f26faba0c3959972377d3b2d306ee9f71faee9714294e41bb777f83f88578be"
SRC_URI[serde_repr-0.1.8.sha256sum] = "a2ad84e47328a31223de7fed7a4f5087f2d6ddfe586cf3ca25b7a165bc0a5aed"
SRC_URI[serde_yaml-0.8.24.sha256sum] = "707d15895415db6628332b737c838b88c598522e4dc70647e59b72312924aebc"
SRC_URI[slab-0.4.7.sha256sum] = "4614a76b2a8be0058caa9dbbaf66d988527d86d003c11a94fbd335d7661edcef"
SRC_URI[smallvec-1.9.0.sha256sum] = "2fd0db749597d91ff862fd1d55ea87f7855a744a8425a64695b6fca237d1dad1"
SRC_URI[socket2-0.4.4.sha256sum] = "66d72b759436ae32898a2af0a14218dbf55efde3feeb170eb623637db85ee1e0"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strum-0.21.0.sha256sum] = "aaf86bbcfd1fa9670b7a129f64fc0c9fcbbfe4f1bc4210e9e98fe71ffc12cde2"
SRC_URI[strum_macros-0.21.1.sha256sum] = "d06aaeeee809dbc59eb4556183dd927df67db1540de5be8d3ec0b6636358a5ec"
SRC_URI[syn-1.0.98.sha256sum] = "c50aef8a904de4c23c788f104b7dddc7d6f79c647c7c8ce4cc8f73eb0ca773dd"
SRC_URI[system-deps-3.2.0.sha256sum] = "480c269f870722b3b08d2f13053ce0c2ab722839f472863c3e2d61ff3a1c2fa6"
SRC_URI[textwrap-0.15.0.sha256sum] = "b1141d4d61095b28419e22cb0bbf02755f5e54e0526f97f1e3d1d160e60885fb"
SRC_URI[thiserror-impl-1.0.31.sha256sum] = "0396bc89e626244658bef819e22d0cc459e795a5ebe878e6ec336d1674a8d79a"
SRC_URI[thiserror-1.0.31.sha256sum] = "bd829fe32373d27f76265620b5309d0340cb8550f523c1dda251d6298069069a"
SRC_URI[toml-0.5.9.sha256sum] = "8d82e1a7758622a465f8cee077614c73484dac5b836c02ff6a40d5d1010324d7"
SRC_URI[ucd-trie-0.1.4.sha256sum] = "89570599c4fe5585de2b388aab47e99f7fa4e9238a1399f707a02e356058141c"
SRC_URI[unicode-ident-1.0.1.sha256sum] = "5bd2fe26506023ed7b5e1e315add59d6f584c621d037f9368fea9cfb988f368c"
SRC_URI[unicode-segmentation-1.9.0.sha256sum] = "7e8820f5d777f6224dc4be3632222971ac30164d4a258d595640799554ebfd99"
SRC_URI[version-compare-0.0.11.sha256sum] = "1c18c859eead79d8b95d09e4678566e8d70105c4e7b251f707a03df32442661b"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[waker-fn-1.1.0.sha256sum] = "9d5b2c62b4012a3e1eca5a7e077d13b3bf498c4073e33ccd58626607748ceeca"
SRC_URI[wepoll-ffi-0.1.2.sha256sum] = "d743fdedc5c64377b5fc2bc036b01c7fd642205a0d96356034ae3404d49eb7fb"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[xkbcommon-0.4.0.sha256sum] = "fda0ea5f7ddabd51deeeda7799bee06274112f577da7dd3d954b8eda731b2fce"
SRC_URI[yaml-rust-0.4.5.sha256sum] = "56c1936c4cc7a1c9ab21a1ebb602eb942ba868cbd44a99cb7cdc5892335e1c85"
SRC_URI[zbus-1.9.3.sha256sum] = "9cbeb2291cd7267a94489b71376eda33496c1b9881adf6b36f26cc2779f3fc49"
SRC_URI[zbus_macros-1.9.3.sha256sum] = "fa3959a7847cf95e3d51e312856617c5b1b77191176c65a79a5f14d778bbe0a6"
SRC_URI[zvariant-2.10.0.sha256sum] = "a68c7b55f2074489b7e8e07d2d0a6ee6b4f233867a653c664d8020ba53692525"
SRC_URI[zvariant_derive-2.10.0.sha256sum] = "e4ca5e22593eb4212382d60d26350065bf2a02c34b85bc850474a74b589a3de9"

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
