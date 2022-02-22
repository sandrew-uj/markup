package markup;

public interface BBCodeInterface {      //interface for classes, supporting BBCode and Markdown
    void toBBCode(StringBuilder sb);
    void toMarkdown(StringBuilder sb);
}
