package com.example.try_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombre, editTextpass;
    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Guarda el estado
        //match con la vista
        setContentView(R.layout.activity_main);
        //match de los widgets
        editTextNombre = findViewById(R.id.etUsuario); //asigna las variables con el id del widget
        editTextpass = findViewById(R.id.etPass);
        botonIngreso = findViewById(R.id.btnLogin);
        //Listener para la accion del boton se hara todo lo que este dentro del listener
        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = editTextNombre.getText().toString();
                String password = editTextpass.getText().toString();

                if(nombreUsuario.isEmpty() || password.isEmpty()){
                    //nombre de usuario vacio
                }else{
                    if (nombreUsuario.equals("mussgo") && password.equals("12345")) {
                        //imprimir bienvenido
                        mensaje("Los datos son erroneos");
                    }else{
                        //Imprimir datos erroneos
                        mensaje("Los datos son erroneos");
                    }
                }

            }
        });
    }

    public void mensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}
