import java.util.Random;

/**
 * Controla a lógica do jogo
 */
public class Jogo
{
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador){

        this.jogador = jogador;

        Random rand = new Random();

        this.numeroSecreto = rand.nextInt(100)+1;
    }

    public String jogar(int tentativa){

        jogador.incrementarTentativas();

        if(tentativa == numeroSecreto){

            int pontos = 100 - jogador.getTentativas() * 10;

            if(pontos < 0){pontos = 0;}

            jogador.atualizarPontuacao(pontos);

            return "Acertou!";

        }

        else if( tentativa < numeroSecreto ){
            return "O número secreto é maior.";
        }

        else{
            return "O número secreto é menor.";
        }
    }
}