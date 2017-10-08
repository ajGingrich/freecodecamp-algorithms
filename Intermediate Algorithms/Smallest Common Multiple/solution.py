def smallest_commons(arr):
    # get largest
    if arr[1] > arr[0]:
        largest = arr[1]
        smallest = arr[0]
    else:
        largest = arr[0]
        smallest = arr[1]

    scm = largest * (largest - 1)
    found = False

    while not found:
        for i in range(smallest, largest+1):
            if scm % i != 0:
                scm += largest
                break
            if i == largest and scm % i == 0:
                found = True

    return scm

result = smallest_commons([5, 1])
print(result)