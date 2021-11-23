SUMMARY = "Python Module for the Brotli compression algorithm."
HOMEPAGE = "https://github.com/google/brotli/" 

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=941ee9cd1609382f946352712a319b4b" 

inherit cmake setuptools3

SRC_URI = " \
    git://github.com/google/brotli.git;protocol=https;branch=master \
"

PV = "1.0.9"
SRCREV = "v${PV}"
S = "${WORKDIR}/git"

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"

