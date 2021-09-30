SRC_URI = "git://github.com/libsdl-org/SDL.git;branch=main;protocol=https"
S = "${WORKDIR}/git"
PV = "2.0.16+${SRCREV}"
SRCREV = "ab09f3dae5bf89f17ef92d78ff7e5d2fde9c14b8"

EXTRA_OECONF:remove = "--enable-sdl-dlopen"

