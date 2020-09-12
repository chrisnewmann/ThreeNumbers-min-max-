import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz jedną dowolną liczbę");
        Scanner firstScanner = new Scanner(System.in);
        int firstNumber = firstScanner.nextInt();

        System.out.println("Wpisz jedną dowolną liczbę");
        Scanner secondScanner = new Scanner(System.in);
        int secondNumber = secondScanner.nextInt();

        System.out.println("Wpisz jedną dowolną liczbę");
        Scanner thirdScanner = new Scanner(System.in);
        int thirdNumber = secondScanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Max is: " + firstNumber);
        } else if(secondNumber> firstNumber && secondNumber > thirdNumber){
            System.out.println("Max is: " + secondNumber);
        }else{
            System.out.println("Max is: " + thirdNumber);
        }
        List<Integer> numbers = new ArrayList();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        numbers.add(thirdNumber);
        int number = numbers.stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println(number);



    }
}
