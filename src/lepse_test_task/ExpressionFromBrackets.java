package lepse_test_task;

import java.util.Stack;

public class ExpressionFromBrackets {
    public static void main(String[] args) {
        ExpressionFromBrackets expression = new ExpressionFromBrackets();
        String s = "([)()]";
        String S = "{[()()]}";
        String s1 = ")(";
        String s2 = "{(x * y) + (2 * (x + y))} * [y + 3] ";
        String s3 = "(x * y) + ) 2 * [x - y](";
        String s4 = "({((x * y) + [2 * (x - y)]})";
        System.out.println(expression.expressionWithBrackets(s1));

    }

    private String expressionWithBrackets(String expression) {
        String rightExpression = " Правильная скобочная последовательность"; // В случае, когда выражение со скобками подходит условию
        String wrongExpression = " Неправильная скобочная последовательность"; // В случае, когда выражение со скобками не подходит условию
        String errorMessage = "Error!";// В случае, когда на входе пустая строка или null
        // Проверка входящей строки на null или пустое значение
        if (expression == null || expression.isEmpty()) {
            return errorMessage; // Возвращаем сообщение об ошибке, если входящая строка null или пустая
        }

        Stack<Character> stack = new Stack<>(); // Создаем стек для хранения символов открывающих скобок

        // Проходим по каждому символу в строке
        for (char character : expression.toCharArray()) {
            switch (character) {
                // Если символ - открывающая скобка, добавляем его в стек
                case '(':
                case '{':
                case '[':
                    stack.push(character);
                    break;

                // Если символ - закрывающая скобка, проверяем, соответствует ли он последней открывающей скобке в стеке
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return expression + wrongExpression;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return expression + wrongExpression;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return expression + wrongExpression;
                    }
                    break;
            }
        }

        // Если после проверки всех символов в стеке остались символы, то скобочная последовательность неправильная
        if (!stack.isEmpty()) {
            return expression + wrongExpression;
        }

        // Если все скобки корректно открыты и закрыты, то скобочная последовательность правильная
        return expression + rightExpression;
    }


}

