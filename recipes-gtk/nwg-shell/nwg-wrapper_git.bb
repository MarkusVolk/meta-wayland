SUMMARY = "GTK3-based wrapper to display a script output, or a text file content on the desktop in wlroots-based compositors."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f8c294ba3ca22f2369223ac6415d1168"

SRC_URI = " \
	git://github.com/nwg-piotr/nwg-wrapper.git;protocol=https;branch=master \
"

DEPENDS = "python3"
RDEPENDS:${PN} = "python3-pygobject"

inherit setuptools3 gobject-introspection

S = "${WORKDIR}/git"
PV = "0.1.1"
SRCREV = "9c1b0669dd894b6209a3130169956c755154b055"

