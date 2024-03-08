package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItensInclusos;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) throws Exception {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);
        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(4999.99);

        List<ItensInclusos> itensInclusos = new ArrayList<>();

        ItensInclusos primeiroItemAdicional = new ItensInclusos(2, " Controles");
        ItensInclusos segundoItemAdicional = new ItensInclusos(3, " Jogos");
        ItensInclusos terceiroItemAdicional = new ItensInclusos(2, " Cabo de Energia");

        itensInclusos.add(primeiroItemAdicional);
        itensInclusos.add(segundoItemAdicional);
        itensInclusos.add(terceiroItemAdicional);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println("Começando a apresentar os itens ...");

        for (ItensInclusos itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getQuantidade() + itemAtual.getNome());
        }

        System.out.println();
        System.out.println("Acabaram-se os itens da lista.");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.PEQUENO);

        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(  meuProdutoNacional.getImpostoNacional());


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony",Tamanho.GRANDE);

        meuProdutoInternacional.setValor(-99);
        System.out.println(meuProdutoInternacional.getValor());



    }
}

