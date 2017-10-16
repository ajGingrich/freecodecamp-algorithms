class Algorithm:
    def __init__(self):
        self.matches = []
        self.temp = []

    def pairwise(self, arr, total):
        for item in arr:
            self.temp.append(item)

        self.get_matches(self.temp, total)
        return self.get_indices(self.matches, arr)

    def get_matches(self, arr, total):
        no_match = True

        if len(self.temp) > 1:
            for i in range(1, len(arr)):
                if arr[0] + arr[i] == total:
                    # add to matches
                    self.matches.append(arr[0])
                    self.matches.append(arr[i])

                    # remove from temp
                    self.temp.remove(arr[i])
                    del self.temp[0]

                    no_match = False
                    self.get_matches(self.temp, total)
                    # don't continue the other iterations of this loop
                    break

            if no_match:
                # remove first one
                del self.temp[0]
                self.get_matches(self.temp, total)

    def get_indices(self, matches, arr):
        count = 0
        for item in matches:
            index = arr.index(item)
            count += index
            arr[index] = -3000
        return count

result = Algorithm().pairwise([0, 0, 0, 0, 1, 1], 1)
print(result)