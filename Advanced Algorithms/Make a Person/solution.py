class Person:
    def __init__(self, full_name):
        self.__first_name = full_name.split(' ')[0]
        self.__last_name = full_name.split(' ')[1]

    def get_first_name(self):
        return self.__first_name

    def get_last_name(self):
        return self.__last_name

    def get_full_name(self):
        return self.__first_name + " " + self.__last_name

    def set_first_name(self, name):
        self.__first_name = name

    def set_last_name(self, name):
        self.__last_name = name

    def set_full_name(self, full_name):
        self.__first_name = full_name.split(' ')[0]
        self.__last_name = full_name.split(' ')[1]

p = Person('Bob Ross')
p.set_full_name("Haskell Curry")
print(p.get_full_name())