SUMMARY = "A date and time library based on C++11/14/17."
AUTHOR = "Howard Hinnant"
HOMEPAGE = "https://github.com/HowardHinnant/date.git"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b5d973344b3c7bbf7535f0e6e002d017"

SRC_URI = " \
	git://github.com/HowardHinnant/date.git;protocol=https;branch=master \
	file://pkgconfig.patch \
"

S = "${WORKDIR}/git"
PV = "3.0.1"
SRCREV = "v${PV}"

inherit cmake

DEPENDS = "curl"

EXTRA_OECMAKE += " \
	-DBUILD_TZ_LIB=ON \
	-DBUILD_SHARED_LIBS=ON \
	-DUSE_SYSTEM_TZ_DB=ON \
"
	
