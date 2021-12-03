SRC_URI = "git://github.com/libsdl-org/SDL.git;branch=main;protocol=https"
S = "${WORKDIR}/git"
PV = "2.0.18"
SRCREV = "release-${PV}"

EXTRA_OECONF:remove = "--enable-sdl-dlopen"

