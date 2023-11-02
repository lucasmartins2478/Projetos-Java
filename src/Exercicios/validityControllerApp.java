package Exercicios;

import java.util.Scanner;

public class validityControllerApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] produtos = new String[1000];
        int[] validades = new int[1000];
        int[] codigos = new int[1000];
        int countValidade = 1;
        int countProduto = 1;
        int countCodigo = 1;
        int codigoEditar;
        int codigoExcluir;
        String escolha = "";

        System.out.println("Seja bem vindo ao App de conntrole de validade!");

        while (escolha != "5") {

            System.out.println("");
            System.out.println("|||||||||||||||||||||||||||||||||");
            System.out.println("Escolha uma das opcoes a seguir:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Visualizar lista de produtos");
            System.out.println("3 - Editar produtos");
            System.out.println("4 - Remover produtos");
            System.out.println("5 - Sair");
            System.out.println("|||||||||||||||||||||||||||||||||");
            escolha = scan.next();

            switch (escolha) {

                case "1":
                    System.out.println("Digite o  codigo do produto:");
                    codigos[countCodigo] = scan.nextInt();
                    for (int x = 0; x < countCodigo; x++) {
                        if (produtos[countCodigo] != null) {
                            System.out.println("O codigo ja esta cadastrado!");

                        } else {
                            System.out.println("Digite o nome do produto:");
                            produtos[countProduto] = scan.nextLine();
                            produtos[countProduto] = scan.nextLine();
                            System.out.println("Digite a validade do produto em dias:");
                            validades[countValidade] = scan.nextInt();
                            System.out.println("Produto cadastrado com sucesso!");

                        }
                    }
                    countProduto++;
                    countValidade++;
                    countCodigo++;
                    break;

                case "2":

                    System.out.println("LISTA DE PRODUTOS");
                    System.out.println("");
                    for (int x = 1; x < countCodigo; x++) {
                        if (validades[x] > 0) {
                            System.out.println(codigos[x] + " - " + produtos[x] + " - " + validades[x] + " dias");
                        }
                    }
                    break;
                case "3":

                    System.out.println("Digite o codigo do produto que quer editar:");
                    codigoEditar = scan.nextInt();

                    for (int x = 1; x < countCodigo; x++) {
                        if (codigoEditar == codigos[x]) {
                            System.out.println("O que deseja editar:");
                            System.out.println("1 - Nome do produto");
                            System.out.println("2 - Data de validade");
                            escolha = scan.next();
                            if (escolha.equals("1")) {
                                System.out.println("Digite o nome do produto:");
                                produtos[x] = scan.nextLine();
                                produtos[x] = scan.nextLine();
                                System.out.println("Alteração concluida!");

                            } else if (escolha.equals("2")) {
                                System.out.println("Digite a data de validade em dias:");
                                validades[x] = scan.nextInt();
                                System.out.println("Alteracao concluida!");
                            } else {
                                System.out.println("A opcao digitada nao existe!");
                            }

                        }
                    }
                    break;
                case "4":

                    System.out.println("Digite o codigo do produto que deseja excluir:");
                    codigoExcluir = scan.nextInt();
                    for (int x = 1; x < countCodigo; x++) {
                        if (codigoExcluir == codigos[x]) {
                            System.out.println("Deseja mesmo excluir o produto?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - Nao");
                            escolha = scan.next();
                            if (escolha.equals("1")) {
                                codigos[x] = 0;
                                produtos[x] = null;
                                validades[x] = 0;
                                System.out.println("Produto excluido com sucesso!");
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("A opcao digitada nao existe!");
                    break;

            }
        }

    }

}
