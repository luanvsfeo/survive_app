package com.example.survivign_in_columbin;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Conquistas extends AppCompatActivity {

    public static EditText textoNome1;
    public static EditText textoNome2;
    public static EditText textoNome3;
    public static EditText textoNome4;
    public static EditText textoNome5;
    public static EditText textoNome6;
    public static EditText textoNome7;
    public static EditText textoNome8;

    ImageView back;

    public static final String ARQUIVOSHARED1conq = "ArquivoShared1conq";
    private static final String ARQUIVOSHARED2 = "ArquivoShared2";
    private static final String ARQUIVOSHARED3 = "ArquivoShared3";
    private static final String ARQUIVOSHARED4 = "ArquivoShared4";
    private static final String ARQUIVOSHARED5 = "ArquivoShared5";
    private static final String ARQUIVOSHARED6 = "ArquivoShared6";
    private static final String ARQUIVOSHARED7 = "ArquivoShared7";
    private static final String ARQUIVOSHARED8 = "ArquivoShared8";
    static TextView conquista1, conquista2, conquista3, conquista4, conquista5, conquista6, conquista7, conquista8, conquista9;

    static String mensagemconquista1 = "";
    static String mensagemconquista2 = "";
    static String mensagemconquista3 = "";
    static String mensagemconquista4= "";
    static String mensagemconquista5 = "";
    static String mensagemconquista6 = "";
    static String mensagemconquista7 = "";
    static String mensagemconquista8 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conquistas);

        conquista1 =  (TextView)findViewById(R.id.checkBoxConquista1);
        conquista2 =  (TextView)findViewById(R.id.checkBoxConquista2);
        conquista3 =  (TextView)findViewById(R.id.checkBoxConquista3);
        conquista4 =  (TextView)findViewById(R.id.checkBoxConquista4);
        conquista5 =  (TextView)findViewById(R.id.checkBoxConquista5);
        conquista6 =  (TextView)findViewById(R.id.checkBoxConquista6);
        conquista7 =  (TextView)findViewById(R.id.checkBoxConquista7);
        conquista8 =  (TextView)findViewById(R.id.checkBoxConquista8);

        textoNome1 = (EditText) findViewById(R.id.textoNomeid1);
        textoNome2 = (EditText) findViewById(R.id.textoNomeid2);
        textoNome3 = (EditText) findViewById(R.id.textoNomeid3);
        textoNome4 = (EditText) findViewById(R.id.textoNomeid4);
        textoNome5 = (EditText) findViewById(R.id.textoNomeid5);
        textoNome6 = (EditText) findViewById(R.id.textoNomeid6);
        textoNome7 = (EditText) findViewById(R.id.textoNomeid7);
        textoNome8 = (EditText) findViewById(R.id.textoNomeid8);
        back = (ImageView)findViewById(R.id.imgBac);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (Conversa.desbloquearConq1 == true){
            SharedPreferences sharedPreferences1 = getSharedPreferences(ARQUIVOSHARED1conq, 0);
            SharedPreferences.Editor editor1 = sharedPreferences1.edit();

            editor1.putString("nome1", textoNome1.getText().toString());
            conquista1.setText("O brincalão");
            mensagemconquista1 = "1";
            editor1.commit();
        }

        if (Conversa.desbloquearConq2 == true){
            SharedPreferences sharedPreferences2 = getSharedPreferences(ARQUIVOSHARED2, 0);
            SharedPreferences.Editor editor2 = sharedPreferences2.edit();

            editor2.putString("nome2", textoNome2.getText().toString());
            editor2.commit();
            conquista2.setText("Não use bonés");
        }

        if (Conversa.desbloquearConq3 == true){
            SharedPreferences sharedPreferences3 = getSharedPreferences(ARQUIVOSHARED3, 0);
            SharedPreferences.Editor editor3 = sharedPreferences3.edit();

            editor3.putString("nome3", textoNome3.getText().toString());
            editor3.commit();
            conquista3.setText("Final trágico");
        }

        if (Conversa.desbloquearConq4 == true){
            SharedPreferences sharedPreferences4 = getSharedPreferences(ARQUIVOSHARED4, 0);
            SharedPreferences.Editor editor4 = sharedPreferences4.edit();

            editor4.putString("nome4", textoNome4.getText().toString());
            editor4.commit();
            conquista4.setText("O Sobrevivente");
        }

        if (Conversa.desbloquearConq5 == true){
            SharedPreferences sharedPreferences5 = getSharedPreferences(ARQUIVOSHARED5, 0);
            SharedPreferences.Editor editor5 = sharedPreferences5.edit();

            editor5.putString("nome5", textoNome5.getText().toString());
            editor5.commit();
            conquista5.setText("Vai um café?");
        }

        if (Conversa.desbloquearConq6 == true){
            SharedPreferences sharedPreferences6 = getSharedPreferences(ARQUIVOSHARED6, 0);
            SharedPreferences.Editor editor6 = sharedPreferences6.edit();

            editor6.putString("nome6", textoNome6.getText().toString());
            editor6.commit();
            conquista6.setText("Suba as escadas");
        }

        if (Conversa.desbloquearConq7 == true){
            SharedPreferences sharedPreferences7 = getSharedPreferences(ARQUIVOSHARED7,0);
            SharedPreferences.Editor editor7 = sharedPreferences7.edit();

            editor7.putString("nome7", textoNome7.getText().toString());
            editor7.commit();
            conquista7.setText("Consolador");
        }

        if (Conversa.desbloquearConq8 == true){
            SharedPreferences sharedPreferences8 = getSharedPreferences(ARQUIVOSHARED8, 0);
            SharedPreferences.Editor editor8 = sharedPreferences8.edit();

            editor8.putString("nome8", textoNome8.getText().toString());
            editor8.commit();
            conquista8.setText("Ajudar nem sempre é a melhor opção");
        }

        //recuperar os dados salvos
        SharedPreferences sharedPreferences1 = getSharedPreferences(ARQUIVOSHARED1conq, 0);
        if(sharedPreferences1.contains("nome1")){
            String nomeUsuario1 = sharedPreferences1.getString("nome1","con");
            conquista1.setText("O brincalhão");
            mensagemconquista1 = "1";
        }else{
            conquista1.setText(R.string.conquista1);
        }

        SharedPreferences sharedPreferences2 = getSharedPreferences(ARQUIVOSHARED2, 0);
        if(sharedPreferences2.contains("nome2")){
            String nomeUsuario2 = sharedPreferences2.getString("nome2","con2");
            conquista2.setText("Não use bonés");
            mensagemconquista2 = "1";
        }else{
            conquista2.setText(R.string.conquista2);
        }

        SharedPreferences sharedPreferences3 = getSharedPreferences(ARQUIVOSHARED3, 0);
        if(sharedPreferences3.contains("nome3")){
            String nomeUsuario3 = sharedPreferences3.getString("nome3","con3");
            conquista3.setText("Final trágico");
            mensagemconquista3 = "1";
        }else{
            conquista3.setText(R.string.conquista3);
        }

        SharedPreferences sharedPreferences4 = getSharedPreferences(ARQUIVOSHARED4, 0);
        if(sharedPreferences4.contains("nome4")){
            String nomeUsuario4 = sharedPreferences4.getString("nome4","con4");
            conquista4.setText("O Sobrevivente");
            mensagemconquista4 = "1";
        }else{
            conquista4.setText(R.string.conquista4);
        }

        SharedPreferences sharedPreferences5 = getSharedPreferences(ARQUIVOSHARED5, 0);
        if(sharedPreferences5.contains("nome5")){
            String nomeUsuario5 = sharedPreferences5.getString("nome5","con5");
            conquista5.setText("Vai um café?");
            mensagemconquista5 = "1";
        }else{
            conquista5.setText(R.string.conquista5);
        }

        SharedPreferences sharedPreferences6 = getSharedPreferences(ARQUIVOSHARED6, 0);
        if(sharedPreferences6.contains("nome6")){
            String nomeUsuario6 = sharedPreferences6.getString("nome6","con6");
            conquista6.setText("Suba as escadas");
            mensagemconquista6 = "1";
        }else{
            conquista6.setText(R.string.conquista6);
        }

        SharedPreferences sharedPreferences7 = getSharedPreferences(ARQUIVOSHARED7, 0);
        if(sharedPreferences7.contains("nome7")){
            String nomeUsuario7 = sharedPreferences7.getString("nome7","con7");
            conquista7.setText("Consolador");
            mensagemconquista7 = "1";
        }else{
            conquista7.setText(R.string.conquista7);
        }

        SharedPreferences sharedPreferences8 = getSharedPreferences(ARQUIVOSHARED8, 0);
        if(sharedPreferences8.contains("nome8")){
            String nomeUsuario8 = sharedPreferences8.getString("nome8","con8");
            conquista8.setText("Ajudar nem sempre é a melhor opção");
            mensagemconquista8 = "1";
        }else{
            conquista8.setText(R.string.conquista8);
        }



    }
}
