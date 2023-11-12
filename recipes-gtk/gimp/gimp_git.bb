SUMMARY = "The GIMP is the GNU Image Manipulation Program"
HOMEPAGE = "http://www.gimp.org"
SECTION = "graphics"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=c678957b0c8e964aa6c70fd77641a71e"

REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"

DEPENDS = " \
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
    gtk+3 \
    harfbuzz \
    json-glib \
    lcms \
    libarchive \
    libexif \
    libmypaint \
    libpng \
    libxmu \
    libxslt-native \
    mypaint-brushes-1.0 \
    pango \
    poppler \
    poppler-data \
"

DEPENDS:append:libc-musl = " libexecinfo"
RDEPENDS:${PN} = "mypaint-brushes-1.0 glib-networking"

inherit meson gtk-icon-cache mime-xdg pkgconfig gettext gi-docgen features_check gobject-introspection vala
GIR_MESON_OPTION = ''
VALA_MESON_OPTION = "vala"
VALA_MESON_ENABLE_FLAG = "enabled"
VALA_MESON_DISABLE_FLAG = "disabled"
GIDOCGEN_MESON_OPTION = "gi-docgen"
GIDOCGEN_MESON_ENABLE_FLAG = "enabled"
GIDOCGEN_MESON_DISABLE_FLAG = "disabled"

SRC_URI = " \
    git://github.com/GNOME/gimp.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"
SRCREV = "d3c5536ac85bb84e1beaba68aea12cf28062e08c"
PV = "2.99.16"

PACKAGECONFIG[aa] = "-Daa=enabled,-Daa=disabled,aalib"
PACKAGECONFIG[alsa] = "-Dalsa=enabled,-Dalsa=disabled,alsa-lib"
PACKAGECONFIG[appdata-test] = "-Dappdata-test=enabled,-Dappdata-test=disabled,appstream-glib-native"
PACKAGECONFIG[bzip2] = ",,bzip2"
PACKAGECONFIG[cairo-pdf] = "-Dcairo-pdf=enabled,-Dcairo-pdf=disabled"
PACKAGECONFIG[check-update] = "-Dcheck-update=yes,-Dcheck-update=no"
PACKAGECONFIG[enable-console-bin] = "-Denable-console-bin=true,-Denable-console-bin=false"
PACKAGECONFIG[ghostscript] = "-Dghostscript=enabled,-Dghostscript=disabled,ghostscript,ghostscript"
PACKAGECONFIG[gudev] = "-Dgudev=enabled,-Dgudev=disabled,libgudev"
PACKAGECONFIG[iso-codes] = ",,iso-codes"
PACKAGECONFIG[javascript] = "-Djavascript=enabled,-Djavascript=disabled,gjs"
PACKAGECONFIG[jpeg2000] = "-Djpeg2000=enabled,-Djpeg2000=disabled,jasper"
PACKAGECONFIG[jpeg] = ",,jpeg"
PACKAGECONFIG[jpeg-xl] = ",,libjxl"
PACKAGECONFIG[libunwind] = ",,libunwind"
PACKAGECONFIG[libbacktrace] = ",,libbacktrace"
PACKAGECONFIG[lua] = "-Dlua=enabled,-Dlua=disabled,luajit"
PACKAGECONFIG[lzma] = ",,xz"
PACKAGECONFIG[mng] = "-Dmng=enabled,-Dmng=disabled,libmng"
PACKAGECONFIG[python] = "-Dpython=enabled,-Dpython=disabled,,python3-core python3-pygobject"
PACKAGECONFIG[rsvg] = ",,librsvg"
PACKAGECONFIG[tiff] = ",,tiff"
PACKAGECONFIG[vector-icons] = "-Dvector-icons=true,-Dvector-icons=false,librsvg shared-mime-info"
PACKAGECONFIG[webp] = "-Dwebp=enabled,-Dwebp=disabled,libwebp"
PACKAGECONFIG[xcursor] = "-Dxcursor=enabled,-Dxcursor=disabled,libxcursor"
PACKAGECONFIG[x11] = "-Dxpm=enabled,-Dxpm=disabled,libxpm libxext libxfixes"
PACKAGECONFIG[zlib] = ",,zlib"

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)} \
    aa \
    alsa \
    bzip2 \
    cairo-pdf \
    ghostscript \
    gudev \
    jpeg \
    jpeg2000 \
    jpeg-xl \
    lzma \
    mng \
    python \
    rsvg \
    tiff \
    vector-icons \
    webp \
    zlib \
"

FILES:${PN} += "${datadir}/metainfo"

EXTRA_OEMESON += " \
    -Dshmem-type=posix \
    -Dlinux-input=enabled \
    -Dcan-crosscompile-gir=true \
    --buildtype release \
"
