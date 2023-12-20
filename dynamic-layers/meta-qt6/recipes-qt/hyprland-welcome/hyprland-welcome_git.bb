SUMMARY = "Hyprland's cute welcome app, written in qt6."
HOMEPAGE = "https://hyprland.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6458723c467506fd0c4aea3be2bcf8a"

SRC_URI = "git://github.com/hyprwm/hyprland-welcome.git;protocol=https;branch=main"

PV = "0.0.1"
SRCREV = "51561c00288775ad7afc20f47783bb068093ca5a"
S = "${WORKDIR}/git"

DEPENDS = "qtbase"
RDEPENDS:${PN} = "qtwayland"

inherit qt6-cmake
