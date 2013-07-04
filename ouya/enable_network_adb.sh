su
mount -o rw,remount -t ext4 /dev/block/platform/sdhci-tegra.3/by-name/APP
chmod 666 /system/build.prop
echo "================precondition================="
cat /system/build.prop
echo "service.adb.tcp.port=1085" >> /system/build.prop
echo "===============postcondition================="
cat /system/build.prop
chmod 644 /system/build.prop
mount -o ro,remount -t ext4 /dev/block/platform/sdhci-tegra.3/by-name/APP
echo "===============complete================="
