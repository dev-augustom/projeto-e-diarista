package ProjetoSemana2;

import java.util.Scanner;

import ProjetoSemana2.models.Diarista;
import ProjetoSemana2.repository.DiaristaRepository;

public class App {

    public static void main(String[] args) {
       var repository = new DiaristaRepository();

       Scanner scanner = new Scanner(System.in);

      var opcao = "x";

      do {
        exibirMenu();
        System.out.print("Informe a opçao: ");
        opcao = scanner.nextLine();

        System.out.println();

        switch (opcao) {
            case "1":
              listarDiaristas(repository);
              break;
            case "2":
                cadrastarDiarista(scanner, repository);
                break;
            case "3":
                buscarDiaristas(scanner ,  repository);

                break;
            case "4":
                excluirDiarista(scanner, repository);
                break;
            case "x":
                System.err.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opçao invalida");
        }

        System.out.println("Opcão selecionda " + opcao );


      }while (!opcao.equals("x") );

       scanner.close();
    }

    private static void excluirDiarista(Scanner scanner, DiaristaRepository repository) {
        // TODO Auto-generated method stub
        System.out.println("ID: ");
        var id = scanner.nextLong();
        scanner.nextLine();

        var foiExcluido =  repository.excluirPorId(id);

        if (foiExcluido){
            System.out.println("Diarista excluida com sucesso");


        }else {
            System.out.println("Diarista não encontrada");
        }


    }

    private static void buscarDiaristas(Scanner scanner, DiaristaRepository repository) {
        // TODO Auto-generated method stub
        System.out.print("Digite o ID: ");
        var id = scanner.nextLong();
        scanner.nextLine();

        var diarista = repository.buscarPorId(id);

        if (diarista != null){
            System.out.println(diarista.getId() + "-" + diarista.getNome());

        }else {
            System.out.println("Diarista não encontrada");
        }
        
    }

    private static void cadrastarDiarista(Scanner scanner, DiaristaRepository repository) {
        // TODO Auto-generated method stub
        System.out.println("Nome:");
        var nome = scanner.nextLine();
        System.out.println("Telefone::");
        var telefone = scanner.nextLine();
        System.out.println("cpf:");
        var cpf = scanner.nextLine();
        System.out.println("Endereco:");
        var endereco = scanner.nextLine();

        var diarista = new Diarista(nome, telefone, cpf, endereco);
        repository.cadrastar(diarista);

        System.out.println("Cadrasto realizado");

    }

    private static void listarDiaristas(DiaristaRepository repository) {
        // TODO Auto-generated method stub
        var diaristas = repository.buscarTodos();

        for (Diarista diarista : diaristas){
            System.out.println(diarista.getId() + "-" + diarista.getNome());
        }

    }

    public static void exibirMenu (){
        System.out.println("1: Listar Diaristas");
        System.out.println("2: Cadrastar Diaristas");
        System.out.println("3: Buscar Diaristas");
        System.out.println("4: Excluir Diaristas");
        System.err.println("x: Sair do Sistema");

    }

}