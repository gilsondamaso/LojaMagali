import java.util.Scanner;

import Classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {       
        
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();        
        
        System.out.println("INFORME O NOME DO PRODUTO:");
        p.nome = sc.nextLine();
        System.out.println("INFORME O VALOR DO PRODUTO");
        p.preco = sc.nextDouble();
        System.out.println("INFORME A QUANTIDADE INICIAL");
        p.qtde = sc.nextInt();
        
        System.out.println("DADOS DO PRODUTO: ");
        System.out.println(p);

        System.out.println("DESEJA INSERIR QUANTOS PRODUTOS NO ESTOQUE?");
        p.AddProduto(sc.nextInt());

        System.out.println("DADOS DO PRODUTO ATUALIZADOS: ");
        System.out.println(p);

        System.out.println("DESEJA REMOVER QUANTOS PRODUTOS NO ESTOQUE?");
        p.RemProduto(sc.nextInt());

        System.out.println("DADOS DO PRODUTO ATUALIZADOS: ");
        System.out.println(p);
        
        sc.close();

    }
}
