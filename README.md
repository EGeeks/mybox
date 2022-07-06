# zbox
support cubietruck(A20)


build
````
export MACHINE=zbox-hd
export TEMPLATECONF=/home/zhangkb/board/zbox/meta-box/conf
. ./poky/oe-init-build-env /home/zhangkb/board/gitlab-build-cache/images/zbox-hd

bitbake -c do_image_complete image-zbox

bitbake -c do_image_complete core-image-minimal

````