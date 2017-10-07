import math


def sum_primes(num):
    res = 2

    for i in range(3, num + 1):
        prime = True
        if i % 2 == 0:
            continue

        # only have to check only square root
        for j in range(3, int(math.sqrt(i)) + 1, 2):
            if i % j == 0:
                prime = False
                break

        if prime is True:
            res += i

    return res

result = sum_primes(841)
print(result)