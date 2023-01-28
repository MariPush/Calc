import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение для расчета в формате 'a * b'");
        Scanner scanner = new Scanner(System.in);


        System.out.println(calc(scanner.nextLine()));

    }
    static int sum (int value1, int value2){
        return value1+value2;
    }
    static int sub  (int value1, int value2){
        return value1-value2;
    }
    static int mul (int value1, int value2){
        return value1 * value2;
    }
    static int del(int value1, int value2){
        return  value1 / value2;
    }
    public static String calc(String input) throws IOException
    {

        String [] inputValue = input.split( " ");
        if (inputValue.length != 3) {
            throw new IOException();
        }

        int value1 = Integer.parseInt(inputValue[0]);
        int value2 = Integer.parseInt(inputValue[2]);
        int result;
        if (value1>10 || value1<1 || value2>10 || value2<1)
        {
            throw new IOException();
        }
        switch (inputValue[1]) {
            case ("+"):
                result = sum(value1, value2);
                break;
            case ("-"):
                result = sub(value1, value2);
                break;
            case ("*"):
                result = mul(value1, value2);
                break;
            case ("/"):
                result = del(value1, value2);
                break;
            default:
                throw new IOException();
        }



        return String.valueOf(result);
    }

}