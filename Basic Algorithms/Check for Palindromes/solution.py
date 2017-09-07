def check_palindrome(string):
    # import regex
    import re

    # remove all non-alphanumeric characters and turn lowercase
    regex = re.compile('[^0-9a-zA-z]')
    trim = regex.sub('', string).lower()

    # reverse it
    reverse = trim[::-1]

    # return true if they match
    if trim == reverse:
        return True
    else:
        return False

result = check_palindrome("A man, a plan, a canal. Panama")
print(result)