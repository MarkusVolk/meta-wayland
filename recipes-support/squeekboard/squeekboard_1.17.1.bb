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
    git://gitlab.gnome.org/World/Phosh/squeekboard.git;protocol=https;branch=${BRANCH} \
    git://source.puri.sm/dorota.czaplejewicz/fragile.git;protocol=https;nobranch=1;name=fragile;destsuffix=fragile \
    file://0001-Pass-additional-arguments-to-cargo.patch \
    file://0001-Skip-build-tests-if-not-enabled.patch \
    crate://crates.io/atk-sys/0.9.1 \
    crate://crates.io/atk/0.7.0 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/cairo-rs/0.7.1 \
    crate://crates.io/cairo-sys-rs/0.9.2 \
    crate://crates.io/cc/1.0.72 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/dtoa/0.4.8 \
    crate://crates.io/fragile/0.3.0 \
    crate://crates.io/gdk-pixbuf-sys/0.9.1 \
    crate://crates.io/gdk-pixbuf/0.7.0 \
    crate://crates.io/gdk-sys/0.9.1 \
    crate://crates.io/gdk/0.11.0 \
    crate://crates.io/gio-sys/0.9.1 \
    crate://crates.io/gio/0.7.0 \
    crate://crates.io/glib-sys/0.9.1 \
    crate://crates.io/glib/0.8.2 \
    crate://crates.io/gobject-sys/0.9.1 \
    crate://crates.io/gtk-sys/0.9.2 \
    crate://crates.io/gtk/0.7.0 \
    crate://crates.io/hashbrown/0.8.1 \
    crate://crates.io/indexmap/1.5.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.107 \
    crate://crates.io/linked-hash-map/0.5.4 \
    crate://crates.io/maplit/1.0.2 \
    crate://crates.io/memmap/0.7.0 \
    crate://crates.io/pango-sys/0.9.1 \
    crate://crates.io/pango/0.7.0 \
    crate://crates.io/pkg-config/0.3.22 \
    crate://crates.io/proc-macro2/1.0.32 \
    crate://crates.io/quote/1.0.10 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.3.9 \
    crate://crates.io/serde/1.0.130 \
    crate://crates.io/serde_derive/1.0.130 \
    crate://crates.io/serde_yaml/0.8.21 \
    crate://crates.io/syn/1.0.81 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/xkbcommon/0.4.0 \
    crate://crates.io/yaml-rust/0.4.5 \
    "

SRC_URI[atk-sys-0.9.1.sha256sum] = "e552c1776737a4c80110d06b36d099f47c727335f9aaa5d942a72b6863a8ec6f"
SRC_URI[atk-0.7.0.sha256sum] = "86b7499272acf036bb5820c6e346bbfb5acc5dceb104bc2c4fd7e6e33dfcde6a"
SRC_URI[autocfg-1.0.1.sha256sum] = "cdb031dd78e28731d87d56cc8ffef4a8f36ca26c38fe2de700543e627f8a464a"
SRC_URI[bitflags-1.2.1.sha256sum] = "cf1de2fe8c75bc145a2f577add951f8134889b4795d47466a54a5c846d691693"
SRC_URI[cairo-rs-0.7.1.sha256sum] = "e05db47de3b0f09a222fa4bba2eab957d920d4243962a86b2d77ab401e4a359c"
SRC_URI[cairo-sys-rs-0.9.2.sha256sum] = "ff65ba02cac715be836f63429ab00a767d48336efc5497c5637afb53b4f14d63"
SRC_URI[cc-1.0.72.sha256sum] = "22a9137b95ea06864e018375b72adfb7db6e6f68cfc8df5a04d00288050485ee"
SRC_URI[clap-2.33.3.sha256sum] = "37e58ac78573c40708d45522f0d80fa2f01cc4f9b4e2bf749807255454312002"
SRC_URI[dtoa-0.4.8.sha256sum] = "56899898ce76aaf4a0f24d914c97ea6ed976d42fec6ad33fcbb0a1103e07b2b0"
SRC_URI[fragile-0.3.0.sha256sum] = "05f8140122fa0d5dcb9fc8627cfce2b37cc1500f752636d46ea28bc26785c2f9"
SRC_URI[gdk-pixbuf-sys-0.9.1.sha256sum] = "d8991b060a9e9161bafd09bf4a202e6fd404f5b4dd1a08d53a1e84256fb34ab0"
SRC_URI[gdk-pixbuf-0.7.0.sha256sum] = "9726408ee1bbada83094326a99b9c68fea275f9dbb515de242a69e72051f4fcc"
SRC_URI[gdk-sys-0.9.1.sha256sum] = "6adf679e91d1bff0c06860287f80403e7db54c2d2424dce0a470023b56c88fbb"
SRC_URI[gdk-0.11.0.sha256sum] = "6243e995f41f3a61a31847e54cc719edce93dd9140c89dca3b9919be1cfe22d5"
SRC_URI[gio-sys-0.9.1.sha256sum] = "4fad225242b9eae7ec8a063bb86974aca56885014672375e5775dc0ea3533911"
SRC_URI[gio-0.7.0.sha256sum] = "6261b5d34c30c2d59f879e643704cf54cb44731f3a2038000b68790c03e360e3"
SRC_URI[glib-sys-0.9.1.sha256sum] = "95856f3802f446c05feffa5e24859fe6a183a7cb849c8449afc35c86b1e316e2"
SRC_URI[glib-0.8.2.sha256sum] = "be27232841baa43e0fd5ae003f7941925735b2f733a336dc75f07b9eff415e7b"
SRC_URI[gobject-sys-0.9.1.sha256sum] = "31d1a804f62034eccf370006ccaef3708a71c31d561fee88564abe71177553d9"
SRC_URI[gtk-sys-0.9.2.sha256sum] = "53def660c7b48b00b510c81ef2d2fbd3c570f1527081d8d7947f471513e1a4c1"
SRC_URI[gtk-0.7.0.sha256sum] = "709f1074259d4685b96133f92b75c7f35b504715b0fcdc96ec95de2607296a60"
SRC_URI[hashbrown-0.8.1.sha256sum] = "34f595585f103464d8d2f6e9864682d74c1601fed5e07d62b1c9058dba8246fb"
SRC_URI[indexmap-1.5.2.sha256sum] = "4e47a3566dd4fd4eec714ae6ceabdee0caec795be835c223d92c2d40f1e8cf1c"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.107.sha256sum] = "fbe5e23404da5b4f555ef85ebed98fb4083e55a00c317800bc2a50ede9f3d219"
SRC_URI[linked-hash-map-0.5.4.sha256sum] = "7fb9b38af92608140b86b693604b9ffcc5824240a484d1ecd4795bacb2fe88f3"
SRC_URI[maplit-1.0.2.sha256sum] = "3e2e65a1a2e43cfcb47a895c4c8b10d1f4a61097f9f254f183aee60cad9c651d"
SRC_URI[memmap-0.7.0.sha256sum] = "6585fd95e7bb50d6cc31e20d4cf9afb4e2ba16c5846fc76793f11218da9c475b"
SRC_URI[pango-sys-0.9.1.sha256sum] = "86b93d84907b3cf0819bff8f13598ba72843bee579d5ebc2502e4b0367b4be7d"
SRC_URI[pango-0.7.0.sha256sum] = "393fa071b144f8ffb83ede273758983cf414ca3c0b1d2a5a9ce325b3ba3dd786"
SRC_URI[pkg-config-0.3.22.sha256sum] = "12295df4f294471248581bc09bef3c38a5e46f1e36d6a37353621a0c6c357e1f"
SRC_URI[proc-macro2-1.0.32.sha256sum] = "ba508cc11742c0dc5c1659771673afbab7a0efab23aa17e854cbab0837ed0b43"
SRC_URI[quote-1.0.10.sha256sum] = "38bc8cc6a5f2e3655e0899c1b848643b2562f853f114bfec7be120678e3ace05"
SRC_URI[regex-syntax-0.6.25.sha256sum] = "f497285884f3fcff424ffc933e56d7cbca511def0c9831a7f9b5f6153e3cc89b"
SRC_URI[regex-1.3.9.sha256sum] = "9c3780fcf44b193bc4d09f36d2a3c87b251da4a046c87795a0d35f4f927ad8e6"
SRC_URI[serde-1.0.130.sha256sum] = "f12d06de37cf59146fbdecab66aa99f9fe4f78722e3607577a5375d66bd0c913"
SRC_URI[serde_derive-1.0.130.sha256sum] = "d7bc1a1ab1961464eae040d96713baa5a724a8152c1222492465b54322ec508b"
SRC_URI[serde_yaml-0.8.21.sha256sum] = "d8c608a35705a5d3cdc9fbe403147647ff34b921f8e833e49306df898f9b20af"
SRC_URI[syn-1.0.81.sha256sum] = "f2afee18b8beb5a596ecb4a2dce128c719b4ba399d34126b9e4396e3f9860966"
SRC_URI[textwrap-0.11.0.sha256sum] = "d326610f408c7a4eb6f51c37c330e496b08506c9457c9d34287ecc38809fb060"
SRC_URI[unicode-width-0.1.9.sha256sum] = "3ed742d4ea2bd1176e236172c8429aaf54486e7ac098db29ffe6529e0ce50973"
SRC_URI[unicode-xid-0.2.2.sha256sum] = "8ccb82d61f80a663efe1f787a51b16b5a51e3314d6ac365b08639f52387b33f3"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[xkbcommon-0.4.0.sha256sum] = "fda0ea5f7ddabd51deeeda7799bee06274112f577da7dd3d954b8eda731b2fce"
SRC_URI[yaml-rust-0.4.5.sha256sum] = "56c1936c4cc7a1c9ab21a1ebb602eb942ba868cbd44a99cb7cdc5892335e1c85"

# Modify these as desired
PV = "1.17.1"
SRCREV = "2faa98d85f1142383ec8ad1487616c1a7ad1882f"
BRANCH = "1.17"

SRCREV_FORMAT .= "_fragile"
SRCREV_fragile = "51048ca11824279c2114c77fef5bcb950838fc09"
EXTRA_OECARGO_PATHS += "${WORKDIR}/fragile"

S = "${WORKDIR}/git"

inherit cargo meson rust pkgconfig

EXTRA_OEMESON = "\
    -Dcargo-flags=[\'--target\',\'${HOST_SYS}\',\'-v\'] \
    -Dtests=false \
    -Ddepdatadir=${datadir} \
    -Donline=true \
"

export CARGO_FEATURE_STD = "1"

do_compile[network] = "1"

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
