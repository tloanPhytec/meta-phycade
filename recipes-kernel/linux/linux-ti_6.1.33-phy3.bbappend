require conf/machine/phyboard-lyra-am62xx-3.conf

COMPATIBLE_MACHINE = "phyboard-lyra-am62xx-3"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
	file://arcade.cfg \
	file://0001-phycade_F4-button_linux-ti_pd23.2.0.patch \
	file://0002-phycade_volume-buttons_linux-ti_pd23.2.0.patch \
"
