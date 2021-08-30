SRC_URI = "git://github.com/libsdl-org/SDL.git;branch=main;protocol=https"
S = "${WORKDIR}/git"
PV = "2.0.16+${SRCREV}"
SRCREV = "b9bf7ffec755815c95b9d980dffe463f5717d149"

EXTRA_OECONF:remove = "--enable-sdl-dlopen"

