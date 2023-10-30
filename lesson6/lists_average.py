class ListsAverage:
    list1_avg: float
    list2_avg: float
    __list1: list
    __list2: list

    def __init__(self, list1: list, list2: list):
        if not isinstance(list1, list) or not isinstance(list2, list):
            raise TypeError("Аргументы должны быть списками")
        self.__list1 = list1
        self.__list2 = list2

    def set_avgs(self):
        if not self.__list1:
            self.list1_avg = 0
        else:
            self.list1_avg = sum(self.__list1) / len(self.__list1)
        if not self.__list2:
            self.list2_avg = 0
        else:
            self.list2_avg = sum(self.__list2) / len(self.__list2)

    def eq_avgs(self):
        if self.list1_avg > self.list2_avg:
            return "Первый список имеет большее среднее значение"
        elif self.list1_avg < self.list2_avg:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"
