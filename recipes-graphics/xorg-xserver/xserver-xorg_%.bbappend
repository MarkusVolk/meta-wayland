FILESEXTRAPATHS_prepend := "${THISDIR}/xserver-xorg:"

# This backport is needed on hardknott to enable wlroots to create the xwayland backend
SRC_URI_append = " file://0001-xwayland-Add-a-pkg-config-file-for-Xwayland.patch"

