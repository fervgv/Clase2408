package cl.ipvg.com.clase2408;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btaceptar1;
    EditText etnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent =new Intent(this,MainDos.class);
       btaceptar1=(Button) findViewById(R.id.btButon);
       etnombre=(EditText) findViewById(R.id.editText);
       intent.putExtra("nombre" ,etnombre.getText().toString());
       btaceptar1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            startActivity(intent);
           }
       });
    }
}