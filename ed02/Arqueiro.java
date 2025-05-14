

/**
 * Arqueiro com ataques rápidos e críticos.
 */
public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 120, 18);
    }

    @Override
    public void defender(int dano) {
        this.hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
    }
}