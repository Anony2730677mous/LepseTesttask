package lepse_test_task;

public class SearchSaddlePoint {
    public static void main(String[] args) {
        SearchSaddlePoint point = new SearchSaddlePoint();
        int[][] firstMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] secondMatrix = {
                {9, 6, 2},
                {3, 4, 6},
                {1, 5, 7}
        };
        point.searchSaddlePoint(secondMatrix);
    }

    private void searchSaddlePoint(int[][] matrix) { // Предполагается, что в матрице только уникальные значения и матрица не пустая
        int saddlePointRow = -1; // Инициализация переменной для хранения индекса строки седловой точки
        int saddlePointColumn = -1; // Инициализация переменной для хранения индекса столбца седловой точки

        for (int i = 0; i < matrix.length; i++) { // Внешний цикл по строкам матрицы
            int rowMinIndex = matrix[i][0]; // Инициализация минимального значения в строке
            int columnIndex = 0; // Инициализация индекса столбца для минимального значения в строке

            // Вложенный цикл по элементам строки для поиска минимального значения
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < rowMinIndex) { // Если текущий элемент меньше минимального
                    rowMinIndex = matrix[i][j]; // Обновление минимального значения
                    columnIndex = j; // Обновление индекса столбца для минимального значения
                }
            }

            // Проверка, является ли найденный минимум в строке максимумом в своем столбце
            boolean isSaddlePoint = true; // Пусть найденный элемент является седловой точкой
            for (int k = 0; k < matrix.length; k++) { // Вложенный цикл по элементам столбца
                if (matrix[k][columnIndex] > rowMinIndex) { // Если есть элемент больше минимального в строке
                    isSaddlePoint = false; // Точка не является седловой
                    break; // Выходим из внешнего цикла
                }
            }

            // Если точка является седловой
            if (isSaddlePoint) {
                saddlePointRow = i; // Сохранение индекса строки
                saddlePointColumn = columnIndex; // Сохранение индекса столбца
                break; // Выходим из внешнего цикла, так как седловая точка найдена
            }
        }

        // Если седловая точка найдена
        if (saddlePointRow != -1 && saddlePointColumn != -1) {
            System.out.println("Седловая точка находится в позиции: (" + saddlePointRow + ", " + saddlePointColumn + ") и ее значение: " + matrix[saddlePointRow][saddlePointColumn]); // Выводим индексы и значение седловой точки
        } else {
            System.out.println("Седловая точка не найдена"); // Седловая точка не найдена
        }
    }

}

