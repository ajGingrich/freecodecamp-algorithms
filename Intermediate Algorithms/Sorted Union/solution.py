def unite_unique(*args):
    res = []
    for arr in args:
        for num in arr:
            if num not in res:
                res.append(num)
    return res

result = unite_unique([1, 3, 2], [1, [5]], [2, [4]])
print(result)