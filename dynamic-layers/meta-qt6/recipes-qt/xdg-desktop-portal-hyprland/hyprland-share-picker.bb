SUMMARY = "Share picker for hyprlands screenshot/screencast xdg-desktop-portal backend"
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e0f1d50df739a9fb8eae12a8f37ce352"

# Note: meta-qt6 is needed
DEPENDS = "qtbase"
RDEPENDS:${PN} = "qtwayland"
RRECOMMENDS:${PN} = "qgnomeplatform"

require xdg-desktop-portal-hyprland.inc

inherit qt6-cmake features_check

REQUIRED_DISTRO_FEATURES = "opengl wayland"

S = "${WORKDIR}/git/hyprland-share-picker"


