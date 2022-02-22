package markup;

import java.util.List;

class Strikeout extends MarkUp implements BBCodeInterface {
    private static final String TAG = "s";
    private static final String MARK = "~";

    public Strikeout(List<BBCodeInterface> list) {
        super(list);
    }

    @Override
    String getTag() {return TAG;}

    @Override
    String getMark() {return MARK;}
}
