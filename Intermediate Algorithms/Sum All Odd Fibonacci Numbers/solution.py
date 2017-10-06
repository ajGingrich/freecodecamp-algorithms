def sum_fibs(num):
    sequence = [1, 1]
    res = 2
    fib = 2

    while fib <= num:
        if fib % 2 != 0:
            res += fib
        fib = sequence[len(sequence) - 1] + sequence[len(sequence) - 2]
        sequence.append(fib)

    return res

result = sum_fibs(4000000)
print(result)