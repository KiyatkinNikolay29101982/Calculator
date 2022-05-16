

// калькулятор выполняет простые арифметические действия
// в качестве домашнего задания по циклам и переменным.


import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private double result = 0;
    char operant;

    public Calculator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число над которым будет проведена математическая операция");
        a = sc.nextDouble();

        System.out.println("введите математический знак операции");
        operant = sc.next().charAt(0);

        System.out.println("введите число с помощью которого проводится операция");
        b = sc.nextDouble();
    }

    public  double compute(){
        switch (operant) {
            case '+' : result = a + b;
            break;

            case '-' : result = a - b;
            break;

            case '*' : result = a * b;
            break;

            case ':' : if (b != 0)
                       {
                           result = a / b;
                       } else
                       {
                        System.out.println("На ноль делить нельзя, попробуй снова");
                        Scanner newSc = new Scanner(System.in);
                        b = newSc.nextDouble();
                        result = a / b;
                       }
            break;

            default: System.out.println("Вы ввели некорректную опреацию");
            break;

        }


        return result;
    }

}
