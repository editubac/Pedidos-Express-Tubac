package edu.edisontubac.android.ultimoproyecto;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainApp extends AppCompatActivity {

    private Button btnVerProductos;
    private Button btnOrdenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        btnVerProductos = (Button) findViewById(R.id.btnVerProductos);
        btnVerProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Click en Boton Ver Productos",Snackbar.LENGTH_SHORT).show();

                Intent intent=new Intent(MainApp.this,Menu.class);
                startActivity(intent);
            }
        });



        btnOrdenar = (Button) findViewById(R.id.btnOrdenar);
        btnOrdenar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Snackbar.make(v,"Click en Boton Ordenar",Snackbar.LENGTH_SHORT).show();

                Intent intent=new Intent(MainApp.this,Ordenar.class);
                startActivity(intent);

            }
        }));

    }
}
