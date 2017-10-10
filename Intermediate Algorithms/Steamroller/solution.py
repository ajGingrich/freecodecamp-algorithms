import collections


# no strings allowed because it will exceed callstack with recursion
def steamroll_list(x):
    if isinstance(x, collections.Iterable):
        return [a for i in x for a in steamroll_list(i)]
    else:
        return [x]

result = steamroll_list([1, [2], [3, [[4]]]])
print(result)