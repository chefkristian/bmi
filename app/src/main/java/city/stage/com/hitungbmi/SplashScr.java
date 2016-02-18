package city.stage.com.hitungbmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


/**
 * Created by indomegabyte on 18/02/16.
 */
public class SplashScr extends AppCompatActivity {


    private final int SPLASH_DISPLAY_LENGTH = 1500;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();
        ImageView image = (ImageView)findViewById(R.id.slashscreen);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation1);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScr.this, MainActivity.class);
                SplashScr.this.startActivity(mainIntent);
                SplashScr.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

           }

}