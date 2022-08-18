SUMMARY = "Pygments theme using JupyterLab CSS variables"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

PYPI_PACKAGE = "jupyterlab_pygments"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "7405d7fde60819d905a9fa8ce89e4cd830e318cdad22a0030f7a901da705585d"

DEPENDS += "${PYTHON_PN}-jupyter-packaging-native"

RDEPENDS:${PN} += "${PYTHON_PN}-pygments"
