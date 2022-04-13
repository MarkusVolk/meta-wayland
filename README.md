Wayland/Wlroots Layer for OpenEmbedded/Yocto

Main layer maintainer: Markus Volk <f_l_k@t-online.de>

Description

This layer adds recipes to build wlroots based compositors under wayland.
It contains wlroots, sway, wayfire, cage, phosh, nwg-shell and some additional recipes that might come useful.

Dependencies

This layer depends on:

    URI: git://github.com/openembedded/openembedded-core
        branch: master
        revision: HEAD
    URI: git://github.com/openembedded/meta-openembedded
        branch: master
        revision: HEAD

Building

Follow the usual steps to setup OpenEmbedded and bitbake.

