package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import utils.UiUtils;
import widget.LoadDataframe;

/**
 * 创建者: hiboy
 * 创建时间: 2016/9/12.
 */
public class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LoadDataframe loadDataframe = new LoadDataframe(UiUtils.getContext());
        return loadDataframe;
    }
}
