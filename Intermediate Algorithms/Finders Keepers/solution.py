def finders_keepers(arr, func):
    res = filter(func, arr)
    if len(res) > 1:
        return res[0]
    else:
        return None

result = finders_keepers([1, 3, 5, 8, 9, 10], lambda num: num % 2 == 0)
print(result)