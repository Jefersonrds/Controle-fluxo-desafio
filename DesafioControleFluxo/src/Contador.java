import java.util.Scanner;


public class Contador {

    public static void main(String[] args) {
        
        
        //Declarando variaveis
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro numero: ");
        int numeroUm = terminal.nextInt();

        System.out.println("Escreva o segundo numero: ");
        int numeroDois = terminal.nextInt();

        terminal.close();

        //Chamando o metodo contar
        try{
            contar(numeroUm, numeroDois);

        }catch(ParametrosInvalidosException exception){
           
            //erro se numeroUm for maior que numeroDois
            System.out.println("O valor do segundo numero deve ser maior que o primeiro");
        }

    }

    static void contar(int numeroUm, int numeroDois) throws  ParametrosInvalidosException {

        

        if (numeroUm>numeroDois) {
            throw new ParametrosInvalidosException();
            
            
        }
        
        int contagem = numeroDois-numeroUm;
        for (int i = 1;i<=contagem;i++) {

            System.out.println("Imprimindo o numero " + i);
            
        }


    }
    
}