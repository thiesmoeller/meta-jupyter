inherit pypi python_setuptools_build_meta

SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42528797bebcb0e6818398531707415d"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ptyprocess \
        ${PYTHON_PN}-tornado \
        "

SRC_URI[sha256sum] = "ab4eeedccfcc1e6134bfee86106af90852c69d602884ea3a1e8ca6d4486e9bfe"
BBCLASSEXTEND = "native"
