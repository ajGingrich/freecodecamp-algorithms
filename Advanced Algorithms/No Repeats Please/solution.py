class Algorithm:
    def __init__(self):
        self.count = 0

    def perm_alone(self, string):

        arr = list(string)
        self.permute(arr, len(arr))
        return self.count

    def permute(self, arr, n):
        if n == 1:
            if self.has_no_repeats(arr):
                self.count += 1
        else:
            for i in range(n):
                self.permute(arr, n-1)
                if n % 2 == 1:
                    self.swap(arr, 0, n-1)
                else:
                    self.swap(arr, i, n-1)

    def swap(self, arr, a, b):
        temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp

    def has_no_repeats(self, arr):
        for i in range(len(arr)-1):
            if arr[i] == arr[i+1]:
                return False
        return True

result = Algorithm().perm_alone("abfdefa")
print(result)