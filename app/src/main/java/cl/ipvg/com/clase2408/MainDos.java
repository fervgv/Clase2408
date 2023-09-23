package cl.ipvg.com.clase2408;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainDos extends AppCompatActivity {
        Button btaceptar2;
        String stnombre="";
        TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);

    btaceptar2= findViewById(R.id.btAceptar);
    tvResultado= findViewById(R.id.tvResultado);
        Context context = getApplicationContext();
        Bundle intentR= this.getIntent().getExtras();
        if (intentR != null) {
            stnombre=intentR.getString("nombre".toString());
            Toast.makeText( context, "su nombre es , " + stnombre,Toast.LENGTH_SHORT).show();
            tvResultado.setText("su nombre es : "+ stnombre);
        }

    Intent intent= new Intent(this, MainActivity.class);
        btaceptar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}