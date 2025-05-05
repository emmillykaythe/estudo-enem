package redação;
import java.io.*;
import java.util.*;

public class SorteioTemas {
    public static void main(String[] args) {
        // Caminho para o arquivo de temas
        String arquivoTemas = "C:\\Users\\Micro\\Documents\\estudo-enem\\redação\\temas.txt";
        
        // Criar uma lista para armazenar os temas
        List<String> temas = new ArrayList<>();
        
        // Tentar ler o arquivo de temas
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoTemas))) {
            String linha;
            
            // Ler o arquivo linha por linha e adicionar os temas à lista
            while ((linha = br.readLine()) != null) {
                temas.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }
        
        // Verificar se a lista está vazia
        if (temas.isEmpty()) {
            System.out.println("Não há temas no arquivo.");
            return;
        }
        
        // Gerar um número aleatório para escolher um tema
        Random random = new Random();
        int indiceSorteado = random.nextInt(temas.size());
        
        // Mostrar o tema sorteado
        System.out.println("Tema sorteado: ");
        System.out.println(temas.get(indiceSorteado));
    }
}
