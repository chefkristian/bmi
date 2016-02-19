package city.stage.com.hitungbmi;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by indomegabyte on 17/02/16.
 */
public class Bb_IDEAL extends Activity{
    TextView tvbb_ideal,tvbb_ideal2;
    double tinggi;
   // TextView saran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bb_ideal);

        tvbb_ideal = (TextView) findViewById(R.id.tvbb_ideal);
        tvbb_ideal2 = (TextView)findViewById(R.id.tvbb_ideal2);
        //saran = (TextView) findViewById(R.id.saran);
        //setTitle("Berat Badan Ideal");

        tinggi = this.getIntent().getExtras().getDouble("tinggibadan");

        double bb = 19*tinggi*tinggi;
        double bb2 =23*tinggi*tinggi;
        tvbb_ideal.setText(String.format("%.2f",bb));
        tvbb_ideal2.setText(String.format("%.2f",bb2));

    }

}
