package kedaxunfei.fta.com.testfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nian on 18/3/12.
 */

public class MyFragment extends Fragment {

    public static final String TAG = "about_fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_test, container, false);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    @OnClick(R.id.button)
    void addFragment() {
        addMyFragment();
    }

    @OnClick(R.id.button2)
    void clearFragment() {
//        getActivity().getSupportFragmentManager().popBackStackImmediate(null,1);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_fl,new SecondFragment()).commit();
    }

    @OnClick(R.id.button3)
    void aboutCount() {
        int backStackEntryCount = getActivity().getSupportFragmentManager().getBackStackEntryCount();
        Log.i(TAG, "MyFragment aboutCount: count=" + backStackEntryCount);

    }

    private void addMyFragment() {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_fl, new SecondFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}
