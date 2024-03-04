require conf/machine/phyboard-lyra-am62xx-3.conf

COMPATIBLE_MACHINE = "phyboard-lyra-am62xx-3"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://arcade.cfg"
