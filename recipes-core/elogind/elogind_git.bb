SUMMARY = "Elogind User, Seat and Session Manager."
DESCRIPTION = "Elogind is the systemd project's "logind", extracted out to be a standalone daemon. It integrates with PAM to know the set of users that are logged in to a system and whether they are logged in graphically, on the console, or remotely."
HOMEPAGE = "https://github.com/elogind"
SECTION = "base/shell"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/elogind/elogind.git;protocol=https;nobranch=1"

DEPENDS += "gperf-native libcap eudev util-linux acl dbus python3-native polkit"

S = "${WORKDIR}/git"
PV = "248-pre"
SRCREV = "eed62107e2165b6863ee95a730b8f93aa397b92d"

inherit meson pkgconfig

EXTRA_OEMESON += "--buildtype release -Dtranslations=false"

FILES:${PN} += "/usr"

