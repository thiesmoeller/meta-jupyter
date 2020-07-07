inherit pypi setuptools3

DEPENDS += " \
	${PYTHON_PN}-prompt-toolkit-native \
	"

require python-ipykernel.inc

SRC_URI += " file://0001-force-use-target-interpreter-instead-of-native-one.patch"
SRC_URI[md5sum] = "c1d0ff3d8f7e8517a44fef33516929ec"
SRC_URI[sha256sum] = "b368ad13edb71fa2db367a01e755a925d7f75ed5e09fbd3f06c85e7a8ef108a8"

