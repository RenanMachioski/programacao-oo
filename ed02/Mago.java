

/**
 * Mago com ataque mágico e habilidade de fogo.
 */
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 25);
    }

    @Override
    public void defender(int dano) {
        this.hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo!");
    }
}