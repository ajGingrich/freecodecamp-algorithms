def truncate_string(string, num):
    if num <= 3:
        return string[:num] + "..."
    elif num < len(string):
        return string[:num-3] + "..."
    else:
        return string

result = truncate_string("Peter Piper picked a peck of pickled peppers", 14)
print(result)