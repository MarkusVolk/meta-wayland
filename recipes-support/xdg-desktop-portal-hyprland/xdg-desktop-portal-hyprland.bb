SUMMARY = "This provides screenshot/screencast xdg-desktop-portal backends for hyprland."
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e316e9609dd7672b87ff25b46b2cf3e1"

# Note: meta-qt6 is needed
DEPENDS = " \
    wayland \
    wayland-native \
    wayland-protocols \
    libdrm \
    libinih \
    pipewire \
    virtual/libgbm \
"

RDEPENDS:${PN} = "hyprland-share-picker"
RCONFLICTS:${PN} = "xdg-desktop-portal-wlr"

inherit meson pkgconfig features_check
REQUIRED_DISTRO_FEATURES = "opengl wayland"

SRC_URI = "gitsm://github.com/hyprwm/xdg-desktop-portal-hyprland.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"
SRCREV = "13db7db849e1e86289b3b0e296d47d08e4a80d56"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', 'basu', d)}"

PACKAGECONFIG[systemd] = "-Dsystemd=enabled -Dsd-bus-provider=libsystemd,-Dsystemd=disabled"
PACKAGECONFIG[basu] = "-Dsd-bus-provider=basu,,basu"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"
