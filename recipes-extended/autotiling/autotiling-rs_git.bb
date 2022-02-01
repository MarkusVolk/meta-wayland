SUMMARY = "This automatically alternates the container layout between horizontal and vertical for successive new containers."
LICENSE = "WTFPL"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/WTFPL;md5=7993e3336259bdb618ad5a1afc872165"

SRC_URI = " \
	git://github.com/ammgws/autotiling-rs.git;protocol=https;branch=master \
	crate://crates.io/clap/2.33.3 \
	crate://crates.io/swayipc/2.7.2 \
	crate://crates.io/bitflags/1.2.1 \
	crate://crates.io/textwrap/0.11.0 \
	crate://crates.io/unicode-width/0.1.8 \
	crate://crates.io/failure/0.1.8 \
	crate://crates.io/serde/1.0.104 \
	crate://crates.io/serde_json/1.0.48 \
	crate://crates.io/serde_derive/1.0.104 \
	crate://crates.io/backtrace/0.3.48 \
	crate://crates.io/failure_derive/0.1.8 \
	crate://crates.io/itoa/0.4.5 \
	crate://crates.io/ryu/1.0.2 \
	crate://crates.io/addr2line/0.12.1 \
	crate://crates.io/cfg-if/0.1.10 \
	crate://crates.io/libc/0.2.71 \
	crate://crates.io/object/0.19.0 \
	crate://crates.io/rust_demangle/0.1.0 \
	crate://crates.io/rustc-demangle/0.1.16 \
	crate://crates.io/proc-macro2/1.0.17 \
	crate://crates.io/quote/1.0.6 \
	crate://crates.io/syn/1.0.29 \
	crate://crates.io/synstructure/0.12.3 \
	crate://crates.io/gimli/0.21.0 \
	crate://crates.io/unicode-xid/0.2.0 \
"

inherit rust cargo

S = "${WORKDIR}/git"
PV = "0.1.3"
SRCREV = "d5b66b6cc23014aeda8da4c4fe561d366d9892b7"

