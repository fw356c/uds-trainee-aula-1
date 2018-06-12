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
        Integer Produto5=228;
        Integer Produto6=255;
        Integer Produto7=253;
        Integer Produto8=483;
        Integer Produto9=28;
        Integer Produto10=39;
        Integer Produto11=983;
        Integer Produto12=274;
        Integer Produto13=463;
        Integer Produto14=952;
        Integer Produto15=753;
        Integer Produto16=297;
        Integer Produto17=964;
        Integer Produto18=872;
        Integer Produto19=365;
        Integer Produto20=147;
        Integer Produto21=589;
        Integer Produto22=658;
        Integer Produto23=671;
        Integer Produto24=584;
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
       System.out.println("Produtos\n"+categoria1(entrada));
       Scanner scanner2 = new Scanner(System.in);
       System.out.println("Escolha seu Produto:");
       Integer entrada4 = scanner.nextInt();
       switch (entrada4){
           case 1:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto1);
               break;
           case 2:
               System.out.println("produto Selecionado: Camisa");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto2);
               break;
           case 3:
               System.out.println("produto Selecionado: Blusa");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto3);
               break;
           case 4:
               System.out.println("produto Selecionado: Shorts");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto4);
               break;
           case 5:
               System.out.println("produto Selecionado: Moletom");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto5);
               break;
           case 6:
               System.out.println("produto Selecionado: Tenis");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto6);
               break;
           case 7:
               System.out.println("produto Selecionado: Sapato Social");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto7);
               break;
           case 8:
               System.out.println("produto Selecionado: Bota");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto8);
               break;
           case 9:
               System.out.println("produto Selecionado: Tamanco");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto9);
               break;
           case 10:
               System.out.println("produto Selecionado: Chuteira");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto10);
               break;
           case 11:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto11);
               break;
           case 12:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto12);
               break;
           case 13:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto13);
               break;
           case 14:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto14);
               break;
           case 15:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto15);
               break;
           case 16:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto16);
               break;
           case 17:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto17);
               break;
           case 18:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto18);
               break;
           case 19:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto19);
               break;
           case 20:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto20);
               break;
           case 21:
               System.out.println("produto Selecionado: Calça");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto21);
               break;
           case 22:
               System.out.println("produto Selecionado: 22 - Armor+13");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto22);
               break;
           case 23:
               System.out.println("produto Selecionado: 23 - Gloves +13");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto23);
               break;
           case 24:
               System.out.println("produto Selecionado: 24 - Pantes +13");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto24);
               break;
           case 25:
               System.out.println("produto Selecionado: 25 - Boots +13");
               System.out.println("Novo saldo: ");
               System.out.println(Saldo-Produto25);
               break;



       }

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
        Integer Produto5=228;
        Integer Produto6=255;
        Integer Produto7=253;
        Integer Produto8=483;
        Integer Produto9=28;
        Integer Produto10=39;
        Integer Produto11=983;
        Integer Produto12=274;
        Integer Produto13=463;
        Integer Produto14=952;
        Integer Produto15=753;
        Integer Produto16=297;
        Integer Produto17=964;
        Integer Produto18=872;
        Integer Produto19=365;
        Integer Produto20=147;
        Integer Produto21=589;
        Integer Produto22=658;
        Integer Produto23=671;
        Integer Produto24=584;
        Integer Produto25=944;

        switch (produto) {
            case 1:
                return "1 - Calça "+Produto1+"\n2 - Camisa "+Produto2+"\n3 - Blusa "+Produto3+"\n4 - Shorts "+Produto4+"\n5 - Moletom "+Produto5;
            case 2:
                return "6 - Tenis "+Produto6+"\n7 - Sapato Social "+Produto7+"\n8 - Bota "+Produto8+"\n9 - Tamanco "+Produto9+"\n10 - Chuteira "+Produto10;
            case 3:
                return "11 - Faca "+Produto11+"\n12 - Pistola "+Produto12+"\n13 - Submetrlhadora "+Produto13+"\n14 - Fusil "+Produto14+"\n15 - Revolver "+Produto15;
            case 4:
                return "16 - Granada de mão "+Produto16+"\n17 - Granada de fumaça "+Produto17+"\n18 - Granada de efeito moral "+Produto18+"\n19 - Molotov "+Produto19+"\n20 - Bomba Atomica "+Produto20;
            case 5:
                return "21 - Helm +13 "+Produto21+"\n22 - Armor+13 "+Produto22+"\n23 - Gloves +13 "+Produto23+"\n24 - Pantes +13 "+Produto24+"\n25 - Boots +13 "+Produto25;
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



