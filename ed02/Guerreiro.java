
/**
 * Guerreiro com defesa forte e golpe duplo.
 */
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }

    @Override
    public void defender(int dano) {
        this.hp -= (dano / 2);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
    }
}