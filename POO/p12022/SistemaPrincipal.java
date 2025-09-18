import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os dados do arquivo como lista de Strings
        List<String> linhasArquivo = LerArquivo.retornaStrings("caminho/do/arquivo.txt");

        // Converte as Strings para objetos Briofita ou Pteridofita
        List<Planta> listaPlantas = Utils.retornaDados(linhasArquivo);

        // Solicita o ID ao usuário
        System.out.println("Digite o ID da planta que deseja buscar:");
        String idBusca = sc.nextLine();

        // Cria uma Planta apenas com o ID informado
        Planta plantaBusca = new Planta(idBusca);

        // Verifica se essa planta existe na lista
        if (Utils.existe(listaPlantas, plantaBusca)) {
            // F.1 - Exibe os dados da planta com o ID
            for (Planta p : listaPlantas) {
                if (p.getId().equals(idBusca)) {
                    System.out.println(p); // toString polimórfico é chamado aqui
                }
            }
        } else {
            // F.2 - Planta com ID não encontrada
            System.out.println("A planta com ID " + idBusca + " não existe. Considere que " + idBusca + " será o ID inserido.");
        }

        sc.close();
    }
}
