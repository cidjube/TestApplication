package com.example.test.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaPrincipal extends AppCompatActivity {
    private static final String TAG = "DemoTesteApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        Button btn = (Button) findViewById(R.id.btnOK);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Esta eh uma mensagem de Teste");
                Toast.makeText(getApplicationContext(), "Isso eh um teste", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
