SUMMARY = "Reference implementation of JPEG XL (encoder and decoder)"
HOMEPAGE = "https://github.com/libjxl/libjxl/" 

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a905a337cc228a1f68f0b5416f52a7f" 

inherit cmake pkgconfig

DEPENDS = "highway brotli"

SRC_URI = " \
    gitsm://github.com/libjxl/libjxl.git;protocol=https;nobranch=1 \
"

PV = "0.6.1"
SRCREV = "a205468bc5d3a353fb15dae2398a101dff52f2d3"
S = "${WORKDIR}/git"

EXTRA_OECMAKE = " \
	-DCMAKE_BUILD_TYPE=Release \
	-DJPEGXL_ENABLE_PLUGINS=OFF \
	-DBUILD_TESTING=OFF \
	-DJPEGXL_WARNINGS_AS_ERRORS=OFF \
	-DJPEGXL_ENABLE_SJPEG=OFF \
	-DJPEGXL_ENABLE_BENCHMARK=OFF \
	-DJPEGXL_ENABLE_EXAMPLES=OFF \
	-DJPEGXL_ENABLE_MANPAGES=OFF \
	-DJPEGXL_ENABLE_SKCMS=ON \
	-DJPEGXL_FORCE_SYSTEM_BROTLI=ON \
	-DJPEGXL_FORCE_SYSTEM_HWY=ON \
	-DJPEGXL_ENABLE_JNI=OFF \
	-DJPEGXL_ENABLE_TCMALLOC=OFF \
	-DJPEGXL_ENABLE_TOOLS=OFF \
"

CXXFLAGS:append:arm = " -mfp16-format=ieee"
 
