SUMMARY = "This provides screenshot/screencast xdg-desktop-portal backends for hyprland."
HOMEPAGE = "https://github.com/hyprwm/xdg-desktop-portal-hyprland"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0f1d50df739a9fb8eae12a8f37ce352"

SRC_URI:append = " file://0001-meson.build-Dont-build-hyprland-share-picker-with-me.patch"

require xdg-desktop-portal-hyprland.inc

# Note: meta-qt6 is needed
DEPENDS = " \
    wayland \
    wayland-native \
    wayland-protocols \
    hyprlang \
    libdrm \
    pipewire \
    sdbus-c++ \
    virtual/libgbm \
"

RDEPENDS:${PN} = "hyprland-share-picker grim slurp hyprpicker hyprlang"
RCONFLICTS:${PN} = "xdg-desktop-portal-wlr xdg-desktop-portal-gnome"

inherit meson pkgconfig features_check
REQUIRED_DISTRO_FEATURES = "opengl wayland"

S = "${WORKDIR}/git"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)}"
PACKAGECONFIG[systemd] = "-Dsystemd=enabled,-Dsystemd=disabled,systemd"

FILES:${PN} += "${systemd_user_unitdir} ${datadir}"
