import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = new Random().nextInt(10);
        int tentativas = 0;

        for (int i = 0; i <5 ; i++) {

            System.out.println("Advinhe o numero aleatorio de 0 a 10:");
            int numeroDigitados = in.nextInt();
            tentativas++;

            if(numero == numeroDigitados){
                System.out.println("""
                        ----Você acertou o número!----
                       * O numero era:"""+numero);
                break;


            }else if(numero< numeroDigitados){
                System.out.println("O número é menor");
            }else{
                System.out.println("O número é maior");

            }

            if(tentativas == 5){
                System.out.println("Suas tentativas acabaram!!! O número correto era: "+numero);
            }
        }




    }
}
