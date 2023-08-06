SUMMARY = "Sway Contribution Scripts"
HOMEPAGE = "https:/github.com/OctopusET/sway-contrib"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1640a047991fe3cbc70d68830888e863"

SRC_URI = "git://github.com/OctopusET/sway-contrib.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
SRCREV = "7e138bfc112872b79ac9fd766bc57c0f125b96d4"

RDEPENDS:${PN} = "python3"

do_install() {
	install -d ${D}${bindir}
	install -m 755 ${S}/grimshot ${D}${bindir}
	install -m 755 ${S}/autoname-workspaces.py ${D}${bindir}
	install -m 755 ${S}/inactive-windows-transparency.py ${D}${bindir}
	install -m 755 ${S}/switch-top-level.py ${D}${bindir}
}

FILES:${PN} = "${bindir}"
