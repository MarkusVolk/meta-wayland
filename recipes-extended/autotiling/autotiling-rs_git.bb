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

inherit rust cargo

S = "${WORKDIR}/git"
PV = "0.1.3"
SRCREV = "1f7a08c6a87b06f13744962f757e6bdcc6e3fc89"

