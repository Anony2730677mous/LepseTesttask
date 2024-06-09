package lepse_test_task;

public class Ants {
    public static void main(String[] args) {
        Ants ants = new Ants();
        System.out.println(ants.calculate(3, 3, 1));
    }
    public int calculate(int length, int left, int right){
        if (left < right){//если муравьи не встретятся
            if(left > length/2){ // упадет быстрее правый муравей
                return (length - right + 1);
            }
            else if(left <= length - right){ // одинаковое расстояние до края
                return left +1;
            }
            else return length - right + 1; // упадет быстрее левый муравей


        }
        else{// муравьи встретятся
            int countLeft = 0; //счетчик шагов левого муравья
            int countRight = 0; //счетчик шагов правого муравья
            while(left != right + 1 || right != left -1){ //Цикл, считающий шаги муравьев до их встречи
                if(left - 1 != right){
                    left--;
                    countLeft++;
                }
                else{
                    left++;
                    countLeft++;
                    break;
                }
                if(right + 1 != left){
                    right++;
                    countRight++;
                }
                else{
                    right--;
                    countRight++;
                    break;
                }
            }
            //Муравьи разворачиваются
            int temp = left;
            left = right;
            right = temp;

            //Муравьи расходятся в разные стороны
            if(left > length/2){ // упадет быстрее правый муравей
                return (length - right + 1 + countLeft);
            }
            else if(left <= length - right){ // одинаковое расстояние до края
                return left + 1 + countLeft;
            }
            else return length - right + 1 + countRight; // упадет быстрее левый муравей
        }
    }
}

