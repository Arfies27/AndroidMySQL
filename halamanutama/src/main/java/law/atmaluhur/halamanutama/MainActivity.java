package law.atmaluhur.halamanutama;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makanan(View View) {
        Intent i = new Intent( this, Makanan.class);
        startActivity(i);
    }

    public void minuman(View View) {
        Intent i = new Intent(this, Minuman.class);
        startActivity(i);
    }

    public void order(View View) {
        Intent i = new Intent(this, Order.class);
        startActivity(i);
    }

    public void info(View View) {
        Intent i = new Intent(this, Info.class);
        startActivity(i);
    }
}