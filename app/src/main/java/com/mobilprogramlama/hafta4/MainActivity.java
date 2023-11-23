package com.mobilprogramlama.hafta4;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    Button btn;
    Float sayi1, sayi2, toplam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.button);
        edt1=(EditText) findViewById(R.id.editText);
        edt2=(EditText) findViewById(R.id.editText1);
        edt3=(EditText) findViewById(R.id.editText2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Float.parseFloat(edt1.getText().toString()) ;
                sayi2=Float.parseFloat(edt2.getText().toString()) ;
                toplam=sayi1+sayi2;
                edt3.setText(String.valueOf(toplam));
            }
        });
    }
}