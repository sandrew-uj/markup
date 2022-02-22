package markup;

import java.util.List;

class Strong extends MarkUp implements BBCodeInterface {
    private static final String TAG = "b";
    private static final String MARK = "__";

    public Strong(List<BBCodeInterface> list) {
        super(list);
    }

    @Override
    String getTag() {return TAG;}

    @Override
    String getMark() {return MARK;}
}
