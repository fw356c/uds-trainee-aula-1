import java.util.Scanner;

class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo ao OutFit do Torinha!");

        String Cliente="Cliente";
        Integer Saldo=1500;
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
       Integer loll= scanner.nextInt();
//       System.out.println(Testest(loll));
       Integer subtotal=Testest(loll);
       System.out.println(subtotal);
       if (Testest(loll)<=0){
           System.out.println("saldo Insufuciente!");

       }






        while (Testest(loll) >= 0){
//            System.out.print("Seu Saldo: ");System.out.println();
            System.out.println("Categorias:");
            System.out.println("1 - "+Categoria1);
            System.out.println("2 - "+Categoria2);
            System.out.println("3 - "+Categoria3);
            System.out.println("4 - "+Categoria4);
            System.out.println("5 - "+Categoria5);
            System.out.println("Escolha Sua Categoria:");

            Integer entrada2 = scanner.nextInt();
            System.out.println("Produtos\n"+categoria1(entrada2));
            Integer lol2= scanner.nextInt();
//            System.out.println(Testest(lol2));
            Integer saldo2= Testest(lol2)-subtotal;
            System.out.println(saldo2);
            if (saldo2 <=0)
            {System.out.println("saldo Insufuciente!");
            break;
            }
        }

       }


    public static Integer getPrecoProduto(int codigo) {
        Integer preco=0 ;
        switch (codigo) {
            case 1:
                preco = 500;
                break;
            case 2:
                preco = 200;
                break;
            case 3:
                preco = 300;
                break;
            case 4:
                preco = 50;
                break;
            case 5:
                preco = 228;
                break;
            case 6:
                preco = 255;
                break;
            case 7:
                preco = 253;
                break;
            case 8:
                preco = 483;
                break;
            case 9:
                preco = 28;
                break;
            case 10:
                preco = 39;
                break;
            case 11:
                preco = 983;
                break;
            case 12:
                preco = 274;
                break;
            case 13:
                preco = 463;
                break;
            case 14:
                preco = 952;
                break;
            case 15:
                preco = 753;
                break;
            case 16:
                preco = 297;
                break;
            case 17:
                preco = 964;
                break;
            case 18:
                preco = 872;
                break;
            case 19:
                preco = 365;
                break;
            case 20:
                preco = 147;
                break;
            case 21:
                preco = 589;
                break;
            case 22:
                preco = 658;
                break;
            case 23:
                preco = 671;
                break;
            case 24:
                preco = 584;
                break;
            case 25:
                preco = 944;
                break;



        }
        return preco;
    }

    public static Integer Testest(int escolhaproduto) {
        Integer saldo = 1500;
        Integer preco = getPrecoProduto(escolhaproduto);
        Integer resultado = saldo - preco;
        return resultado;



//        Integer Produto1 = 500;
//        Integer Produto2 = 200;
//        Integer Produto3 = 300;
//        Integer Produto4 = 50;
//        Integer Produto5 = 228;
//        Integer Produto6 = 255;
//        Integer Produto7 = 253;
//        Integer Produto8 = 483;
//        Integer Produto9 = 28;
//        Integer Produto10 = 39;
//        Integer Produto11 = 983;
//        Integer Produto12 = 274;
//        Integer Produto13 = 463;
//        Integer Produto14 = 952;
//        Integer Produto15 = 753;
//        Integer Produto16 = 297;
//        Integer Produto17 = 964;
//        Integer Produto18 = 872;
//        Integer Produto19 = 365;
//        Integer Produto20 = 147;
//        Integer Produto21 = 589;
//        Integer Produto22 = 658;
//        Integer Produto23 = 671;
//        Integer Produto24 = 584;
//        Integer Produto25 = 944;

//        switch (escolhaproduto) {
//            case 1:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto1);
//                resultado = Saldo - Produto1;
//                break;
//            case 2:
//                System.out.println("produto Selecionado: Camisa");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto2);
//                resultado = Saldo - Produto1;
//                break;
//            case 3:
//                System.out.println("produto Selecionado: Blusa");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto3);
//                resultado = Saldo - Produto1;
//                break;
//            case 4:
//                System.out.println("produto Selecionado: Shorts");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto4);
//                resultado = Saldo - Produto1;
//                break;
//            case 5:
//                System.out.println("produto Selecionado: Moletom");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto5);
//                resultado = Saldo - Produto1;
//                break;
//            case 6:
//                System.out.println("produto Selecionado: Tenis");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto6);
//                resultado = Saldo - Produto1;
//                break;
//            case 7:
//                System.out.println("produto Selecionado: Sapato Social");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto7);
//                resultado = Saldo - Produto1;
//                break;
//            case 8:
//                System.out.println("produto Selecionado: Bota");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto8);
//                resultado = Saldo - Produto1;
//                break;
//            case 9:
//                System.out.println("produto Selecionado: Tamanco");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto9);
//                resultado = Saldo - Produto1;
//                break;
//            case 10:
//                System.out.println("produto Selecionado: Chuteira");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto10);
//                resultado = Saldo - Produto1;
//                break;
//            case 11:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto11);
//                resultado = Saldo - Produto1;
//                break;
//            case 12:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto12);
//                resultado = Saldo - Produto1;
//                break;
//            case 13:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto13);
//                resultado = Saldo - Produto1;
//                break;
//            case 14:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto14);
//                resultado = Saldo - Produto1;
//                break;
//            case 15:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto15);
//                resultado = Saldo - Produto1;
//                break;
//            case 16:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto16);
//                resultado = Saldo - Produto1;
//                break;
//            case 17:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto17);
//                resultado = Saldo - Produto1;
//                break;
//            case 18:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto18);
//                resultado = Saldo - Produto1;
//                break;
//            case 19:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto19);
//                resultado = Saldo - Produto1;
//                break;
//            case 20:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto20);
//                resultado = Saldo - Produto1;
//                break;
//            case 21:
//                System.out.println("produto Selecionado: Calça");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto21);
//                resultado = Saldo - Produto1;
//                break;
//            case 22:
//                System.out.println("produto Selecionado: 22 - Armor+13");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto22);
//                resultado = Saldo - Produto1;
//                break;
//            case 23:
//                System.out.println("produto Selecionado: 23 - Gloves +13");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto23);
//                resultado = Saldo - Produto1;
//                break;
//            case 24:
//                System.out.println("produto Selecionado: 24 - Pantes +13");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto24);
//                resultado = Saldo - Produto1;
//                break;
//            case 25:
//                System.out.println("produto Selecionado: 25 - Boots +13");
//                System.out.println("Novo saldo: ");
//                System.out.println(Saldo - Produto25);
//                resultado = Saldo - Produto1;
//                break;
//
//        }
    }


        public static String categoria1 ( int produto){
            Integer Produto1 = 500;
            Integer Produto2 = 200;
            Integer Produto3 = 300;
            Integer Produto4 = 50;
            Integer Produto5 = 228;
            Integer Produto6 = 255;
            Integer Produto7 = 253;
            Integer Produto8 = 483;
            Integer Produto9 = 28;
            Integer Produto10 = 39;
            Integer Produto11 = 983;
            Integer Produto12 = 274;
            Integer Produto13 = 463;
            Integer Produto14 = 952;
            Integer Produto15 = 753;
            Integer Produto16 = 297;
            Integer Produto17 = 964;
            Integer Produto18 = 872;
            Integer Produto19 = 365;
            Integer Produto20 = 147;
            Integer Produto21 = 589;
            Integer Produto22 = 658;
            Integer Produto23 = 671;
            Integer Produto24 = 584;
            Integer Produto25 = 944;

            switch (produto) {
                case 1:
                    return "1 - Calça " + Produto1 + "\n2 - Camisa " + Produto2 + "\n3 - Blusa " + Produto3 + "\n4 - Shorts " + Produto4 + "\n5 - Moletom " + Produto5;
                case 2:
                    return "6 - Tenis " + Produto6 + "\n7 - Sapato Social " + Produto7 + "\n8 - Bota " + Produto8 + "\n9 - Tamanco " + Produto9 + "\n10 - Chuteira " + Produto10;
                case 3:
                    return "11 - Faca " + Produto11 + "\n12 - Pistola " + Produto12 + "\n13 - Submetrlhadora " + Produto13 + "\n14 - Fusil " + Produto14 + "\n15 - Revolver " + Produto15;
                case 4:
                    return "16 - Granada de mão " + Produto16 + "\n17 - Granada de fumaça " + Produto17 + "\n18 - Granada de efeito moral " + Produto18 + "\n19 - Molotov " + Produto19 + "\n20 - Bomba Atomica " + Produto20;
                case 5:
                    return "21 - Helm +13 " + Produto21 + "\n22 - Armor+13 " + Produto22 + "\n23 - Gloves +13 " + Produto23 + "\n24 - Pantes +13 " + Produto24 + "\n25 - Boots +13 " + Produto25;
            }

            return "Categoria Invalida!"; }
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
//        System.out.println(convertdec(entrada));
//        for (int i=0;i<=10;i++){
//           System.out.println(convertdec(entrada));
//        }
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
//  exercicio 3
//    public void PositivoNegativo (){
//
//        public static void main(String[] args) {    
//
//                               int n= 0;    
//
//                               if (n >=0){    
//
//                               System.out.println("O número”+ n +“é positivo");    
//
//                               }    
//
//                               else{    
//
//                               System.out.println("O número”+ n +“é negativo");    
//
//                               }    
//
//        }
//
//    }
