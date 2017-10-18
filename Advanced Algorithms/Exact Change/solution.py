import math


def check_cash_register(price, cash, cid):
    change = cash - price
    cid.reverse()
    values = [100,20,10,5,1,0.25,0.1,0.05,0.01]

    cambio = []
    drawer = 0

    for i in range(len(cid)):
        if change/values[i] >= 1 and cid[i][1] >= values[i]:
            drawer = (math.floor(change/values[i]))*values[i]
            if drawer > cid[i][1]:
                drawer = cid[i][1]

            cambio.append([cid[i][0], drawer])
            change -= drawer
            change = round(change, 2)
            cid[i][1] -= drawer

    if drawer < change:
        return 'Insufficient Funds'

    cash_left = 0
    for j in range(len(cid)):
        cash_left += cid[j][1]
    if cash_left == 0:
        return 'Closed'

    return cambio


result = check_cash_register(19.50, 20.00, [["PENNY", 1.01], ["NICKEL", 2.05], ["DIME", 3.10], ["QUARTER", 4.25], ["ONE", 90.00],
                                            ["FIVE", 55.00], ["TEN", 20.00], ["TWENTY", 60.00], ["ONE HUNDRED", 100.00]])
print(result)