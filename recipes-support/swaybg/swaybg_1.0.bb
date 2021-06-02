SUMMARY = "A Wayland WM"
HOMEPAGE = "https://github.com/swaywm/swaybg"
BUGTRACKER = "https://github.com/swaywm/swaybg/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b53d9ec16b9125995437ac9efab1b450"

REQUIRED_DISTRO_FEATURES = "wayland systemd"

DEPENDS = " \
            cairo \
            gdk-pixbuf \
            wayland \
            wayland-native \
            wayland-protocols \
           "

SRC_URI = " \
	https://github.com/swaywm/swaybg/archive/refs/tags/${PV}.tar.gz \
"

SRC_URI[sha256sum] = "a23f1cde07138b865630172eff83db916d2f0989b75fb318def85dcfc3120fbd"

S = "${WORKDIR}/${PN}-${PV}"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

