SUMMARY = "A native style to bend Qt5/Qt6 applications to look like they belong into GNOME Shell.."
HOMEPAGE = "https://github.com/FedoraQt/adwaita-qt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

DEPENDS = "qtbase"

inherit qt6-cmake

EXTRA_OECMAKE += "-DUSE_QT6=ON"

SRC_URI = "git://github.com/FedoraQt/adwaita-qt.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
SRCREV = "3807292acee096459a73732f663544916d9eb0e5"

FILES:${PN} += "${libdir}/plugins/styles/adwaita.so"

do_install:append() {
	# add hack to unbreak crosscompile for qgnomeplatform
	sed -i "s|include(\"\${CMAKE_CURRENT_LIST_DIR}\/AdwaitaQt6Targets.cmake\")||" ${D}${libdir}/cmake/AdwaitaQt6/AdwaitaQt6Config.cmake
}
