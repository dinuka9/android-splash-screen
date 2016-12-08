package lk.dinuka.splash.ads;

import android.app.Activity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import lk.dinuka.splash.R;
/**
 * Created by Dinuka on 12/3/16.
 */
public class ADManager {
    private AdView mAdView;
    private Activity context;

    public ADManager(Activity context){
        this.context = context;
    }
    public void initAd(){
        MobileAds.initialize(context, String.valueOf(R.string.banner_ad_unit_id));
        mAdView = (AdView) context.findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
    }
    public void onPause(){
        if (mAdView != null) {
            mAdView.pause();
        }
    }
    public void onResume(){
        if (mAdView != null) {
            mAdView.resume();
        }
    }
    public void onDestroy(){
        if (mAdView != null) {
            mAdView.destroy();
        }
    }
}
