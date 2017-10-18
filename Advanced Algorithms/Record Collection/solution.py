collection = {
    "2548": {
        "album": "Slippery When Wet",
        "artist": "Bon Jovi",
        "tracks": [
            "Let It Rock",
            "You Give Love a Bad Name"
        ]
    },
    "2468": {
        "album": "1999",
        "artist": "Prince",
        "tracks": [
            "1999",
            "Little Red Corvette"
        ]
    },
    "1245": {
        "artist": "Robert Palmer",
        "tracks": []
    },
    "5439": {
        "album": "ABBA Gold"
    }
}


def update_collection(num, prop, value):
    identify = str(num)

    if value == "":
        del collection[identify][prop]
    else:
        try:
            if value != "tracks":
                collection[identify][prop] = value
            else:
                collection[identify][prop].append(value)
        except KeyError:
            collection[identify][prop] = []
            collection[identify][prop].append(value)

    return collection

result = update_collection(2468, "tracks", "Free")
print(result)