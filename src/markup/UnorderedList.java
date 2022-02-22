package markup;

import java.util.List;

public class UnorderedList extends AbstractList {       //unordered list class
    private static final String OPENER_TAG = "[list]";
    private static final String CLOSER_TAG = "[/list]";

    public UnorderedList(List<ListItem> list) {
        super(list);
    }

    @Override
    String getOpenerTag() {return OPENER_TAG;}

    @Override
    String getCloserTag() {return CLOSER_TAG;}
}
