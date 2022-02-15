do_install:append:class-target() {
	ln -sf ${bindir}/python3 ${D}${bindir}/python
}

FILES:${PN}:class-target += "${bindir}/python"

