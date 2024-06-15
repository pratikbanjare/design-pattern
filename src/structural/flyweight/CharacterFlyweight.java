package structural.flyweight;

public class CharacterFlyweight {

    private final char symbol;
    private final int size;
    private final String font;
    private final String style;


    public CharacterFlyweight(char symbol, int size, String font, String style) {
        this.symbol = symbol;
        this.size = size;
        this.font = font;
        this.style = style;
    }

    public void display(int pos){
        System.out.println("Character - "+ symbol + ", with font size - " + size + ", font type - " + font+", and char style - " + style+", at pos - "+pos);
    }

    public char getSymbol() {
        return symbol;
    }

    public int getSize() {
        return size;
    }

    public String getFont() {
        return font;
    }

    public String getStyle() {
        return style;
    }
}
