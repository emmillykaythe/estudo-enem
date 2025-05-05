import java.util.Scanner;

public class QuizPorcentagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        String[][] perguntas = {
            {
                "1. Um produto custa R$80,00. Se ele tiver um desconto de 10%, qual será o valor final?",
                "a) R$70,00", "b) R$72,00", "c) R$74,00", "d) R$76,00", "e) R$78,00",
                "b"
            },
            {
                "2. João acertou 18 das 20 questões de uma prova. Qual foi seu aproveitamento em porcentagem?",
                "a) 80%", "b) 85%", "c) 90%", "d) 95%", "e) 100%",
                "c"
            },
            {
                "3. Um salário de R$2.000 sofreu aumento de 8% e depois mais 5%. Qual é o salário final?",
                "a) R$2.100", "b) R$2.160", "c) R$2.268", "d) R$2.200", "e) R$2.340",
                "c"
            },
            {
                "4. Um comerciante quer obter 30% de lucro sobre R$150. Por quanto ele deve vender o produto?",
                "a) R$180", "b) R$190", "c) R$195", "d) R$200", "e) R$210",
                "c"
            },
            {
                "5. Um produto que custa R$200 tem dois descontos: 10% à vista e 5% para clientes fidelizados. Quanto custa no final?",
                "a) R$180,00", "b) R$171,00", "c) R$170,00", "d) R$175,00", "e) R$173,00",
                "b"
            }
        };

        while (continuar) {
            int acertos = 0;
            System.out.println("🧠 Quiz de Porcentagem - Nível ENEM");
            System.out.println("----------------------------------");

            for (String[] pergunta : perguntas) {
                System.out.println("\n" + pergunta[0]);
                for (int i = 1; i <= 5; i++) {
                    System.out.println(pergunta[i]);
                }

                System.out.print("Sua resposta (a, b, c, d, e): ");
                String resposta = scanner.nextLine().trim().toLowerCase();

                if (resposta.equals(pergunta[6])) {
                    System.out.println("Correto!");
                    acertos++;
                } else {
                    System.out.println("Errado! Resposta correta: " + pergunta[6]);
                }
            }

            System.out.println("\n🎯 Você acertou " + acertos + " de " + perguntas.length + " perguntas.");

            System.out.print("Deseja tentar novamente? (s/n): ");
            String repetir = scanner.nextLine().trim().toLowerCase();
            continuar = repetir.equals("s");
        }

        System.out.println("👋 Até a próxima!");
        scanner.close();
    }
}
