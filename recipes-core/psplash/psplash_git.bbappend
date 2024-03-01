FILESEXTRAPATHS:prepend := "${THISDIR}:"

SRC_URI:append = " \
    file://psplash-poky.png \
    file://psplash-bar.png \
"

SPLASH_IMAGES = "file://psplash-poky.png;outsuffix=default"

do_configure:prepend() {
    cp ${WORKDIR}/*.png ${S}/base-images
}

