package markup;

public class Text implements BBCodeInterface {  //class for text storing
    String text;
    public Text (String text) {
        this.text = text;
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        sb.append(text);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(text);
    }
}
