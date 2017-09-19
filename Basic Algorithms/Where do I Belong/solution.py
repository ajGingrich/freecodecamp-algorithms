def find_place(data, num):
    data.sort()
    i = 0
    for x in range(0, len(data)):
        if num <= data[x]:
            break
        else:
            i += 1
    return i

result = find_place([2, 5, 10], 15)
print(result)