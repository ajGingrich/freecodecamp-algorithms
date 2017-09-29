def what_is_in_a_name(collection, source):
    return filter(not_included, collection)


def not_included(item):
    source = {'a': 1}
    for key, value in source.items():
        dictionary = {key: value}
        if item == dictionary:
            return False
        else:
            return True

result = what_is_in_a_name([{"a": 1}, {"a": 1}, {"a": 1, "b": 2}], {"a": 1})
print(result)