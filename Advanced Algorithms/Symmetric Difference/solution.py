def sym(*kwargs):
    res = diff(kwargs[0], kwargs[1])

    for i in range(2, len(kwargs)):
        res = diff(res, kwargs[i])

    res.sort()
    return res


def diff(arr1, arr2):
    res = []

    for item in arr1:
        if item not in arr2 and item not in res:
            res.append(item)

    for num in arr2:
        if num not in arr1 and num not in res:
            res.append(num)

    return res

result = sym([1, 1, 2, 5], [2, 2, 3, 5], [3, 4, 5, 5])
print(result)