import java.util.Scanner;

public class Lista01_13 {
    public static void main(String[] args) {
        double h, pesoIdealHomem, pesoIdealMulher;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva a sua altura:");
        h = input.nextDouble();

        pesoIdealHomem = (72.7 * h - 58);
        pesoIdealMulher = (62.1 * h - 44.7);

        System.out.println("Peso ideal para homens: " + pesoIdealHomem + " kg");
        System.out.println("Peso ideal para mulheres: " + pesoIdealMulher + " kg");
        

        input.close();
    }
}



