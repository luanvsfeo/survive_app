package com.example.survivign_in_columbin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Application;
import android.content.res.Configuration;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class Menu extends AppCompatActivity {
    static Button btnComecar,btnSair,btnCarregar,btnConquistas;
    Button trocaLocale;
    static String btncarregarvariavel = "0"; //0->reseta - 1->continua

    private String mLanguageCode = "en";

    private static final String ARQUIVOSHAREDA1 = "ArquivoSharedA1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnComecar = (Button)findViewById(R.id.btnComecar);
        btnSair = (Button)findViewById(R.id.btnSair);
        btnCarregar = (Button)findViewById(R.id.btnCarregar);
        trocaLocale = (Button) findViewById(R.id.btnTrocaLocale);
        btnConquistas = (Button)findViewById(R.id.btnConquistas);
        trocaLocale.setText(Locale.getDefault().getLanguage());

        trocaLocale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Locale.getDefault().getLanguage()=="pt"){
                    Locale_en();
                }else{
                    Locale_pt();
                }

                //It is required to recreate the activity to reflect the change in UI.

            }
        });


        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncarregarvariavel = "0";
                Intent intent =  new Intent(v.getContext(),Conversa.class);
                startActivity(intent);
            }
        });

        btnCarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncarregarvariavel = "1";
                Intent intent =  new Intent(v.getContext(),Conversa.class);
                startActivity(intent);
            }
        });

        btnConquistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Conquistas.class);
                startActivity(i);
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });






    }




    public void Locale_en(){
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        // Create a new configuration object
        Configuration config = new Configuration();
        // Set the locale of the new configuration
        config.locale = locale;
        // Update the configuration of the Accplication context
        getResources().updateConfiguration(
                config,
                getResources().getDisplayMetrics()
        );
        recreate();
    }


    public void Locale_pt(){
        Locale locale = new Locale("pt");
        Locale.setDefault(locale);
        // Create a new configuration object
        Configuration config = new Configuration();
        // Set the locale of the new configuration
        config.locale = locale;
        // Update the configuration of the Accplication context
        getResources().updateConfiguration(
                config,
                getResources().getDisplayMetrics()

        );
        recreate();
    }
}
