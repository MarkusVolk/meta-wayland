do_install:append() {
	ln -sf ${bindir}/python3 ${D}${bindir}/python
}

FILES:${PN} += "${bindir}/python"

