def pair_element(strand):
    dictionary = {'A': 'T', 'T': 'A', 'C': 'G', 'G': 'C'}
    res = []

    for c in strand:
        pair = [c, dictionary.get(c)]
        res.append(pair)
    return res

result = pair_element("TTGAG")
print(result)