import pytest

from lists_average import ListsAverage


# Проверяем, что в конструктор переданы списки, иначе будет ошибка TypeError
def test_init():
    with pytest.raises(TypeError):
        la = ListsAverage(1, 2)


# Проверяем, что верно считается среднее по каждому списку
def test_set_avgs():
    la = ListsAverage([], [1, 2, 1, 2, 5, 7])
    la.set_avgs()
    assert la.list1_avg == 0
    assert la.list2_avg == 3


# Проверяем, что средние сравниваются правильно и возвращается корректный ответ при различных входных параметрах
@pytest.mark.parametrize("list1, list2, res", [
    ([1, 1, 1], [2, 2, 2], "Второй список имеет большее среднее значение"),
    ([4, 4, 4], [3, 3, 3], "Первый список имеет большее среднее значение"),
    ([], [], "Средние значения равны"),
    ([5, 5, 5], [5, 5, 5], "Средние значения равны"),
    ([2], [4], "Второй список имеет большее среднее значение")
])
def test_eq_avgs(list1, list2, res):
    la = ListsAverage(list1, list2)
    la.set_avgs()
    assert la.eq_avgs() == res
