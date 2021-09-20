SUMMARY = "GTK3-based wrapper to display a script output, or a text file content on the desktop in wlroots-based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa55ad1c828db5e334374fb1182530"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-wrapper.git;protocol=https \
"

DEPENDS = "python3"
RDEPENDS:${PN} = "python3-pygobject"

inherit setuptools3 gobject-introspection

S = "${WORKDIR}/git"
PV = "0.0.2"
SRCREV = "v${PV}"

