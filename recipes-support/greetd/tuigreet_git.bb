SUMMARY = "Graphical console greeter for greetd"
HOMEPAGE = "https://github.com/apognu/tuigreet.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

RDEPENDS:${PN} = "greetd"

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

SRC_URI[ahash-0.7.6.sha256sum] = "fcb51a0695d8f838b1ee009b3fbf66bda078cd64590202a864a8f3e8c4315c47"
SRC_URI[aho-corasick-0.7.18.sha256sum] = "1e37cfd5e7657ada45f742d6e99ca5788580b5c529dc78faf11ece6dc702656f"
SRC_URI[async-trait-0.1.53.sha256sum] = "ed6aa3524a2dfcf9fe180c51eae2b58738348d819517ceadf95789c51fff7600"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[block-buffer-0.9.0.sha256sum] = "4152116fd6e9dadb291ae18fc1ec3575ed6d84c29642d97890f4b4a3417297e4"
SRC_URI[block-0.1.6.sha256sum] = "0d8c1fef690941d3e7788d328517591fecc684c084084702d6ff1641e993699a"
SRC_URI[bytes-1.1.0.sha256sum] = "c4872d67bab6358e59559027aa3b9157c53d9358c51423c17554809a8858e0f8"
SRC_URI[cassowary-0.3.0.sha256sum] = "df8670b8c7b9dae1793364eafadf7239c40d669904660c5960d74cfd80b46a53"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.19.sha256sum] = "670ad68c9088c2a963aaa298cb369688cf3f9465ce5e2d4ca10e6e0098a1ce73"
SRC_URI[cpufeatures-0.2.2.sha256sum] = "59a6001667ab124aebae2a495118e11d30984c3a653e99d86d58971708cf5e4b"
SRC_URI[crossterm-0.23.2.sha256sum] = "a2102ea4f781910f8a5b98dd061f4c2023f479ce7bb1236330099ceb5a93cf17"
SRC_URI[crossterm_winapi-0.9.0.sha256sum] = "2ae1b35a484aa10e07fe0638d02301c5ad24de82d310ccbd2f3693da5f09bf1c"
SRC_URI[dashmap-5.3.3.sha256sum] = "391b56fbd302e585b7a9494fb70e40949567b1cf9003a8e4a6041a1687c26573"
SRC_URI[digest-0.9.0.sha256sum] = "d3dd60d1080a57a05ab032377049e0591415d2b31afd7028356dbf3cc6dcb066"
SRC_URI[dlv-list-0.3.0.sha256sum] = "0688c2a7f92e427f44895cd63841bff7b29f8d7a1648b9e7e07a4a365b2e1257"
SRC_URI[find-crate-0.6.3.sha256sum] = "59a98bbaacea1c0eb6a0876280051b892eb73594fd90cf3b20e9c817029c57d2"
SRC_URI[fluent-bundle-0.15.2.sha256sum] = "e242c601dec9711505f6d5bbff5bedd4b61b2469f2e8bb8e57ee7c9747a87ffd"
SRC_URI[fluent-langneg-0.13.0.sha256sum] = "2c4ad0989667548f06ccd0e306ed56b61bd4d35458d54df5ec7587c0e8ed5e94"
SRC_URI[fluent-syntax-0.11.0.sha256sum] = "c0abed97648395c902868fee9026de96483933faa54ea3b40d652f7dfe61ca78"
SRC_URI[fluent-0.16.0.sha256sum] = "61f69378194459db76abd2ce3952b790db103ceb003008d3d50d97c41ff847a7"
SRC_URI[futures-channel-0.3.21.sha256sum] = "c3083ce4b914124575708913bca19bfe887522d6e2e6d0952943f5eac4a74010"
SRC_URI[futures-core-0.3.21.sha256sum] = "0c09fd04b7e4073ac7156a9539b57a484a8ea920f79c7c675d05d289ab6110d3"
SRC_URI[futures-executor-0.3.21.sha256sum] = "9420b90cfa29e327d0429f19be13e7ddb68fa1cccb09d65e5706b8c7a749b8a6"
SRC_URI[futures-io-0.3.21.sha256sum] = "fc4045962a5a5e935ee2fdedaa4e08284547402885ab326734432bed5d12966b"
SRC_URI[futures-macro-0.3.21.sha256sum] = "33c1e13800337f4d4d7a316bf45a567dbcb6ffe087f16424852d97e97a91f512"
SRC_URI[futures-sink-0.3.21.sha256sum] = "21163e139fa306126e6eedaf49ecdb4588f939600f0b1e770f4205ee4b7fa868"
SRC_URI[futures-task-0.3.21.sha256sum] = "57c66a976bf5909d801bbef33416c41372779507e7a6b3a5e25e4749c58f776a"
SRC_URI[futures-util-0.3.21.sha256sum] = "d8b7abd5d659d9b90c8cba917f6ec750a74e2dc23902ef9cd4cc8c8b22e6036a"
SRC_URI[futures-0.3.21.sha256sum] = "f73fe65f54d1e12b726f517d3e2135ca3125a437b6d998caf1962961f7172d9e"
SRC_URI[generic-array-0.14.5.sha256sum] = "fd48d33ec7f05fbfa152300fdad764757cbded343c1aa1cff2fbaf4134851803"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[getrandom-0.2.6.sha256sum] = "9be70c98951c83b8d2f8f60d7065fa6d5146873094452a1008da8c2f1e4205ad"
SRC_URI[greetd_ipc-0.8.0.sha256sum] = "80ef4898e4031d4a6133082ec838df029bfe33ae6c74a55c575e363576cc4cb7"
SRC_URI[hashbrown-0.12.1.sha256sum] = "db0d4cf898abf0081f964436dc980e96670a0f36863e4b83aaacdb65c9d7ccc3"
SRC_URI[hermit-abi-0.1.19.sha256sum] = "62b467343b94ba476dcb2500d242dadbb39557df889310ac77c5d99100aaac33"
SRC_URI[i18n-config-0.4.2.sha256sum] = "b62affcd43abfb51f3cbd8736f9407908dc5b44fc558a9be07460bbfd104d983"
SRC_URI[i18n-embed-fl-0.6.4.sha256sum] = "9420a9718ef9d0ab727840a398e25408ea0daff9ba3c681707ba05485face98e"
SRC_URI[i18n-embed-impl-0.8.0.sha256sum] = "0db2330e035808eb064afb67e6743ddce353763af3e0f2bdfc2476e00ce76136"
SRC_URI[i18n-embed-0.13.4.sha256sum] = "e7f21ed76e44de8ac3dfa36bb37ab2e6480be0dc75c612474949be1f3cb2c253"
SRC_URI[intl-memoizer-0.5.1.sha256sum] = "c310433e4a310918d6ed9243542a6b83ec1183df95dff8f23f87bb88a264a66f"
SRC_URI[intl_pluralrules-7.0.1.sha256sum] = "b18f988384267d7066cc2be425e6faf352900652c046b6971d2e228d3b1c5ecf"
SRC_URI[itoa-1.0.1.sha256sum] = "1aab8fc367588b89dcee83ab0fd66b72b50b72fa1904d7095045ace2b0c81c35"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.125.sha256sum] = "5916d2ae698f6de9bfb891ad7a8d65c09d232dc58cc4ac433c7da3b2fd84bc2b"
SRC_URI[locale_config-0.3.0.sha256sum] = "08d2c35b16f4483f6c26f0e4e9550717a2f6575bcd6f12a53ff0c490a94a6934"
SRC_URI[lock_api-0.4.7.sha256sum] = "327fa5b6a6940e4699ec49a9beae1ea4845c6bab9314e4f84ac68742139d8c53"
SRC_URI[log-0.4.17.sha256sum] = "abb12e687cfb44aa40f41fc3978ef76448f9b6038cad6aef4259d3c095a2382e"
SRC_URI[malloc_buf-0.0.6.sha256sum] = "62bb907fe88d54d8d9ce32a3cceab4218ed2f6b7d35617cafe9adf84e43919cb"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[mio-0.8.3.sha256sum] = "713d550d9b44d89174e066b7a6217ae06234c10cb47819a88290d2b353c31799"
SRC_URI[nix-0.24.1.sha256sum] = "8f17df307904acd05aa8e32e97bb20f2a0df1728bbc2d771ae8f9a90463441e9"
SRC_URI[num-integer-0.1.45.sha256sum] = "225d3389fb3509a24c93f5c29eb6bde2586b98d9f016636dff58d7c6f7569cd9"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[num_cpus-1.13.1.sha256sum] = "19e64526ebdee182341572e50e9ad03965aa510cd94427a4549448f285e957a1"
SRC_URI[objc-foundation-0.1.1.sha256sum] = "1add1b659e36c9607c7aab864a76c7a4c2760cd0cd2e120f3fb8b952c7e22bf9"
SRC_URI[objc-0.2.7.sha256sum] = "915b1b472bc21c53464d6c8461c9d3af805ba1ef837e1cac254428f4a77177b1"
SRC_URI[objc_id-0.1.1.sha256sum] = "c92d4ddb4bd7b50d730c215ff871754d0da6b2178849f8a2a2ab69712d0c073b"
SRC_URI[once_cell-1.10.0.sha256sum] = "87f3e037eac156d1775da914196f0f37741a274155e34a0b7e427c35d2a2ecb9"
SRC_URI[opaque-debug-0.3.0.sha256sum] = "624a8340c38c1b80fd549087862da4ba43e08858af025b236e509b6649fc13d5"
SRC_URI[ordered-multimap-0.4.3.sha256sum] = "ccd746e37177e1711c20dd619a1620f34f5c8b569c53590a72dedd5344d8924a"
SRC_URI[parking_lot-0.12.0.sha256sum] = "87f5ec2493a61ac0506c0f4199f99070cbe83857b0337006a30f3e6719b8ef58"
SRC_URI[parking_lot_core-0.9.3.sha256sum] = "09a279cbf25cb0757810394fbc1e359949b59e348145c643a939a525692e6929"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.38.sha256sum] = "9027b48e9d4c9175fa2218adf3557f91c1137021739951d4932f5f8268ac48aa"
SRC_URI[pure-rust-locales-0.5.6.sha256sum] = "b45c49fc4f91f35bae654f85ebb3a44d60ac64f11b3166ffa609def390c732d8"
SRC_URI[quote-1.0.18.sha256sum] = "a1feb54ed693b93a84e14094943b84b7c4eae204c512b7ccb95ab0c66d278ad1"
SRC_URI[redox_syscall-0.2.13.sha256sum] = "62f25bc4c7e55e0b0b7a1d43fb893f4fa1361d0abe38b9ce4f323c2adfe6ef42"
SRC_URI[regex-syntax-0.6.25.sha256sum] = "f497285884f3fcff424ffc933e56d7cbca511def0c9831a7f9b5f6153e3cc89b"
SRC_URI[regex-1.5.5.sha256sum] = "1a11647b6b25ff05a515cb92c365cec08801e83423a235b51e231e1808747286"
SRC_URI[rust-embed-impl-6.2.0.sha256sum] = "94e763e24ba2bf0c72bc6be883f967f794a019fafd1b86ba1daff9c91a7edd30"
SRC_URI[rust-embed-utils-7.2.0.sha256sum] = "756feca3afcbb1487a1d01f4ecd94cf8ec98ea074c55a69e7136d29fb6166029"
SRC_URI[rust-embed-6.4.0.sha256sum] = "9a17e5ac65b318f397182ae94e532da0ba56b88dd1200b774715d36c4943b1c3"
SRC_URI[rust-ini-0.18.0.sha256sum] = "f6d5f2436026b4f6e79dc829837d467cc7e9a55ee40e750d716713540715a2df"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[ryu-1.0.9.sha256sum] = "73b4b750c782965c211b42f022f59af1fbceabdd026623714f104152f1ec149f"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[self_cell-0.10.2.sha256sum] = "1ef965a420fe14fdac7dd018862966a4c14094f900e1650bbc71ddd7d580c8af"
SRC_URI[serde-1.0.137.sha256sum] = "61ea8d54c77f8315140a05f4c7237403bf38b72704d031543aa1d16abbf517d1"
SRC_URI[serde_derive-1.0.137.sha256sum] = "1f26faba0c3959972377d3b2d306ee9f71faee9714294e41bb777f83f88578be"
SRC_URI[serde_json-1.0.81.sha256sum] = "9b7ce2b32a1aed03c558dc61a5cd328f15aff2dbc17daad8fb8af04d2100e15c"
SRC_URI[sha2-0.9.9.sha256sum] = "4d58a1e1bf39749807d89cf2d98ac2dfa0ff1cb3faa38fbb64dd88ac8013d800"
SRC_URI[signal-hook-mio-0.2.3.sha256sum] = "29ad2e15f37ec9a6cc544097b78a1ec90001e9f71b81338ca39f430adaca99af"
SRC_URI[signal-hook-registry-1.4.0.sha256sum] = "e51e73328dc4ac0c7ccbda3a494dfa03df1de2f46018127f60c693f2648455b0"
SRC_URI[signal-hook-0.3.13.sha256sum] = "647c97df271007dcea485bb74ffdb57f2e683f1306c854f468a0c244badabf2d"
SRC_URI[slab-0.4.6.sha256sum] = "eb703cfe953bccee95685111adeedb76fabe4e97549a58d16f03ea7b9367bb32"
SRC_URI[smallvec-1.8.0.sha256sum] = "f2dd574626839106c320a323308629dcb1acfc96e32a8cba364ddc61ac23ee83"
SRC_URI[smart-default-0.6.0.sha256sum] = "133659a15339456eeeb07572eb02a91c91e9815e9cbc89566944d2c8d3efdbf6"
SRC_URI[smawk-0.3.1.sha256sum] = "f67ad224767faa3c7d8b6d91985b78e70a1324408abcb1cfcc2be4c06bc06043"
SRC_URI[socket2-0.4.5.sha256sum] = "ca642ba17f8b2995138b1d7711829c92e98c0a25ea019de790f4f09279c4e296"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[syn-1.0.92.sha256sum] = "7ff7c592601f11445996a06f8ad0c27f094a58857c2f89e97974ab9235b92c52"
SRC_URI[textwrap-0.15.0.sha256sum] = "b1141d4d61095b28419e22cb0bbf02755f5e54e0526f97f1e3d1d160e60885fb"
SRC_URI[thiserror-impl-1.0.31.sha256sum] = "0396bc89e626244658bef819e22d0cc459e795a5ebe878e6ec336d1674a8d79a"
SRC_URI[thiserror-1.0.31.sha256sum] = "bd829fe32373d27f76265620b5309d0340cb8550f523c1dda251d6298069069a"
SRC_URI[time-0.1.43.sha256sum] = "ca8a50ef2360fbd1eeb0ecd46795a87a19024eb4b53c5dc916ca1fd95fe62438"
SRC_URI[tinystr-0.3.4.sha256sum] = "29738eedb4388d9ea620eeab9384884fc3f06f586a2eddb56bedc5885126c7c1"
SRC_URI[tokio-macros-1.7.0.sha256sum] = "b557f72f448c511a979e2564e55d74e6c4432fc96ff4f6241bc6bded342643b7"
SRC_URI[tokio-1.18.2.sha256sum] = "4903bf0427cf68dddd5aa6a93220756f8be0c34fcfa9f5e6191e103e15a31395"
SRC_URI[toml-0.5.9.sha256sum] = "8d82e1a7758622a465f8cee077614c73484dac5b836c02ff6a40d5d1010324d7"
SRC_URI[tui-0.18.0.sha256sum] = "96fe69244ec2af261bced1d9046a6fee6c8c2a6b0228e59e5ba39bc8ba4ed729"
SRC_URI[type-map-0.4.0.sha256sum] = "b6d3364c5e96cb2ad1603037ab253ddd34d7fb72a58bdddf4b7350760fc69a46"
SRC_URI[typenum-1.15.0.sha256sum] = "dcf81ac59edc17cc8697ff311e8f5ef2d99fcbd9817b34cec66f90b6c3dfd987"
SRC_URI[unic-langid-impl-0.9.0.sha256sum] = "1a4a8eeaf0494862c1404c95ec2f4c33a2acff5076f64314b465e3ddae1b934d"
SRC_URI[unic-langid-0.9.0.sha256sum] = "73328fcd730a030bdb19ddf23e192187a6b01cd98be6d3140622a89129459ce5"
SRC_URI[unicode-linebreak-0.1.2.sha256sum] = "3a52dcaab0c48d931f7cc8ef826fa51690a08e1ea55117ef26f89864f532383f"
SRC_URI[unicode-segmentation-1.9.0.sha256sum] = "7e8820f5d777f6224dc4be3632222971ac30164d4a258d595640799554ebfd99"
SRC_URI[unicode-width-0.1.9.sha256sum] = "3ed742d4ea2bd1176e236172c8429aaf54486e7ac098db29ffe6529e0ce50973"
SRC_URI[unicode-xid-0.2.3.sha256sum] = "957e51f3646910546462e67d5f7599b9e4fb8acdd304b087a6494730f9eebf04"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[walkdir-2.3.2.sha256sum] = "808cf2735cd4b6866113f648b791c6adc5714537bc222d9347bb203386ffda56"
SRC_URI[wasi-0.10.2+wasi-snapshot-preview1.sha256sum] = "fd6fbd9a79829dd1ad0cc20627bf1ed606756a7f77edff7b66b7064f9cb327c6"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.36.1.sha256sum] = "ea04155a16a59f9eab786fe12a4a450e75cdb175f9e0d80da1e17db09f55b8d2"
SRC_URI[windows_aarch64_msvc-0.36.1.sha256sum] = "9bb8c3fd39ade2d67e9874ac4f3db21f0d710bee00fe7cab16949ec184eeaa47"
SRC_URI[windows_i686_gnu-0.36.1.sha256sum] = "180e6ccf01daf4c426b846dfc66db1fc518f074baa793aa7d9b9aaeffad6a3b6"
SRC_URI[windows_i686_msvc-0.36.1.sha256sum] = "e2e7917148b2812d1eeafaeb22a97e4813dfa60a3f8f78ebe204bcc88f12f024"
SRC_URI[windows_x86_64_gnu-0.36.1.sha256sum] = "4dcd171b8776c41b97521e5da127a2d86ad280114807d0b2ab1e462bc764d9e1"
SRC_URI[windows_x86_64_msvc-0.36.1.sha256sum] = "c811ca4a8c853ef420abd8592ba53ddbbac90410fab6903b3e79972a631f7680"
SRC_URI[zeroize-1.5.5.sha256sum] = "94693807d016b2f2d2e14420eb3bfcca689311ff775dcf113d74ea624b7cdf07"

inherit cargo rust

SRCREV = "599d8d5d3657e6c25b3877f84a09979a79256600"
S = "${WORKDIR}/git"
PV = "0.7.3"

