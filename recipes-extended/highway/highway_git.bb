SUMMARY = "Highway is a C++ library for SIMD (Single Instruction, Multiple Data)"
HOMEPAGE = "https://github.com/google/highway/" 

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b42edef8fa55315f34f2370b4715ca9" 

inherit cmake

SRC_URI = " \
    git://github.com/google/highway.git;protocol=https \
"

PV = "0.14.2"
SRCREV = "${PV}"
S = "${WORKDIR}/git"

EXTRA_OECMAKE = "-DBUILD_TESTING=0 -DCMAKE_BUILD_TYPE=Release"

