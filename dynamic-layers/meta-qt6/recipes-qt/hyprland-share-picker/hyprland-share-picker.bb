SUMMARY = "Share picker for hyprlands screenshot/screencast xdg-desktop-portal backend"
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

# Note: meta-qt6 is needed
DEPENDS = "qtbase"
RDEPENDS:${PN} = "qtwayland"
RRECOMMENDS:${PN} = "adwaita-qt"

inherit qt6-cmake features_check

REQUIRED_DISTRO_FEATURES = "opengl wayland"

SRC_URI = "git://github.com/hyprwm/xdg-desktop-portal-hyprland.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git/hyprland-share-picker"
SRCREV = "198d019583e332653d4e8dcca9439817b39b6a20"
PV = "0.2.1"
