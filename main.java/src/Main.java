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
            case 1: return " 1=I";
            case 2: return " 2=II";
            case 3: return " 3=III";
            case 4: return " 4=IV";
            case 5: return " 5=V";
            case 6: return  " 6=VI";
            case 7: return  " 7=VII";
            case 8: return  " 8=VIII";
            case 9: return " 9=IX";
            case 10: return " 10=X";
        }
            return"Numero Invalido";


    }
}





