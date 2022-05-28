package law.atmaluhur.latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText kolom1;
    EditText kolom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kolom1 = (EditText) findViewById(R.id.kolom1);
        kolom2 = (EditText) findViewById(R.id.kolom2);
    }

    public void pindah(View View){
        String klm1 = kolom1.getText().toString();
        String klm2 = kolom2.getText().toString();
        if (klm1.equals("admin") && klm2.equals("admin")) {
            Intent i = new Intent( this, Tujuan.class);
            startActivity(i);
        }else {
            Intent i = new Intent( this, MainActivity .class);
            startActivity(i);
        }
    }
}