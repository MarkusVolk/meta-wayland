SUMMARY = "GUI wallpaper setter for Wayland and Xorg window managers."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/anufrievroman/waypaper.git;protocol=https;branch=main"

RDEPENDS:${PN} = "python3-pygobject"

inherit setuptools3

S = "${WORKDIR}/git"
PV = "2.0.2"
SRCREV = "bf55f79092f7fbef787d437672d824ecd5b025b6"

FILES:${PN} += "${datadir}"
