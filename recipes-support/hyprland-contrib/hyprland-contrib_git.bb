SUMMARY = "Hyprland Contribution Scripts"
HOMEPAGE = "https:/github.com/hyprwm/contrib"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0836e8f0d25d383d1195ea44fdd185d"

SRC_URI = "git://github.com/hyprwm/contrib.git;protocol=https;branch=main"

S = "${WORKDIR}/git"
SRCREV = "bef073cff65917ba2d888aa4dc39bd9868e2b0a4"
PV = "0.1"

DEPENDS = "scdoc-native"
RDEPENDS:${PN} = "bash sed rofi jq libnotify grim slurp wl-clipboard"

EXTRA_OEMAKE += "DESTDIR=${D} PREFIX=${prefix} BINDIR=${D}${bindir} MANDIR=${D}${datadir}/man MAN1DIR=${D}${datadir}/man1"

do_install() {
	for dir in grimblast hyprprop scratchpad shellevents try_swap_workspace; do
		cd $dir && oe_runmake install && cd ${S}
	done
}

FILES:${PN} = "${bindir} ${datadir}"
