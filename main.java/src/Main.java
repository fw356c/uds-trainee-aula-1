import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo ao OutFit do Torinha!");

        String Cliente="Cliente";
        Integer Saldo= 1500;
        String Categoria1="Roupas";
        String Categoria2="Sapatos";
        String Categoria3="armas";
        String Categoria4="bombas";
        String Categoria5="Acessorios";
        Integer Produto1=500;
        Integer Produto2=200;
        Integer Produto3=300;
        Integer Produto4=50;
        Integer Produto6=228;
        Integer Produto7=255;
        Integer Produto8=253;
        Integer Produto9=483;
        Integer Produto10=28;
        Integer Produto11=39;
        Integer Produto12=983;
        Integer Produto13=274;
        Integer Produto14=463;
        Integer Produto15=952;
        Integer Produto16=753;
        Integer Produto17=297;
        Integer Produto18=964;
        Integer Produto19=872;
        Integer Produto20=365;
        Integer Produto21=147;
        Integer Produto22=589;
        Integer Produto23=658;
        Integer Produto24=671;
        Integer Produto25=944;
        


        System.out.println("Ola "+Cliente+" seu saldo é: "+Saldo);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Categorias:");
        System.out.println("1 - "+Categoria1);
        System.out.println("2 - "+Categoria2);
        System.out.println("3 - "+Categoria3);
        System.out.println("4 - "+Categoria4);
        System.out.println("5 - "+Categoria5);
        System.out.println("Escolha Sua Categoria:");



       Integer entrada = scanner.nextInt();
       System.out.println("Produtos"+"\n"+categoria1(entrada));
       Scanner scanner2 = new Scanner(System.in);
       System.out.println("Escolha seu Produto:");
       Integer entrada4 = scanner.nextInt();
       }



//    }
//    static String escolhacategoria(int categoria) {
//        switch (categoria) {
//            case 1:
//                return "Categoria 1.";
//            case 2:
//                return "Categoria 2.";
//            case 3:
//                return "Categoria 3.";
//            case 4:
//                return "Categoria 4.";
//            case 5:
//                return "Categoria 5.";
//        }
//
//       return"Categoria Invalida!";}

    static String categoria1(int produto) {
        Integer Produto1=500;
        Integer Produto2=200;
        Integer Produto3=300;
        Integer Produto4=50;
        Integer Produto6=228;
        Integer Produto7=255;
        Integer Produto8=253;
        Integer Produto9=483;
        Integer Produto10=28;
        Integer Produto11=39;
        Integer Produto12=983;
        Integer Produto13=274;
        Integer Produto14=463;
        Integer Produto15=952;
        Integer Produto16=753;
        Integer Produto17=297;
        Integer Produto18=964;
        Integer Produto19=872;
        Integer Produto20=365;
        Integer Produto21=147;
        Integer Produto22=589;
        Integer Produto23=658;
        Integer Produto24=671;
        Integer Produto25=944;
        Integer Produto26=874;

        switch (produto) {
            case 1:
                return "Calça "+Produto1+"\n"+"Camisa "+Produto2+"\n"+"Blusa "+Produto3+"\n"+"shorts "+Produto4+"\n"+"Moletom "+Produto6;
            case 2:
                return "Tenis "+Produto7+"\n"+"Sapato Social "+Produto8+"\n"+"Bota "+Produto9+"\n"+"Tamanco "+Produto10+"\n"+"chuteira "+Produto11;
            case 3:
                return "Faca "+Produto12+"\n"+"Pistola "+Produto13+"\n"+"Submetrlhadora "+Produto14+"\n"+"Fusil "+Produto15+"\n"+"Revolver "+Produto16;
            case 4:
                return "Granada de mão "+Produto17+"\n"+"Granada de fumaça "+Produto18+"\n"+"Granada de efeito moral "+Produto19+"\n"+"Molotov "+Produto20+"\n"+"Bomba Atomica "+Produto21;
            case 5:
                return "Helm +13 "+Produto22+"\n"+"Armor+13 "+Produto23+"\n"+"Gloves +13 "+Produto24+"\n"+"Pantes +13 "+Produto25+"\n"+"Boots +13 "+Produto26;
        }

        return"Categoria Invalida!";}
    }

//    static Integer osprodutosdopai(int Produtos) {
//
//        String Cliente="Cliente";
//        Integer Saldo= 1500;
//        String Categoria1="Roupas";
//        String Categoria2="Sapatos";
//        String Categoria3="armas";
//        String Categoria4="bombas";
//        String Categoria5="Acessorios";
//        Integer Produto1=500;
//        Integer Produto2=200;
//        Integer Produto3=300;
//        Integer Produto4=50;
//        Integer Produto6=228;
//        Integer Produto7=255;
//        Integer Produto8=253;
//        Integer Produto9=483;
//        Integer Produto10=28;
//        Integer Produto11=39;
//        Integer Produto12=983;
//        Integer Produto13=274;
//        Integer Produto14=463;
//        Integer Produto15=952;
//        Integer Produto16=753;
//        Integer Produto17=297;
//        Integer Produto18=964;
//        Integer Produto19=872;
//        Integer Produto20=365;
//        Integer Produto21=147;
//        Integer Produto22=589;
//        Integer Produto23=658;
//        Integer Produto24=671;
//        Integer Produto25=944;
//        switch (Produtos){
//            case 1:
//                return System.out.println(Categoria1);
//        }
//        return Categoria1;
//    }
//}




//    public static void main(String[] args){
//
//        System.out.println("Hello Word");
//        String Nome = "Alison Tadeu";
//        String Sobrenome="Veloza";
//        Integer Idade = 26;
//        Boolean sexoFeminino = false;
//        Double Peso = 92.0;
//
//        System.out.println( "Olá, meu nome é "+Nome+" "+Sobrenome+", tenho "+Idade+" anos de idedade" );
//
//        if (Idade <= 18){
//            System.out.println("Novinho(a)");
//        }
//
//        else if (Idade > 18 && Idade <= 30)
//        {
//            System.out.println("Tiozinho");
//        }
//
//        else {
//            System.out.println("Tiozão(ona)");
//        }
//        Integer Dia = 3;
//        switch (Dia) {
//            case 3:
//                System.out.println("Hoje é Quarta-feira!");
//                break;
//            case 0:
//                System.out.println("Hoje é Domingo!");
//                break;
//            case 1:
//                System.out.println("Hoje é Segunda-feira!");
//                break;
//            case 2:
//                System.out.println("Hoje é Terça-feira");
//                break;
//            case 4:
//                System.out.println("Hoje é Quinta-Feira!");
//                break;
//            case 5:
//                System.out.println("Hoje é Sexta-Feira!");
//                break;
//            case 6:
//                System.out.println("Hoje é Sabado!");
//                break;
//
//
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Conversor de numeros Romanos ;D");
//        System.out.println("Insira o Número Decimal:");
//        Integer entrada = scanner.nextInt();
////        System.out.println(convertdec(entrada));
////        for (int i=0;i<=10;i++){
////           System.out.println(convertdec(entrada));
////        }
//        int i=1;
//        while (i <= 10){
//
//            System.out.println(convertdec(entrada));
//            i ++;
//        }
//    }
//
//    static String convertdec(int numero){
//
//        switch (numero)
//        {
//            case 1: return " 1=I";
//            case 2: return " 2=II";
//            case 3: return " 3=III";
//            case 4: return " 4=IV";
//            case 5: return " 5=V";
//            case 6: return  " 6=VI";
//            case 7: return  " 7=VII";
//            case 8: return  " 8=VIII";
//            case 9: return " 9=IX";
//            case 10: return " 10=X";
//        }
//        return"Numero Invalido";
//
//
//
//    }



