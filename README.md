meta-custom:
contains two simple recipes. one to print hello world and the other takes name and age then print them.

rootfs.py:
self.pm.run_intercepts() was commented as it caused issues when installing post installation hooks  during the build with WSL 2..this commenting action doesn't have a major impact on the created image, image tested with qemu and is working fine 

