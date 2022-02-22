package markup;

import java.util.List;

public class ListItem {
    private static final String TAG = "[*]";
    private final List<ListItemInterface> list;

    public ListItem(List<ListItemInterface> list) {
        this.list = list;
    }

    public void toBBCode(StringBuilder sb) {
        sb.append(TAG);
        for (var elem: list) {
            elem.toBBCode(sb);
        }
    }
}
