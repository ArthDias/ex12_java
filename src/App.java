import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        float altura = 0.0f;
        float pesoIdeal = 0f;

        System.out.print("Informe sua altura (separe os metros dos centimetros através de vírgula): ");
        altura = console.nextFloat();

        pesoIdeal = (72.7f * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
        console.close();
    }
}
