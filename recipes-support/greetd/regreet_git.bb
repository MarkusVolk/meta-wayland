SUMMARY = "Clean and customizable greeter for greetd"
HOMEPAGE = "https://github.com/rharish101/ReGreet/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8da5784ab1c72e63ac74971f88658166"

SRC_URI += " \
    git://github.com/rharish101/ReGreet.git;protocol=https;nobranch=1;branch=main \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.8.3 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anyhow/1.0.68 \
    crate://crates.io/async-trait/0.1.64 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cairo-rs/0.16.7 \
    crate://crates.io/cairo-sys-rs/0.16.3 \
    crate://crates.io/cc/1.0.78 \
    crate://crates.io/cfg-expr/0.11.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.23 \
    crate://crates.io/clap/4.1.4 \
    crate://crates.io/clap_derive/4.1.0 \
    crate://crates.io/clap_lex/0.3.1 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/const_format/0.2.30 \
    crate://crates.io/const_format_proc_macros/0.2.29 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.6 \
    crate://crates.io/crossbeam-utils/0.8.14 \
    crate://crates.io/cxx-build/1.0.88 \
    crate://crates.io/cxx/1.0.88 \
    crate://crates.io/cxxbridge-flags/1.0.88 \
    crate://crates.io/cxxbridge-macro/1.0.88 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/field-offset/0.3.4 \
    crate://crates.io/file-rotate/0.7.2 \
    crate://crates.io/flate2/1.0.25 \
    crate://crates.io/flume/0.10.14 \
    crate://crates.io/fragile/2.0.0 \
    crate://crates.io/futures-channel/0.3.26 \
    crate://crates.io/futures-core/0.3.26 \
    crate://crates.io/futures-executor/0.3.26 \
    crate://crates.io/futures-io/0.3.26 \
    crate://crates.io/futures-macro/0.3.26 \
    crate://crates.io/futures-sink/0.3.26 \
    crate://crates.io/futures-task/0.3.26 \
    crate://crates.io/futures-util/0.3.26 \
    crate://crates.io/futures/0.3.26 \
    crate://crates.io/gdk-pixbuf-sys/0.16.3 \
    crate://crates.io/gdk-pixbuf/0.16.7 \
    crate://crates.io/gdk4-sys/0.5.5 \
    crate://crates.io/gdk4/0.5.5 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/gio-sys/0.16.3 \
    crate://crates.io/gio/0.16.7 \
    crate://crates.io/glib-macros/0.16.3 \
    crate://crates.io/glib-sys/0.16.3 \
    crate://crates.io/glib/0.16.7 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/gobject-sys/0.16.3 \
    crate://crates.io/graphene-rs/0.16.3 \
    crate://crates.io/graphene-sys/0.16.3 \
    crate://crates.io/greetd_ipc/0.9.0 \
    crate://crates.io/gsk4-sys/0.5.5 \
    crate://crates.io/gsk4/0.5.5 \
    crate://crates.io/gtk4-macros/0.5.5 \
    crate://crates.io/gtk4-sys/0.5.5 \
    crate://crates.io/gtk4/0.5.5 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.13.2 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/iana-time-zone-haiku/0.1.1 \
    crate://crates.io/iana-time-zone/0.1.53 \
    crate://crates.io/indexmap/1.9.2 \
    crate://crates.io/io-lifetimes/1.0.4 \
    crate://crates.io/is-terminal/0.4.2 \
    crate://crates.io/itoa/1.0.5 \
    crate://crates.io/js-sys/0.3.60 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.139 \
    crate://crates.io/link-cplusplus/1.0.8 \
    crate://crates.io/linux-raw-sys/0.1.4 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/lru/0.9.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/mio/0.8.6 \
    crate://crates.io/nanorand/0.7.0 \
    crate://crates.io/nom8/0.2.0 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/num_threads/0.1.6 \
    crate://crates.io/once_cell/1.17.0 \
    crate://crates.io/os_str_bytes/6.4.1 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/pango-sys/0.16.3 \
    crate://crates.io/pango/0.16.5 \
    crate://crates.io/pest/2.5.4 \
    crate://crates.io/pin-project-internal/1.0.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.0.12 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.26 \
    crate://crates.io/proc-macro-crate/1.3.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.50 \
    crate://crates.io/pwd/1.4.0 \
    crate://crates.io/quote/1.0.23 \
    crate://crates.io/regex-syntax/0.6.28 \
    crate://crates.io/regex/1.7.1 \
    crate://crates.io/relm4-macros/0.5.0 \
    crate://crates.io/relm4/0.5.0 \
    crate://crates.io/rustc_version/0.3.3 \
    crate://crates.io/rustix/0.36.7 \
    crate://crates.io/ryu/1.0.12 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scratch/1.0.3 \
    crate://crates.io/semver-parser/0.10.2 \
    crate://crates.io/semver/0.11.0 \
    crate://crates.io/serde/1.0.152 \
    crate://crates.io/serde_derive/1.0.152 \
    crate://crates.io/serde_json/1.0.91 \
    crate://crates.io/serde_spanned/0.6.0 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.107 \
    crate://crates.io/system-deps/6.0.3 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/thiserror-impl/1.0.38 \
    crate://crates.io/thiserror/1.0.38 \
    crate://crates.io/thread_local/1.1.4 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.6 \
    crate://crates.io/time/0.3.17 \
    crate://crates.io/tokio/1.26.0 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.6.0 \
    crate://crates.io/toml_datetime/0.5.1 \
    crate://crates.io/toml_edit/0.18.1 \
    crate://crates.io/tracing-appender/0.2.2 \
    crate://crates.io/tracing-attributes/0.1.23 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.16 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/tracker-macros/0.2.0 \
    crate://crates.io/tracker/0.2.0 \
    crate://crates.io/ucd-trie/0.1.5 \
    crate://crates.io/unicode-ident/1.0.6 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.83 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.83 \
    crate://crates.io/wasm-bindgen-macro/0.2.83 \
    crate://crates.io/wasm-bindgen-shared/0.2.83 \
    crate://crates.io/wasm-bindgen/0.2.83 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
"

SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.8.3.sha256sum] = "2c99f64d1e06488f620f932677e24bc6e2897582980441ae90a671415bd7ec2f"
SRC_URI[aho-corasick-0.7.20.sha256sum] = "cc936419f96fa211c1b9166887b38e5e40b19958e5b895be7c1f93adec7071ac"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anyhow-1.0.68.sha256sum] = "2cb2f989d18dd141ab8ae82f64d1a8cdd37e0840f73a406896cf5e99502fab61"
SRC_URI[async-trait-0.1.64.sha256sum] = "1cd7fce9ba8c3c042128ce72d8b2ddbf3a05747efb67ea0313c635e10bda47a2"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bumpalo-3.12.0.sha256sum] = "0d261e256854913907f67ed06efbc3338dfe6179796deefc1ff763fc1aee5535"
SRC_URI[bytes-1.4.0.sha256sum] = "89b2fd2a0dcf38d7971e2194b6b6eebab45ae01067456a7fd93d5547a61b70be"
SRC_URI[cairo-rs-0.16.7.sha256sum] = "f3125b15ec28b84c238f6f476c6034016a5f6cc0221cb514ca46c532139fc97d"
SRC_URI[cairo-sys-rs-0.16.3.sha256sum] = "7c48f4af05fabdcfa9658178e1326efa061853f040ce7d72e33af6885196f421"
SRC_URI[cc-1.0.78.sha256sum] = "a20104e2335ce8a659d6dd92a51a767a0c062599c73b343fd152cb401e828c3d"
SRC_URI[cfg-expr-0.11.0.sha256sum] = "b0357a6402b295ca3a86bc148e84df46c02e41f41fef186bda662557ef6328aa"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.23.sha256sum] = "16b0a3d9ed01224b22057780a37bb8c5dbfe1be8ba48678e7bf57ec4b385411f"
SRC_URI[clap-4.1.4.sha256sum] = "f13b9c79b5d1dd500d20ef541215a6423c75829ef43117e1b4d17fd8af0b5d76"
SRC_URI[clap_derive-4.1.0.sha256sum] = "684a277d672e91966334af371f1a7b5833f9aa00b07c84e92fbce95e00208ce8"
SRC_URI[clap_lex-0.3.1.sha256sum] = "783fe232adfca04f90f56201b26d79682d4cd2625e0bc7290b95123afe558ade"
SRC_URI[codespan-reporting-0.11.1.sha256sum] = "3538270d33cc669650c4b093848450d380def10c331d38c768e34cac80576e6e"
SRC_URI[const_format-0.2.30.sha256sum] = "7309d9b4d3d2c0641e018d449232f2e28f1b22933c137f157d3dbc14228b8c0e"
SRC_URI[const_format_proc_macros-0.2.29.sha256sum] = "d897f47bf7270cf70d370f8f98c1abb6d2d4cf60a6845d30e05bfb90c6568650"
SRC_URI[core-foundation-sys-0.8.3.sha256sum] = "5827cebf4670468b8772dd191856768aedcb1b0278a04f989f7766351917b9dc"
SRC_URI[crc32fast-1.3.2.sha256sum] = "b540bd8bc810d3885c6ea91e2018302f68baba2129ab3e88f32389ee9370880d"
SRC_URI[crossbeam-channel-0.5.6.sha256sum] = "c2dd04ddaf88237dc3b8d8f9a3c1004b506b54b3313403944054d23c0870c521"
SRC_URI[crossbeam-utils-0.8.14.sha256sum] = "4fb766fa798726286dbbb842f174001dab8abc7b627a1dd86e0b7222a95d929f"
SRC_URI[cxx-build-1.0.88.sha256sum] = "017a1385b05d631e7875b1f151c9f012d37b53491e2a87f65bff5c262b2111d8"
SRC_URI[cxx-1.0.88.sha256sum] = "322296e2f2e5af4270b54df9e85a02ff037e271af20ba3e7fe1575515dc840b8"
SRC_URI[cxxbridge-flags-1.0.88.sha256sum] = "c26bbb078acf09bc1ecda02d4223f03bdd28bd4874edcb0379138efc499ce971"
SRC_URI[cxxbridge-macro-1.0.88.sha256sum] = "357f40d1f06a24b60ae1fe122542c1fb05d28d32acb2aed064e84bc2ad1e252e"
SRC_URI[derivative-2.2.0.sha256sum] = "fcc3dd5e9e9c0b295d6e1e4d811fb6f157d5ffd784b8d202fc62eac8035a770b"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[errno-0.2.8.sha256sum] = "f639046355ee4f37944e44f60642c6f3a7efa3cf6b78c78a0d989a8ce6c396a1"
SRC_URI[field-offset-0.3.4.sha256sum] = "1e1c54951450cbd39f3dbcf1005ac413b49487dabf18a720ad2383eccfeffb92"
SRC_URI[file-rotate-0.7.2.sha256sum] = "0ff9cc595c02801d7e61675928f8c4698cab40b68b837884936a6b24fcf711e1"
SRC_URI[flate2-1.0.25.sha256sum] = "a8a2db397cb1c8772f31494cb8917e48cd1e64f0fa7efac59fbd741a0a8ce841"
SRC_URI[flume-0.10.14.sha256sum] = "1657b4441c3403d9f7b3409e47575237dac27b1b5726df654a6ecbf92f0f7577"
SRC_URI[fragile-2.0.0.sha256sum] = "6c2141d6d6c8512188a7891b4b01590a45f6dac67afb4f255c4124dbb86d4eaa"
SRC_URI[futures-channel-0.3.26.sha256sum] = "2e5317663a9089767a1ec00a487df42e0ca174b61b4483213ac24448e4664df5"
SRC_URI[futures-core-0.3.26.sha256sum] = "ec90ff4d0fe1f57d600049061dc6bb68ed03c7d2fbd697274c41805dcb3f8608"
SRC_URI[futures-executor-0.3.26.sha256sum] = "e8de0a35a6ab97ec8869e32a2473f4b1324459e14c29275d14b10cb1fd19b50e"
SRC_URI[futures-io-0.3.26.sha256sum] = "bfb8371b6fb2aeb2d280374607aeabfc99d95c72edfe51692e42d3d7f0d08531"
SRC_URI[futures-macro-0.3.26.sha256sum] = "95a73af87da33b5acf53acfebdc339fe592ecf5357ac7c0a7734ab9d8c876a70"
SRC_URI[futures-sink-0.3.26.sha256sum] = "f310820bb3e8cfd46c80db4d7fb8353e15dfff853a127158425f31e0be6c8364"
SRC_URI[futures-task-0.3.26.sha256sum] = "dcf79a1bf610b10f42aea489289c5a2c478a786509693b80cd39c44ccd936366"
SRC_URI[futures-util-0.3.26.sha256sum] = "9c1d6de3acfef38d2be4b1f543f553131788603495be83da675e180c8d6b7bd1"
SRC_URI[futures-0.3.26.sha256sum] = "13e2792b0ff0340399d58445b88fd9770e3489eff258a4cbc1523418f12abf84"
SRC_URI[gdk-pixbuf-sys-0.16.3.sha256sum] = "3092cf797a5f1210479ea38070d9ae8a5b8e9f8f1be9f32f4643c529c7d70016"
SRC_URI[gdk-pixbuf-0.16.7.sha256sum] = "c3578c60dee9d029ad86593ed88cb40f35c1b83360e12498d055022385dd9a05"
SRC_URI[gdk4-sys-0.5.5.sha256sum] = "de55cb49432901fe2b3534177fa06844665b9b0911d85d8601a8d8b88b7791db"
SRC_URI[gdk4-0.5.5.sha256sum] = "bb2181330ebf9d091f8ea7fed6877f7adc92114128592e1fdaeb1da28e0d01e9"
SRC_URI[getrandom-0.2.8.sha256sum] = "c05aeb6a22b8f62540c194aac980f2115af067bfe15a0734d7277a768d396b31"
SRC_URI[gio-sys-0.16.3.sha256sum] = "e9b693b8e39d042a95547fc258a7b07349b1f0b48f4b2fa3108ba3c51c0b5229"
SRC_URI[gio-0.16.7.sha256sum] = "2a1c84b4534a290a29160ef5c6eff2a9c95833111472e824fc5cb78b513dd092"
SRC_URI[glib-macros-0.16.3.sha256sum] = "e084807350b01348b6d9dbabb724d1a0bb987f47a2c85de200e98e12e30733bf"
SRC_URI[glib-sys-0.16.3.sha256sum] = "c61a4f46316d06bfa33a7ac22df6f0524c8be58e3db2d9ca99ccb1f357b62a65"
SRC_URI[glib-0.16.7.sha256sum] = "ddd4df61a866ed7259d6189b8bcb1464989a77f1d85d25d002279bbe9dd38b2f"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[gobject-sys-0.16.3.sha256sum] = "3520bb9c07ae2a12c7f2fbb24d4efc11231c8146a86956413fb1a79bb760a0f1"
SRC_URI[graphene-rs-0.16.3.sha256sum] = "95ecb4d347e6d09820df3bdfd89a74a8eec07753a06bb92a3aac3ad31d04447b"
SRC_URI[graphene-sys-0.16.3.sha256sum] = "b9aa82337d3972b4eafdea71e607c23f47be6f27f749aab613f1ad8ddbe6dcd6"
SRC_URI[greetd_ipc-0.9.0.sha256sum] = "839390036de887ed0e6a58a82fc03619b27c96f24ac6425f7c9a6c397a6482f6"
SRC_URI[gsk4-sys-0.5.5.sha256sum] = "195a63f0be42529f98c3eb3bae0decfd0428ba2cc683b3e20ced88f340904ec5"
SRC_URI[gsk4-0.5.5.sha256sum] = "591239f5c52ca803b222124ac9c47f230cd180cee9b114c4d672e4a94b74f491"
SRC_URI[gtk4-macros-0.5.5.sha256sum] = "832687a415d9d8bc11fe9c17dda1bf13ee262c41b995dd4df1d1cce33cead405"
SRC_URI[gtk4-sys-0.5.5.sha256sum] = "e370564e3fdacff7cffc99f7366b6a4689feb44e819d3ccee598a9a215b71605"
SRC_URI[gtk4-0.5.5.sha256sum] = "fd89dba65def483a233dc4fdd3f3dab01576e3d83f80f6c9303ebe421661855e"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[hashbrown-0.13.2.sha256sum] = "43a3c133739dddd0d2990f9a4bdf8eb4b21ef50e4851ca85ab661199821d510e"
SRC_URI[heck-0.4.0.sha256sum] = "2540771e65fc8cb83cd6e8a237f70c319bd5c29f78ed1084ba5d50eeac86f7f9"
SRC_URI[hermit-abi-0.2.6.sha256sum] = "ee512640fe35acbfb4bb779db6f0d80704c2cacfa2e39b601ef3e3f47d1ae4c7"
SRC_URI[iana-time-zone-haiku-0.1.1.sha256sum] = "0703ae284fc167426161c2e3f1da3ea71d94b21bedbcc9494e92b28e334e3dca"
SRC_URI[iana-time-zone-0.1.53.sha256sum] = "64c122667b287044802d6ce17ee2ddf13207ed924c712de9a66a5814d5b64765"
SRC_URI[indexmap-1.9.2.sha256sum] = "1885e79c1fc4b10f0e172c475f458b7f7b93061064d98c3293e98c5ba0c8b399"
SRC_URI[io-lifetimes-1.0.4.sha256sum] = "e7d6c6f8c91b4b9ed43484ad1a938e393caf35960fce7f82a040497207bd8e9e"
SRC_URI[is-terminal-0.4.2.sha256sum] = "28dfb6c8100ccc63462345b67d1bbc3679177c75ee4bf59bf29c8b1d110b8189"
SRC_URI[itoa-1.0.5.sha256sum] = "fad582f4b9e86b6caa621cabeb0963332d92eea04729ab12892c2533951e6440"
SRC_URI[js-sys-0.3.60.sha256sum] = "49409df3e3bf0856b916e2ceaca09ee28e6871cf7d9ce97a692cacfdb2a25a47"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.139.sha256sum] = "201de327520df007757c1f0adce6e827fe8562fbc28bfd9c15571c66ca1f5f79"
SRC_URI[link-cplusplus-1.0.8.sha256sum] = "ecd207c9c713c34f95a097a5b029ac2ce6010530c7b49d7fea24d977dede04f5"
SRC_URI[linux-raw-sys-0.1.4.sha256sum] = "f051f77a7c8e6957c0696eac88f26b0117e54f52d3fc682ab19397a8812846a4"
SRC_URI[lock_api-0.4.9.sha256sum] = "435011366fe56583b16cf956f9df0095b405b82d76425bc8981c0e22e60ec4df"
SRC_URI[log-0.4.17.sha256sum] = "abb12e687cfb44aa40f41fc3978ef76448f9b6038cad6aef4259d3c095a2382e"
SRC_URI[lru-0.9.0.sha256sum] = "71e7d46de488603ffdd5f30afbc64fbba2378214a2c3a2fb83abf3d33126df17"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[miniz_oxide-0.6.2.sha256sum] = "b275950c28b37e794e8c55d88aeb5e139d0ce23fdbbeda68f8d7174abdf9e8fa"
SRC_URI[mio-0.8.6.sha256sum] = "5b9d9a46eff5b4ff64b45a9e316a6d1e0bc719ef429cbec4dc630684212bfdf9"
SRC_URI[nanorand-0.7.0.sha256sum] = "6a51313c5820b0b02bd422f4b44776fbf47961755c74ce64afc73bfad10226c3"
SRC_URI[nom8-0.2.0.sha256sum] = "ae01545c9c7fc4486ab7debaf2aad7003ac19431791868fb2e8066df97fad2f8"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[num-integer-0.1.45.sha256sum] = "225d3389fb3509a24c93f5c29eb6bde2586b98d9f016636dff58d7c6f7569cd9"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[num_cpus-1.15.0.sha256sum] = "0fac9e2da13b5eb447a6ce3d392f23a29d8694bff781bf03a16cd9ac8697593b"
SRC_URI[num_threads-0.1.6.sha256sum] = "2819ce041d2ee131036f4fc9d6ae7ae125a3a40e97ba64d04fe799ad9dabbb44"
SRC_URI[once_cell-1.17.0.sha256sum] = "6f61fba1741ea2b3d6a1e3178721804bb716a68a6aeba1149b5d52e3d464ea66"
SRC_URI[os_str_bytes-6.4.1.sha256sum] = "9b7820b9daea5457c9f21c69448905d723fbd21136ccf521748f23fd49e723ee"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[pango-sys-0.16.3.sha256sum] = "9e134909a9a293e04d2cc31928aa95679c5e4df954d0b85483159bd20d8f047f"
SRC_URI[pango-0.16.5.sha256sum] = "cdff66b271861037b89d028656184059e03b0b6ccb36003820be19f7200b1e94"
SRC_URI[pest-2.5.4.sha256sum] = "4ab62d2fa33726dbe6321cc97ef96d8cde531e3eeaf858a058de53a8a6d40d8f"
SRC_URI[pin-project-internal-1.0.12.sha256sum] = "069bdb1e05adc7a8990dce9cc75370895fbe4e3d58b9b73bf1aee56359344a55"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pin-project-1.0.12.sha256sum] = "ad29a609b6bcd67fee905812e544992d216af9d755757c05ed2d0e15a74c6ecc"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.26.sha256sum] = "6ac9a59f73473f1b8d852421e59e64809f025994837ef743615c6d0c5b305160"
SRC_URI[proc-macro-crate-1.3.0.sha256sum] = "66618389e4ec1c7afe67d51a9bf34ff9236480f8d51e7489b7d5ab0303c13f34"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.50.sha256sum] = "6ef7d57beacfaf2d8aee5937dab7b7f28de3cb8b1828479bb5de2a7106f2bae2"
SRC_URI[pwd-1.4.0.sha256sum] = "72c71c0c79b9701efe4e1e4b563b2016dd4ee789eb99badcb09d61ac4b92e4a2"
SRC_URI[quote-1.0.23.sha256sum] = "8856d8364d252a14d474036ea1358d63c9e6965c8e5c1885c18f73d70bff9c7b"
SRC_URI[regex-syntax-0.6.28.sha256sum] = "456c603be3e8d448b072f410900c09faf164fbce2d480456f50eea6e25f9c848"
SRC_URI[regex-1.7.1.sha256sum] = "48aaa5748ba571fb95cd2c85c09f629215d3a6ece942baa100950af03a34f733"
SRC_URI[relm4-macros-0.5.0.sha256sum] = "aaf49f6588ecac70fd6163110ed7e294195cc5c9c82efb7b3150b9ca87486a72"
SRC_URI[relm4-0.5.0.sha256sum] = "67d336a752868ac036d994ff051a02dc8c1b53173980e5fce16dfb580f458d95"
SRC_URI[rustc_version-0.3.3.sha256sum] = "f0dfe2087c51c460008730de8b57e6a320782fbfb312e1f4d520e6c6fae155ee"
SRC_URI[rustix-0.36.7.sha256sum] = "d4fdebc4b395b7fbb9ab11e462e20ed9051e7b16e42d24042c776eca0ac81b03"
SRC_URI[ryu-1.0.12.sha256sum] = "7b4b9743ed687d4b4bcedf9ff5eaa7398495ae14e61cba0a295704edbc7decde"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[scratch-1.0.3.sha256sum] = "ddccb15bcce173023b3fedd9436f882a0739b8dfb45e4f6b6002bee5929f61b2"
SRC_URI[semver-parser-0.10.2.sha256sum] = "00b0bef5b7f9e0df16536d3961cfb6e84331c065b4066afb39768d0e319411f7"
SRC_URI[semver-0.11.0.sha256sum] = "f301af10236f6df4160f7c3f04eec6dbc70ace82d23326abad5edee88801c6b6"
SRC_URI[serde-1.0.152.sha256sum] = "bb7d1f0d3021d347a83e556fc4683dea2ea09d87bccdf88ff5c12545d89d5efb"
SRC_URI[serde_derive-1.0.152.sha256sum] = "af487d118eecd09402d70a5d72551860e788df87b464af30e5ea6a38c75c541e"
SRC_URI[serde_json-1.0.91.sha256sum] = "877c235533714907a8c2464236f5c4b2a17262ef1bd71f38f35ea592c8da6883"
SRC_URI[serde_spanned-0.6.0.sha256sum] = "2c68e921cef53841b8925c2abadd27c9b891d9613bdc43d6b823062866df38e8"
SRC_URI[sharded-slab-0.1.4.sha256sum] = "900fba806f70c630b0a382d0d825e17a0f19fcd059a2ade1ff237bcddf446b31"
SRC_URI[shlex-1.1.0.sha256sum] = "43b2853a4d09f215c24cc5489c992ce46052d359b5109343cbafbf26bc62f8a3"
SRC_URI[slab-0.4.7.sha256sum] = "4614a76b2a8be0058caa9dbbaf66d988527d86d003c11a94fbd335d7661edcef"
SRC_URI[smallvec-1.10.0.sha256sum] = "a507befe795404456341dfab10cef66ead4c041f62b8b11bbb92bffe5d0953e0"
SRC_URI[socket2-0.4.9.sha256sum] = "64a4a911eed85daf18834cfaa86a79b7d266ff93ff5ba14005426219480ed662"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[syn-1.0.107.sha256sum] = "1f4064b5b16e03ae50984a5a8ed5d4f8803e6bc1fd170a3cda91a1be4b18e3f5"
SRC_URI[system-deps-6.0.3.sha256sum] = "2955b1fe31e1fa2fbd1976b71cc69a606d7d4da16f6de3333d0c92d51419aeff"
SRC_URI[termcolor-1.2.0.sha256sum] = "be55cf8942feac5c765c2c993422806843c9a9a45d4d5c407ad6dd2ea95eb9b6"
SRC_URI[thiserror-impl-1.0.38.sha256sum] = "1fb327af4685e4d03fa8cbcf1716380da910eeb2bb8be417e7f9fd3fb164f36f"
SRC_URI[thiserror-1.0.38.sha256sum] = "6a9cd18aa97d5c45c6603caea1da6628790b37f7a34b6ca89522331c5180fed0"
SRC_URI[thread_local-1.1.4.sha256sum] = "5516c27b78311c50bf42c071425c560ac799b11c30b31f87e3081965fe5e0180"
SRC_URI[time-core-0.1.0.sha256sum] = "2e153e1f1acaef8acc537e68b44906d2db6436e2b35ac2c6b42640fff91f00fd"
SRC_URI[time-macros-0.2.6.sha256sum] = "d967f99f534ca7e495c575c62638eebc2898a8c84c119b89e250477bc4ba16b2"
SRC_URI[time-0.3.17.sha256sum] = "a561bf4617eebd33bca6434b988f39ed798e527f51a1e797d0ee4f61c0a38376"
SRC_URI[tokio-1.26.0.sha256sum] = "03201d01c3c27a29c8a5cee5b55a93ddae1ccf6f08f65365c2c918f8c1b76f64"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[toml-0.6.0.sha256sum] = "4fb9d890e4dc9298b70f740f615f2e05b9db37dce531f6b24fb77ac993f9f217"
SRC_URI[toml_datetime-0.5.1.sha256sum] = "4553f467ac8e3d374bc9a177a26801e5d0f9b211aa1673fb137a403afd1c9cf5"
SRC_URI[toml_edit-0.18.1.sha256sum] = "56c59d8dd7d0dcbc6428bf7aa2f0e823e26e43b3c9aca15bbc9475d23e5fa12b"
SRC_URI[tracing-appender-0.2.2.sha256sum] = "09d48f71a791638519505cefafe162606f706c25592e4bde4d97600c0195312e"
SRC_URI[tracing-attributes-0.1.23.sha256sum] = "4017f8f45139870ca7e672686113917c71c7a6e02d4924eda67186083c03081a"
SRC_URI[tracing-core-0.1.30.sha256sum] = "24eb03ba0eab1fd845050058ce5e616558e8f8d8fca633e6b163fe25c797213a"
SRC_URI[tracing-log-0.1.3.sha256sum] = "78ddad33d2d10b1ed7eb9d1f518a5674713876e97e5bb9b7345a7984fbb4f922"
SRC_URI[tracing-subscriber-0.3.16.sha256sum] = "a6176eae26dd70d0c919749377897b54a9276bd7061339665dd68777926b5a70"
SRC_URI[tracing-0.1.37.sha256sum] = "8ce8c33a8d48bd45d624a6e523445fd21ec13d3653cd51f681abf67418f54eb8"
SRC_URI[tracker-macros-0.2.0.sha256sum] = "32b086e6cb7f65c79bc0b132db4e468c4159133c917da44e1b97594101e9e7e0"
SRC_URI[tracker-0.2.0.sha256sum] = "4948dd579c7facd8b583a8838956177740021c7bbcc1074ff49f7a5e76a150fd"
SRC_URI[ucd-trie-0.1.5.sha256sum] = "9e79c4d996edb816c91e4308506774452e55e95c3c9de07b6729e17e15a5ef81"
SRC_URI[unicode-ident-1.0.6.sha256sum] = "84a22b9f218b40614adcb3f4ff08b703773ad44fa9423e4e0d346d5db86e4ebc"
SRC_URI[unicode-width-0.1.10.sha256sum] = "c0edd1e5b14653f783770bce4a4dabb4a5108a5370a5f5d8cfe8710c361f6c8b"
SRC_URI[unicode-xid-0.2.4.sha256sum] = "f962df74c8c05a667b5ee8bcf162993134c104e96440b663c8daa176dc772d8c"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[version-compare-0.1.1.sha256sum] = "579a42fc0b8e0c63b76519a339be31bed574929511fa53c1a3acae26eb258f29"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-backend-0.2.83.sha256sum] = "4c8ffb332579b0557b52d268b91feab8df3615f265d5270fec2a8c95b17c1142"
SRC_URI[wasm-bindgen-macro-support-0.2.83.sha256sum] = "07bc0c051dc5f23e307b13285f9d75df86bfdf816c5721e573dec1f9b8aa193c"
SRC_URI[wasm-bindgen-macro-0.2.83.sha256sum] = "052be0f94026e6cbc75cdefc9bae13fd6052cdcaf532fa6c45e7ae33a1e6c810"
SRC_URI[wasm-bindgen-shared-0.2.83.sha256sum] = "1c38c045535d93ec4f0b4defec448e4291638ee608530863b1e2ba115d4fff7f"
SRC_URI[wasm-bindgen-0.2.83.sha256sum] = "eaf9f5aceeec8be17c128b2e93e031fb8a4d469bb9c4ae2d7dc1888b26887268"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.42.0.sha256sum] = "5a3e1820f08b8513f676f7ab6c1f99ff312fb97b553d30ff4dd86f9f15728aa7"
SRC_URI[windows-sys-0.45.0.sha256sum] = "75283be5efb2831d37ea142365f009c02ec203cd29a3ebecbc093d52315b66d0"
SRC_URI[windows-targets-0.42.2.sha256sum] = "8e5180c00cd44c9b1c88adb3693291f1cd93605ded80c250a75d472756b4d071"
SRC_URI[windows_aarch64_gnullvm-0.42.2.sha256sum] = "597a5118570b68bc08d8d59125332c54f1ba9d9adeedeef5b99b02ba2b0698f8"
SRC_URI[windows_aarch64_msvc-0.42.2.sha256sum] = "e08e8864a60f06ef0d0ff4ba04124db8b0fb3be5776a5cd47641e942e58c4d43"
SRC_URI[windows_i686_gnu-0.42.2.sha256sum] = "c61d927d8da41da96a81f029489353e68739737d3beca43145c8afec9a31a84f"
SRC_URI[windows_i686_msvc-0.42.2.sha256sum] = "44d840b6ec649f480a41c8d80f9c65108b92d89345dd94027bfe06ac444d1060"
SRC_URI[windows_x86_64_gnu-0.42.2.sha256sum] = "8de912b8b8feb55c064867cf047dda097f92d51efad5b491dfb98f6bbb70cb36"
SRC_URI[windows_x86_64_gnullvm-0.42.2.sha256sum] = "26d41b46a36d453748aedef1486d5c7a85db22e56aff34643984ea85514e94a3"
SRC_URI[windows_x86_64_msvc-0.42.2.sha256sum] = "9aec5da331524158c6d1a4ac0ab1541149c0b9505fde06423b02f5ef0106b9f0"

DEPENDS = "glib-2.0 gtk4 cairo graphene gdk-pixbuf"

inherit cargo pkgconfig

SRCREV = "4b6597004d1c8857c0d6c1dfb0e6a026006a99ba"
S = "${WORKDIR}/git"
PV = "0.1.0"

RDEPENDS:${PN} = "cage greetd"
