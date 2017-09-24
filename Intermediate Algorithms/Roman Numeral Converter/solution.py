def convert_to_roman(num):
    res = ""
    romans = ["I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL",
              "L", "LX", "LXX", "LXXX", "XC", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC",
              "CM"]

    # get thousands, hundreds, tens and ones
    thousands = (num/1000)*1000
    hundreds = ((num-thousands)/100)*100
    tens = ((num-thousands-hundreds)/10)*10
    ones = num-thousands-hundreds-tens

    if thousands is not 0:
        for x in range(0, thousands, 1000):
            res += 'M'

    if hundreds is not 0:
        res += romans[(hundreds/100)+17]
    if tens is not 0:
        res += romans[(tens/10)+8]
    if ones is not 0:
        res += romans[ones-1]

    return res

result = convert_to_roman(649)
print(result)