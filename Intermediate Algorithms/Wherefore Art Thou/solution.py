def what_is_in_a_name(collection, source):
    res = collection[:]
    for i in range(len(source)):
        key, value = source.items()[i]
        res = filter(lambda x: key in x and value == x[key], res)
    return res

result = what_is_in_a_name([{"a": 1, "b": 2}, {"a": 1}, {"a": 1, "b": 2, "c": 2}], {"a": 1, "c": 2})
print(result)