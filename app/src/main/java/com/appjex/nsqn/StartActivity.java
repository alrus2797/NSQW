package com.appjex.nsqn;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity{

    private EditText txt_usuario;
    //private EditText txt_telefono;
    private Button btn_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Tipo de letra del nombre de la app
        TextView an = (TextView) findViewById(R.id.app_name);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/calamity.ttf");
        an.setTypeface(custom_font);

        //referencias
        txt_usuario = (EditText) findViewById(R.id.user_name);
        //txt_telefono = (EditText) findViewById(R.id.phone_number);
        btn_ingresar = (Button) findViewById(R.id.btn_init);

        //intents
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);

                intent.putExtra("Usuario", txt_usuario.getText().toString());
                //intent.putExtra("Celular", txt_telefono.getText().toString());
                startActivityForResult(intent, 0);
            }
        });

    }
}
