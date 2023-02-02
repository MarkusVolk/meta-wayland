SUMMARY = "Share picker for hyprlands screenshot/screencast xdg-desktop-portal backend"
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

# Note: meta-qt6 is needed
DEPENDS = "qtbase qtwayland"

inherit qt6-cmake pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "opengl wayland"

SRC_URI = "git://github.com/hyprwm/xdg-desktop-portal-hyprland.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git/hyprland-share-picker"
SRCREV = "13db7db849e1e86289b3b0e296d47d08e4a80d56"
