SUMMARY = "The GIMP is the GNU Image Manipulation Program"
HOMEPAGE = "http://www.gimp.org"
SECTION = "graphics"
LICENSE = "GPLv3"
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
    intltool-native \
    json-glib \
    lcms \
    libarchive \
    libexif \
    libmypaint \
    libxslt-native \
    mypaint-brushes-1.0 \
    pango \
    poppler \
    poppler-data \
"

DEPENDS:append:libc-musl = " libexecinfo"
RDEPENDS:${PN} = "mypaint-brushes-1.0 glib-networking"

inherit meson gtk-icon-cache mime-xdg pkgconfig features_check gobject-introspection

SRC_URI = " \
    git://github.com/GNOME/gimp.git;protocol=https \
    file://0001-meson-make-gir-buildable.patch \
"

S = "${WORKDIR}/git"
SRCREV = "GIMP_2_99_6"

PACKAGECONFIG[aa] = "-Daa=enabled,-Daa=disabled,aalib"
PACKAGECONFIG[alsa] = "-Dalsa=enabled,-Dalsa=disabled,alsa-lib"
PACKAGECONFIG[appdata-test] = "-Dappdata-test=enabled,-Dappdata-test=disabled,appstream-glib-native"
PACKAGECONFIG[bzip2] = ",,bzip2"
PACKAGECONFIG[cairo-pdf] = "-Dcairo-pdf=enabled,-Dcairo-pdf=disabled"
PACKAGECONFIG[check-update] = "-Dcheck-update=true,-Dcheck-update=false"
PACKAGECONFIG[enable-console-bin] = "-Denable-console-bin=true,-Denable-console-bin=false"
PACKAGECONFIG[ghostscript] = "-Dghostscript=enabled,-Dghostscript=disabled,ghostscript"
PACKAGECONFIG[gtk-doc] = "-Dgtk-doc=true,-Dgtk-doc=false,gtk-doc-native"
PACKAGECONFIG[gtk-doc-app] = "-Dgtk-doc-app=true,-Dgtk-doc-app=false,gtk-doc-native"
PACKAGECONFIG[gudev] = "-Dgudev=enabled,-Dgudev=disabled,libgudev"
PACKAGECONFIG[javascript] = "-Djavascript=true,-Djavascript=false,,openjre-8"
PACKAGECONFIG[jpeg2000] = "-Djpeg2000=enabled,-Djpeg2000=disabled,jasper"
PACKAGECONFIG[jpeg] = ",,jpeg"
PACKAGECONFIG[lua] = "-Dlua=true,-Dlua=false,,luajit lgi"
PACKAGECONFIG[lzma] = ",,xz"
PACKAGECONFIG[mng] = "-Dmng=enabled,-Dmng=disabled,libmng"
PACKAGECONFIG[png] = "-Dpng=enabled,-Dpng=disabled,libpng"
PACKAGECONFIG[python] = "-Dpython=true,-Dpython=false,,python3 python3-pygobject"
PACKAGECONFIG[rsvg] = ",,librsvg"
PACKAGECONFIG[tiff] = ",,tiff"
PACKAGECONFIG[vala-plugins] = "-Dvala-plugins=enabled,-Dvala-plugins=disabled"
PACKAGECONFIG[webkit] = "-Dwebkit=enabled,-Dwebkit=disabled,webkitgtk"
PACKAGECONFIG[webp] = "-Dwebp=enabled,-Dwebp=disabled,libwebp"
PACKAGECONFIG[xcursor] = "-Dxcursor=enabled,-Dxcursor=disabled,libxcursor"
PACKAGECONFIG[x11] = "-Dxpm=enabled,-Dxpm=disabled,libxpm libxmu"
PACKAGECONFIG[zlib] = ",,zlib"

PACKAGECONFIG ?= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'x11', d)} \
    aa \
    alsa \
    bzip2 \
    cairo-pdf \
    gtk-doc-app \
    gudev \
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
    zlib \
"

FILES:${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/gir-1.0 \
    ${datadir}/appdata \ 
    ${libdir}/girepository-1.0 \
"

EXTRA_OEMESON += " \
    -Dshmem-type=posix \
    --buildtype release \
"

