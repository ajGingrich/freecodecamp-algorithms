def pig_latin(word):
    vowels = 'aeiou'
    first = 0

    for c in range(0, len(word)):
        if word[c] in vowels:
            first = c
            break

    if first == 0:
        word += "way"
    else:
        word = word[first:] + word[0:first] + "ay"

    return word

result = pig_latin("california")
print(result)