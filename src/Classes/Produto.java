package Classes;

public class Produto {
    public String nome;
    public double preco;
    public int qtde;

    public double TotalValorEstoque(){
        return preco * qtde; 
    }

    public void AddProduto(int qtd){
        qtde += qtd;
        //qtde = qtde - qtd;
    }

    public void RemProduto(int qtd){
        qtde -= qtd;
        //qtde = qtde - qtd;        
    }

    @Override
    public String toString() {        
        return  "Produto: "
                + nome 
                + ", R$: "
                + String.format("%.2f",preco) 
                + ", " 
                + qtde 
                + " unidades, Valor total em estoque: R$ "
                + String.format("%.2f", TotalValorEstoque()) ;

                //"TV, R$ 1000.00, 10 unidades, total: R$ 10000.00"
    }
}
