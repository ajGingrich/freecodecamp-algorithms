def mutations(arr):
    # convert to lowercase
    first = arr[0].lower()
    second = arr[1].lower()

    for i in range(0, len(second)):
        if first.find(second[i]) == -1:
            return False
    return True

result = mutations(["hello", "neo"])
print(result)