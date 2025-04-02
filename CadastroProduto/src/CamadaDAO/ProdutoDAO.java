package CamadaDAO;

import CamadaDTO.ProdutoDTO;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public void SalvarProduto(ProdutoDTO ProdutoDTO) {
        
        String nome = ProdutoDTO.getNome();
        double preco = ProdutoDTO.getPreco();
        int quantidade = ProdutoDTO.getQuantidade();
        
        JOptionPane.showMessageDialog(null, "nome: " + nome + "\npreco: " + preco + "\nquantidade: " + quantidade, "Cadastro Produto", 1);
    }
}
