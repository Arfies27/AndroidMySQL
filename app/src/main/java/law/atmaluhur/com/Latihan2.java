package law.atmaluhur.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Latihan2 extends AppCompatActivity {
    EditText nilai1;
    EditText nilai2;
    TextView hasil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);

        nilai1 = (EditText) findViewById(R.id.nilai1);
        nilai2 = (EditText) findViewById(R.id.nilai2);
        hasil1 = (TextView) findViewById(R.id.hasil1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void hitung (View View){
        Integer a = Integer.parseInt(nilai1.getText().toString());
        Integer b = Integer.parseInt(nilai2.getText().toString());
        Integer c = a * b * 2;
        hasil1.setText("Hasil1 = "+c);
    }
}