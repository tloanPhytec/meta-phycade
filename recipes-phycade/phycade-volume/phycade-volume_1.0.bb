SUMMARY = "PHYTEC PHYcade ALSA Volume Service recipe"
DESCRIPTION = "Configures Audio Codec for Max Volume by default"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM=""

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
	file://phycade-volume.service \
	file://phycade-volume.sh \
"

S = "${WORKDIR}"

inherit systemd

SYSTEMD_AUTO_ENABLE:${PN} = "enable"
SYSTEMD_SERVICE:${PN} = "phycade-volume.service"

FILES:${PN} += "${systemd_unitdir}/system/phycade-volume.service ${bindir}/phycade-volume.sh"

do_install() {
    install -d ${D}/${systemd_unitdir}/system
    install -m 0755 ${S}/phycade-volume.service ${D}/${systemd_unitdir}/system

    install -d ${D}/${bindir}
    install -m 0755 ${S}/phycade-volume.sh ${D}/${bindir}
}

RDEPENDS:${PN} += "bash"
