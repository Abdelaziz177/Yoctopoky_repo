SUMMARY = "Simple customApp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37bf9258ebe4c704b8bf0b1933b2ee44"
SRC_URI = "file://customApp.cpp \
    file://LICENSE"


S = "${WORKDIR}/sources-unpack"

do_compile() {
    pwd
    ls -l ${WORKDIR}
    ${CXX} -Wall ${CXXFLAGS} ${LDFLAGS} customApp.cpp -o customApp 
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 customApp ${D}${bindir}/customApp
}

