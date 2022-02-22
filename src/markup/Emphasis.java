package markup;

import java.util.List;

public class Emphasis extends MarkUp implements BBCodeInterface {   //class for emphasis
    private static final String TAG = "i";
    private static final String MARK = "*";

    public Emphasis (List<BBCodeInterface> list) {
        super(list);
    }

    @Override
    String getTag() {return TAG;}

    @Override
    String getMark() {return MARK;}
}
