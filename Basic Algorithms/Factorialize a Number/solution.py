def factorialize_number(num):
    total = 1
    # check if one first
    if num == 1:
        return total
    else:
        for x in range(1, num+1):
            total *= x
    return total

factorial = factorialize_number(8)
print(factorial)