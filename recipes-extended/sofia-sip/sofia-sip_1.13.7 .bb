DESCRIPTION = "RFC3261 compliant SIP User-Agent library."
HOMEPAGE = "https://github.com/freeswitch/sofia-sip"
SECTION = "libs"

DEPENDS = "glib-2.0 dbus-glib openssl"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=03068f550c635f6520e0f0252da412fc"

S = "${WORKDIR}/git"
SRCREV = "1607ade8b6d1c4f82379c7489e7573a769b61994"
PV = "1.13.7"

SRC_URI = "git://github.com/freeswitch/sofia-sip.git;protocol=https;branch=master"

inherit autotools pkgconfig

EXTRA_OECONF += "--with-glib"

