inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "aa9a6c32054b290374f95f73bb0cae91455c58dfb84f65c8591912b8f65e6d56"

SUMMARY = "Jupyter protocol implementation and client libraries"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=0d99f15eb14ae0f6bd895f65127d0fa8"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-pyzmq \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-tornado \
        ${PYTHON_PN}-dateutil \
        "

PYPI_PACKAGE = "jupyter_client"

BBCLASSEXTEND = "native"

do_install:append () {
  if [ find ${D}/usr/bin -name "jupyter*" &> /dev/null ]; then
    for f in ${D}/usr/bin/jupyter*; do sed -i -e 's:env python$:env python3:' $f; done
  fi
}
