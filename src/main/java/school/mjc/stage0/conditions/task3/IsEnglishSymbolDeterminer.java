package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if ((symbol == 'E' | symbol == 'N' | symbol == 'G') || (symbol == 'e' | symbol == 'n' | symbol == 'g')) {
            System.out.println("English");
        }
        else {
            System.out.println("Non english");
        }
    }
}
