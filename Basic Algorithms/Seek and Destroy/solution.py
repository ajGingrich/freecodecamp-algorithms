def seek_destroy(l, *args):
    return filter(lambda x: x not in args, l)

result = seek_destroy(["tree", "hamburger", 53], "tree", 53)
print(result)