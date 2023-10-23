import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.qtd = sc.nextInt();
        System.out.println();

        System.out.println("Dados do produto: " + produto);

        System.out.println("Insira a quantidade de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        System.out.println("Dados atualizados: " + produto);

        System.out.println("Insira a quantidade de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);
        System.out.println("Dados atualizados: " + produto);

    }
}
