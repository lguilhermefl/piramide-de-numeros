import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Este algoritimo imprime uma pirâmide formada por todos os números em um intervalo de dois números,\nrepetindo cada um pelo mesmo número de vezes de sua posição de iteração.");
        
        System.out.println("Digite um número de onde o intervalo comecará e tecle enter:");
        int startNumber = in.nextInt();
        
        System.out.println("Digite o número onde o intervalo terminará e tecle enter:");
        int endNumber = in.nextInt();

        System.out.println("Pirâmide do intervalo entre " + startNumber + " e " + endNumber + ":");
        int currentInteration = 1;
        for(int i = startNumber; i <= endNumber; i++) {
            String str = Integer.toString(i);
            System.out.println(str.repeat(currentInteration));
            currentInteration++;
        }
    }
}
