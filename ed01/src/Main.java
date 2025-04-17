import java.util.Scanner;

/**
 * Executa o jogo
 */
public class	Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        Placar placar = new Placar();

        System.out.println("Jogo de Adivinhação!");

        boolean jogarNovamente = true;

        while(jogarNovamente){

            System.out.print("\nDigite seu nome: ");

            String nomeJogador = teclado.nextLine();

            Jogador jogador = new Jogador(nomeJogador);

            Jogo jogo = new Jogo(jogador);

            boolean acertou = false;

            while( !acertou ){

                System.out.print("Digite um número entre 1 e 100: ");

                int tentativa = teclado.nextInt();

                teclado.nextLine();


                String resultado = jogo.jogar(tentativa);

                System.out.println(resultado);

                if(resultado.equals("Acertou!")){

                    acertou = true;

                }

            }

            System.out.println("\nParabéns, "+ jogador.getNome() + "!");

            System.out.println("Tentativas: " + jogador.getTentativas());

            System.out.println("Pontuação: " + jogador.getPontuacao());

            placar.adicionarJogador(jogador);

            System.out.print("\nDeseja jogar novamente? (sim/nao): ");

            String resposta = teclado.nextLine();

            jogarNovamente = resposta.equalsIgnoreCase("s");

        }

        placar.mostrarRanking();

        teclado.close();
    }
}