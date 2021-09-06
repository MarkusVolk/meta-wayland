PACKAGECONFIG[xkbregistry] = "-Denable-xkbregistry=true,-Denable-xkbregistry=false,libxml2"
PACKAGECONFIG[docs] = "-Denable-docs=true,-Denable-docs=false,doxygen-native"

PACKAGECONFIG:append = " xkbregistry"

