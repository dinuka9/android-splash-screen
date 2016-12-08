package lk.dinuka.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lk.dinuka.splash.ads.ADManager;
/**
 * Created by Dinuka on 12/3/16.
 */
public class MainActivity extends AppCompatActivity {

    ADManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = new ADManager(this);
        manager.initAd();
    }

    @Override
    public void onPause() {
        manager.onPause();
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        manager.onResume();
    }

    @Override
    public void onDestroy() {
        manager.onDestroy();
        super.onDestroy();
    }
}
