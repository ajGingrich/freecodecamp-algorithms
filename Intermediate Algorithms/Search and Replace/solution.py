def search_replace(sentence, search, replace):
    words = sentence.split(' ')

    for i in range(0, len(words)):
        if words[i] == search:
            if words[i][0].isupper():
                words[i] = replace[0:1].upper() + replace[1:].lower()
            else:
                words[i] = replace
    return ' '.join(words)

result = search_replace("His name is Tom", "Tom", "john")
print(result)