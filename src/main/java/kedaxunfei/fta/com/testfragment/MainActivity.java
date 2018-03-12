package kedaxunfei.fta.com.testfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_fl, new OneFragment()).commit();

    }

    @OnClick(R.id.main_clear)
    void mainClear() {
        getSupportFragmentManager().popBackStackImmediate(null, 1);
    }

    @OnClick(R.id.main_count)
    void mainCount() {
        int backStackEntryCount = getSupportFragmentManager().getBackStackEntryCount();
        Log.i(MyFragment.TAG, "MainActivity mainCount: count=" + backStackEntryCount);
    }
}
