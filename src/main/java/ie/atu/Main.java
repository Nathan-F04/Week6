package ie.atu;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, val=100,input=0;
        int[] Numb;

        Numb = new int[10];

        System.out.println("The output of this program is:");

        for (x = 0; x < 10; x++) {
            Numb[x] = val;
            val+=100;
            System.out.println("Element at index: " + x + ": " + Numb[x]);
        }
        System.out.println("Please enter a value:");
        val=scanner.nextInt();
        Numb[10]=val;
        System.out.println(Numb[10]);


    }


    }