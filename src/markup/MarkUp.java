package markup;

import java.util.List;

public abstract class MarkUp {      //abstract class with toBBCode() and toMarkdown() methods
    protected List<BBCodeInterface> list;

    protected MarkUp(List<BBCodeInterface> list) {
        this.list = list;
    }

    abstract String getMark();
    abstract String getTag();

    public void toMarkdown(StringBuilder sb) {
        sb.append(getMark());
        for (var elem: list) {
            elem.toMarkdown(sb);
        }
        sb.append(getMark());
    }

    public void toBBCode(StringBuilder sb) {
        if (!getTag().equals("")) {
            sb.append(String.format("[%s]", getTag()));
        }
        for (var elem: list) {
            elem.toBBCode(sb);
        }
        if (!getTag().equals("")) {
            sb.append(String.format("[/%s]", getTag()));
        }
    }
}
