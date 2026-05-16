import java.util.Scanner;

void main() {

    String accountType = "corrente";
    double saldo = 5;
    String nome = "";
    boolean exitCondition = false;
    int i = 0;

    newLineSeparation();
    System.out.println("digite seu nome: ");
    nome = inputString(nome);

    System.out.println("digite o seu saldo: ");
    saldo = inputDouble(saldo);
    newLineSeparation();

    System.out.println("bem-vindo(a) " + nome);

    System.out.println("seu saldo é: " + saldo);
    System.out.println("sua conta é:" + accountType );
    newLineSeparation();

    while (!exitCondition){



        System.out.println("operações");
        System.out.println(" ");

        System.out.println("1- consultar saldos");
        System.out.println("2- receber valor");
        System.out.println("3- tranferir valor");
        System.out.println("4- sair");

        i = inputInt(i);

        switch (i){
            case 1:

                newLineSeparation();
                System.out.println("seu saldo é: " + saldo);
                newLineSeparation();

                break;
            case 2:
                saldo = receive(saldo);
                break;
            case 3:
                saldo = tranfer(saldo);
                break;
            case 4:
                exitCondition = true;
            default:
                if (i < 1){

                    newLineSeparation();
                    System.out.println("operação inválida!");
                    newLineSeparation();

                } else if (i > 4) {

                    newLineSeparation();
                    System.out.println("operação inválida!");
                    newLineSeparation();

                }

                break;

        }

    }
}







void newLineSeparation(){
    System.out.println("------------------------------------------------------------------------");
}

int inputInt (int inputVar){

    Scanner input = new Scanner(System.in);
    inputVar = input.nextInt();
    return  inputVar;
}

double inputDouble (double inputVar){

    Scanner input = new Scanner(System.in);
    inputVar = input.nextDouble();
    return  inputVar;
}

String inputString (String inputVar){

    Scanner input = new Scanner(System.in);
    inputVar = input.nextLine();
    return  inputVar;
}

double tranfer (double currentBalance){

    double tranferBalance = 0;

    newLineSeparation();
    System.out.println("valor a ser retirado: ");
    currentBalance -= inputDouble(tranferBalance);

    System.out.println("seu novo saldo é: " + currentBalance);
    newLineSeparation();
    return currentBalance ;
}

double receive (double currentBalance){

    double requestedBalance = 0;

    newLineSeparation();
    System.out.println("digite o valor a ser recebido: ");
    currentBalance += inputDouble(requestedBalance);
    
    System.out.println("seu novo saldo é: " + currentBalance);
    newLineSeparation();

    return currentBalance ;
}
