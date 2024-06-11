import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.println( a +  " vurulma qaydasi : ");
        for (int i = 1;i<=10; i++){
            int res = a*i;
            System.out.println(a + " * " + i + " = " + res);
        }




    }
}