package kedaxunfei.fta.com.testfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nian on 18/3/12.
 */

public class OneFragment extends Fragment {

    public static final String TAG = "about_fragment";

    @BindView(R.id.textView)
    TextView mTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: one");
        View inflate = inflater.inflate(R.layout.fragment_test, container, false);
        ButterKnife.bind(this, inflate);
        mTextView.setText("one");
        return inflate;
    }

    @OnClick(R.id.button)
    void addFragment() {
        addMyFragment();
    }

    @OnClick(R.id.button2)
    void clearFragment() {
        getActivity().getSupportFragmentManager().popBackStackImmediate(null,1);
    }

    @OnClick(R.id.button3)
    void aboutCount() {
        int backStackEntryCount = getActivity().getSupportFragmentManager().getBackStackEntryCount();
        Log.i(TAG, "MyFragment aboutCount: count=" + backStackEntryCount);

    }

    private void addMyFragment() {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_fl, new TwoFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, " onAttach: one");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: one");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated: one");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: one");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: one");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: one");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: one");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView: one");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: one");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: one");
    }
}
