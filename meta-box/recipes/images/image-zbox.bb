SUMMARY = "Minimal image for Radxa boards"

LICENSE = "close"

inherit image extrausers

# Distro can override the following VIRTUAL-RUNTIME providers:
VIRTUAL-RUNTIME_dev_manager ?= "busybox-mdev"
VIRTUAL-RUNTIME_login_manager ?= "busybox"
VIRTUAL-RUNTIME_init_manager ?= "busybox"
VIRTUAL-RUNTIME_initscripts ?= "initscripts"

IMAGE_INSTALL = " \
	base-files \
	shadow \
	${VIRTUAL-RUNTIME_login_manager} \
	${VIRTUAL-RUNTIME_init_manager} \
	${VIRTUAL-RUNTIME_dev_manager} \
	${VIRTUAL-RUNTIME_initscripts} \
	modutils-initscripts \
	init-ifupdown \
"

IMAGE_LINGUAS = " "