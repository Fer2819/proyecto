package com.example.ap11;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.activity_main, menu);
        return true;
    }

    //metodo que llama a otro Activity
    public boolean onOptionsItemSelected(MenuItem mi){
//evalua la opcionelejida al presionar la tecla menu
        switch(mi.getItemId()){
            case R.id.menu_settings:
                /*si la opcion seleccionada corresponde al parametro
                 * R.id.menu_settings , entonces crea un nuevo
                 * Intent el cual recibe dos parametros de entrada,
                 * el primero corresponde a la clase actual P1.this, y
                 * el segundo a la clase a la que se desea acceder
                 * P2.class, la cual es un Activity*/
                Intent miIntent1 = new Intent(MainActivity.this,P2.class);
                /*este metodo inicia la ejecucion del Activity, y
                 * recibe como parametro de entrada un Intent*/
                startActivity(miIntent1);
                break;
        }
        return true;
    }
}
