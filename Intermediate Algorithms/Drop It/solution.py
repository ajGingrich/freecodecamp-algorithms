def drop_elements(arr, func):
    copy = arr[:]

    for item in copy:
        if func(item):
            return arr
        else:
            del arr[0]
    return arr


result = drop_elements([1, 2, 3, 9, 2], lambda num: num > 2)
print(result)