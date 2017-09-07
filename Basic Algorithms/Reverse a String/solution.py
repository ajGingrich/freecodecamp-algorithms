def reverse_string(string):
    # strings are already arrays of characters in Python
    # use array method to reverse it
    return string[::-1]

new = reverse_string('The lazy dog jumped over the quick brown fox')
print(new)