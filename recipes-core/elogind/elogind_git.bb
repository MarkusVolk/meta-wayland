SUMMARY = "Elogind User, Seat and Session Manager."
DESCRIPTION = "Elogind is the systemd project's "logind", extracted out to be a standalone daemon. It integrates with PAM to know the set of users that are logged in to a system and whether they are logged in graphically, on the console, or remotely."
HOMEPAGE = "https://github.com/elogind"
SECTION = "base/shell"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/elogind/elogind.git;protocol=https;nobranch=1"

DEPENDS += " \
	acl dbus \
	eudev \
	gperf-native \
	libcap \
	libpam \
	polkit \
	python3-jinja2-native \
	python3-native \
	util-linux \
"


S = "${WORKDIR}/git"
PV = "249-pre"
SRCREV = "06e702c9dafa3ea1dd6df8ee8cb4dcf417a0d442"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release -Dtranslations=false"

do_install:prepend() {
	install -d ${D}${libdir}/elogind/system-shutdown
	install -d ${D}${libdir}/elogind/system-sleep
}

FILES:${PN} += "/usr"

