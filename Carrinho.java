public class Carrinho {

    double total;
    Produto produto[];




    void exibirInfos()
    {

        int i;
        for (i = 0; i < 5; i++)
        {
            System.out.println("O produto "+ produto[i].nome + " vem da compania "+ produto[i].fabricante + "Compre esse produto afinal! "+ produto[i].descricao);
            System.out.println("\n");
        }

    }

    double calculaTotal(int i, Produto produto[])
    {
        if (produto[i].comprado = true)
        {

        total += this.produto[i].preco; 

        }

        return total;

    }   
    
    
}
