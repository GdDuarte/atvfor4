/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            if(num2 == 0){
                System.out.println("Divisao impossivel ");
            }else{
                double divisao = num1 /num2;
                System.out.println(divisao);
            }

        }



    }
}

