SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

PYPI_PACKAGE = "jupyterlab_server"
PN="${PYTHON_PN}-jupyterlab-server"

inherit pypi python_setuptools_build_meta

DEPENDS += " \
       ${PYTHON_PN}-jupyter-server-native \
       ${PYTHON_PN}-anyio-native \
       ${PYTHON_PN}-sniffio-native \
       ${PYTHON_PN}-websocket-client-native \
"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        "

SRC_URI[sha256sum] = "a91c515e0e7971a8f7c3c9834b748857f7dac502f93604bf283987991fd987ef"

RDEPENDS:${PN} += "${PYTHON_PN}-json5"
