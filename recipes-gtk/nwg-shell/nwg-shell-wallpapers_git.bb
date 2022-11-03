SUMMARY = "A selection of wallpapers contributed to the nwg-shell project."
LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=65d3616852dbf7b1a6d4b53b00626032"

SRC_URI = "git://github.com/nwg-piotr/nwg-shell-wallpapers.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "1.1"
SRCREV = "56a177afe8b8e10d9963a6793fa8bc27b6c063cc"

do_install() {
	install -d ${D}${datadir}/backgrounds/sway
	for file in ${S}/wallpapers/*; do
		install -m 0644 "$file" ${D}${datadir}/backgrounds/sway
	done
}

FILES:${PN} = "${datadir}"
