def boo_who(val):
    if val is True or val is False:
        return True
    else:
        return False

result = boo_who([1, 2, 3])
print(result)