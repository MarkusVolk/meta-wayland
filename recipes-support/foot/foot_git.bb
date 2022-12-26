SUMMARY = "A fast, lightweight and minimalistic Wayland terminal emulator."
HOMEPAGE = "https://codeberg.org/dnkl/foot"
BUGTRACKER = "https://codeberg.org/dnkl/foot/issues"
SECTION = "base/shell"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3a7351a597a91e763901f7c76f21e798"

DEPENDS = " \
	fcft \
	fontconfig \
	freetype \
	libxkbcommon \
	pixman \
	wayland \
	wayland-native \
"

RRECOMMENDS:${PN} = "ncurses-terminfo"

SRC_URI = " \
	git://codeberg.org/dnkl/foot.git;protocol=https;branch=master \
	file://0001-generate-version.sh-dont-try-to-fetch-version-from-g.patch \
"

S = "${WORKDIR}/git"
PV = "1.13.1"
SRCREV = "dfabc5d75423c863a7e9a930b9a8aac593784e02"

PACKAGECONFIG[grapheme-clustering] = "-Dgrapheme-clustering=enabled,-Dgrapheme-clustering=disabled,utf8proc"
PACKAGECONFIG[docs] = "-Ddocs=enabled,-Ddocs=disabled,scdoc-native"
PACKAGECONFIG[themes] = "-Dthemes=true,-Dthemes=false"

PACKAGECONFIG ?= " \
	grapheme-clustering \
	themes \
"

EXTRA_OEMESON += "--buildtype=release -Dterminfo=disabled"

inherit meson pkgconfig

CFLAGS += "-Wno-unused-but-set-variable"

FILES:${PN} = " \
	${bindir} \
	${datadir} \
	${libdir} \
	${sysconfdir} \
"

BBCLASSEXTEND = ""

