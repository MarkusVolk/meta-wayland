SUMMARY = "A selection of wallpapers contributed to the nwg-shell project."
LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=65d3616852dbf7b1a6d4b53b00626032"

SRC_URI = "git://github.com/nwg-piotr/nwg-shell-wallpapers.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
PV = "1.3"
SRCREV = "93610e70f8fec577c96e226b0f7b960cdfe01d48"

do_install() {
	install -d ${D}${datadir}/backgrounds/sway
	for file in ${S}/wallpapers/*; do
		install -m 0644 "$file" ${D}${datadir}/backgrounds/sway
	done
}

FILES:${PN} = "${datadir}"
