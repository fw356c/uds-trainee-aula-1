import javafx.scene.control.Alert;

import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args){

        System.out.println("Hello Word");
        String Nome = "Alison Tadeu";
        String Sobrenome="Veloza";
        Integer Idade = 26;
        Boolean sexoFeminino = false;
        Double Peso = 92.0;

        System.out.println( "Olá, meu nome é "+Nome+" "+Sobrenome+", tenho "+Idade+" anos de idedade" );

        if (Idade <= 18){
            System.out.println("Novinho(a)");
        }

         else if (Idade > 18 && Idade <= 30)
         {
            System.out.println("Tiozinho");
         }

        else {
            System.out.println("Tiozão(ona)");
        }
        Integer Dia = 3;
        switch (Dia) {
            case 3:
                System.out.println("Hoje é Quarta-feira!");
                break;
            case 0:
                System.out.println("Hoje é Domingo!");
                break;
            case 1:
                System.out.println("Hoje é Segunda-feira!");
                break;
            case 2:
                System.out.println("Hoje é Terça-feira");
                break;
            case 4:
                System.out.println("Hoje é Quinta-Feira!");
                break;
            case 5:
                System.out.println("Hoje é Sexta-Feira!");
                break;
            case 6:
                System.out.println("Hoje é Sabado!");
                break;


        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de numeros Romanos ;D");
        System.out.println("Insira o Número Decimal:");
        Integer entrada = scanner.nextInt();
        System.out.println(convertdec(entrada));

    }

    static String convertdec(int numero){

        switch (numero)
        {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "iV";
            case 5: return "V";
            case 6: return  "VI";
            case 7: return  "VII";
            case 8: return  "VIII";
            case 9: return "IX";
            case 10: return "X";
        }
            return"Numero Invalido";


    }
}





