import math


def chunky_monkey(arr, size):
    res = []
    for i in range(0, math.ceil(len(arr)/size)):
        res.append(arr[size*i:size*(i+1)])
    return res

result = chunky_monkey([0, 1, 2, 3, 4, 5, 6], 3)
print(result)