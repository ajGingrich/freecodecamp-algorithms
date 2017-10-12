def add_together(*kwargs):
    num1 = kwargs[0]

    def add(num):
        if isinstance(num, int):
            return num1 + num
        else:
            return None

    # check if first parameter is a number
    if not isinstance(num1, int):
        return None

    if len(kwargs) == 2:
        num2 = kwargs[1]
        try:
            return num1 + num2
        except TypeError:
            return None
    else:
        return add


result = add_together(2, "3")
print(result)