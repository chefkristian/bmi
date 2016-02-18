package city.stage.com.hitungbmi;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by indomegabyte on 16/02/16.
 */
public class HistoryList extends AppCompatActivity {
    ArrayList<Double> mArraylist;
    ArrayAdapter<Double> mAdapter;
    ListView mListview;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_list);
        mListview= (ListView)findViewById(R.id.history);

        mArraylist= new ArrayList<Double>();
        mArraylist.add(3.3);
        mArraylist.add(21.24);

        mAdapter= new ArrayAdapter<Double>(this,android.R.layout.simple_list_item_1,mArraylist);

        mListview.setAdapter(mAdapter);

    }
}
