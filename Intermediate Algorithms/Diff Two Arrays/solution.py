def diff_arrays(first, second):
    res = []
    diff_one(first, second, res)
    diff_one(second, first, res)
    return res


def diff_one(first, second, res):
    for item in first:
        if item not in second:
            res.append(item)

result = diff_arrays([1, "calf", 3, "piglet"], [1, "calf", 3, 4])
print(result)