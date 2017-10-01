def missing_letter(string):
    for c in range(1, len(string)):
        if ord(string[c]) != ord(string[c-1])+1:
            return chr(ord(string[c])-1)
    return None

result = missing_letter("abcde")
print(result)