package edu.edisontubac.android.ultimoproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Factura extends AppCompatActivity {

    private TextView txt_CocaCola,txt_AguaPura,txt_HotDog,txt_Hamburguesas,txt_Chevere,txt_PapasFritas,txt_Licuados,txt_Nachos,txt_Total,txt_Total2,txt_Total3,txt_Total4,txt_Total5,txt_Total6,txt_Total7,txt_Total8,granTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        txt_CocaCola=(TextView) findViewById(R.id.txt_CocaCola);
        txt_AguaPura=(TextView) findViewById(R.id.txt_AguaPura);
        txt_HotDog=(TextView) findViewById(R.id.txt_HotDog);
        txt_Hamburguesas=(TextView) findViewById(R.id.txt_Hamburguesas);
        txt_Chevere=(TextView) findViewById(R.id.txt_Chevere);
        txt_PapasFritas=(TextView) findViewById(R.id.txt_PapasFritas);
        txt_Licuados=(TextView) findViewById(R.id.txt_Licuados);
        txt_Nachos=(TextView) findViewById(R.id.txt_Nachos);
        txt_Total=(TextView) findViewById(R.id.txt_Total);
        txt_Total2=(TextView) findViewById(R.id.txt_Total2);
        txt_Total3=(TextView) findViewById(R.id.txt_Total3);
        txt_Total4=(TextView) findViewById(R.id.txt_Total4);
        txt_Total5=(TextView) findViewById(R.id.txt_Total5);
        txt_Total6=(TextView) findViewById(R.id.txt_Total6);
        txt_Total7=(TextView) findViewById(R.id.txt_Total7);
        txt_Total8=(TextView) findViewById(R.id.txt_Total8);
        granTotal=(TextView) findViewById(R.id.granTotal);



        Bundle bundle=this.getIntent().getExtras();
        txt_CocaCola.setText(bundle.getString("CocaCola1").toString());
        Double total=Double.parseDouble(bundle.getString("CocaCola1"))*10;
        txt_Total.setText(total.toString());

        Bundle bundle2=this.getIntent().getExtras();
        txt_AguaPura.setText(bundle2.getString("AguaPura1").toString());
        Double total2=Double.parseDouble(bundle2.getString("AguaPura1"))*7;
        txt_Total2.setText(total2.toString());

        Bundle bundle3=this.getIntent().getExtras();
        txt_HotDog.setText(bundle3.getString("HotDog1").toString());
        Double total3=Double.parseDouble(bundle3.getString("HotDog1"))*16;
        txt_Total3.setText(total3.toString());

        Bundle bundle4=this.getIntent().getExtras();
        txt_Hamburguesas.setText(bundle4.getString("Hamburguesa1").toString());
        Double total4=Double.parseDouble(bundle4.getString("Hamburguesa1"))*32;
        txt_Total4.setText(total4.toString());

        Bundle bundle5=this.getIntent().getExtras();
        txt_Chevere.setText(bundle5.getString("Chevere1").toString());
        Double total5=Double.parseDouble(bundle5.getString("Chevere1"))*13;
        txt_Total5.setText(total5.toString());

        Bundle bundle6=this.getIntent().getExtras();
        txt_PapasFritas.setText(bundle6.getString("PapasFritas1").toString());
        Double total6=Double.parseDouble(bundle6.getString("PapasFritas1"))*19;
        txt_Total6.setText(total6.toString());

        Bundle bundle7=this.getIntent().getExtras();
        txt_Licuados.setText(bundle7.getString("Licuados1").toString());
        Double total7=Double.parseDouble(bundle7.getString("Licuados1"))*12;
        txt_Total7.setText(total7.toString());

        Bundle bundle8=this.getIntent().getExtras();
        txt_Nachos.setText(bundle8.getString("Nachos1").toString());
        Double total8=Double.parseDouble(bundle8.getString("Nachos1"))*17;
        txt_Total8.setText(total8.toString());


    }
}
