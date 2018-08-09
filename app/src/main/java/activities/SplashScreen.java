package activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.vt.vedamurthy.vtranslator.R;

public class SplashScreen extends AppCompatActivity {

    private final String TAG = SplashScreen.class.getSimpleName();

    private static final int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        activityNavigation();
    }


    private void activityNavigation()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                start();
            }
        }, SPLASH_TIME_OUT);
    }

    private void start() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
