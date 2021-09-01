SUMMARY = "The GIMP is the GNU Image Manipulation Program"
HOMEPAGE = "http://www.gimp.org"
SECTION = "graphics"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=c678957b0c8e964aa6c70fd77641a71e"

DEPENDS = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libxmu libxpm', '', d)} \
    appstream-glib \
    atk \
    babl \
    bison-native \
    cairo \
    dbus-glib \
    fontconfig \
    freetype \
    gdk-pixbuf-native \
    gegl \
    gegl-native \
    gexiv2 \
    gobject-introspection-native \
    gtk+3 \
    harfbuzz \
    intltool-native \
    json-glib \
    lcms \
    libarchive \
    libgudev \
    libmypaint \
    libxslt-native \
    mypaint-brushes-1.0 \
    pango \
    poppler \
    poppler-data \
    prelink-native \
    python3-native \
    python3-pygobject-native \
    qemuwrapper-cross \
"

DEPENDS:append:libc-musl = " libexecinfo"
RDEPENDS:${PN} += "mypaint-brushes-1.0 glib-networking"

inherit meson gtk-icon-cache mime-xdg pkgconfig

SRC_URI = " \
    git://github.com/GNOME/gimp.git;protocol=https \
    file://0001-meson-make-gir-buildable.patch \
"
S = "${WORKDIR}/git"
PV = "2.99.6"
SRCREV = "GIMP_2_99_6"

PACKAGECONFIG[alsa] = ",,alsa-lib"
PACKAGECONFIG[bzip2] = ",,bzip2"
PACKAGECONFIG[cairo-pdf] = "-Dcairo-pdf=enabled,-Dcairo-pdf=disabled"
PACKAGECONFIG[check-update] = "-Dcheck-update=true,-Dcheck-update=false"
PACKAGECONFIG[enable-console-bin] = "-Denable-console-bin=true,-Denable-console-bin=false"
PACKAGECONFIG[ghostscript] = ",,ghostscript"
PACKAGECONFIG[javascript] = "-Djavascript=true,-Djavascript=false,,openjre-8"
PACKAGECONFIG[jpeg2000] = ",,jasper"
PACKAGECONFIG[jpeg] = ",,jpeg"
PACKAGECONFIG[lua] = "-Dlua=true,-Dlua=false,,luajit lgi"
PACKAGECONFIG[lzma] = ",,xz"
PACKAGECONFIG[mng] = ",,libmng"
PACKAGECONFIG[png] = ",,libpng"
PACKAGECONFIG[python] = "-Dpython=true,-Dpython=false,,python3 python3-pygobject"
PACKAGECONFIG[rsvg] = ",,librsvg"
PACKAGECONFIG[tiff] = ",,tiff"
PACKAGECONFIG[vala-plugins] = "-Dvala-plugins=enabled,-Dvala-plugins=disabled"
PACKAGECONFIG[webkit] = ",,webkitgtk"
PACKAGECONFIG[webp] = ",,libwebp"
PACKAGECONFIG[wmf] = ",,libwmf"
PACKAGECONFIG[xcursor] = ",,libxcursor"
PACKAGECONFIG[xpm] = "-Dxpm=enabled,-Dxpm=disabled,libexif"
PACKAGECONFIG[zlib] = ",,zlib"

PACKAGECONFIG ?= " \
    alsa \
    bzip2 \
    cairo-pdf \
    jpeg \
    jpeg2000 \
    lua \
    lzma \
    mng \
    png \
    python \
    rsvg \
    tiff \
    webp \
    wmf \
    xcursor \
    xpm \
    zlib \
"

FILES:${PN} += " \
    ${datadir} \
    ${libdir}/girepository-1.0 \
"

EXTRA_OEMESON = " \
    -Dshmem-type=posix \
    -Dgtk-doc=false \
    -Dcan-crosscompile-gir=true \
    --buildtype release \
"

