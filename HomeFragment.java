package www.abhiandroidknowledge.blogspot.com.navigationbackpressedtogohomepagefragement;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by www.abhiandroidknowledge.blogspot.com on 18/7/18.
 */

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.common_fragment, container, false);
        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText("Home Fragment");
        return view;
    }
}
