package com.example.survivign_in_columbin;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Carregar extends AppCompatActivity {

    private static final String ARQUIVOSHARED1 = "ArquivoShared1";
    private static final String ARQUIVOSHARED2 = "ArquivoShared2";
    private static final String ARQUIVOSHARED3 = "ArquivoShared3";
    private static final String ARQUIVOSHARED4 = "ArquivoShared4";
    private static final String ARQUIVOSHARED5 = "ArquivoShared5";
    private static final String ARQUIVOSHARED6 = "ArquivoShared6";
    private static final String ARQUIVOSHARED7 = "ArquivoShared7";
    private static final String ARQUIVOSHARED8 = "ArquivoShared8";
    private static final String ARQUIVOSHARED9 = "ArquivoShared9";
    private static final String ARQUIVOSHARED10 = "ArquivoShared10";
    private static final String ARQUIVOSHARED11 = "ArquivoShared11";
    private static final String ARQUIVOSHARED12 = "ArquivoShared12";
    private static final String ARQUIVOSHARED13 = "ArquivoShared13";
    private static final String ARQUIVOSHARED14 = "ArquivoShared14";
    private static final String ARQUIVOSHARED15 = "ArquivoShared15";
    private static final String ARQUIVOSHARED16 = "ArquivoShared16";
    private static final String ARQUIVOSHARED17 = "ArquivoShared17";
    private static final String ARQUIVOSHARED18 = "ArquivoShared18";
    private static final String ARQUIVOSHARED19 = "ArquivoShared19";
    private static final String ARQUIVOSHARED20 = "ArquivoShared20";
    static String carregarEscolhido = Conversa.carregarEscolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

            if (Conversa.carregarEscolhido!="0") {
                switch (Conversa.carregarEscolhido) {
                    case "A1":

                            Toast.makeText(Carregar.this, "Conquista: O Brincalhão", Toast.LENGTH_SHORT).show();

                        Conversa.dialogoA.setVisibility(View.VISIBLE);
                        Conversa.dialogoA.setText(R.string.dialogoA1);//coloca o texto antes de mostrar
                        Conversa.dialogo2.setVisibility(View.VISIBLE);
                        Conversa.dialogo2a.setVisibility(View.VISIBLE);
                        Conversa.dialogo2b.setVisibility(View.VISIBLE);
                        Conversa.dialogo2c.setVisibility(View.VISIBLE);
                        Conversa.B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                        Conversa.B2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                        Conversa.caixaresposta.setVisibility(View.GONE);
                        break;

                    case "A2":
                        SharedPreferences sharedPreferences2 = getSharedPreferences(ARQUIVOSHARED2, 0);
                        SharedPreferences.Editor editor2 = sharedPreferences2.edit();
                        String carregar2 = "2";
                        editor2.putString("carregar2", carregar2);
                        editor2.commit();

                        Conversa.dA.setVisibility(View.VISIBLE);
                        Conversa.dialogoA.setText(R.string.dialogoA2);//coloca o texto antes de mostrar
                        Conversa.d2.setVisibility(View.VISIBLE);
                        Conversa.d2a.setVisibility(View.VISIBLE);
                        Conversa.d2b.setVisibility(View.VISIBLE);
                        Conversa.d2c.setVisibility(View.VISIBLE);
                        Conversa.B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                        Conversa.B2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                        Conversa.caixaresposta.setVisibility(View.GONE);
                        break;

                    case "B1":
                        SharedPreferences sharedPreferences3 = getSharedPreferences(ARQUIVOSHARED3, 0);
                        SharedPreferences.Editor editor3 = sharedPreferences3.edit();
                        String carregar3 = "3";
                        editor3.putString("carregar3", carregar3);
                        editor3.commit();

                        Conversa.dB.setVisibility(View.VISIBLE);
                        Conversa.dialogoB.setText(R.string.dialogoB1);//coloca o texto antes de mostrar
                        Conversa.d3.setVisibility(View.VISIBLE);
                        Conversa.d3a.setVisibility(View.VISIBLE);
                        Conversa.C1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                        Conversa.C2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                        Conversa.caixaresposta.setVisibility(View.GONE);
                        break;

                    case "B2":
                        SharedPreferences sharedPreferences4 = getSharedPreferences(ARQUIVOSHARED4, 0);
                        SharedPreferences.Editor editor4 = sharedPreferences4.edit();
                        String carregar4 = "4";
                        editor4.putString("carregar4", carregar4);
                        editor4.commit();

                        Conversa.dB.setVisibility(View.VISIBLE);
                        Conversa.dialogoB.setText(R.string.dialogoB2);//coloca o texto antes de mostrar
                        Conversa.d3.setVisibility(View.VISIBLE);
                        Conversa.d3a.setVisibility(View.VISIBLE);
                        Conversa.C1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                        Conversa.C2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                        Conversa.caixaresposta.setVisibility(View.GONE);
                        break;
                }
            }
        //recuperar os dados salvos
        SharedPreferences sharedPreferences1 = getSharedPreferences(ARQUIVOSHARED1, 0);
        if(sharedPreferences1.contains("carregar1")){
            String recuperar1 = sharedPreferences1.getString("carregar1","carregar");
            Conversa.dA.setVisibility(View.VISIBLE);
            Conversa.dialogoA.setText(R.string.dialogoA1);//coloca o texto antes de mostrar
            Conversa.d2.setVisibility(View.VISIBLE);
            Conversa.d2a.setVisibility(View.VISIBLE);
            Conversa.d2b.setVisibility(View.VISIBLE);
            Conversa.d2c.setVisibility(View.VISIBLE);
            Conversa.B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
            Conversa.B2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
            Conversa.caixaresposta.setVisibility(View.GONE);
        }



    }
}
