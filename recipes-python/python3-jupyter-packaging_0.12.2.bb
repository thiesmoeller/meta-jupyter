inherit pypi python_setuptools_build_meta

SUMMARY = "making Python packages with and without accompanying JavaScript packages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3acab95fd69e0d08e339a87b8bc1081f"

PYPI_PACKAGE="jupyter_packaging"
PN="${PYTHON_PN}-jupyter-packaging"

BBCLASSEXTEND = "native"

SRC_URI[sha256sum] = "0b99eaecf56b9d1d99e7bcb6632d914a8ea5698da40b238ba89227a34157de32"
