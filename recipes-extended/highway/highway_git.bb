SUMMARY = "Highway is a C++ library for SIMD (Single Instruction, Multiple Data)"
HOMEPAGE = "https://github.com/google/highway/" 

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b42edef8fa55315f34f2370b4715ca9" 

inherit cmake

SRC_URI = " \
    git://github.com/google/highway.git;protocol=https;branch=master \
"

PV = "0.15.0"
SRCREV = "e69083a12a05caf037cabecdf1b248b7579705a5"
S = "${WORKDIR}/git"

EXTRA_OECMAKE = "-DBUILD_TESTING=0 -DCMAKE_BUILD_TYPE=Release"
CXXFLAGS:append:arm = " -mfp16-format=ieee"
