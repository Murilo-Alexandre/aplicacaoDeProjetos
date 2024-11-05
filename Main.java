public class Main {
    public static void main(String[] args) {
        
        // Teste Singleton
        GameConfig config = GameConfig.getInstance();
        System.out.println("Dificuldade: " + config.getDifficulty());
        System.out.println("Modo: " + config.getMode());

        // Teste Strategy
        Character character = new Character(new StandardAttack());
        character.performAttack();

        character.setAttackStrategy(new MagicAttack());
        character.performAttack();

        character.setAttackStrategy(new FuryAttack());
        character.performAttack();
    }
}