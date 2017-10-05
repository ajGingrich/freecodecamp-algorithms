import re


def spinal_case(sentence):
    # deciphers thisType into array
    words = re.findall('[a-zA-Z][^A-Z]*', sentence)
    final = []

    for word in words:
        spaces = re.split('\s+|_', word)
        for palabra in spaces:
            if palabra != '':
                final.append(palabra.lower())

    return "-".join(final)

result = spinal_case('AllThe-small Things')
print(result)