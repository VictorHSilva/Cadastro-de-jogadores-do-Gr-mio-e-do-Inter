/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroJogadores;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class CadastroJogadores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Matriz com 11 linhas e 5 colunas pois são 11 jogadores com 5 caracteristicas.
        //Uma matriz para cada time. 
        String[][] vInter = new String[11][5];
        String[][] vGremio = new String[11][5];

        int linhaGremio = 0, colunaGremio = 0, linhaInter = 0, colunaInter = 0;

        int opcao, opcaoTime;

        do {
            // Menu de opções.
            System.out.println("\n\n--- Escolha a opção desejada ---");
            System.out.println("Digite [1] para Cadastrar jogadores");
            System.out.println("Digite [2] para mostrar o time do inter");
            System.out.println("Digite [3] para mostrar o time do Grêmio");
            System.out.println("Digite [4] para mostrar todos os jogadores");
            System.out.println("Digite [5] para sair");
            System.out.print("Opcao : ");
            opcao = Integer.parseInt(teclado.nextLine());
            // Opção de cadastro.
            if (opcao == 1) {
                System.out.println("Para escolher o time do Grêmio digite [1]");
                System.out.println("Para escolher o time do Inter digite  [2]");
                opcaoTime = Integer.parseInt(teclado.nextLine());
                //Cadastro no time do Grêmio.
                if (opcaoTime == 1) {
                    System.out.println("\n**Você escolheu o time do Grêmio**");
                    System.out.print("\nDigite o nome do jogador : ");
                    vGremio[linhaGremio][colunaGremio] = teclado.nextLine();
                    colunaGremio++;
                    System.out.print("\nDigite a idade : ");
                    vGremio[linhaGremio][colunaGremio] = teclado.nextLine();
                    colunaGremio++;
                    System.out.print("\nDigite o peso em kilos : ");
                    vGremio[linhaGremio][colunaGremio] = teclado.nextLine();
                    colunaGremio++;
                    System.out.print("\nDigite a altura em metros: ");
                    vGremio[linhaGremio][colunaGremio] = teclado.nextLine();
                    colunaGremio++;
                    System.out.print("\nDigite a posição : ");
                    vGremio[linhaGremio][colunaGremio] = teclado.nextLine();
                    colunaGremio = 0;
                    linhaGremio++;

                } else {
                    // Cadastro no time do Inter.
                    if (opcaoTime == 2) {
                        System.out.println("**Você escolheu o time do Inter**");
                        System.out.print("\nDigite o nome do jogador : ");
                        vInter[linhaInter][colunaInter] = teclado.nextLine();
                        colunaInter++;
                        System.out.print("\nDigite a idade : ");
                        vInter[linhaInter][colunaInter] = teclado.nextLine();
                        colunaInter++;
                        System.out.print("\nDigite o peso em kilos: ");
                        vInter[linhaInter][colunaInter] = teclado.nextLine();
                        colunaInter++;
                        System.out.print("\nDigite a altura em metros: ");
                        vInter[linhaInter][colunaInter] = teclado.nextLine();
                        colunaInter++;
                        System.out.print("\nDigite a posição : ");
                        vInter[linhaInter][colunaInter] = teclado.nextLine();
                        colunaInter = 0;
                        linhaInter++;
                    }

                }
                //Mensagem de erro caso o usuário digite um valor inválido.
                if (opcaoTime != 1 && opcaoTime != 2) {
                    System.out.println("\n\nVocê digitou um caracter incorreto, comece novamenete");
                }

            }
            //Mostrar os jogadores do time do Inter.
            if (opcao == 2) {

                System.out.println("\nTime do Inter");
                System.out.println(" ");
                if (linhaInter == 0) {
                    //mensagem caso não tenha nenhum jogador cadastrado
                    System.out.println("Nenhum jogador cadastrado");
                } else {
                    for (int i = 0; i < linhaInter; i++) {

                        System.out.println("Nome : " + vInter[i][0]);
                        System.out.println("Tem : " + vInter[i][1] + " anos");
                        System.out.println("Pesa : " + vInter[i][2] + " Kg");
                        System.out.println("Mede : " + vInter[i][3] + " metros");
                        System.out.println("Joga na posição de : " + vInter[i][4]);
                        System.out.println("_________________________________");
                    }
                }

            }
            //Mostrar os jogadores do time do Grêmio.
            if (opcao == 3) {

                System.out.println("\nTime do Grêmio");
                System.out.println(" ");

                if (linhaGremio == 0) {
                    //Mensagem caso caso não tenha nenhum jogador cadstrado. 
                    System.out.println("Nenhum jogador cadastrado");
                } else {
                    for (int i = 0; i < linhaGremio; i++) {

                        System.out.println("Nome : " + vGremio[i][0]);
                        System.out.println("Tem : " + vGremio[i][1] + " anos.");
                        System.out.println("Pesa : " + vGremio[i][2] + " Kg.");
                        System.out.println("Mede : " + vGremio[i][3] + " metros.");
                        System.out.println("Joga na posição de : " + vGremio[i][4]);
                        System.out.println("_________________________________");
                    }
                }

            }
            //Mostrar os dois times
            if (opcao == 4) {
                for (int i = 0; i < linhaInter; i++) {

                    System.out.println("\nJogador colorado número: " + (i + 1));
                    System.out.println("Nome : " + vInter[i][0]);
                    System.out.println("Tem : " + vInter[i][1] + " anos");
                    System.out.println("Pesa : " + vInter[i][2] + " Kg");
                    System.out.println("Mede : " + vInter[i][3] + " metros");
                    System.out.println("Joga na posição de : " + vInter[i][4]);
                    System.out.println("_________________________________");
                }

                for (int j = 0; j < linhaGremio; j++) {
                    System.out.println("\nJogador Gremista número: " + (j + 1));
                    System.out.println("Nome : " + vGremio[j][0]);
                    System.out.println("Tem : " + vGremio[j][1] + " anos.");
                    System.out.println("Pesa : " + vGremio[j][2] + " Kg.");
                    System.out.println("Mede : " + vGremio[j][3] + " metros.");
                    System.out.println("Joga na posição de : " + vGremio[j][4]);
                    System.out.println("_________________________________");
                }
            }
            //Menssagem de erro caso o usuário digite um valor inválido
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
                System.out.println("\n\nVocê digitou um caracter incorreto, comece novamenete");
            }

        } while (opcao != 5);

    }

}
