def repeat_string(str, num):
    if num <= 0:
        return ""
    else:
        res = ""
        for i in range(0, num):
            res += str
        return res

result = repeat_string("*", -5)
print(result)