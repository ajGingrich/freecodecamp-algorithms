def largest_of_four(arr):
    res = [0, 0, 0, 0]

    for i in range(0, len(arr)):
        for j in range(0, len(arr[i])):
            if arr[i][j] > res[i]:
                res[i] = arr[i][j]
    return res

result = largest_of_four([[4, 9, 1, 3], [13, 35, 18, 26], [32, 35, 97, 39], [1000000, 1001, 857, 1]])
print(result)