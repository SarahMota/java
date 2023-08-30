package pacote1;

        import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;
        
        class Voo {
            int numeroVoo;
            String origem;
            String destino;
            String horarioPartida;
            String horarioChegada;
            int capacidadeMaxima;
            Queue<Passageiro> reservasPendentes;
        
            public Voo(int numeroVoo, String origem, String destino, String horarioPartida, String horarioChegada, int capacidadeMaxima) {
                this.numeroVoo = numeroVoo;
                this.origem = origem;
                this.destino = destino;
                this.horarioPartida = horarioPartida;
                this.horarioChegada = horarioChegada;
                this.capacidadeMaxima = capacidadeMaxima;
                this.reservasPendentes = new LinkedList<>();
            }
        }
        
        class Passageiro {
            String nome;
            int idade;
            String cpf;
            String email;
        
            public Passageiro(String nome, int idade, String cpf, String email) {
                this.nome = nome;
                this.idade = idade;
                this.cpf = cpf;
                this.email = email;
            }
        }
        
        public class Aviao {
            public static void main(String[] args) {
                Aviao sistema = new Aviao();
                sistema.exibirMenu();
            }
        
            public void exibirMenu() {
                Scanner scanner = new Scanner(System.in);
                int opcao;
        
                do {
                    System.out.println("Escolha uma opção:");
                    System.out.println("1. Reservar voo");
                    System.out.println("2. Fazer check-in");
                    System.out.println("3. Exibir informações sobre voos");
                    System.out.println("0. Sair");
                    opcao = scanner.nextInt();
        
                    switch (opcao) {
                        case 1:
                            // Lógica para reservar um voo
                            break;
                        case 2:
                            // Lógica para fazer check-in
                            break;
                        case 3:
                            // Lógica para exibir informações sobre voos
                            break;
                        case 0:
                            System.out.println("Saindo do sistema.");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao != 0);
        
                scanner.close();
            }
        
            // Métodos para manipular reservas, check-in e exibir informações sobre voos
        }
        
        
    