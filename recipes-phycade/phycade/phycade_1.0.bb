SUMMARY = "PHYTEC PHYcade recipe (PACMAN)"
DESCRIPTION = "Creates a PACMAN Arcade Machine based on the phyCORE-AM62x + RetroArch"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM=""

inherit retro-user

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
	file://Atari800.opt \
	file://Pac-Man_Atari5200-cart.bin \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${RETRO_USER_HOMEDIR}/.config/retroarch/config/Atari800/
    install -m 0755 ${S}/Atari800.opt ${D}${RETRO_USER_HOMEDIR}/.config/retroarch/config/Atari800/

    install -d ${D}${RETRO_USER_HOMEDIR}/ROMs/atari5200/
    install -m 0755 ${S}/Pac-Man_Atari5200-cart.bin ${D}${RETRO_USER_HOMEDIR}/ROMs/atari5200/

    chown ${RETRO_USER_NAME}:${RETRO_USER_NAME} -R ${D}${RETRO_USER_HOMEDIR}/
}

FILES:${PN} += " \
    ${RETRO_USER_HOMEDIR}/.config/retroarch/config/Atari800/Atari800.opt \
    ${RETRO_USER_HOMEDIR}/ROMs/atari5200/Pac-Man_Atari5200-cart.bin \
"

COMPATIBLE_MACHINE:phyboard-lyra-am62xx-3 = "phyboard-lyra-am62xx-3"
