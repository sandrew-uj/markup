package markup;

import java.util.List;

public abstract class AbstractList implements ListItemInterface {   //abstract class for lists
    protected List<ListItem> list;

    protected AbstractList(List<ListItem> list) {
        this.list = list;
    }

    abstract String getOpenerTag();
    abstract String getCloserTag();

    public void toBBCode(StringBuilder sb) {
        sb.append(getOpenerTag());
        for (var elem: list) {
            elem.toBBCode(sb);
        }
        sb.append(getCloserTag());
    }
}
