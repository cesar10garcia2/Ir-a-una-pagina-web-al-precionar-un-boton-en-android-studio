package com.codigojavalibre.cesargarcia.lanzarunnavegadorweb_intent_implicito;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.boton_navegacion);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //El brindamos el dato necesario a Uri
        Uri uriUrl = Uri.parse("http://www.codigojavalibre.com/");
        //Especificamos la accion a realizar con el ACTION_VIEW
        //para que elija lo mas razonable
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);
    }
}
