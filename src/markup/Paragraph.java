package markup;

import java.util.List;

public class Paragraph extends MarkUp implements ListItemInterface{
    private static final String TAG = "";
    private static final String MARK = "";

    public Paragraph(List<BBCodeInterface> list) {
        super(list);
    }

    @Override
    String getTag() {return TAG;}
    @Override
    String getMark() {return MARK;}

}

