import re


def telephone_check(num):

    # make sure doesn't have non number, -, (, )
    p = re.compile('[^\d\-\s\(\)]')
    if re.search(p, num):
        return False

    # replace spaces
    num = re.sub('\s', '', num)

    if '-' in num:
        if num[0] == '-':
            return False

        h = re.compile('\d\d\d\-\d\d\d\d')
        if not re.search(h, num):
            return False

        # remove hyphens
        num = re.sub('-', '', num)

    if len(num) == 10:
        return True
    if len(num) == 11 and num[0] == '1':
        return True
    if len(num) == 12 and num[0] == '(' and num[4] == ')':
        return True
    if len(num) == 13 and num[0] == '1' and num[1] == '(' and num[5] == ')':
        return True

    return False


result = telephone_check("1 456 789 4444")
print(result)