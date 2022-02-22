package markup;

import java.util.List;

public class OrderedList extends AbstractList  {
    private static final String OPENER_TAG = "[list=1]";
    private static final String CLOSER_TAG = "[/list]";

    public OrderedList(List<ListItem> list) {
        super(list);
    }

    @Override
    String getOpenerTag() {return OPENER_TAG;}

    @Override
    String getCloserTag() {return CLOSER_TAG;}

}
