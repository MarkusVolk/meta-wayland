SUMMARY = "swaybg is a wallpaper utility for Wayland compositors."
HOMEPAGE = "https://github.com/swaywm/swaybg"
BUGTRACKER = "https://github.com/swaywm/swaybg/issues"
SECTION = "graphics"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b53d9ec16b9125995437ac9efab1b450"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS = " \
            cairo \
            gdk-pixbuf \
            wayland \
            wayland-native \
            wayland-protocols \
"

SRC_URI = " \
	git://github.com/swaywm/swaybg.git;protocol=https;branch=master \
"

# Reproducibility issue. Fix me!
CFLAGS:append = " -Wno-error=date-time"

S = "${WORKDIR}/git"
PV = "1.1"
SRCREV = "e10d02c77e54cb035c625e255f0df208cb3c86a0"

inherit meson pkgconfig features_check

EXTRA_OEMESON += "--buildtype release"

BBCLASSEXTEND = ""

