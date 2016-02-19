package city.stage.com.hitungbmi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * Created by indomegabyte on 15/02/16.
 */
public class Result extends Activity implements View.OnClickListener {
    TextView tvResult, tvKriteria;
    Button button3;
    double x, y;

    private final int SPLASH_DISPLAY_LENGTH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        tvResult=(TextView)findViewById(R.id.tvResult);
        tvKriteria= (TextView)findViewById(R.id.tvKriteria);
        tvKriteria.setOnClickListener(this);
        tvResult.setOnClickListener(this);

       // button3=(Button)findViewById(R.id.button3);
      // button3.setOnClickListener(this);

        x = this.getIntent().getExtras().getDouble("body mass index");
        y = this.getIntent().getExtras().getDouble("tinggi badan");

        tvResult.setText(String.format("%.2f", x));

        if (x < 18.5) {
            tvKriteria.setText("Underweight");
        }
        else if (x>=18.5 && x<23) {
            tvKriteria.setText("Normal weight");
        }
        else if (x>=23 && x<25) {
            tvKriteria.setText("Overweight");

        } else if (x>=25 && x<30) {
            tvKriteria.setText("Obese Class I");
        }
        else if (x>=30) {
            tvKriteria.setText("Obese Class II");
        }
        else if (x>=40){
            tvKriteria.setText(("Obese Class III"));
        }


        ImageView animationTarget = (ImageView) this.findViewById(R.id.testImage);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_around_center);
        animationTarget.startAnimation(animation);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent intent2 = new Intent(Result.this, Bb_IDEAL.class);
                intent2.putExtra("tinggibadan", y);
                startActivity(intent2);
            }
        }, SPLASH_DISPLAY_LENGTH);


    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.tvKriteria) {

            Intent intent1 = new Intent(this, Bb_IDEAL.class);
            intent1.putExtra("tinggibadan",y);

            startActivity(intent1);


            //if (view.getId()==R.id.button3);

            //Intent intent = new Intent(this,HistoryList.class);
            //startActivity(intent);


        }
        if (view.getId()==R.id.tvResult){
            Intent intent2 = new Intent(this, Bb_IDEAL.class);
            intent2.putExtra("tinggibadan",y);
            startActivity(intent2);
        }
    }
}