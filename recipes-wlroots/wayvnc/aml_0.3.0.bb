SUMMARY = "Andri's Main Loop"
DESCRIPTION = "Andri's Main Loop"
HOMEPAGE = "https://github.com/any1/aml/"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6f3cfaa39204b96e14b68b9d50d3e4e \
                    "

SRC_URI = "https://github.com/any1/${BPN}/archive/refs/tags/v${PV}.tar.gz \
           "

SRC_URI[sha256sum] = "cba1ca1689d4031faf37bb7a184559106b6d2f462ae8890a9fa16e3022ca1eb0"


inherit meson pkgconfig


