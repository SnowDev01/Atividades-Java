import java.util.Scanner;

public class Policia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int licenciamento_vencido = input.nextInt();
        int carteira_vencida = input.nextInt();

        String inputBafometro = input.next();
        inputBafometro = inputBafometro.replace(",", ".");
        float bafometro = Float.parseFloat(inputBafometro);

        boolean apreendido;

        if (licenciamento_vencido >= 30 || carteira_vencida >= 30 || bafometro > 0.05f) {
            apreendido = true;
        } else {
            apreendido = false;
        }

        System.out.println(apreendido);

        input.close();
    }
}

