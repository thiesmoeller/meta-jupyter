inherit pypi python_setuptools_build_meta

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "bfa01945156f2bfd9a386bfc51b54ec5bfa26006d26bb75e5351e226f870fafb"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        "

FILES:${PN} += " /usr/share/jupyter/nbextensions/* \
    /usr/share/etc/jupyter/* \ "

