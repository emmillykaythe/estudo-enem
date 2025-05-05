import java.util.Scanner;

public class QuizRazoProporcao {

    public static void main(String[] args) {
        // Perguntas e respostas do quiz
        String[][] questions = {
            {"Em uma escola, a razão de alunos do sexo masculino para alunos do sexo feminino é 2:3. Se o número total de alunos é 100, quantos alunos são do sexo masculino?", "40"},
            {"Uma receita pede 4 xícaras de farinha para 2 xícaras de açúcar. Qual é a razão entre as xícaras de farinha e as de açúcar?", "2:1"},
            {"Se um mapa tem uma escala de 1:100.000, quanto de distância real corresponde a 2 cm no mapa?", "2 km"},
            {"Em uma sala de aula, a razão de alunos que gostam de matemática para os que não gostam é 3:7. Se há 100 alunos na sala, quantos alunos não gostam de matemática?", "70"},
            {"Uma farmácia vende 3 pacotes de remédio por R$15,00. Qual é o preço de 5 pacotes?", "25"}
        };

        int score = 0;  // Contador de respostas corretas
        Scanner scanner = new Scanner(System.in);

        // Loop para exibir todas as perguntas e coletar respostas
        for (int i = 0; i < questions.length; i++) {
            String question = questions[i][0];
            String correctAnswer = questions[i][1];

            System.out.println("Pergunta " + (i + 1) + ": " + question);
            System.out.print("Digite sua resposta: ");
            String userAnswer = scanner.nextLine().trim();

            // Verificando se a resposta do usuário está correta
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                score++;
                System.out.println("Resposta correta!\n");
            } else {
                System.out.println("Resposta incorreta! A resposta correta é: " + correctAnswer + "\n");
            }
        }

        // Exibindo o resultado final
        System.out.println("Você terminou o quiz!");
        System.out.println("Sua pontuação final é: " + score + " de " + questions.length);
        
        scanner.close();
    }
}
