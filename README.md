Проект представляет собой решение задач из этого списка:
Для каждой задачи создан соответствующий класс. Весь код прокомментирован.

1. Реализовать алгоритм определения правильной скобочной последовательности в выражении, например:
{(x * y) + (2 * (x + y))} * [y + 3] - правильная скобочная последовательность.
({((x * y) + [2 * (x - y)]}) - неправильная скобочная последовательность.
(x * y) + ) 2 * [x - y]( - неправильная скобочная последовательность.

В выражении могут быть использованы круглые "()", фигурные "{}" и квадратные "[]" скобки, а также произвольные печатные символы.
Программе на вход передается текстовый файл, содержащий несколько выражений, по одному в каждой строке. 
Необходимо определить, является ли скобочная последовательность в каждом из выражений правильной и вывести результат на экран в виде:
   <выражение> - правильная скобочная последовательность 
	или
   <выражение> - неправильная скобочная последовательность 
Класс решения - ExpressionFromBrackets

2. Написать программу, выполняющую поиск седловой точки в заданной матрице. Класс решения - SearchSaddlePoint
   
3. Дана строка, представляющая собой идентификатор переменной. Идентификатор может содержать только латинские буквы и символы подчеркивания "_".
Идентификатор написан с использованием "snake_case", если он начинается со строчной буквы, заканчивается строчной буквой, содержит только строчные буквы и одиночные символы подчеркивания (т.е. несколько подряд символов подчеркивания не допускаются).
Идентификатор написан с использованием "camelCase", если он начинается со строчной буквы и содержит только строчные и прописные буквы. 

Нужно написать программу (метод), преобразующую входную строку из одного формата в другой. 
Т.е. если входная строка соответствует формату "snake_case", то ее надо преобразовать в формат "camelCase" и наоборот. Если на вход программе передана строка, не соответствующая ни одному из этих форматов - выдать сообщение об ошибке. 

Например:

"some_variable"     ->  "someVariable"
"tryToConvertMe" ->  "try_to_convert_me"
"unchanged"           ->   "unchanged"
"InvalidMethod"     ->  "Error!"
"bad_VarName"     ->  "Error!"

Класс решения - StringConversion

4. Даны 6 прямоугольных фанерных листов. Нужно определить, можно ли из этих листов собрать коробку (прямоугольный параллелепипед).
Размеры фанерных листов в сантиметрах записаны в текстовом файле, по 2 числа (длина и ширина) в каждой строке, разделенные пробелом, всего 6 строк.
Все размеры целочисленные, от 1 до 1000. Написать программу, которая считывает размеры фанерных листов из файла и определяет, возможно или невозможно из этого набора листов собрать коробку (см. рис.).
Толщина фанерного листа не учитывается.  На выходе программа должна написать "Возможно" или "Невозможно".
