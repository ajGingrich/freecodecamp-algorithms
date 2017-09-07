def confirm_ending(arr, end):
    if arr[-len(end):] == end:
        return True
    else:
        return False

result = confirm_ending("He has to give me a new name", "name")
print(result)