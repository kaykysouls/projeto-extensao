package com.laguapa.inventory.service;

import com.laguapa.inventory.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<Produto> estoque;

    public EstoqueService() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
        System.out.println(produto.getNome() + " adicionado ao estoque.");
    }

    public void atualizarQuantidade(String nome, int quantidade) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println("Quantidade de " + nome + " atualizada.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void listarEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Itens no estoque:");
            for (Produto produto : estoque) {
                System.out.println(produto);
            }
        }
    }
}
