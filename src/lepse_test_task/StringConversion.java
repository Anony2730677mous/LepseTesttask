package lepse_test_task;

public class StringConversion {
    public static void main(String[] args) {
        StringConversion stringConversion = new StringConversion();
        System.out.println(stringConversion.stringConversion("bad_VarName")); // проверял с такими словами: tryToConvertMe snake_case_case unchanged InvalidMethod bad_VarName

    }

    private String stringConversion(String string) {
        String errorMessage = "Error!"; // Возвращается в случае ошибки
        String unchanged = "Unchanged"; // Возвращается в случае, если строка не изменена
        String finalLine; // Возвращаемая итоговая строка
        // Проверка входящей строки
        if (string == null || string.isEmpty()) { // Если строка пуста или равна null
            return errorMessage; // Возвращаем сообщение об ошибке
        }
        // Проверка на snake_case
        String[] transformStringArray = string.split("_"); // Разбиваем строку на массив слов
        if (transformStringArray.length > 1 && string.matches("[a-z]+(_[a-z]+)*")) { // Если входящая строка соответствует формату snake_case
            StringBuilder stringBuilder = new StringBuilder(transformStringArray[0]); // Создаем StringBuilder с первым словом из массива
            for (int i = 1; i < transformStringArray.length; i++) { // Цикл по остальным словам
                char[] charArray = transformStringArray[i].toCharArray(); // Преобразуем слово в массив символов
                charArray[0] = Character.toUpperCase(charArray[0]); // Преобразуем первую букву в верхний регистр
                StringBuilder firstCharCapital = new StringBuilder(new String(charArray)); // Создаем StringBuilder из массива символов
                stringBuilder.append(firstCharCapital); // Добавляем слово к итоговой строке
            }
            finalLine = stringBuilder.toString(); // Преобразуем StringBuilder в строку
        }
        // Проверка на camelCase
        else if (string.matches("[a-z]+([A-Z][a-z]*)*")) { // Если входящая строка соответствует формату camelCase
            StringBuilder stringBuilder = new StringBuilder(); // Создаем пустой StringBuilder
            for (char character : string.toCharArray()) { // Цикл по символам строки
                if (Character.isUpperCase(character)) { // Если символ в верхнем регистре
                    stringBuilder.append('_'); // Добавляем символ подчеркивания
                }
                stringBuilder.append(Character.toLowerCase(character)); // Добавляем символ в нижнем регистре
            }
            finalLine = stringBuilder.toString(); // Преобразуем StringBuilder в строку
        }
        // Проверка на неизменяемую строку
        else if (string.matches("[a-z]+")) { // Если строка состоит только из строчных букв
            finalLine = unchanged; // Возвращаем сообщение о том, что строка не изменена
        }
        // Если строка не соответствует ни одному из форматов
        else {
            finalLine = errorMessage; // Возвращаем сообщение об ошибке
        }
        return finalLine; // Возвращаем итоговую строку
    }

}
