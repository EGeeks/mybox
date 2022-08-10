# zbox
support cubietruck(A20)


build zbox
````
export MACHINE=zbox-hd
export TEMPLATECONF=/home/zhangkb/board/zbox/meta-box/conf
. ./poky/oe-init-build-env /home/zhangkb/board/gitlab-build-cache/images/zbox-hd

bitbake -c do_image_complete image-zbox

bitbake -c menuconfig linux-mainline
````

build retro game
````
export MACHINE=cubietruck
export TEMPLATECONF=/home/zhangkb/board/zbox/meta-box/conf
. ./poky/oe-init-build-env /home/zhangkb/board/gitlab-build-cache/images/retro

bitbake retro-image-full

<!-- bitbake -c menuconfig linux-mainline -->
````