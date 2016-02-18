package city.stage.com.hitungbmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by indomegabyte on 15/02/16.
 */
public class Calculator extends ActionBarActivity implements View.OnClickListener {
    Button button2;
    TextView tvBerat;
    EditText etBerat;
    TextView tvTinggi;
    EditText etTinggi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatoract);

        etTinggi =(EditText)findViewById(R.id.etTinggi);

        etBerat= (EditText)findViewById(R.id.etBerat);

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
            }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button2){
            String a = etBerat.getText().toString();
            String b = etTinggi.getText().toString();

            if (a.equals("")){
                Toast.makeText(this,"Berat badan masih kosong",Toast.LENGTH_SHORT).show();
            }
            else if (b.equals("")){
                Toast.makeText(this,"Tinggi badan masih kosong",Toast.LENGTH_SHORT).show();

            }

            else {
                double c = Double.parseDouble(a);
                double d = Double.parseDouble(b);


                if (d>=3) {
                    d = d/100;
                }

                double bmi = c/(d*d);

                Intent intent = new Intent(this,Result.class);
                intent.putExtra("tinggi badan", d);
                intent.putExtra("body mass index", bmi);
                startActivity(intent);

            }



          //  Toast.makeText(this, "BMI : " + String.format("%.2f", bmi), Toast.LENGTH_SHORT).show();


        }
    }
}


