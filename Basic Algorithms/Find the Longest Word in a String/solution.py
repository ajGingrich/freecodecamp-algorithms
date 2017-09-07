def longest_word(string):

    longest = 0
    # split string into array
    arr = string.split(' ')
    for word in arr:
        if len(word) > longest:
            longest = len(word)

    return longest

result = longest_word("What if we try a super-long word such as otorhinolaryngology")
print(result)