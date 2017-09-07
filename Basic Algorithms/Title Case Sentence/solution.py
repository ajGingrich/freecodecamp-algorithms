def title_case(string):

    # split string into list
    arr = string.split(' ')

    # make new list for storing
    res = []

    for word in arr:
        res.append(word[0:1].upper() + word[1:].lower())

    # join back into string an return
    return ' '.join(res)


result = title_case("HERE IS MY HANDLE HERE IS MY SPOUT")
print(result)