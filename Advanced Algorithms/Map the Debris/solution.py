import math


def orbital_period(data):
    gm = 398600.4418
    earth_radius = 6367.4447
    result = []

    for sat in data:
        r = earth_radius + sat.get("avgAlt")
        orbital_p = int(round(2*math.pi*(math.sqrt((math.pow(r, 3))/gm))))
        result.append({"name": sat.get("name"), "orbitalPeriod": orbital_p})
    return result

res = orbital_period([{"name": "iss", "avgAlt": 413.6}, {"name": "hubble", "avgAlt": 556.7}, {"name": "moon", "avgAlt": 378632.553}])
print(res)