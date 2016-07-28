import os
def test():
    list_dirs = os.walk(rootdir)
    for root, dirs, files in list_dirs:
        for d in dirs:
            print os.path.join(root, d)
        for f in files:
            print os.path.join(root, f)
