package city.stage.com.hitungbmi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * Created by indomegabyte on 15/02/16.
 */
public class Result extends ActionBarActivity implements View.OnClickListener {
    TextView tvResult, tvKriteria;
    Button button3;
    double x, y;


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