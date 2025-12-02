import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis declaradas
        int op;
        double saldo = 0;
        double saldoRecebedor = 0;
        double valorTransacao = 0;
        String cr;


        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("==== Sistema Bancário ====");
            System.out.println("Operações:");
            System.out.println("\n1 - Consultar Saldo \n2 - Receber Transação \n3 - Efetuar Transação \n4 - Sair");
            System.out.print("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1: {
                    try {
                        System.out.println("==== Sistema Bancário ====");
                        System.out.println("Seu saldo atual é de: R$" + saldo);
                    break;
                    } catch (Exception e) {
                        System.err.println("Erro, o sistema não processou bem essa requisição");
                    }
                }

                case 2: {
                    try {
                        do {
                            System.out.println("==== Sistema Bancário ====");
                            System.out.print("Deseja continuar com o procedimento? (CONFIRMAR) | (RECUSAR): ");
                            cr = sc.nextLine().trim().toUpperCase();
                            if (cr.equals("CONFIRMAR")) {
                                System.out.println("Continuando processo de Transação.");
                            } else if (cr.equals("RECUSAR")) {
                                System.out.println("Recusado. Voltando...");
                                break;
                            } else {
                                System.out.println("Escreva corretamente. ");
                                continue;
                            }

                            System.out.println("==== Sistema Bancário ====");
                            System.out.print("Informe o valor que deseja receber: R$");
                            saldoRecebedor = sc.nextDouble();
                            sc.nextLine();
                            if (saldoRecebedor > 0) {
                                System.out.println("Transferindo " + saldoRecebedor + " para a sua conta...");
                                saldo += saldoRecebedor;
                                System.out.println("Transferência bem sucedida! Dinheiro recebido com sucesso.\nSaldo atual: R$" + saldo);
                                break;
                            } else {
                                System.out.println("Valor insuficiente. O valor digitado é abaixo de 1.");
                            }
                        } while (true);
                    } catch (Exception e) {
                        System.err.println("Erro, o sistema não processou bem essa requisição");
                    }
                    break;
                }


                case 3: {
                    try {
                        do {
                                System.out.println("==== Sistema Bancário ====");
                                System.out.print("Deseja continuar com o procedimento? (CONFIRMAR) | (RECUSAR): ");
                                cr = sc.nextLine().trim().toUpperCase();
                                if (cr.equals("CONFIRMAR")) {
                                    System.out.println("Continuando processo de Transação.");
                                } else if (cr.equals("RECUSAR")) {
                                    System.out.println("Recusado. Voltando...");
                                    break;
                                } else {
                                    System.out.println("Escreva corretamente. ");
                                    continue;
                                }

                            System.out.println("==== Sistema Bancário ====");
                            System.out.print("Digite o quanto deseja enviar: R$");
                            valorTransacao = sc.nextDouble();
                            sc.nextLine();
                            if (valorTransacao == 0) {
                                System.out.println("Não foi possivel efetuar a transação. Valor igual a 0");
                            } else if (valorTransacao <= saldo) {
                                saldo -= valorTransacao;
                                System.out.println("Transação bem-sucedida. Dinheiro enviado R$" + valorTransacao + "\nSaldo atual: R$" + saldo);
                                break;
                            } else if (valorTransacao < 0) {
                                System.out.println("Valor insuficiente. O valor digitado é abaixo de 1.");
                            } else {
                                    System.out.println("Valor insuficiente. O valor digitado é acima do que você possue.");
                                }
                        } while (true);
                    } catch (Exception e) {
                        System.err.println("Erro, o sistema não processou bem essa requisição");
                    }
                    break;
                }

                case 4: {
                    System.out.println("==== Sistema Bancário ====");
                    System.out.println("Encerrando programa...");
                    break;
                }
                default: {
                    System.out.println("Numero inválido.");
                }
            }


        } while (op != 4);

    }
}
