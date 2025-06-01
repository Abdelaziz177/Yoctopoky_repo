SUMMARY = "Simple Hello World application"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=1c3a71ed227f3cbe5c7c37d03b7fcb56"
SRC_URI = "file://hello.cpp"


S = "${WORKDIR}/sources-unpack"

do_compile() {
    pwd
    ls -l ${WORKDIR}
    ${CXX} -Wall ${CXXFLAGS} ${LDFLAGS} hello.cpp -o hello 
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}/hello
}

