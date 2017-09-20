def sum_range(arr):
    res = 0
    if arr[0] > arr[1]:
        for num in range(arr[0], arr[1]-1, -1):
            res += num
    else:
        for num in range(arr[0], arr[1]+1):
            res += num
    return res

result = sum_range([5, 10])
print(result)