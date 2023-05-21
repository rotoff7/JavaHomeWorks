package HomeWork1;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public int triangularNum(int number){
        int answer = 0;
        for (int i = 0; i <= number; i++) {
            answer += i;
        }
        return answer;
    }
    public int factorial(int number){
        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer *= i;
        }
        return answer;
    }
}
