package com.laguapa.inventory.Program;

import com.laguapa.inventory.model.Produto;
import com.laguapa.inventory.service.EstoqueService;
import com.laguapa.inventory.util.DataUtil;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Sistema de Controle de Inventário");
        System.out.println("Data atual: " + DataUtil.formatarDataAtual());

        do {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Atualizar Quantidade");
            System.out.println("3. Listar Estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    Produto produto = new Produto(nome, preco, quantidade);
                    estoqueService.adicionarProduto(produto);
                    break;

                case 2:
                    System.out.print("Nome do Produto: ");
                    scanner.nextLine();
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int qtd = scanner.nextInt();

                    estoqueService.atualizarQuantidade(nomeProduto, qtd);
                    break;

                case 3:
                    estoqueService.listarEstoque();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
