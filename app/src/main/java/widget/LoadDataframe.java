package widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.item.googleplay.R;

/**
 * 创建者: hiboy
 * 创建时间: 2016/9/12.
 */
public class LoadDataframe extends FrameLayout{

    public LoadDataframe(Context context) {
        this(context,null);
    }

    public LoadDataframe(Context context, AttributeSet attrs) {
        super(context, attrs);
        View loadview = View.inflate(context, R.layout.pager_loading,null);
        addView(loadview);
    }

}
