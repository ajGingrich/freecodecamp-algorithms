def falsy_bouncer(data):
    return list(filter(None, data))

result = falsy_bouncer([7, "ate", "", False, 9])
print(result)