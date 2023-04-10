DESCRIPTION = "RFC3261 compliant SIP User-Agent library."
HOMEPAGE = "https://github.com/freeswitch/sofia-sip"
SECTION = "libs"

DEPENDS = "glib-2.0 dbus-glib openssl"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=03068f550c635f6520e0f0252da412fc"

S = "${WORKDIR}/git"
SRCREV = "3f17604d0c427a276839ea96b6dc31d7da69d27c"
PV = "1.13.14"

SRC_URI = "git://github.com/freeswitch/sofia-sip.git;protocol=https;branch=master"

inherit autotools pkgconfig

EXTRA_OECONF += "--with-glib"

