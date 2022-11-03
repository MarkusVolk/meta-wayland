SUMMARY = "ddcutil is a Linux program for querying and changing monitor settings, such as brightness and color levels."
HOMEPAGE = "https://github.com/rockowitz/ddcutil"
SECTION = "libs"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/rockowitz/ddcutil.git;protocol=https;branch=master"

DEPENDS = "i2c-tools glib-2.0 kmod"

S = "${WORKDIR}/git"
PV = "1.3.0"
SRCREV = "207f6c75b01924bf5aa7faa4a6688eb2c14dfebf"

inherit autotools pkgconfig gobject-introspection

EXTRA_OECONF:remove = '--enable-introspection'

CFLAGS += "-Wno-unused-but-set-variable"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'drm x11 systemd', d)}"

PACKAGECONFIG[drm] = "--enable-drm=yes,--enable-drm=no,libdrm"
PACKAGECONFIG[systemd] = "--enable-udev=yes,--enable-udev=no,udev"
PACKAGECONFIG[usb] = "--enable-usb=yes,--enable-usb=no,libusb1"
PACKAGECONFIG[x11] = "--enable-x11=yes,--enable-x11=no,libx11 xrandr"

do_install:append () {
	install -d ${D}${sysconfdir}/udev/rules.d
	cp -rf ${D}${datadir}/ddcutil/data/* ${D}${sysconfdir}/udev/rules.d
}

FILES:${PN} += "${sysconfdir}"

