def caesers_cipher(string):
    res = ""
    for x in range(0, len(string)):
        c = string[x]
        if c.isalpha():
            if ord(c) >= 65 and ord(c) <= 77:
                res += chr(ord(c) + 13)
            else:
                res += chr(ord(c) - 13)
        else:
            res += c
    return res

result = caesers_cipher('SERR CVMMN!')
print(result)
