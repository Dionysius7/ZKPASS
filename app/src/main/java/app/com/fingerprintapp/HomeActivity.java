package app.com.fingerprintapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity{
    String[] names= {"All Transactions","January","February","March","April","May","June","July","August","September","October","November","December"};
    String[] des ={"Transactions","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 10","item 11","item 12"};

    ArrayAdapter<String> adapter;

    Spinner sp;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sp = (Spinner)findViewById(R.id.spinner);
        description = (TextView)findViewById(R.id.textViewHome);

        adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,names);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0: description.setText(des[i]);
                        break;
                    case 1:description.setText(des[i]);
                        break;
                    case 2:description.setText(des[i]);
                        break;
                    case 3:description.setText(des[i]);
                        break;
                    case 4:description.setText(des[i]);
                        break;
                    case 5:description.setText(des[i]);
                        break;
                    case 6:description.setText(des[i]);
                        break;
                    case 7:description.setText(des[i]);
                        break;
                    case 8:description.setText(des[i]);
                        break;
                    case 9:description.setText(des[i]);
                        break;
                    case 10:description.setText(des[i]);
                        break;
                    case 11:description.setText(des[i]);
                        break;
                    case 12:description.setText(des[i]);
                        break;
                    case 13:description.setText(des[i]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
