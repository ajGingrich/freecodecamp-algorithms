def update_inventory(arr1, arr2):
    props = []
    for item in arr1:
        props.append(item[1])

    for i in range(len(arr2)):
        if arr2[i][1] in props:
            arr1[props.index(arr2[i][1])][0] += arr2[i][0]
        else:
            arr1.append(arr2[i])

    return sorted(arr1, key=lambda x: x[1])


result = update_inventory([[21, "Bowling Ball"], [2, "Dirty Sock"], [1, "Hair Pin"], [5, "Microphone"]],
                          [[2, "Hair Pin"], [3, "Half-Eaten Apple"], [67, "Bowling Ball"], [7, "Toothpaste"]])
print(result)