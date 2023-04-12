SUMMARY = "This automatically alternates the container layout between horizontal and vertical for successive new containers."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c9e7f297308461c48038d7c1e05cfb8"

SRC_URI = " \
	git://github.com/ammgws/autotiling-rs.git;protocol=https;branch=master \
	crate://crates.io/autocfg/1.1.0 \
	crate://crates.io/bitflags/1.3.2 \
	crate://crates.io/clap/3.1.2 \
	crate://crates.io/clap_derive/3.1.2 \
	crate://crates.io/hashbrown/0.11.2 \
	crate://crates.io/heck/0.4.0 \
	crate://crates.io/indexmap/1.8.0 \
	crate://crates.io/itoa/1.0.1 \
	crate://crates.io/lazy_static/1.4.0 \
	crate://crates.io/memchr/2.4.1 \
	crate://crates.io/os_str_bytes/6.0.0 \
	crate://crates.io/proc-macro-error-attr/1.0.4 \
	crate://crates.io/proc-macro-error/1.0.4 \
	crate://crates.io/proc-macro2/1.0.36 \
	crate://crates.io/quote/1.0.15 \
	crate://crates.io/ryu/1.0.9 \
	crate://crates.io/serde/1.0.136 \
	crate://crates.io/serde_derive/1.0.136 \
	crate://crates.io/serde_json/1.0.79 \
	crate://crates.io/swayipc-types/1.0.1 \
	crate://crates.io/swayipc/3.0.0 \
	crate://crates.io/syn/1.0.86 \
	crate://crates.io/textwrap/0.14.2 \
	crate://crates.io/thiserror-impl/1.0.30 \
	crate://crates.io/thiserror/1.0.30 \
	crate://crates.io/unicode-xid/0.2.2 \
	crate://crates.io/version_check/0.9.4 \
"

SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[clap-3.1.2.sha256sum] = "5177fac1ab67102d8989464efd043c6ff44191b1557ec1ddd489b4f7e1447e77"
SRC_URI[clap_derive-3.1.2.sha256sum] = "01d42c94ce7c2252681b5fed4d3627cc807b13dfc033246bd05d5b252399000e"
SRC_URI[hashbrown-0.11.2.sha256sum] = "ab5ef0d4909ef3724cc8cce6ccc8572c5c817592e9285f5464f8e86f8bd3726e"
SRC_URI[heck-0.4.0.sha256sum] = "2540771e65fc8cb83cd6e8a237f70c319bd5c29f78ed1084ba5d50eeac86f7f9"
SRC_URI[indexmap-1.8.0.sha256sum] = "282a6247722caba404c065016bbfa522806e51714c34f5dfc3e4a3a46fcb4223"
SRC_URI[itoa-1.0.1.sha256sum] = "1aab8fc367588b89dcee83ab0fd66b72b50b72fa1904d7095045ace2b0c81c35"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[memchr-2.4.1.sha256sum] = "308cc39be01b73d0d18f82a0e7b2a3df85245f84af96fdddc5d202d27e47b86a"
SRC_URI[os_str_bytes-6.0.0.sha256sum] = "8e22443d1643a904602595ba1cd8f7d896afe56d26712531c5ff73a15b2fbf64"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro2-1.0.36.sha256sum] = "c7342d5883fbccae1cc37a2353b09c87c9b0f3afd73f5fb9bba687a1f733b029"
SRC_URI[quote-1.0.15.sha256sum] = "864d3e96a899863136fc6e99f3d7cae289dafe43bf2c5ac19b70df7210c0a145"
SRC_URI[ryu-1.0.9.sha256sum] = "73b4b750c782965c211b42f022f59af1fbceabdd026623714f104152f1ec149f"
SRC_URI[serde-1.0.136.sha256sum] = "ce31e24b01e1e524df96f1c2fdd054405f8d7376249a5110886fb4b658484789"
SRC_URI[serde_derive-1.0.136.sha256sum] = "08597e7152fcd306f41838ed3e37be9eaeed2b61c42e2117266a554fab4662f9"
SRC_URI[serde_json-1.0.79.sha256sum] = "8e8d9fa5c3b304765ce1fd9c4c8a3de2c8db365a5b91be52f186efc675681d95"
SRC_URI[swayipc-types-1.0.1.sha256sum] = "620c3054335b817901d36f06fa5ef715f04d59d7b96f48ecc1a7bf408f194af7"
SRC_URI[swayipc-3.0.0.sha256sum] = "40cc7e2bba9f31e7c46b119d9c542496806b9114676d8f46aa5c9c950ececaec"
SRC_URI[syn-1.0.86.sha256sum] = "8a65b3f4ffa0092e9887669db0eae07941f023991ab58ea44da8fe8e2d511c6b"
SRC_URI[textwrap-0.14.2.sha256sum] = "0066c8d12af8b5acd21e00547c3797fde4e8677254a7ee429176ccebbe93dd80"
SRC_URI[thiserror-impl-1.0.30.sha256sum] = "aa32fd3f627f367fe16f893e2597ae3c05020f8bba2666a4e6ea73d377e5714b"
SRC_URI[thiserror-1.0.30.sha256sum] = "854babe52e4df1653706b98fcfc05843010039b406875930a70e4d9644e5c417"
SRC_URI[unicode-xid-0.2.2.sha256sum] = "8ccb82d61f80a663efe1f787a51b16b5a51e3314d6ac365b08639f52387b33f3"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"

inherit rust cargo

S = "${WORKDIR}/git"
PV = "0.1.3"
SRCREV = "1f7a08c6a87b06f13744962f757e6bdcc6e3fc89"

