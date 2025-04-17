import java.util.ArrayList;

/**
 * Placar geral do jogo.
 */
public	class	Placar
{

    private ArrayList<Jogador>	ranking;

    public Placar(	)
    {
        ranking = new	ArrayList<>();
    }

    public void adicionarJogador(Jogador j){
        ranking.add(j);

    }

    public void mostrarRanking( ) {

        System.out.println("\nRanking:");
        for( Jogador j : ranking ){
            System.out.println(j.getNome()+" - "+j.getPontuacao()+" pontos");
        }
    }
}