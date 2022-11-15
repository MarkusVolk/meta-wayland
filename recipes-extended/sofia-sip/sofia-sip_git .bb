DESCRIPTION = "RFC3261 compliant SIP User-Agent library."
HOMEPAGE = "https://github.com/freeswitch/sofia-sip"
SECTION = "libs"

DEPENDS = "glib-2.0 dbus-glib openssl"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=03068f550c635f6520e0f0252da412fc"

S = "${WORKDIR}/git"
SRCREV = "2a6190f8928c44d561efa734fe636fb6e00ab74b"
PV = "1.13.9"

SRC_URI = "git://github.com/freeswitch/sofia-sip.git;protocol=https;branch=master"

inherit autotools pkgconfig

EXTRA_OECONF += "--with-glib"

