package p2202201;

import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID da estrela que deseja verificar:");
        String id = sc.nextLine();

        // Cria objeto com o ID a ser buscado
        CorpoCeleste procurado = new CorpoCeleste(id);

        // Lê o arquivo e converte em um Map de corpos celestes
        Set<String> dadosLidos = LerArquivo.retornaStrings("c:/corposCelestes.txt");

        Utils utils = new Utils();
        Map<String, CorpoCeleste> corpos = utils.retornaDados(dadosLidos);

        // Verifica se o corpo celeste existe usando o método da classe Utils
        if (Utils.Existe(corpos.values(), procurado)) {
            CorpoCeleste encontrado = corpos.get(id);
            System.out.println(encontrado);
        } else {
            System.out.println("Corpo celeste com ID '" + id + "' não encontrado.");
        }
    }
}
