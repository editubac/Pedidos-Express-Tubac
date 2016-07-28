package edu.edisontubac.android.ultimoproyecto;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ordenar extends AppCompatActivity {

    private EditText txtCocaCola;
    private EditText txtAguaPura;
    private EditText txtHotDog;
    private EditText txtHamburguesa;
    private EditText txtChevere;
    private EditText txtPapasFritas;
    private EditText txtLicuados;
    private EditText txtNachos;
    private Button btnOrdenar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenar);

        txtCocaCola=(EditText) findViewById(R.id.txtCocaCola);
        txtAguaPura=(EditText) findViewById(R.id.txtAguaPura);
        txtHotDog=(EditText) findViewById(R.id.txtHotDog);
        txtHamburguesa=(EditText) findViewById(R.id.txtHamburguesa);
        txtChevere=(EditText) findViewById(R.id.txtChevere);
        txtPapasFritas=(EditText) findViewById(R.id.txtPapasFritas);
        txtLicuados=(EditText) findViewById(R.id.txtLicuados);
        txtNachos=(EditText) findViewById(R.id.txtNachos);

        btnOrdenar2=(Button) findViewById(R.id.btnOrdenar2);
        btnOrdenar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Click en Boton Ordenar",Snackbar.LENGTH_SHORT).show();

                Intent intent = new Intent(Ordenar.this,Factura.class);

                intent.putExtra("CocaCola1",txtCocaCola.getText().toString());
                intent.putExtra("AguaPura1",txtAguaPura.getText().toString());
                intent.putExtra("HotDog1",txtHotDog.getText().toString());
                intent.putExtra("Hamburguesa1",txtHamburguesa.getText().toString());
                intent.putExtra("Chevere1",txtChevere.getText().toString());
                intent.putExtra("PapasFritas1",txtPapasFritas.getText().toString());
                intent.putExtra("Licuados1",txtLicuados.getText().toString());
                intent.putExtra("Nachos1",txtNachos.getText().toString());

                startActivity(intent);

            }
        });


    }
}
