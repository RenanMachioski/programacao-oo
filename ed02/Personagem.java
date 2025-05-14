

/**
 * Classe base para personagens do RPG.
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Ataca outro personagem.
     * @param inimigo o personagem inimigo.
     */
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }

    /**
     * Recebe dano.
     * @param dano o dano a sofrer.
     */
    public abstract void defender(int dano);

    /**
     * Usa habilidade especial.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status do personagem.
     */
    public void status() {
        System.out.println(nome + " - HP: " + hp);
    }
}