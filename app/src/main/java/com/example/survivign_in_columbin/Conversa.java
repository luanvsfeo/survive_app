package com.example.survivign_in_columbin;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import org.w3c.dom.Text;

import static android.app.PendingIntent.getActivity;

public class Conversa extends AppCompatActivity {

    public static TextView dialogoA, dialogoB, dialogoC, dialogoCa, dialogoD, dialogoE, dialogoF, dialogoG, dialogoGa, dialogoH, dialogoHa, dialogoI, dialogoIa, dialogoJ, dialogoK, dialogoKa, dialogoL, dialogoLa, dialogoLb, dialogoM;
    public static TextView dialogo1,dialogo1a, dialogo1b, dialogo2, dialogo2a, dialogo2b, dialogo2c, dialogo3, dialogo3a, dialogo4, dialogo4a, dialogo4b, dialogo5, dialogo5a, dialogo5b, dialogo6, dialogo6a, dialogo6b, dialogo6c, dialogo7, dialogo7a, dialogo7b, dialogo7c, dialogo7d, dialogo7e, dialogo8, dialogo8a, dialogo9, dialogo9a, dialogo9b, dialogo9c, dialogo9d, dialogo9e, dialogo10,
            dialogo11, dialogo12, dialogo13, dialogo14, dialogo15, dialogo15a, dialogo15b, dialogo16, dialogo16a, dialogo16b, dialogo16c, dialogo17, dialogo17a, dialogo17b, dialogo19,
            dialogo20, dialogo21, dialogo22, dialogo22a, dialogo23, dialogo23a, dialogo24, dialogo24a, dialogo25, dialogo25a, dialogo26, dialogo27, dialogo27a, dialogo28, dialogo28a, dialogo29, dialogo29a, dialogo29b,
            dialogo30, dialogo30a, dialogo31, dialogo31a, dialogo31b, dialogo32, dialogo33, dialogo33a, dialogo34, dialogo34a, dialogo34b, dialogo34c;

    public static Button A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, G1a, H1a, I1a, K1a;
    public static Button A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, C2a, L2a;

    static TextView hora1, hora1a, hora1b, hora2, hora2a, hora2b, hora2c, hora3, hora3a, hora4, hora4a, hora4b, hora5, hora5a, hora5b, hora6, hora6a, hora6b, hora6c, hora7, hora7a, hora7b, hora7c, hora7d, hora7e, hora8, hora8a, hora9, hora9a, hora9b, hora9c, hora9d, hora9e,
            hora10, hora11, hora12, hora13, hora14, hora15, hora15a, hora15b, hora16, hora16a, hora16b, hora16c, hora17, hora17a, hora17b, hora19, hora20, hora21, hora22, hora22a, hora23, hora23a, hora24, hora24a, hora25, hora25a, hora26, hora27, hora27a, hora28, hora28a, hora29, hora29a, hora29b,
            hora30, hora30a, hora31, hora31a, hora31b, hora32, hora33, hora33a, hora34, hora34a, hora34b, hora34c;
    static TextView horaA, horaB, horaC, horaCa, horaD, horaE, horaF, horaG, horaGa, horaH, horaHa, horaI, horaIa, horaJ, horaK, horaKa, horaL, horaLa, horaM;

    static LinearLayout d1a, d1b, d2, d2a, d2b, d2c, d3, d3a, d4, d4a, d4b, d5, d5a, d5b, d6, d6a, d6b, d6c, d7, d7a, d7b, d7c, d7d, d7e, d8, d8a, d9, d9a, d9b, d9c, d9d, d9e,
            d10, d11, d12, d13, d14, d15, d15a, d15b, d16, d16a, d16b, d16c, d17, d17a, d17b, d19, d20, d21, d22, d22a, d23, d23a, d24, d24a, d25, d25a, d26, d27, d27a, d28, d28a,
            d29, d29a, d29b, d30, d30a, d31, d31a, d31b, d32, d33, d33a, d34, d34a, d34b, d34c;

    static LinearLayout d1,dA, dB, dC, dCa, dD, dE, dF, dG, dGa, dH, dHa, dI, dIa, dJ, dK, dKa, dL, dLa, dM;

    static TextView status;

    static ScrollView tela;

    ImageView back;

    static LinearLayout caixaresposta;

    TextView conquista1, conquista2, conquista3, conquista4, conquista5, conquista6, conquista7, conquista8;

    EditText textoNome1, textoNome2;

    public static Boolean desbloquearConq1 = false;
    public static Boolean desbloquearConq2 = false;
    public static Boolean desbloquearConq3 = false;
    public static Boolean desbloquearConq4 = false;
    public static Boolean desbloquearConq5 = false;
    public static Boolean desbloquearConq6 = false;
    public static Boolean desbloquearConq7 = false;
    public static Boolean desbloquearConq8 = false;

    public static String carregarEscolhido = "0";

    private static final String ARQUIVOSHAREDA1 = "ArquivoSharedA1";
    private static final String ARQUIVOSHAREDA1a = "ArquivoSharedA1a";
    private static final String ARQUIVOSHAREDA2 = "ArquivoSharedA2";
    private static final String ARQUIVOSHAREDA2a = "ArquivoSharedA2a";
    private static final String ARQUIVOSHAREDB1 = "ArquivoSharedB1";
    private static final String ARQUIVOSHAREDB1a = "ArquivoSharedB1a";
    private static final String ARQUIVOSHAREDB2 = "ArquivoSharedB2";
    private static final String ARQUIVOSHAREDB2a = "ArquivoSharedB2a";
    private static final String ARQUIVOSHAREDC1 = "ArquivoSharedC1";
    private static final String ARQUIVOSHAREDC1a = "ArquivoSharedC1a";
    private static final String ARQUIVOSHAREDC2 = "ArquivoSharedC2";
    private static final String ARQUIVOSHAREDC2a = "ArquivoSharedC2a";
    private static final String ARQUIVOSHAREDC2A = "ArquivoSharedC2A";
    private static final String ARQUIVOSHAREDC2Aa = "ArquivoSharedC2Aa";
    private static final String ARQUIVOSHAREDD1 = "ArquivoSharedD1";
    private static final String ARQUIVOSHAREDD1a = "ArquivoSharedD1a";
    private static final String ARQUIVOSHAREDD2 = "ArquivoSharedD2";
    private static final String ARQUIVOSHAREDD2a = "ArquivoSharedD2a";
    private static final String ARQUIVOSHAREDE1 = "ArquivoSharedE1";
    private static final String ARQUIVOSHAREDE1a = "ArquivoSharedE1a";
    private static final String ARQUIVOSHAREDE2 = "ArquivoSharedE2";
    private static final String ARQUIVOSHAREDE2a = "ArquivoSharedE2a";
    private static final String ARQUIVOSHAREDF1 = "ArquivoSharedF1";
    private static final String ARQUIVOSHAREDF1a = "ArquivoSharedF1a";
    private static final String ARQUIVOSHAREDF2 = "ArquivoSharedF2";
    private static final String ARQUIVOSHAREDF2a = "ArquivoSharedF2a";
    private static final String ARQUIVOSHAREDG1 = "ArquivoSharedG1";
    private static final String ARQUIVOSHAREDG1a = "ArquivoSharedG1a";
    private static final String ARQUIVOSHAREDG2 = "ArquivoSharedG2";
    private static final String ARQUIVOSHAREDG2a = "ArquivoSharedG2a";
    private static final String ARQUIVOSHAREDG1A = "ArquivoSharedG1A";
    private static final String ARQUIVOSHAREDG1Aa = "ArquivoSharedG1Aa";
    private static final String ARQUIVOSHAREDH1 = "ArquivoSharedH1";
    private static final String ARQUIVOSHAREDH1a = "ArquivoSharedH1a";
    private static final String ARQUIVOSHAREDH2 = "ArquivoSharedH2";
    private static final String ARQUIVOSHAREDH2a = "ArquivoSharedH2a";
    private static final String ARQUIVOSHAREDH1A = "ArquivoSharedH1A";
    private static final String ARQUIVOSHAREDH1Aa = "ArquivoSharedH1Aa";
    private static final String ARQUIVOSHAREDI1 = "ArquivoSharedI1";
    private static final String ARQUIVOSHAREDI1a = "ArquivoSharedI1a";
    private static final String ARQUIVOSHAREDI2 = "ArquivoSharedI2";
    private static final String ARQUIVOSHAREDI2a = "ArquivoSharedI2a";
    private static final String ARQUIVOSHAREDI1A = "ArquivoSharedI1A";
    private static final String ARQUIVOSHAREDI1Aa = "ArquivoSharedI1Aa";
    private static final String ARQUIVOSHAREDJ1 = "ArquivoSharedJ1";
    private static final String ARQUIVOSHAREDJ1a = "ArquivoSharedJ1a";
    private static final String ARQUIVOSHAREDJ2 = "ArquivoSharedJ2";
    private static final String ARQUIVOSHAREDJ2a = "ArquivoSharedJ2a";
    private static final String ARQUIVOSHAREDK1 = "ArquivoSharedK1";
    private static final String ARQUIVOSHAREDK1a = "ArquivoSharedK1a";
    private static final String ARQUIVOSHAREDK2 = "ArquivoSharedK2";
    private static final String ARQUIVOSHAREDK2a = "ArquivoSharedK2a";
    private static final String ARQUIVOSHAREDK1A = "ArquivoSharedK1A";
    private static final String ARQUIVOSHAREDK1Aa = "ArquivoSharedK1Aa";
    private static final String ARQUIVOSHAREDL1 = "ArquivoSharedL1";
    private static final String ARQUIVOSHAREDL1a = "ArquivoSharedL1a";
    private static final String ARQUIVOSHAREDL2 = "ArquivoSharedL2";
    private static final String ARQUIVOSHAREDL2a = "ArquivoSharedL2a";
    private static final String ARQUIVOSHAREDL2A = "ArquivoSharedL2A";
    private static final String ARQUIVOSHAREDL2Aa = "ArquivoSharedL2Aa";
    private static final String ARQUIVOSHAREDM1 = "ArquivoSharedM1";
    private static final String ARQUIVOSHAREDM1a = "ArquivoSharedM1a";
    private static final String ARQUIVOSHAREDM2 = "ArquivoSharedM2";
    private static final String ARQUIVOSHAREDM2a = "ArquivoSharedM2a";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

        back = (ImageView) findViewById(R.id.imgBack);
        tela = (ScrollView)findViewById(R.id.tela);
        status = (TextView)findViewById(R.id.status);
        caixaresposta = (LinearLayout)findViewById(R.id.caixaresposta);

        hora1=(TextView) findViewById(R.id.hora1);
        hora1a=(TextView) findViewById(R.id.hora1a);
        hora1b=(TextView) findViewById(R.id.hora1b);
        horaA=(TextView) findViewById(R.id.horaA);
        hora2=(TextView) findViewById(R.id.hora2);
        hora2a=(TextView) findViewById(R.id.hora2a);
        hora2b=(TextView) findViewById(R.id.hora2b);
        hora2c=(TextView) findViewById(R.id.hora2c);
        horaB=(TextView) findViewById(R.id.horaB);
        hora3=(TextView) findViewById(R.id.hora3);
        hora3a=(TextView) findViewById(R.id.hora3a);
        horaC=(TextView) findViewById(R.id.horaC);
        horaCa=(TextView) findViewById(R.id.horaCa);
        hora4=(TextView) findViewById(R.id.hora4);
        hora4a=(TextView) findViewById(R.id.hora4a);
        hora4b=(TextView) findViewById(R.id.hora4b);
        hora5=(TextView) findViewById(R.id.hora5);
        hora5a=(TextView) findViewById(R.id.hora5a);
        hora5b=(TextView) findViewById(R.id.hora5b);
        horaD=(TextView) findViewById(R.id.horaD);
        hora6=(TextView) findViewById(R.id.hora6);
        hora6a=(TextView) findViewById(R.id.hora6a);
        hora6b=(TextView) findViewById(R.id.hora6b);
        hora6c=(TextView) findViewById(R.id.hora6c);
        hora7=(TextView) findViewById(R.id.hora7);
        hora7a=(TextView) findViewById(R.id.hora7a);
        hora7b=(TextView) findViewById(R.id.hora7b);
        hora7c=(TextView) findViewById(R.id.hora7c);
        hora7d=(TextView) findViewById(R.id.hora7d);
        hora7e=(TextView) findViewById(R.id.hora7e);
        horaF=(TextView) findViewById(R.id.horaF);
        hora8=(TextView) findViewById(R.id.hora8);
        hora8a=(TextView) findViewById(R.id.hora8a);
        horaE=(TextView) findViewById(R.id.horaE);
        hora9=(TextView) findViewById(R.id.hora9);
        hora9a=(TextView) findViewById(R.id.hora9a);
        hora9b=(TextView) findViewById(R.id.hora9b);
        hora9c=(TextView) findViewById(R.id.hora9c);
        hora9d=(TextView) findViewById(R.id.hora9d);
        hora9e=(TextView) findViewById(R.id.hora9e);
        hora10=(TextView) findViewById(R.id.hora10);
        hora11=(TextView) findViewById(R.id.hora11);
        hora12=(TextView) findViewById(R.id.hora12);
        hora13=(TextView) findViewById(R.id.hora13);
        hora14=(TextView) findViewById(R.id.hora14);
        hora15=(TextView) findViewById(R.id.hora15);
        hora15a=(TextView) findViewById(R.id.hora15a);
        hora15b=(TextView) findViewById(R.id.hora15b);
        hora16=(TextView) findViewById(R.id.hora16);
        hora16a=(TextView) findViewById(R.id.hora16a);
        hora16b=(TextView) findViewById(R.id.hora16b);
        hora16c=(TextView) findViewById(R.id.hora16c);
        hora17=(TextView) findViewById(R.id.hora17);
        hora17a=(TextView) findViewById(R.id.hora17a);
        hora17b=(TextView) findViewById(R.id.hora17b);
        hora19=(TextView) findViewById(R.id.hora19);
        hora20=(TextView) findViewById(R.id.hora20);
        hora21=(TextView) findViewById(R.id.hora21);
        hora22=(TextView) findViewById(R.id.hora22);
        hora22a=(TextView) findViewById(R.id.hora22a);
        hora23=(TextView) findViewById(R.id.hora23);
        hora23a=(TextView) findViewById(R.id.hora23a);
        hora24=(TextView) findViewById(R.id.hora24);
        hora24a=(TextView) findViewById(R.id.hora24a);
        hora25=(TextView) findViewById(R.id.hora25);
        hora25a=(TextView) findViewById(R.id.hora25a);
        hora26=(TextView) findViewById(R.id.hora26);
        hora27=(TextView) findViewById(R.id.hora27);
        hora27a=(TextView) findViewById(R.id.hora27a);
        hora28=(TextView) findViewById(R.id.hora28);
        hora28a=(TextView) findViewById(R.id.hora28a);
        hora29=(TextView) findViewById(R.id.hora29);
        hora29a=(TextView) findViewById(R.id.hora29a);
        hora29b=(TextView) findViewById(R.id.hora29b);
        hora30=(TextView) findViewById(R.id.hora30);
        hora30a=(TextView) findViewById(R.id.hora30a);
        hora31=(TextView) findViewById(R.id.hora31);
        hora31a=(TextView) findViewById(R.id.hora31a);
        hora31b=(TextView) findViewById(R.id.hora31b);
        hora32=(TextView) findViewById(R.id.hora32);
        hora33=(TextView) findViewById(R.id.hora33);
        hora33a=(TextView) findViewById(R.id.hora33a);
        hora34=(TextView) findViewById(R.id.hora34);
        hora34a=(TextView) findViewById(R.id.hora34a);
        hora34b=(TextView) findViewById(R.id.hora34b);
        hora34c=(TextView) findViewById(R.id.hora34c);
        horaG=(TextView) findViewById(R.id.horaG);
        horaGa=(TextView) findViewById(R.id.horaGa);
        horaH=(TextView) findViewById(R.id.horaH);
        horaHa=(TextView) findViewById(R.id.horaHa);
        horaI=(TextView) findViewById(R.id.horaI);
        horaIa=(TextView) findViewById(R.id.horaIa);
        horaJ=(TextView) findViewById(R.id.horaJ);
        horaK=(TextView) findViewById(R.id.horaK);
        horaKa=(TextView) findViewById(R.id.horaKa);
        horaL=(TextView) findViewById(R.id.horaL);
        horaLa=(TextView) findViewById(R.id.horaLa);
        horaM=(TextView) findViewById(R.id.horaM);

        d1 = (LinearLayout) findViewById(R.id.llDialogo1);
        d1a = (LinearLayout) findViewById(R.id.llDialogo1a);
        d1b = (LinearLayout) findViewById(R.id.llDialogo1b);
        dA = (LinearLayout) findViewById(R.id.llDialogoA);
        d2 = (LinearLayout) findViewById(R.id.llDialogo2);
        d2a = (LinearLayout) findViewById(R.id.llDialogo2a);
        d2b = (LinearLayout) findViewById(R.id.llDialogo2b);
        d2c = (LinearLayout) findViewById(R.id.llDialogo2c);
        dB = (LinearLayout) findViewById(R.id.llDialogoB);
        d3 = (LinearLayout) findViewById(R.id.llDialogo3);
        d3a = (LinearLayout) findViewById(R.id.llDialogo3a);
        dC = (LinearLayout) findViewById(R.id.llDialogoC);
        dCa = (LinearLayout) findViewById(R.id.llDialogoCa);
        dD = (LinearLayout) findViewById(R.id.llDialogoD);
        d4 = (LinearLayout) findViewById(R.id.llDialogo4);
        d4a = (LinearLayout) findViewById(R.id.llDialogo4a);
        d4b = (LinearLayout) findViewById(R.id.llDialogo4b);
        d5 = (LinearLayout) findViewById(R.id.llDialogo5);
        d5a = (LinearLayout) findViewById(R.id.llDialogo5a);
        d5b = (LinearLayout) findViewById(R.id.llDialogo5b);
        d6 = (LinearLayout) findViewById(R.id.llDialogo6);
        d6a = (LinearLayout) findViewById(R.id.llDialogo6a);
        d6b = (LinearLayout) findViewById(R.id.llDialogo6b);
        d6c = (LinearLayout) findViewById(R.id.llDialogo6c);
        dE = (LinearLayout) findViewById(R.id.llDialogoE);
        dF = (LinearLayout) findViewById(R.id.llDialogoF);
        d7 = (LinearLayout) findViewById(R.id.llDialogo7);
        d7a = (LinearLayout) findViewById(R.id.llDialogo7a);
        d7b = (LinearLayout) findViewById(R.id.llDialogo7b);
        d7c = (LinearLayout) findViewById(R.id.llDialogo7c);
        d7d = (LinearLayout) findViewById(R.id.llDialogo7d);
        d7e = (LinearLayout) findViewById(R.id.llDialogo7e);
        d8 = (LinearLayout) findViewById(R.id.llDialogo8);
        d8a = (LinearLayout) findViewById(R.id.llDialogo8a);
        d9 = (LinearLayout) findViewById(R.id.llDialogo9);
        d9a = (LinearLayout) findViewById(R.id.llDialogo9a);
        d9b = (LinearLayout) findViewById(R.id.llDialogo9b);
        d9c = (LinearLayout) findViewById(R.id.llDialogo9c);
        d9d = (LinearLayout) findViewById(R.id.llDialogo9d);
        d9e = (LinearLayout) findViewById(R.id.llDialogo9e);
        d10 = (LinearLayout) findViewById(R.id.llDialogo10);
        d11 = (LinearLayout) findViewById(R.id.llDialogo11);
        d12 = (LinearLayout) findViewById(R.id.llDialogo12);
        d13 = (LinearLayout) findViewById(R.id.llDialogo13);
        d14 = (LinearLayout) findViewById(R.id.llDialogo14);
        d15 = (LinearLayout) findViewById(R.id.llDialogo15);
        d15a = (LinearLayout) findViewById(R.id.llDialogo15a);
        d15b = (LinearLayout) findViewById(R.id.llDialogo15b);
        d16 = (LinearLayout) findViewById(R.id.llDialogo16);
        d16a = (LinearLayout) findViewById(R.id.llDialogo16a);
        d16b = (LinearLayout) findViewById(R.id.llDialogo16b);
        d16c = (LinearLayout) findViewById(R.id.llDialogo16c);
        d17 = (LinearLayout) findViewById(R.id.llDialogo17);
        d17a = (LinearLayout) findViewById(R.id.llDialogo17a);
        d17b = (LinearLayout) findViewById(R.id.llDialogo17b);
        d19 = (LinearLayout) findViewById(R.id.llDialogo19);
        d20 = (LinearLayout) findViewById(R.id.llDialogo20);
        d21 = (LinearLayout) findViewById(R.id.llDialogo21);
        d22 = (LinearLayout) findViewById(R.id.llDialogo22);
        d22a = (LinearLayout) findViewById(R.id.llDialogo22a);
        d23 = (LinearLayout) findViewById(R.id.llDialogo23);
        d23a = (LinearLayout) findViewById(R.id.llDialogo23a);
        d24 = (LinearLayout) findViewById(R.id.llDialogo24);
        d24a = (LinearLayout) findViewById(R.id.llDialogo24a);
        d25 = (LinearLayout) findViewById(R.id.llDialogo25);
        d25a = (LinearLayout) findViewById(R.id.llDialogo25a);
        d26 = (LinearLayout) findViewById(R.id.llDialogo26);
        d27 = (LinearLayout) findViewById(R.id.llDialogo27);
        d27a = (LinearLayout) findViewById(R.id.llDialogo27a);
        d28 = (LinearLayout) findViewById(R.id.llDialogo28);
        d28a = (LinearLayout) findViewById(R.id.llDialogo28a);
        d29 = (LinearLayout) findViewById(R.id.llDialogo29);
        d29a = (LinearLayout) findViewById(R.id.llDialogo29a);
        d29b = (LinearLayout) findViewById(R.id.llDialogo29b);
        d30 = (LinearLayout) findViewById(R.id.llDialogo30);
        d30a = (LinearLayout) findViewById(R.id.llDialogo30a);
        d31 = (LinearLayout) findViewById(R.id.llDialogo31);
        d31a = (LinearLayout) findViewById(R.id.llDialogo31a);
        d31b = (LinearLayout) findViewById(R.id.llDialogo31b);
        d32 = (LinearLayout) findViewById(R.id.llDialogo32);
        d33 = (LinearLayout) findViewById(R.id.llDialogo33);
        d33a = (LinearLayout) findViewById(R.id.llDialogo33a);
        d34 = (LinearLayout) findViewById(R.id.llDialogo34);
        d34a = (LinearLayout) findViewById(R.id.llDialogo34a);
        d34b = (LinearLayout) findViewById(R.id.llDialogo34b);
        d34c = (LinearLayout) findViewById(R.id.llDialogo34c);
        dH = (LinearLayout) findViewById(R.id.llDialogoH);
        dHa = (LinearLayout) findViewById(R.id.llDialogoHa);
        dI = (LinearLayout) findViewById(R.id.llDialogoI);
        dIa = (LinearLayout) findViewById(R.id.llDialogoIa);
        dJ= (LinearLayout) findViewById(R.id.llDialogoJ);
        dK = (LinearLayout) findViewById(R.id.llDialogoK);
        dKa = (LinearLayout) findViewById(R.id.llDialogoKa);
        dL = (LinearLayout) findViewById(R.id.llDialogoL);
        dLa = (LinearLayout) findViewById(R.id.llDialogoLa);
        dG = (LinearLayout) findViewById(R.id.llDialogoG);
        dGa = (LinearLayout) findViewById(R.id.llDialogoGa);
        dM = (LinearLayout) findViewById(R.id.llDialogoM);



        dialogoA = (TextView) findViewById(R.id.dialogoA);
        dialogoB = (TextView) findViewById(R.id.dialogoB);
        dialogoC = (TextView) findViewById(R.id.dialogoC);
        dialogoCa = (TextView) findViewById(R.id.dialogoCa);
        dialogoD = (TextView) findViewById(R.id.dialogoD);
        dialogoE = (TextView) findViewById(R.id.dialogoE);
        dialogoF = (TextView) findViewById(R.id.dialogoF);
        dialogoG = (TextView) findViewById(R.id.dialogoG);
        dialogoGa = (TextView) findViewById(R.id.dialogoGa);
        dialogoH = (TextView) findViewById(R.id.dialogoH);
        dialogoHa = (TextView) findViewById(R.id.dialogoHa);
        dialogoI = (TextView) findViewById(R.id.dialogoI);
        dialogoIa = (TextView) findViewById(R.id.dialogoIa);
        dialogoJ = (TextView) findViewById(R.id.dialogoJ);
        dialogoK = (TextView) findViewById(R.id.dialogoK);
        dialogoKa = (TextView) findViewById(R.id.dialogoKa);
        dialogoL = (TextView) findViewById(R.id.dialogoL);
        dialogoLa = (TextView) findViewById(R.id.dialogoLa);
        dialogoLb = (TextView) findViewById(R.id.dialogoLb);
        dialogoM = (TextView) findViewById(R.id.dialogoM);

        dialogo1 = (TextView) findViewById(R.id.dialogo1);
        dialogo1a = (TextView) findViewById(R.id.dialogo1a);
        dialogo1b = (TextView) findViewById(R.id.dialogo1b);
        dialogo2 = (TextView) findViewById(R.id.dialogo2);
        dialogo2a = (TextView) findViewById(R.id.dialogo2a);
        dialogo2b = (TextView) findViewById(R.id.dialogo2b);
        dialogo2c = (TextView) findViewById(R.id.dialogo2c);
        dialogo3 = (TextView) findViewById(R.id.dialogo3);
        dialogo3a = (TextView) findViewById(R.id.dialogo3a);
        dialogo4 = (TextView) findViewById(R.id.dialogo4);
        dialogo4a = (TextView) findViewById(R.id.dialogo4a);
        dialogo4b = (TextView) findViewById(R.id.dialogo4b);
        dialogo5 = (TextView) findViewById(R.id.dialogo5);
        dialogo5a = (TextView) findViewById(R.id.dialogo5a);
        dialogo5b = (TextView) findViewById(R.id.dialogo5b);
        dialogo6 = (TextView) findViewById(R.id.dialogo6);
        dialogo6a = (TextView) findViewById(R.id.dialogo6a);
        dialogo6b = (TextView) findViewById(R.id.dialogo6b);
        dialogo6c = (TextView) findViewById(R.id.dialogo6c);
        dialogo7 = (TextView) findViewById(R.id.dialogo7);
        dialogo7a = (TextView) findViewById(R.id.dialogo7a);
        dialogo7b = (TextView) findViewById(R.id.dialogo7b);
        dialogo7c = (TextView) findViewById(R.id.dialogo7c);
        dialogo7d = (TextView) findViewById(R.id.dialogo7d);
        dialogo7e = (TextView) findViewById(R.id.dialogo7e);
        dialogo8 = (TextView) findViewById(R.id.dialogo8);
        dialogo8a = (TextView) findViewById(R.id.dialogo8a);
        dialogo9 = (TextView) findViewById(R.id.dialogo9);
        dialogo9a = (TextView) findViewById(R.id.dialogo9a);
        dialogo9b = (TextView) findViewById(R.id.dialogo9b);
        dialogo9c = (TextView) findViewById(R.id.dialogo9c);
        dialogo9d = (TextView) findViewById(R.id.dialogo9d);
        dialogo9e = (TextView) findViewById(R.id.dialogo9e);
        dialogo10 = (TextView) findViewById(R.id.dialogo10);
        dialogo11 = (TextView) findViewById(R.id.dialogo11);
        dialogo12 = (TextView) findViewById(R.id.dialogo12);
        dialogo13 = (TextView) findViewById(R.id.dialogo13);
        dialogo14 = (TextView) findViewById(R.id.dialogo14);
        dialogo15 = (TextView) findViewById(R.id.dialogo15);
        dialogo15a = (TextView) findViewById(R.id.dialogo15a);
        dialogo15b = (TextView) findViewById(R.id.dialogo15b);
        dialogo16 = (TextView) findViewById(R.id.dialogo16);
        dialogo16a = (TextView) findViewById(R.id.dialogo16a);
        dialogo16b = (TextView) findViewById(R.id.dialogo16b);
        dialogo16c = (TextView) findViewById(R.id.dialogo16c);
        dialogo17 = (TextView) findViewById(R.id.dialogo17);
        dialogo17a = (TextView) findViewById(R.id.dialogo17a);
        dialogo17b = (TextView) findViewById(R.id.dialogo17b);
        dialogo19 = (TextView) findViewById(R.id.dialogo19);
        dialogo20 = (TextView) findViewById(R.id.dialogo20);
        dialogo21 = (TextView) findViewById(R.id.dialogo21);
        dialogo22 = (TextView) findViewById(R.id.dialogo22);
        dialogo22a = (TextView) findViewById(R.id.dialogo22a);
        dialogo23 = (TextView) findViewById(R.id.dialogo23);
        dialogo23a = (TextView) findViewById(R.id.dialogo23a);
        dialogo24 = (TextView) findViewById(R.id.dialogo24);
        dialogo24a = (TextView) findViewById(R.id.dialogo24a);
        dialogo25 = (TextView) findViewById(R.id.dialogo25);
        dialogo25a = (TextView) findViewById(R.id.dialogo25a);
        dialogo26 = (TextView) findViewById(R.id.dialogo26);
        dialogo27 = (TextView) findViewById(R.id.dialogo27);
        dialogo27a = (TextView) findViewById(R.id.dialogo27a);
        dialogo28 = (TextView) findViewById(R.id.dialogo28);
        dialogo28a = (TextView) findViewById(R.id.dialogo28a);
        dialogo29 = (TextView) findViewById(R.id.dialogo29);
        dialogo29a = (TextView) findViewById(R.id.dialogo29a);
        dialogo29b = (TextView) findViewById(R.id.dialogo29b);
        dialogo30 = (TextView) findViewById(R.id.dialogo30);
        dialogo30a = (TextView) findViewById(R.id.dialogo30a);
        dialogo31 = (TextView) findViewById(R.id.dialogo31);
        dialogo31a = (TextView) findViewById(R.id.dialogo31a);
        dialogo31b = (TextView) findViewById(R.id.dialogo31b);
        dialogo32 = (TextView) findViewById(R.id.dialogo32);
        dialogo33 = (TextView) findViewById(R.id.dialogo33);
        dialogo33a = (TextView) findViewById(R.id.dialogo33a);
        dialogo34 = (TextView) findViewById(R.id.dialogo34);
        dialogo34a = (TextView) findViewById(R.id.dialogo34a);
        dialogo34b = (TextView) findViewById(R.id.dialogo34b);
        dialogo34c = (TextView) findViewById(R.id.dialogo34c);


        A1 = (Button) findViewById(R.id.A1);
        A2 = (Button) findViewById(R.id.A2);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        C1 = (Button) findViewById(R.id.C1);
        C2 = (Button) findViewById(R.id.C2);
        C2a = (Button) findViewById(R.id.C2a);
        D1 = (Button) findViewById(R.id.D1);
        D2 = (Button) findViewById(R.id.D2);
        E1 = (Button) findViewById(R.id.E1);
        E2 = (Button) findViewById(R.id.E2);
        F1 = (Button) findViewById(R.id.F1);
        F2 = (Button) findViewById(R.id.F2);
        G1 = (Button) findViewById(R.id.G1);
        G2 = (Button) findViewById(R.id.G2);
        G1a = (Button) findViewById(R.id.G1a);
        H1 = (Button) findViewById(R.id.H1);
        H2 = (Button) findViewById(R.id.H2);
        H1a = (Button) findViewById(R.id.H1a);
        I1 = (Button) findViewById(R.id.I1);
        I1a = (Button) findViewById(R.id.I1a);
        I2 = (Button) findViewById(R.id.I2);
        J1 = (Button) findViewById(R.id.J1);
        J2 = (Button) findViewById(R.id.J2);
        K1 = (Button) findViewById(R.id.K1);
        K2 = (Button) findViewById(R.id.K2);
        K1a = (Button) findViewById(R.id.K1a);
        L1 = (Button) findViewById(R.id.L1);
        L2 = (Button) findViewById(R.id.L2);
        L2a = (Button) findViewById(R.id.L2a);
        M1 = (Button) findViewById(R.id.M1);
        M2 = (Button) findViewById(R.id.M2);

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

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        status.setText(R.string.online);
        status.setText(R.string.pessoa_escrevendo);
        hora1.setText(hora.calculaHora());


        if(Menu.btncarregarvariavel == "0") {

            SharedPreferences preferences = getSharedPreferences(ARQUIVOSHAREDA1, 0);
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
            editor.commit();

            SharedPreferences sharedPreferencesA1 = getSharedPreferences(ARQUIVOSHAREDA1, 0);
            SharedPreferences.Editor editorA1 = sharedPreferencesA1.edit();
            editorA1.clear();
            editorA1.commit();
            SharedPreferences sharedPreferencesA1a = getSharedPreferences(ARQUIVOSHAREDA1a, 0);
            SharedPreferences.Editor editorA1a = sharedPreferencesA1a.edit();
            editorA1a.clear();
            editorA1a.commit();

            SharedPreferences sharedPreferencesA2 = getSharedPreferences(ARQUIVOSHAREDA2, 0);
            SharedPreferences.Editor editorA2 = sharedPreferencesA2.edit();
            editorA2.clear();
            editorA2.commit();
            SharedPreferences sharedPreferencesA2a = getSharedPreferences(ARQUIVOSHAREDA2a, 0);
            SharedPreferences.Editor editorA2a = sharedPreferencesA2a.edit();
            editorA2a.clear();
            editorA2a.commit();

            SharedPreferences sharedPreferencesB1 = getSharedPreferences(ARQUIVOSHAREDB1, 0);
            SharedPreferences.Editor editorB1 = sharedPreferencesB1.edit();
            editorB1.clear();
            editorB1.commit();
            SharedPreferences sharedPreferencesB1a = getSharedPreferences(ARQUIVOSHAREDB1a, 0);
            SharedPreferences.Editor editorB1a = sharedPreferencesB1a.edit();
            editorB1a.clear();
            editorB1a.commit();

            SharedPreferences sharedPreferencesB2 = getSharedPreferences(ARQUIVOSHAREDB2, 0);
            SharedPreferences.Editor editorB2 = sharedPreferencesB2.edit();
            editorB2.clear();
            editorB2.commit();
            SharedPreferences sharedPreferencesB2a = getSharedPreferences(ARQUIVOSHAREDB2a, 0);
            SharedPreferences.Editor editorB2a = sharedPreferencesB2a.edit();
            editorB2a.clear();
            editorB2a.commit();

            SharedPreferences sharedPreferencesC1 = getSharedPreferences(ARQUIVOSHAREDC1, 0);
            SharedPreferences.Editor editorC1 = sharedPreferencesC1.edit();
            editorC1.clear();
            editorC1.commit();
            SharedPreferences sharedPreferencesC1a = getSharedPreferences(ARQUIVOSHAREDC1a, 0);
            SharedPreferences.Editor editorC1a = sharedPreferencesC1a.edit();
            editorC1a.clear();
            editorC1a.commit();

            SharedPreferences sharedPreferencesC2 = getSharedPreferences(ARQUIVOSHAREDC2, 0);
            SharedPreferences.Editor editorC2 = sharedPreferencesC2.edit();
            editorC2.clear();
            editorC2.commit();
            SharedPreferences sharedPreferencesC2a = getSharedPreferences(ARQUIVOSHAREDC2a, 0);
            SharedPreferences.Editor editorC2a = sharedPreferencesC2a.edit();
            editorC2a.clear();
            editorC2a.commit();

            SharedPreferences sharedPreferencesC2A = getSharedPreferences(ARQUIVOSHAREDC2A, 0);
            SharedPreferences.Editor editorC2A = sharedPreferencesC2A.edit();
            editorC2A.clear();
            editorC2A.commit();
            SharedPreferences sharedPreferencesC2Aa = getSharedPreferences(ARQUIVOSHAREDC2Aa, 0);
            SharedPreferences.Editor editorC2Aa = sharedPreferencesC2Aa.edit();
            editorC2Aa.clear();
            editorC2Aa.commit();

            SharedPreferences sharedPreferencesD1 = getSharedPreferences(ARQUIVOSHAREDD1, 0);
            SharedPreferences.Editor editorD1 = sharedPreferencesD1.edit();
            editorD1.clear();
            editorD1.commit();
            SharedPreferences sharedPreferencesD1a = getSharedPreferences(ARQUIVOSHAREDD1a, 0);
            SharedPreferences.Editor editorD1a = sharedPreferencesD1a.edit();
            editorD1a.clear();
            editorD1a.commit();

            SharedPreferences sharedPreferencesD2 = getSharedPreferences(ARQUIVOSHAREDD2, 0);
            SharedPreferences.Editor editorD2 = sharedPreferencesD2.edit();
            editorD2.clear();
            editorD2.commit();
            SharedPreferences sharedPreferencesD2a = getSharedPreferences(ARQUIVOSHAREDD2a, 0);
            SharedPreferences.Editor editorD2a = sharedPreferencesD2a.edit();
            editorD2a.clear();
            editorD2a.commit();

            SharedPreferences sharedPreferencesE1 = getSharedPreferences(ARQUIVOSHAREDE1, 0);
            SharedPreferences.Editor editorE1 = sharedPreferencesE1.edit();
            editorE1.clear();
            editorE1.commit();
            SharedPreferences sharedPreferencesE1a = getSharedPreferences(ARQUIVOSHAREDE1a, 0);
            SharedPreferences.Editor editorE1a = sharedPreferencesE1a.edit();
            editorE1a.clear();
            editorE1a.commit();

            SharedPreferences sharedPreferencesE2 = getSharedPreferences(ARQUIVOSHAREDE2, 0);
            SharedPreferences.Editor editorE2 = sharedPreferencesE2.edit();
            editorE2.clear();
            editorE2.commit();
            SharedPreferences sharedPreferencesE2a = getSharedPreferences(ARQUIVOSHAREDE2a, 0);
            SharedPreferences.Editor editorE2a = sharedPreferencesE2a.edit();
            editorE2a.clear();
            editorE2a.commit();

            SharedPreferences sharedPreferencesF1 = getSharedPreferences(ARQUIVOSHAREDF1, 0);
            SharedPreferences.Editor editorF1 = sharedPreferencesF1.edit();
            editorF1.clear();
            editorF1.commit();
            SharedPreferences sharedPreferencesF1a = getSharedPreferences(ARQUIVOSHAREDF1a, 0);
            SharedPreferences.Editor editorF1a = sharedPreferencesF1a.edit();
            editorF1a.clear();
            editorF1a.commit();

            SharedPreferences sharedPreferencesF2 = getSharedPreferences(ARQUIVOSHAREDF2, 0);
            SharedPreferences.Editor editorF2 = sharedPreferencesF2.edit();
            editorF2.clear();
            editorF2.commit();
            SharedPreferences sharedPreferencesF2a = getSharedPreferences(ARQUIVOSHAREDF2a, 0);
            SharedPreferences.Editor editorF2a = sharedPreferencesF2a.edit();
            editorF2a.clear();
            editorF2a.commit();

            SharedPreferences sharedPreferencesG1 = getSharedPreferences(ARQUIVOSHAREDG1, 0);
            SharedPreferences.Editor editorG1 = sharedPreferencesG1.edit();
            editorG1.clear();
            editorG1.commit();
            SharedPreferences sharedPreferencesG1a = getSharedPreferences(ARQUIVOSHAREDG1a, 0);
            SharedPreferences.Editor editorG1a = sharedPreferencesG1a.edit();
            editorG1a.clear();
            editorG1a.commit();

            SharedPreferences sharedPreferencesG2 = getSharedPreferences(ARQUIVOSHAREDG2, 0);
            SharedPreferences.Editor editorG2 = sharedPreferencesG2.edit();
            editorG2.clear();
            editorG2.commit();
            SharedPreferences sharedPreferencesG2a = getSharedPreferences(ARQUIVOSHAREDG2a, 0);
            SharedPreferences.Editor editorG2a = sharedPreferencesG2a.edit();
            editorG2a.clear();
            editorG2a.commit();

            SharedPreferences sharedPreferencesG1A = getSharedPreferences(ARQUIVOSHAREDG1A, 0);
            SharedPreferences.Editor editorG1A = sharedPreferencesG1A.edit();
            editorG1A.clear();
            editorG1A.commit();
            SharedPreferences sharedPreferencesG1Aa = getSharedPreferences(ARQUIVOSHAREDG1Aa, 0);
            SharedPreferences.Editor editorG1Aa = sharedPreferencesG1Aa.edit();
            editorG1Aa.clear();
            editorG1Aa.commit();

            SharedPreferences sharedPreferencesL1 = getSharedPreferences(ARQUIVOSHAREDL1, 0);
            SharedPreferences.Editor editorL1 = sharedPreferencesL1.edit();
            editorL1.clear();
            editorL1.commit();
            SharedPreferences sharedPreferencesL1a = getSharedPreferences(ARQUIVOSHAREDL1a, 0);
            SharedPreferences.Editor editorL1a = sharedPreferencesL1a.edit();
            editorL1a.clear();
            editorL1a.commit();

            SharedPreferences sharedPreferencesL2 = getSharedPreferences(ARQUIVOSHAREDL2, 0);
            SharedPreferences.Editor editorL2 = sharedPreferencesL2.edit();
            editorL2.clear();
            editorL2.commit();
            SharedPreferences sharedPreferencesL2a = getSharedPreferences(ARQUIVOSHAREDL2a, 0);
            SharedPreferences.Editor editorL2a = sharedPreferencesL2a.edit();
            editorL2a.clear();
            editorL2a.commit();

            SharedPreferences sharedPreferencesL2A = getSharedPreferences(ARQUIVOSHAREDL2A, 0);
            SharedPreferences.Editor editorL2A = sharedPreferencesL2A.edit();
            editorL2A.clear();
            editorL2A.commit();
            SharedPreferences sharedPreferencesL2Aa = getSharedPreferences(ARQUIVOSHAREDL2Aa, 0);
            SharedPreferences.Editor editorL2Aa = sharedPreferencesL2Aa.edit();
            editorL2Aa.clear();
            editorL2Aa.commit();

            SharedPreferences sharedPreferencesM1 = getSharedPreferences(ARQUIVOSHAREDM1, 0);
            SharedPreferences.Editor editorM1 = sharedPreferencesM1.edit();
            editorM1.clear();
            editorM1.commit();
            SharedPreferences sharedPreferencesM1a = getSharedPreferences(ARQUIVOSHAREDM1a, 0);
            SharedPreferences.Editor editorM1a = sharedPreferencesM1a.edit();
            editorM1a.clear();
            editorM1a.commit();

            SharedPreferences sharedPreferencesM2 = getSharedPreferences(ARQUIVOSHAREDM2, 0);
            SharedPreferences.Editor editorM2 = sharedPreferencesM2.edit();
            editorM2.clear();
            editorM2.commit();
            SharedPreferences sharedPreferencesM2a = getSharedPreferences(ARQUIVOSHAREDM2a, 0);
            SharedPreferences.Editor editorM2a = sharedPreferencesM2a.edit();
            editorM2a.clear();
            editorM2a.commit();

            SharedPreferences sharedPreferencesH1 = getSharedPreferences(ARQUIVOSHAREDH1, 0);
            SharedPreferences.Editor editorH1 = sharedPreferencesH1.edit();
            editorH1.clear();
            editorH1.commit();
            SharedPreferences sharedPreferencesH1a = getSharedPreferences(ARQUIVOSHAREDH1a, 0);
            SharedPreferences.Editor editorH1a = sharedPreferencesH1a.edit();
            editorH1a.clear();
            editorH1a.commit();

            SharedPreferences sharedPreferencesH2 = getSharedPreferences(ARQUIVOSHAREDH2, 0);
            SharedPreferences.Editor editorH2 = sharedPreferencesH2.edit();
            editorH2.clear();
            editorH2.commit();
            SharedPreferences sharedPreferencesH2a = getSharedPreferences(ARQUIVOSHAREDH2a, 0);
            SharedPreferences.Editor editorH2a = sharedPreferencesH2a.edit();
            editorH2a.clear();
            editorH2a.commit();

            SharedPreferences sharedPreferencesH1A = getSharedPreferences(ARQUIVOSHAREDH1A, 0);
            SharedPreferences.Editor editorH1A = sharedPreferencesH1A.edit();
            editorH1A.clear();
            editorH1A.commit();
            SharedPreferences sharedPreferencesH1Aa = getSharedPreferences(ARQUIVOSHAREDH1Aa, 0);
            SharedPreferences.Editor editorH1Aa = sharedPreferencesH1Aa.edit();
            editorH1Aa.clear();
            editorH1Aa.commit();

            SharedPreferences sharedPreferencesI1 = getSharedPreferences(ARQUIVOSHAREDI1, 0);
            SharedPreferences.Editor editorI1 = sharedPreferencesI1.edit();
            editorI1.clear();
            editorI1.commit();
            SharedPreferences sharedPreferencesI1a = getSharedPreferences(ARQUIVOSHAREDI1a, 0);
            SharedPreferences.Editor editorI1a = sharedPreferencesI1a.edit();
            editorI1a.clear();
            editorI1a.commit();

            SharedPreferences sharedPreferencesI2 = getSharedPreferences(ARQUIVOSHAREDI2, 0);
            SharedPreferences.Editor editorI2 = sharedPreferencesI2.edit();
            editorI2.clear();
            editorI2.commit();
            SharedPreferences sharedPreferencesI2a = getSharedPreferences(ARQUIVOSHAREDI2a, 0);
            SharedPreferences.Editor editorI2a = sharedPreferencesI2a.edit();
            editorI2a.clear();
            editorI2a.commit();

            SharedPreferences sharedPreferencesI1A = getSharedPreferences(ARQUIVOSHAREDI1A, 0);
            SharedPreferences.Editor editorI1A = sharedPreferencesI1A.edit();
            editorI1A.clear();
            editorI1A.commit();
            SharedPreferences sharedPreferencesI1Aa = getSharedPreferences(ARQUIVOSHAREDI1Aa, 0);
            SharedPreferences.Editor editorI1Aa = sharedPreferencesI1Aa.edit();
            editorI1Aa.clear();
            editorI1Aa.commit();

            SharedPreferences sharedPreferencesJ1 = getSharedPreferences(ARQUIVOSHAREDJ1, 0);
            SharedPreferences.Editor editorJ1 = sharedPreferencesJ1.edit();
            editorJ1.clear();
            editorJ1.commit();
            SharedPreferences sharedPreferencesJ1a = getSharedPreferences(ARQUIVOSHAREDJ1a, 0);
            SharedPreferences.Editor editorJ1a = sharedPreferencesJ1a.edit();
            editorJ1a.clear();
            editorJ1a.commit();

            SharedPreferences sharedPreferencesJ2 = getSharedPreferences(ARQUIVOSHAREDJ2, 0);
            SharedPreferences.Editor editorJ2 = sharedPreferencesJ2.edit();
            editorJ2.clear();
            editorJ2.commit();
            SharedPreferences sharedPreferencesJ2a = getSharedPreferences(ARQUIVOSHAREDJ2a, 0);
            SharedPreferences.Editor editorJ2a = sharedPreferencesJ2a.edit();
            editorJ2a.clear();
            editorJ2a.commit();

            SharedPreferences sharedPreferencesK1 = getSharedPreferences(ARQUIVOSHAREDK1, 0);
            SharedPreferences.Editor editorK1 = sharedPreferencesK1.edit();
            editorK1.clear();
            editorK1.commit();
            SharedPreferences sharedPreferencesK1a = getSharedPreferences(ARQUIVOSHAREDK1a, 0);
            SharedPreferences.Editor editorK1a = sharedPreferencesK1a.edit();
            editorK1a.clear();
            editorK1a.commit();

            SharedPreferences sharedPreferencesK2 = getSharedPreferences(ARQUIVOSHAREDK2, 0);
            SharedPreferences.Editor editorK2 = sharedPreferencesK2.edit();
            editorK2.clear();
            editorK2.commit();
            SharedPreferences sharedPreferencesK2a = getSharedPreferences(ARQUIVOSHAREDK2a, 0);
            SharedPreferences.Editor editorK2a = sharedPreferencesK2a.edit();
            editorK2a.clear();
            editorK2a.commit();



            dialogo1.postDelayed(new Runnable() { // delay para a respota
                @Override
                public void run() {
                    dialogo1.setText(R.string.dialogo1); // coloca a texto dela
                    hora1.setText(hora.calculaHora());// funcao da hora
                    d1.setVisibility(View.VISIBLE); //mostra a hora e o dialogo


                }
            }, 2000);

            dialogo1a.postDelayed(new Runnable() { // delay para a respota
                @Override
                public void run() {
                    dialogo1a.setText(R.string.dialogo1a); // coloca a texto dela
                    hora1a.setText(hora.calculaHora());// funcao da hora
                    d1a.setVisibility(View.VISIBLE); //mostra a hora e o dialogo


                }
            }, 4000);

            dialogo1b.postDelayed(new Runnable() { // delay para a respota
                @Override
                public void run() {
                    status.setText(R.string.online);
                    dialogo1b.setText(R.string.dialogo1b); // coloca a texto dela
                    hora1b.setText(hora.calculaHora());// funcao da hora
                    d1b.setVisibility(View.VISIBLE); //mostra a hora e o dialogo


                    A1.setVisibility(View.VISIBLE);
                    A2.setVisibility(View.VISIBLE);
                    caixaresposta.setVisibility(View.GONE);

                }
            }, 6000);
        }


        A1.setOnClickListener(new View.OnClickListener() {
            //escolha A1
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferencesA1 = getSharedPreferences(ARQUIVOSHAREDA1, 0);
                SharedPreferences.Editor editorA1 = sharedPreferencesA1.edit();
                String carregarA1 = "A1";
                editorA1.putString("carregarA1", carregarA1);
                carregarEscolhido = "A1";
                editorA1.commit();
                SharedPreferences sharedPreferencesA1a = getSharedPreferences(ARQUIVOSHAREDA1a, 0);
                SharedPreferences.Editor editorA1a = sharedPreferencesA1a.edit();
                editorA1a.putString("carregarA1a", carregarEscolhido);
                editorA1a.commit();

                horaA.setText(hora.calculaHora()); // coloca a hora na mensagem
                dialogoA.setText(R.string.dialogoA1);//coloca o texto antes de mostrar
                dA.setVisibility(View.VISIBLE); //a1 aparece com o texto e hora
                A1.setVisibility(View.GONE); // sai o botao 1
                A2.setVisibility(View.GONE); // sai o botao 2
                caixaresposta.setVisibility(View.VISIBLE);
                status.setText(R.string.pessoa_escrevendo);// mudança do titulo
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 100L);



                dialogo2.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2.setText(R.string.dialogo2); // coloca a texto dela
                        hora2.setText(hora.calculaHora());// funcao da hora
                        d2.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 1500);// tempo de delay

                dialogo2a.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2a.setText(R.string.dialogo2a); // coloca a texto dela
                        hora2a.setText(hora.calculaHora());// funcao da hora
                        d2a.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 5000);// tempo de delay

                dialogo2b.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2b.setText(R.string.dialogo2b); // coloca a texto dela
                        hora2b.setText(hora.calculaHora());// funcao da hora
                        d2b.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 7000);// tempo de delay

                dialogo2c.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2c.setText(R.string.dialogo2c); // coloca a texto dela
                        hora2c.setText(hora.calculaHora());// funcao da hora
                        d2c.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        status.setText(R.string.online);
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                        B2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                        caixaresposta.setVisibility(View.GONE);
                    }
                }, 9000);// tempo de delay

            }});


        A2.setOnClickListener(new View.OnClickListener() {
            //escolha A1
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferencesA2 = getSharedPreferences(ARQUIVOSHAREDA2, 0);
                SharedPreferences.Editor editorA2 = sharedPreferencesA2.edit();
                String carregarA2 = "A2";
                editorA2.putString("carregarA2", carregarA2);
                carregarEscolhido = "A2";
                editorA2.commit();
                SharedPreferences sharedPreferencesA2a = getSharedPreferences(ARQUIVOSHAREDA2a, 0);
                SharedPreferences.Editor editorA2a = sharedPreferencesA2a.edit();
                editorA2a.putString("carregarA2a", carregarEscolhido);
                editorA2a.commit();

                horaA.setText(hora.calculaHora()); // coloca a hora na mensagem
                dialogoA.setText(R.string.dialogoA2);//coloca o texto antes de mostrar
                dA.setVisibility(View.VISIBLE); //a1 aparece com o texto e hora
                A1.setVisibility(View.GONE); // sai o botao 1
                A2.setVisibility(View.GONE); // sai o botao 2
                caixaresposta.setVisibility(View.VISIBLE);
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);


                //

                dialogo2.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2.setText(R.string.dialogo2); // coloca a texto dela
                        hora2.setText(hora.calculaHora());// funcao da hora
                        d2.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 1500);// tempo de delay

                dialogo2a.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2a.setText(R.string.dialogo2a); // coloca a texto dela
                        hora2a.setText(hora.calculaHora());// funcao da hora
                        d2a.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 5000);// tempo de delay

                dialogo2b.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2b.setText(R.string.dialogo2b); // coloca a texto dela
                        hora2b.setText(hora.calculaHora());// funcao da hora
                        d2b.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 7000);// tempo de delay

                dialogo2c.postDelayed(new Runnable() { // delay para a respota
                    @Override
                    public void run() {

                        dialogo2c.setText(R.string.dialogo2c); // coloca a texto dela
                        hora2c.setText(hora.calculaHora());// funcao da hora
                        d2c.setVisibility(View.VISIBLE); //mostra a hora e o dialogo
                        status.setText(R.string.online);
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                        B2.setVisibility(View.VISIBLE); //mostra o proximo botao 2
                        caixaresposta.setVisibility(View.GONE);
                    }
                }, 9000);// tempo de delay

            }});


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                SharedPreferences sharedPreferencesB1 = getSharedPreferences(ARQUIVOSHAREDB1, 0);
                SharedPreferences.Editor editorB1 = sharedPreferencesB1.edit();
                String carregarB1 = "B1";
                editorB1.putString("carregarB1", carregarB1);
                carregarEscolhido = "B1";
                editorB1.commit();
                SharedPreferences sharedPreferencesB1a = getSharedPreferences(ARQUIVOSHAREDB1a, 0);
                SharedPreferences.Editor editorB1a = sharedPreferencesB1a.edit();
                editorB1a.putString("carregarB1a", carregarEscolhido);
                editorB1a.commit();

                dialogoB.setText(R.string.dialogoB1);
                dB.setVisibility(View.VISIBLE);
                B1.setVisibility(View.GONE);
                B2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaB.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);
                dialogo3.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d3.setVisibility(View.VISIBLE);
                        dialogo3.setText(R.string.dialogo3);
                        hora3.setText(hora.calculaHora());

                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 1500);

                dialogo3a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d3a.setVisibility(View.VISIBLE);
                        dialogo3a.setText(R.string.dialogo3a);
                        hora3a.setText(hora.calculaHora());

                        status.setText(R.string.online);
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        C1.setVisibility(View.VISIBLE);
                        C2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 4000);

            }});

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                SharedPreferences sharedPreferencesB2 = getSharedPreferences(ARQUIVOSHAREDB2, 0);
                SharedPreferences.Editor editorB2 = sharedPreferencesB2.edit();
                String carregarB2 = "B2";
                editorB2.putString("carregarB2", carregarB2);
                carregarEscolhido = "B2";
                editorB2.commit();
                SharedPreferences sharedPreferencesB2a = getSharedPreferences(ARQUIVOSHAREDB2a, 0);
                SharedPreferences.Editor editorB2a = sharedPreferencesB2a.edit();
                editorB2a.putString("carregarB2a", carregarEscolhido);
                editorB2a.commit();

                dialogoB.setText(R.string.dialogoB2);
                dB.setVisibility(View.VISIBLE);
                B1.setVisibility(View.GONE);
                B2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaB.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo3.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d3.setVisibility(View.VISIBLE);
                        dialogo3.setText(R.string.dialogo3);
                        hora3.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 1500);

                dialogo3a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        status.setText(R.string.online);
                        d3a.setVisibility(View.VISIBLE);
                        dialogo3a.setText(R.string.dialogo3a);
                        hora3a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        C1.setVisibility(View.VISIBLE);
                        C2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 4000);

            }});



        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoC.setText(R.string.dialogoC1);
                SharedPreferences sharedPreferencesC1 = getSharedPreferences(ARQUIVOSHAREDC1, 0);
                SharedPreferences.Editor editorC1 = sharedPreferencesC1.edit();
                String carregarC1 = "C1";
                editorC1.putString("carregarC1", carregarC1);
                carregarEscolhido = "C1";
                editorC1.commit();
                SharedPreferences sharedPreferencesC1a = getSharedPreferences(ARQUIVOSHAREDC1a, 0);
                SharedPreferences.Editor editorC1a = sharedPreferencesC1a.edit();
                editorC1a.putString("carregarC1a", carregarEscolhido);
                editorC1a.commit();
                if(Conquistas.mensagemconquista1 == "") {
                    Toast.makeText(Conversa.this, "Conquista: O Brincalhão", Toast.LENGTH_SHORT).show();
                }
                desbloquearConq1 = true;
                dC.setVisibility(View.VISIBLE);
                C1.setVisibility(View.GONE);
                C2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaC.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);


                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo4.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d4.setVisibility(View.VISIBLE);
                        dialogo4.setText(R.string.dialogo4);
                        hora4.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 1500);

                dialogo4a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d4a.setVisibility(View.VISIBLE);
                        dialogo4a.setText(R.string.dialogo4a);
                        hora4a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 3000);

                dialogo4b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d4b.setVisibility(View.VISIBLE);
                        dialogo4b.setText(R.string.dialogo4b);
                        hora4b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        C2a.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);


                    }
                }, 6000);
            }

        });


        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoC.setText(R.string.dialogoC2);
                SharedPreferences sharedPreferencesC2 = getSharedPreferences(ARQUIVOSHAREDC2, 0);
                SharedPreferences.Editor editorC2 = sharedPreferencesC2.edit();
                String carregarC2 = "C2";
                editorC2.putString("carregarC2", carregarC2);
                carregarEscolhido = "C2";
                editorC2.commit();
                SharedPreferences sharedPreferencesC2a = getSharedPreferences(ARQUIVOSHAREDC2a, 0);
                SharedPreferences.Editor editorC2a = sharedPreferencesC2a.edit();
                editorC2a.putString("carregarC2a", carregarEscolhido);
                editorC2a.commit();

                dC.setVisibility(View.VISIBLE);
                C1.setVisibility(View.GONE);
                C2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaC.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo5.postDelayed(new Runnable() {
                    @Override
                    public void run() {


                        d5.setVisibility(View.VISIBLE);
                        dialogo5.setText(R.string.dialogo5);
                        hora5.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 2000);

                dialogo5a.postDelayed(new Runnable() {
                    @Override
                    public void run() {


                        d5a.setVisibility(View.VISIBLE);
                        dialogo5a.setText(R.string.dialogo5a);
                        hora5a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 5000);

                dialogo5b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);

                        d5b.setVisibility(View.VISIBLE);
                        dialogo5b.setText(R.string.dialogo5b);
                        hora5b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        D1.setVisibility(View.VISIBLE);
                        D2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 7000);
            }

        });

        C2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoCa.setText(R.string.dialogoC2);
                SharedPreferences sharedPreferencesC2A = getSharedPreferences(ARQUIVOSHAREDC2A, 0);
                SharedPreferences.Editor editorC2A = sharedPreferencesC2A.edit();
                String carregarC2A = "C2A";
                editorC2A.putString("carregarC2A", carregarC2A);
                carregarEscolhido = "C2A";
                editorC2A.commit();
                SharedPreferences sharedPreferencesC2Aa = getSharedPreferences(ARQUIVOSHAREDC2Aa, 0);
                SharedPreferences.Editor editorC2Aa = sharedPreferencesC2Aa.edit();
                editorC2Aa.putString("carregarC2Aa", carregarEscolhido);
                editorC2Aa.commit();

                dCa.setVisibility(View.VISIBLE);
                C2a.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaCa.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo5.postDelayed(new Runnable() {
                    @Override
                    public void run() {


                        d5.setVisibility(View.VISIBLE);
                        dialogo5.setText(R.string.dialogo5);
                        hora5.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 2000);

                dialogo5a.postDelayed(new Runnable() {
                    @Override
                    public void run() {


                        d5a.setVisibility(View.VISIBLE);
                        dialogo5a.setText(R.string.dialogo5a);
                        hora5a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 5000);

                dialogo5b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);

                        d5b.setVisibility(View.VISIBLE);
                        dialogo5b.setText(R.string.dialogo5b);
                        hora5b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        D1.setVisibility(View.VISIBLE);
                        D2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 7000);
            }

        });

        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoD.setText(R.string.dialogoD1);
                SharedPreferences sharedPreferencesD1 = getSharedPreferences(ARQUIVOSHAREDD1, 0);
                SharedPreferences.Editor editorD1 = sharedPreferencesD1.edit();
                String carregarD1 = "D1";
                editorD1.putString("carregarD1", carregarD1);
                carregarEscolhido = "D1";
                editorD1.commit();
                SharedPreferences sharedPreferencesD1a = getSharedPreferences(ARQUIVOSHAREDD1a, 0);
                SharedPreferences.Editor editorD1a = sharedPreferencesD1a.edit();
                editorD1a.putString("carregarD1a", carregarEscolhido);
                editorD1a.commit();

                horaD.setText(hora.calculaHora());
                dD.setVisibility(View.VISIBLE);
                D1.setVisibility(View.GONE);
                D2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                status.setText(R.string.pessoa_escrevendo);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo6.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6.setVisibility(View.VISIBLE);
                        dialogo6.setText(R.string.dialogo6);
                        hora6.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 5000);

                dialogo6a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6a.setVisibility(View.VISIBLE);
                        dialogo6a.setText(R.string.dialogo6a);
                        hora6a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 7000);

                dialogo6b.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6b.setVisibility(View.VISIBLE);
                        dialogo6b.setText(R.string.dialogo6b);
                        hora6b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 8500);

                dialogo6c.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d6c.setVisibility(View.VISIBLE);
                        dialogo6c.setText(R.string.dialogo6c);
                        hora6c.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        E1.setVisibility(View.VISIBLE);
                        E2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 10000);
            }

        });


        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoD.setText(R.string.dialogoD2);
                SharedPreferences sharedPreferencesD2 = getSharedPreferences(ARQUIVOSHAREDD2, 0);
                SharedPreferences.Editor editorD2 = sharedPreferencesD2.edit();
                String carregarD2 = "D2";
                editorD2.putString("carregarD2", carregarD2);
                carregarEscolhido = "D2";
                editorD2.commit();
                SharedPreferences sharedPreferencesD2a = getSharedPreferences(ARQUIVOSHAREDD2a, 0);
                SharedPreferences.Editor editorD2a = sharedPreferencesD2a.edit();
                editorD2a.putString("carregarD2a", carregarEscolhido);
                editorD2a.commit();

                dD.setVisibility(View.VISIBLE);
                D1.setVisibility(View.GONE);
                D2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaD.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);
                dialogo6.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6.setVisibility(View.VISIBLE);
                        dialogo6.setText(R.string.dialogo6);
                        hora6.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 5000);

                dialogo6a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6a.setVisibility(View.VISIBLE);
                        dialogo6a.setText(R.string.dialogo6a);
                        hora6a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 7000);

                dialogo6b.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6b.setVisibility(View.VISIBLE);
                        dialogo6b.setText(R.string.dialogo6b);
                        hora6.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 8500);

                dialogo6c.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d6c.setVisibility(View.VISIBLE);
                        dialogo6c.setText(R.string.dialogo6c);
                        hora6c.setText(hora.calculaHora());
                        status.setText(R.string.online);
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        E1.setVisibility(View.VISIBLE);
                        E2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 10000);
            }

        });



        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoE.setText(R.string.dialogoE1);
                SharedPreferences sharedPreferencesE1 = getSharedPreferences(ARQUIVOSHAREDE1, 0);
                SharedPreferences.Editor editorE1 = sharedPreferencesE1.edit();
                String carregarE1 = "E1";
                editorE1.putString("carregarE1", carregarE1);
                carregarEscolhido = "E1";
                editorE1.commit();
                SharedPreferences sharedPreferencesE1a = getSharedPreferences(ARQUIVOSHAREDE1a, 0);
                SharedPreferences.Editor editorE1a = sharedPreferencesE1a.edit();
                editorE1a.putString("carregarE1a", carregarEscolhido);
                editorE1a.commit();

                if(Conquistas.mensagemconquista2 == "") {
                    Toast.makeText(Conversa.this, "Conquista: Não use bonés", Toast.LENGTH_SHORT).show();
                }
                desbloquearConq2 = true;
                dE.setVisibility(View.VISIBLE);
                E1.setVisibility(View.GONE);
                E2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaE.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo9.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9.setVisibility(View.VISIBLE);
                        dialogo9.setText(R.string.dialogo9);
                        hora9.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 3000);

                dialogo9a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9a.setVisibility(View.VISIBLE);
                        dialogo9a.setText(R.string.dialogo9a);
                        hora9a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 7000);

                dialogo9b.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9b.setVisibility(View.VISIBLE);
                        dialogo9b.setText(R.string.dialogo9b);
                        hora9b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 9000);

                dialogo9c.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9c.setVisibility(View.VISIBLE);
                        dialogo9c.setText(R.string.dialogo9c);
                        hora9c.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 13000);

                dialogo9d.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9d.setVisibility(View.VISIBLE);
                        dialogo9d.setText(R.string.dialogo9d);
                        hora9d.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 15500);

                dialogo9e.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d9e.setVisibility(View.VISIBLE);
                        dialogo9e.setText(R.string.dialogo9e);
                        hora9e.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        G1.setVisibility(View.VISIBLE);
                        G2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 17000);
            }

        });


        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoE.setText(R.string.dialogoE2);
                SharedPreferences sharedPreferencesE2 = getSharedPreferences(ARQUIVOSHAREDE2, 0);
                SharedPreferences.Editor editorE2 = sharedPreferencesE2.edit();
                String carregarE2 = "E2";
                editorE2.putString("carregarE2", carregarE2);
                carregarEscolhido = "E2";
                editorE2.commit();
                SharedPreferences sharedPreferencesE2a = getSharedPreferences(ARQUIVOSHAREDE2a, 0);
                SharedPreferences.Editor editorE2a = sharedPreferencesE2a.edit();
                editorE2a.putString("carregarE2a", carregarEscolhido);
                editorE2a.commit();

                dE.setVisibility(View.VISIBLE);
                E1.setVisibility(View.GONE);
                E2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaE.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo7.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d7.setVisibility(View.VISIBLE);
                        dialogo7.setText(R.string.dialogo7);
                        hora7.setText(hora.calculaHora());

                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 3000);

                dialogo7a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d7a.setVisibility(View.VISIBLE);
                        dialogo7a.setText(R.string.dialogo7a);
                        hora7a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 4000);

                dialogo7b.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d7b.setVisibility(View.VISIBLE);
                        dialogo7b.setText(R.string.dialogo7b);
                        hora7b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                dialogo7c.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d7c.setVisibility(View.VISIBLE);
                        dialogo7c.setText(R.string.dialogo7c);
                        hora7c.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 10000);

                dialogo7d.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d7d.setVisibility(View.VISIBLE);
                        dialogo7d.setText(R.string.dialogo7d);
                        hora7d.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 12500);

                dialogo7e.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d7e.setVisibility(View.VISIBLE);
                        dialogo7e.setText(R.string.dialogo7e);
                        hora7e.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        F1.setVisibility(View.VISIBLE);
                        F2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 15000);
            }

        });


        F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoF.setText(R.string.dialogoF1);
                if(Conquistas.mensagemconquista3 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Final trágico", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesF1 = getSharedPreferences(ARQUIVOSHAREDF1, 0);
                SharedPreferences.Editor editorF1 = sharedPreferencesF1.edit();
                String carregarF1 = "F1";
                editorF1.putString("carregarF1", carregarF1);
                carregarEscolhido = "F1";
                editorF1.commit();
                SharedPreferences sharedPreferencesF1a = getSharedPreferences(ARQUIVOSHAREDF1a, 0);
                SharedPreferences.Editor editorF1a = sharedPreferencesF1a.edit();
                editorF1a.putString("carregarF1a", carregarEscolhido);
                editorF1a.commit();

                desbloquearConq3 = true;
                dF.setVisibility(View.VISIBLE);
                F1.setVisibility(View.GONE);
                F2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaF.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo8.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d8.setVisibility(View.VISIBLE);
                        dialogo8.setText(R.string.dialogo8);
                        hora8.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);


                    }
                }, 5000);

                dialogo8a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d8a.setVisibility(View.VISIBLE);
                        dialogo8a.setText(R.string.dialogo8a);
                        hora8a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);


                        // caixa de dialogo com delay
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                                mensagem.setTitle(R.string.fim)
                                        .setMessage(R.string.morreu)
                                        .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                finish();
                                                startActivity(getIntent());
                                            }
                                        })
                                        .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                finish();

                                            }
                                        });

                                mensagem.show();
                            }
                        }, 3000);



                    }
                }, 10000);
            }

        });

        F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoF.setText(R.string.dialogoF2);
                if(Conquistas.mensagemconquista2 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Não use bonés", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesF2 = getSharedPreferences(ARQUIVOSHAREDF2, 0);
                SharedPreferences.Editor editorF2 = sharedPreferencesF2.edit();
                String carregarF2 = "F2";
                editorF2.putString("carregarF2", carregarF2);
                carregarEscolhido = "F2";
                editorF2.commit();
                SharedPreferences sharedPreferencesF2a = getSharedPreferences(ARQUIVOSHAREDF2a, 0);
                SharedPreferences.Editor editorF2a = sharedPreferencesF2a.edit();
                editorF2a.putString("carregarF2a", carregarEscolhido);
                editorF2a.commit();

                desbloquearConq2 = true;
                dF.setVisibility(View.VISIBLE);
                F1.setVisibility(View.GONE);
                F2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaF.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo9.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9.setVisibility(View.VISIBLE);
                        dialogo9.setText(R.string.dialogo9);
                        hora9.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 3000);

                dialogo9a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9a.setVisibility(View.VISIBLE);
                        dialogo9a.setText(R.string.dialogo9a);
                        hora9a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 7000);

                dialogo9b.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9b.setVisibility(View.VISIBLE);
                        dialogo9b.setText(R.string.dialogo9b);
                        hora9b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 9000);

                dialogo9c.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9c.setVisibility(View.VISIBLE);
                        dialogo9c.setText(R.string.dialogo9c);
                        hora9c.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 13000);

                dialogo9d.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d9d.setVisibility(View.VISIBLE);
                        dialogo9d.setText(R.string.dialogo9d);
                        hora9d.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 15500);

                dialogo9e.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d9e.setVisibility(View.VISIBLE);
                        dialogo9e.setText(R.string.dialogo9e);
                        hora9e.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        G1.setVisibility(View.VISIBLE);
                        G2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 17000);
            }

        });

        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoG.setText(R.string.dialogoG1);
                if(Conquistas.mensagemconquista5 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Vai um café?", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesG1 = getSharedPreferences(ARQUIVOSHAREDG1, 0);
                SharedPreferences.Editor editorG1 = sharedPreferencesG1.edit();
                String carregarG1 = "G1";
                editorG1.putString("carregarG1", carregarG1);
                carregarEscolhido = "G1";
                editorG1.commit();
                SharedPreferences sharedPreferencesG1a = getSharedPreferences(ARQUIVOSHAREDG1a, 0);
                SharedPreferences.Editor editorG1a = sharedPreferencesG1a.edit();
                editorG1a.putString("carregarG1a", carregarEscolhido);
                editorG1a.commit();

                desbloquearConq5 = true;
                dG.setVisibility(View.VISIBLE);
                G1.setVisibility(View.GONE);
                G2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaG.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo29.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d29.setVisibility(View.VISIBLE);
                        dialogo29.setText(R.string.dialogo29);
                        hora29.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo29a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d29a.setVisibility(View.VISIBLE);
                        dialogo29a.setText(R.string.dialogo29a);
                        hora29a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 5000);

                dialogo29b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d29b.setVisibility(View.VISIBLE);
                        dialogo29b.setText(R.string.dialogo29b);
                        hora29b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        G1a.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 8000);


            }

        });

        G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoG.setText(R.string.dialogoG2);
                if(Conquistas.mensagemconquista6 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Suba as escadas", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesG2 = getSharedPreferences(ARQUIVOSHAREDG2, 0);
                SharedPreferences.Editor editorG2 = sharedPreferencesG2.edit();
                String carregarG2 = "G2";
                editorG2.putString("carregarG2", carregarG2);
                carregarEscolhido = "G2";
                editorG2.commit();
                SharedPreferences sharedPreferencesG2a = getSharedPreferences(ARQUIVOSHAREDG2a, 0);
                SharedPreferences.Editor editorG2a = sharedPreferencesG2a.edit();
                editorG2a.putString("carregarG2a", carregarEscolhido);
                editorG2a.commit();

                desbloquearConq6 = true;
                dG.setVisibility(View.VISIBLE);
                G1.setVisibility(View.GONE);
                G2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaG.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);
                dialogo10.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d10.setVisibility(View.VISIBLE);
                        dialogo10.setText(R.string.dialogo10);
                        hora10.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo11.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d11.setVisibility(View.VISIBLE);
                        dialogo11.setText(R.string.dialogo11);
                        hora11.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 4000);

                dialogo12.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d12.setVisibility(View.VISIBLE);
                        dialogo12.setText(R.string.dialogo12);
                        hora12.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                dialogo13.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d13.setVisibility(View.VISIBLE);
                        dialogo13.setText(R.string.dialogo13);
                        hora13.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 8000);

                dialogo14.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d14.setVisibility(View.VISIBLE);
                        dialogo14.setText(R.string.dialogo14);
                        hora14.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        H1.setVisibility(View.VISIBLE);
                        H2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 10000);

            }

        });

        G1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoGa.setText(R.string.dialogoG1a);
                SharedPreferences sharedPreferencesG1A = getSharedPreferences(ARQUIVOSHAREDG1A, 0);
                SharedPreferences.Editor editorG1A = sharedPreferencesG1A.edit();
                String carregarG1A = "G1A";
                editorG1A.putString("carregarG1A", carregarG1A);
                carregarEscolhido = "G1A";
                editorG1A.commit();
                SharedPreferences sharedPreferencesG1Aa = getSharedPreferences(ARQUIVOSHAREDG1Aa, 0);
                SharedPreferences.Editor editorG1Aa = sharedPreferencesG1Aa.edit();
                editorG1Aa.putString("carregarG1Aa", carregarEscolhido);
                editorG1Aa.commit();

                dGa.setVisibility(View.VISIBLE);
                G1a.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaGa.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo30.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d30.setVisibility(View.VISIBLE);
                        dialogo30.setText(R.string.dialogo30);
                        hora30.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo30a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d30a.setVisibility(View.VISIBLE);
                        dialogo30a.setText(R.string.dialogo30a);
                        hora30a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        L1.setVisibility(View.VISIBLE);
                        L2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 4000);

            }

        });

        L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoL.setText(R.string.dialogoL1);
                SharedPreferences sharedPreferencesL1 = getSharedPreferences(ARQUIVOSHAREDL1, 0);
                SharedPreferences.Editor editorL1 = sharedPreferencesL1.edit();
                String carregarL1 = "L1";
                editorL1.putString("carregarL1", carregarL1);
                carregarEscolhido = "L1";
                editorL1.commit();
                SharedPreferences sharedPreferencesL1a = getSharedPreferences(ARQUIVOSHAREDL1a, 0);
                SharedPreferences.Editor editorL1a = sharedPreferencesL1a.edit();
                editorL1a.putString("carregarL1a", carregarEscolhido);
                editorL1a.commit();

                dL.setVisibility(View.VISIBLE);
                L1.setVisibility(View.GONE);
                L2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaL.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);
                dialogo33.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d33.setVisibility(View.VISIBLE);
                        dialogo33.setText(R.string.dialogo33);
                        hora33.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo33a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d33a.setVisibility(View.VISIBLE);
                        dialogo33a.setText(R.string.dialogo33a);
                        hora33a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        M1.setVisibility(View.VISIBLE);
                        M2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 4000);

            }

        });

        L2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoL.setText(R.string.dialogoL2);
                SharedPreferences sharedPreferencesL2 = getSharedPreferences(ARQUIVOSHAREDL2, 0);
                SharedPreferences.Editor editorL2 = sharedPreferencesL2.edit();
                String carregarL2 = "L2";
                editorL2.putString("carregarL2", carregarL2);
                carregarEscolhido = "L2";
                editorL2.commit();
                SharedPreferences sharedPreferencesL2a = getSharedPreferences(ARQUIVOSHAREDL2a, 0);
                SharedPreferences.Editor editorL2a = sharedPreferencesL2a.edit();
                editorL2a.putString("carregarL2a", carregarEscolhido);
                editorL2a.commit();

                if(Conquistas.mensagemconquista4 == ""){
                    Toast.makeText(Conversa.this, "Conquista: O sobrevivente", Toast.LENGTH_SHORT).show();
                }
                desbloquearConq4 = true;
                dL.setVisibility(View.VISIBLE);
                L1.setVisibility(View.GONE);
                L2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaL.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo31.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d31.setVisibility(View.VISIBLE);
                        dialogo31.setText(R.string.dialogo31);
                        hora31.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                        L2a.setVisibility(View.VISIBLE);

                    }
                }, 10000);

            }

        });

        L2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoLa.setText(R.string.dialogoL2a);
                SharedPreferences sharedPreferencesL2A = getSharedPreferences(ARQUIVOSHAREDL2A, 0);
                SharedPreferences.Editor editorL2A = sharedPreferencesL2A.edit();
                String carregarL2A = "L2A";
                editorL2A.putString("carregarL2A", carregarL2A);
                carregarEscolhido = "L2A";
                editorL2A.commit();
                SharedPreferences sharedPreferencesL2Aa = getSharedPreferences(ARQUIVOSHAREDL2Aa, 0);
                SharedPreferences.Editor editorL2Aa = sharedPreferencesL2Aa.edit();
                editorL2Aa.putString("carregarL2Aa", carregarEscolhido);
                editorL2Aa.commit();

                desbloquearConq4 = true;
                dLa.setVisibility(View.VISIBLE);
                L2a.setVisibility(View.GONE);
                horaLa.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo31a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d31a.setVisibility(View.VISIBLE);
                        dialogo31a.setText(R.string.dialogo31a);
                        hora31a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                dialogo31b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d31b.setVisibility(View.VISIBLE);
                        dialogo31b.setText(R.string.dialogo31b);
                        hora31b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 8000);

                //final bom
                dialogo32.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d32.setVisibility(View.VISIBLE);
                        dialogo32.setText(R.string.dialogo32);
                        hora32.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 11000);

                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.sobreviveu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 12000);
                // fim da caixa de dialogo



            }

        });

        M1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoM.setText(R.string.dialogoM1);
                if(Conquistas.mensagemconquista3 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Final trágico", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesM1 = getSharedPreferences(ARQUIVOSHAREDM1, 0);
                SharedPreferences.Editor editorM1 = sharedPreferencesM1.edit();
                String carregarM1 = "M1";
                editorM1.putString("carregarM1", carregarM1);
                carregarEscolhido = "M1";
                editorM1.commit();
                SharedPreferences sharedPreferencesM1a = getSharedPreferences(ARQUIVOSHAREDM1a, 0);
                SharedPreferences.Editor editorM1a = sharedPreferencesM1a.edit();
                editorM1a.putString("carregarM1a", carregarEscolhido);
                editorM1a.commit();

                desbloquearConq3 = true;
                dM.setVisibility(View.VISIBLE);
                M1.setVisibility(View.GONE);
                M2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaM.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo34.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d34.setVisibility(View.VISIBLE);
                        dialogo34.setText(R.string.dialogo34);
                        hora34.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo34a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d34a.setVisibility(View.VISIBLE);
                        dialogo34a.setText(R.string.dialogo34a);
                        hora34a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);
                    }
                }, 4000);

                dialogo34b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d34b.setVisibility(View.VISIBLE);
                        dialogo34b.setText(R.string.dialogo34b);
                        hora34b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                dialogo34c.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d34c.setVisibility(View.VISIBLE);
                        dialogo34c.setText(R.string.dialogo34c);
                        hora34c.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 8000);


                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.morreu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 9000);
                // fim da caixa de dialogo

            }

        });

        M2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoM.setText(R.string.dialogoM2);
                if(Conquistas.mensagemconquista6 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Suba as escadas", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesM2 = getSharedPreferences(ARQUIVOSHAREDM2, 0);
                SharedPreferences.Editor editorM2 = sharedPreferencesM2.edit();
                String carregarM2 = "M2";
                editorM2.putString("carregarM2", carregarM2);
                carregarEscolhido = "M2";
                editorM2.commit();
                SharedPreferences sharedPreferencesM2a = getSharedPreferences(ARQUIVOSHAREDM2a, 0);
                SharedPreferences.Editor editorM2a = sharedPreferencesM2a.edit();
                editorM2a.putString("carregarM2a", carregarEscolhido);
                editorM2a.commit();

                desbloquearConq6 = true;
                dM.setVisibility(View.VISIBLE);
                M1.setVisibility(View.GONE);
                M2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaM.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo11.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d11.setVisibility(View.VISIBLE);
                        dialogo11.setText(R.string.dialogo11);
                        hora11.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 4000);

                dialogo12.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d12.setVisibility(View.VISIBLE);
                        dialogo12.setText(R.string.dialogo12);
                        hora12.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                dialogo13.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d13.setVisibility(View.VISIBLE);
                        dialogo13.setText(R.string.dialogo13);
                        hora13.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 8000);

                dialogo14.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d14.setVisibility(View.VISIBLE);
                        dialogo14.setText(R.string.dialogo14);
                        hora14.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        H1.setVisibility(View.VISIBLE);
                        H2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 10000);

            }

        });

        H1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoH.setText(R.string.dialogoH1);
                if(Conquistas.mensagemconquista8 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Ajudar nem sempre é a melhor opção", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesH1 = getSharedPreferences(ARQUIVOSHAREDH1, 0);
                SharedPreferences.Editor editorH1 = sharedPreferencesH1.edit();
                String carregarH1 = "H1";
                editorH1.putString("carregarH1", carregarH1);
                carregarEscolhido = "H1";
                editorH1.commit();
                SharedPreferences sharedPreferencesH1a = getSharedPreferences(ARQUIVOSHAREDH1a, 0);
                SharedPreferences.Editor editorH1a = sharedPreferencesH1a.edit();
                editorH1a.putString("carregarH1a", carregarEscolhido);
                editorH1a.commit();

                desbloquearConq8 = true;
                dH.setVisibility(View.VISIBLE);
                H1.setVisibility(View.GONE);
                H2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaH.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);

                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo16.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d16.setVisibility(View.VISIBLE);
                        dialogo16.setText(R.string.dialogo16);
                        hora16.setText(hora.calculaHora());

                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo16a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d16a.setVisibility(View.VISIBLE);
                        dialogo16a.setText(R.string.dialogo16a);
                        hora16a.setText(hora.calculaHora());

                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 4000);

                dialogo16b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d16b.setVisibility(View.VISIBLE);
                        dialogo16b.setText(R.string.dialogo16b);
                        hora16b.setText(hora.calculaHora());

                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                dialogo16c.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d16c.setVisibility(View.VISIBLE);
                        dialogo16c.setText(R.string.dialogo16c);
                        hora16c.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        H1a.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 8000);

            }

        });

        H2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoH.setText(R.string.dialogoH2);
                if(Conquistas.mensagemconquista3 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Final trágico", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesH2 = getSharedPreferences(ARQUIVOSHAREDH2, 0);
                SharedPreferences.Editor editorH2 = sharedPreferencesH2.edit();
                String carregarH2 = "H2";
                editorH2.putString("carregarH2", carregarH2);
                carregarEscolhido = "H2";
                editorH2.commit();
                SharedPreferences sharedPreferencesH2a = getSharedPreferences(ARQUIVOSHAREDH2a, 0);
                SharedPreferences.Editor editorH2a = sharedPreferencesH2a.edit();
                editorH2a.putString("carregarH2a", carregarEscolhido);
                editorH2a.commit();

                desbloquearConq3 = true;
                dH.setVisibility(View.VISIBLE);
                H1.setVisibility(View.GONE);
                H2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaH.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo15.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d15.setVisibility(View.VISIBLE);
                        dialogo15.setText(R.string.dialogo15);
                        hora15.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);


                    }
                }, 3000);

                dialogo15a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d15a.setVisibility(View.VISIBLE);
                        dialogo15a.setText(R.string.dialogo15a);
                        hora15a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);


                    }
                }, 6000);

                dialogo15b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d15b.setVisibility(View.VISIBLE);
                        dialogo15b.setText(R.string.dialogo15b);
                        hora15b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);


                    }
                }, 9000);


                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.morreu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 10500);
                // fim da caixa de dialogo



            }

        });

        H1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoHa.setText(R.string.dialogoH1a);
                if(Conquistas.mensagemconquista7 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Consolador", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesH1A = getSharedPreferences(ARQUIVOSHAREDH1A, 0);
                SharedPreferences.Editor editorH1A = sharedPreferencesH1A.edit();
                String carregarH1A = "H1A";
                editorH1A.putString("carregarH1A", carregarH1A);
                carregarEscolhido = "H1A";
                editorH1A.commit();
                SharedPreferences sharedPreferencesH1Aa = getSharedPreferences(ARQUIVOSHAREDH1Aa, 0);
                SharedPreferences.Editor editorH1Aa = sharedPreferencesH1Aa.edit();
                editorH1Aa.putString("carregarH1Aa", carregarEscolhido);
                editorH1Aa.commit();

                desbloquearConq7 = true;
                dHa.setVisibility(View.VISIBLE);
                H1a.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaHa.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo17.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d17.setVisibility(View.VISIBLE);
                        dialogo17.setText(R.string.dialogo17);
                        hora17.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 2000);

                dialogo17a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d17a.setVisibility(View.VISIBLE);
                        dialogo17a.setText(R.string.dialogo17a);
                        hora17a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 4000);

                dialogo17b.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d17b.setVisibility(View.VISIBLE);
                        dialogo17b.setText(R.string.dialogo17b);
                        hora17b.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        I1.setVisibility(View.VISIBLE);
                        I2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 6000);

            }

        });

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoI.setText(R.string.dialogoI1);
                if(Conquistas.mensagemconquista3 == "") {
                    Toast.makeText(Conversa.this, "Conquista: Final trágico", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesI1 = getSharedPreferences(ARQUIVOSHAREDI1, 0);
                SharedPreferences.Editor editorI1 = sharedPreferencesI1.edit();
                String carregarI1 = "I1";
                editorI1.putString("carregarI1", carregarI1);
                carregarEscolhido = "I1";
                editorI1.commit();
                SharedPreferences sharedPreferencesI1a = getSharedPreferences(ARQUIVOSHAREDI1a, 0);
                SharedPreferences.Editor editorI1a = sharedPreferencesI1a.edit();
                editorI1a.putString("carregarI1a", carregarEscolhido);
                editorI1a.commit();

                desbloquearConq3 = true;
                dI.setVisibility(View.VISIBLE);
                I1.setVisibility(View.GONE);
                I2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaI.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo27.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d27.setVisibility(View.VISIBLE);
                        dialogo27.setText(R.string.dialogo27);
                        hora27.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 3000);

                dialogo27a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d27a.setVisibility(View.VISIBLE);
                        dialogo27a.setText(R.string.dialogo27a);
                        hora27a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        I1a.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 5000);

            }

        });

        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoI.setText(R.string.dialogoI2);
                SharedPreferences sharedPreferencesI2 = getSharedPreferences(ARQUIVOSHAREDI2, 0);
                SharedPreferences.Editor editorI2 = sharedPreferencesI2.edit();
                String carregarI2 = "I2";
                editorI2.putString("carregarI2", carregarI2);
                carregarEscolhido = "I2";
                editorI2.commit();
                SharedPreferences sharedPreferencesI2a = getSharedPreferences(ARQUIVOSHAREDI2a, 0);
                SharedPreferences.Editor editorI2a = sharedPreferencesI2a.edit();
                editorI2a.putString("carregarI2a", carregarEscolhido);
                editorI2a.commit();

                dI.setVisibility(View.VISIBLE);
                I1.setVisibility(View.GONE);
                I2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaI.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo19.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d19.setVisibility(View.VISIBLE);
                        dialogo19.setText(R.string.dialogo19);
                        hora19.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        J1.setVisibility(View.VISIBLE);
                        J2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 3000);


            }

        });

        I1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoIa.setText(R.string.dialogoI1a);
                SharedPreferences sharedPreferencesI1A = getSharedPreferences(ARQUIVOSHAREDI1A, 0);
                SharedPreferences.Editor editorI1A = sharedPreferencesI1A.edit();
                String carregarI1A = "I1A";
                editorI1A.putString("carregarI1A", carregarI1A);
                carregarEscolhido = "I1A";
                editorI1A.commit();
                SharedPreferences sharedPreferencesI1Aa = getSharedPreferences(ARQUIVOSHAREDI1Aa, 0);
                SharedPreferences.Editor editorI1Aa = sharedPreferencesI1Aa.edit();
                editorI1Aa.putString("carregarI1Aa", carregarEscolhido);
                editorI1Aa.commit();

                dIa.setVisibility(View.VISIBLE);
                I1a.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaIa.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo28.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d28.setVisibility(View.VISIBLE);
                        dialogo28.setText(R.string.dialogo28);
                        hora28.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 3500);

                dialogo28a.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        d28a.setVisibility(View.VISIBLE);
                        dialogo28a.setText(R.string.dialogo28a);
                        hora28a.setText(hora.calculaHora());
                        status.setText(R.string.online);
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 6000);

                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.morreu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 8000);
                // fim da caixa de dialogo

            }

        });

        J1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoJ.setText(R.string.dialogoJ1);
                if(Conquistas.mensagemconquista8 == "") {
                    Toast.makeText(Conversa.this, "Conquista: Ajudar nem sempre é a melhor opção", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesJ1 = getSharedPreferences(ARQUIVOSHAREDJ1, 0);
                SharedPreferences.Editor editorJ1 = sharedPreferencesJ1.edit();
                String carregarJ1 = "J1";
                editorJ1.putString("carregarJ1", carregarJ1);
                carregarEscolhido = "J1";
                editorJ1.commit();
                SharedPreferences sharedPreferencesJ1a = getSharedPreferences(ARQUIVOSHAREDJ1a, 0);
                SharedPreferences.Editor editorJ1a = sharedPreferencesJ1a.edit();
                editorJ1a.putString("carregarJ1a", carregarEscolhido);
                editorJ1a.commit();

                desbloquearConq8 = true;
                dJ.setVisibility(View.VISIBLE);
                J1.setVisibility(View.GONE);
                J2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaJ.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo20.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d20.setVisibility(View.VISIBLE);
                        dialogo20.setText(R.string.dialogo20);
                        hora20.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 3000);

                dialogo21.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d21.setVisibility(View.VISIBLE);
                        dialogo21.setText(R.string.dialogo21);
                        hora21.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 7000);

                dialogo22.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d22.setVisibility(View.VISIBLE);
                        dialogo22.setText(R.string.dialogo22);
                        hora22.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 10000);

                dialogo22a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d22a.setVisibility(View.VISIBLE);
                        dialogo22a.setText(R.string.dialogo22a);
                        hora22a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                        K1.setVisibility(View.VISIBLE);
                        K2.setVisibility(View.VISIBLE);
                        caixaresposta.setVisibility(View.GONE);

                    }
                }, 13000);

            }

        });

        J2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoJ.setText(R.string.dialogoJ2);
                if(Conquistas.mensagemconquista3 == ""){
                    Toast.makeText(Conversa.this, "Conquista: Final trágico", Toast.LENGTH_SHORT).show();
                }

                SharedPreferences sharedPreferencesJ2 = getSharedPreferences(ARQUIVOSHAREDJ2, 0);
                SharedPreferences.Editor editorJ2 = sharedPreferencesJ2.edit();
                String carregarJ2 = "J2";
                editorJ2.putString("carregarJ2", carregarJ2);
                carregarEscolhido = "J2";
                editorJ2.commit();
                SharedPreferences sharedPreferencesJ2a = getSharedPreferences(ARQUIVOSHAREDJ2a, 0);
                SharedPreferences.Editor editorJ2a = sharedPreferencesJ2a.edit();
                editorJ2a.putString("carregarJ2a", carregarEscolhido);
                editorJ2a.commit();

                desbloquearConq3 = true;
                dJ.setVisibility(View.VISIBLE);
                J1.setVisibility(View.GONE);
                J2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaJ.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo26.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d26.setVisibility(View.VISIBLE);
                        dialogo26.setText(R.string.dialogo26);
                        hora26.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 5000);


                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.morreu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 6500);
                // fim da caixa de dialogo


            }

        });

        K1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoK.setText(R.string.dialogoK1);
                if(Conquistas.mensagemconquista4 == "") {
                    Toast.makeText(Conversa.this, "Conquista: O Sobrevivente", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesK1 = getSharedPreferences(ARQUIVOSHAREDK1, 0);
                SharedPreferences.Editor editorK1 = sharedPreferencesK1.edit();
                String carregarK1 = "K1";
                editorK1.putString("carregarK1", carregarK1);
                carregarEscolhido = "K1";
                editorK1.commit();
                SharedPreferences sharedPreferencesK1a = getSharedPreferences(ARQUIVOSHAREDK1a, 0);
                SharedPreferences.Editor editorK1a = sharedPreferencesK1a.edit();
                editorK1a.putString("carregarK1a", carregarEscolhido);
                editorK1a.commit();

                desbloquearConq4 = true;
                dK.setVisibility(View.VISIBLE);
                K1.setVisibility(View.GONE);
                K2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaK.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);


                dialogo24.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d24.setVisibility(View.VISIBLE);
                        dialogo24.setText(R.string.dialogo24);
                        hora24.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 5000);

                dialogo24a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d24a.setVisibility(View.VISIBLE);
                        dialogo24a.setText(R.string.dialogo24a);
                        hora24a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 10000);

                dialogo25.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d25.setVisibility(View.VISIBLE);
                        dialogo25.setText(R.string.dialogo25);
                        hora25.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 12000);

                dialogo25a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d25a.setVisibility(View.VISIBLE);
                        dialogo25a.setText(R.string.dialogo25a);
                        hora25a.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 15000);

                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.sobreviveu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 16000);
                // fim da caixa de dialogo

            }

        });

        K2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoK.setText(R.string.dialogoK2);
                if(Conquistas.mensagemconquista3 == "") {
                    Toast.makeText(Conversa.this, "Conquista: Final trágico", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferencesK2 = getSharedPreferences(ARQUIVOSHAREDK2, 0);
                SharedPreferences.Editor editorK2 = sharedPreferencesK2.edit();
                String carregarK2 = "K2";
                editorK2.putString("carregarK2", carregarK2);
                carregarEscolhido = "K2";
                editorK2.commit();
                SharedPreferences sharedPreferencesK2a = getSharedPreferences(ARQUIVOSHAREDK2a, 0);
                SharedPreferences.Editor editorK2a = sharedPreferencesK2a.edit();
                editorK2a.putString("carregarK2a", carregarEscolhido);
                editorK2a.commit();

                desbloquearConq3 = true;
                dK.setVisibility(View.VISIBLE);
                K1.setVisibility(View.GONE);
                K2.setVisibility(View.GONE);
                caixaresposta.setVisibility(View.VISIBLE);
                horaK.setText(hora.calculaHora());
                status.setText(R.string.pessoa_escrevendo);
                tela.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //replace this line to scroll up or down
                        tela.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                }, 50L);

                dialogo23.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status.setText(R.string.online);
                        d23.setVisibility(View.VISIBLE);
                        dialogo23.setText(R.string.dialogo23);
                        hora23.setText(hora.calculaHora());
                        tela.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //replace this line to scroll up or down
                                tela.fullScroll(ScrollView.FOCUS_DOWN);
                            }
                        }, 50L);

                    }
                }, 5000);


                // caixa de dialogo com delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(Conversa.this);
                        mensagem.setTitle(R.string.fim)
                                .setMessage(R.string.morreu)
                                .setPositiveButton(R.string.recomecar, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        startActivity(getIntent());
                                    }
                                })
                                .setNegativeButton(R.string.sair, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();

                                    }
                                });

                        mensagem.show();
                    }
                }, 6500);
                // fim da caixa de dialogo


            }

        });

        SharedPreferences sharedPreferencesA1a = getSharedPreferences(ARQUIVOSHAREDA1a, 0);
        SharedPreferences sharedPreferencesA2a = getSharedPreferences(ARQUIVOSHAREDA2a, 0);
        SharedPreferences sharedPreferencesB1a = getSharedPreferences(ARQUIVOSHAREDB1a, 0);
        SharedPreferences sharedPreferencesB2a = getSharedPreferences(ARQUIVOSHAREDB2a, 0);
        SharedPreferences sharedPreferencesC1a = getSharedPreferences(ARQUIVOSHAREDC1a, 0);
        SharedPreferences sharedPreferencesC2a = getSharedPreferences(ARQUIVOSHAREDC2a, 0);
        SharedPreferences sharedPreferencesC2Aa = getSharedPreferences(ARQUIVOSHAREDC2Aa, 0);
        SharedPreferences sharedPreferencesD1a = getSharedPreferences(ARQUIVOSHAREDD1a, 0);
        SharedPreferences sharedPreferencesD2a = getSharedPreferences(ARQUIVOSHAREDD2a, 0);
        SharedPreferences sharedPreferencesE1a = getSharedPreferences(ARQUIVOSHAREDE1a, 0);
        SharedPreferences sharedPreferencesE2a = getSharedPreferences(ARQUIVOSHAREDE2a, 0);
        SharedPreferences sharedPreferencesF1a = getSharedPreferences(ARQUIVOSHAREDF1a, 0);
        SharedPreferences sharedPreferencesF2a = getSharedPreferences(ARQUIVOSHAREDF2a, 0);
        SharedPreferences sharedPreferencesG1a = getSharedPreferences(ARQUIVOSHAREDG1a, 0);
        SharedPreferences sharedPreferencesG2a = getSharedPreferences(ARQUIVOSHAREDG2a, 0);
        SharedPreferences sharedPreferencesG1Aa = getSharedPreferences(ARQUIVOSHAREDG1Aa, 0);
        SharedPreferences sharedPreferencesH1a = getSharedPreferences(ARQUIVOSHAREDH1a, 0);
        SharedPreferences sharedPreferencesH2a = getSharedPreferences(ARQUIVOSHAREDH2a, 0);
        SharedPreferences sharedPreferencesH1Aa = getSharedPreferences(ARQUIVOSHAREDH1Aa, 0);
        SharedPreferences sharedPreferencesI1a = getSharedPreferences(ARQUIVOSHAREDI1a, 0);
        SharedPreferences sharedPreferencesI2a = getSharedPreferences(ARQUIVOSHAREDI2a, 0);
        SharedPreferences sharedPreferencesI1Aa = getSharedPreferences(ARQUIVOSHAREDI1Aa, 0);
        SharedPreferences sharedPreferencesJ1a = getSharedPreferences(ARQUIVOSHAREDJ1a, 0);
        SharedPreferences sharedPreferencesJ2a = getSharedPreferences(ARQUIVOSHAREDJ2a, 0);
        SharedPreferences sharedPreferencesK1a = getSharedPreferences(ARQUIVOSHAREDK1a, 0);
        SharedPreferences sharedPreferencesK2a = getSharedPreferences(ARQUIVOSHAREDK2a, 0);
        SharedPreferences sharedPreferencesL1a = getSharedPreferences(ARQUIVOSHAREDL1a, 0);
        SharedPreferences sharedPreferencesL2a = getSharedPreferences(ARQUIVOSHAREDL2a, 0);
        SharedPreferences sharedPreferencesL2Aa = getSharedPreferences(ARQUIVOSHAREDL2Aa, 0);
        SharedPreferences sharedPreferencesM1a = getSharedPreferences(ARQUIVOSHAREDM1a, 0);
        SharedPreferences sharedPreferencesM2a = getSharedPreferences(ARQUIVOSHAREDM2a, 0);

        SharedPreferences sharedPreferencesA1 = getSharedPreferences(ARQUIVOSHAREDA1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesA1a.contains("carregarA1a")) {
            if (sharedPreferencesA1.contains("carregarA1")) {
                String recuperarA1 = sharedPreferencesA1.getString("carregarA1", "carregar");
                Conversa.dA.setVisibility(View.VISIBLE);
                horaA.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoA.setText(R.string.dialogoA1);//coloca o texto antes de mostrar
                Conversa.d2.setVisibility(View.VISIBLE);
                hora2.setText(hora.calculaHora());// funcao da hora
                Conversa.d2a.setVisibility(View.VISIBLE);
                hora2a.setText(hora.calculaHora());// funcao da hora
                Conversa.d2b.setVisibility(View.VISIBLE);
                hora2b.setText(hora.calculaHora());// funcao da hora
                Conversa.d2c.setVisibility(View.VISIBLE);
                hora2c.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesB1a.contains("carregarB1a") || sharedPreferencesB2a.contains("carregarB2a")) {
                    Conversa.B1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.B2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.B2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesA2 = getSharedPreferences(ARQUIVOSHAREDA2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesA2a.contains("carregarA2a")) {
            if (sharedPreferencesA2.contains("carregarA2")) {
                String recuperarA2 = sharedPreferencesA2.getString("carregarA2", "carregar");
                Conversa.dA.setVisibility(View.VISIBLE);
                horaA.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoA.setText(R.string.dialogoA2);//coloca o texto antes de mostrar
                Conversa.d2.setVisibility(View.VISIBLE);
                hora2.setText(hora.calculaHora());// funcao da hora
                Conversa.d2a.setVisibility(View.VISIBLE);
                hora2a.setText(hora.calculaHora());// funcao da hora
                Conversa.d2b.setVisibility(View.VISIBLE);
                hora2b.setText(hora.calculaHora());// funcao da hora
                Conversa.d2c.setVisibility(View.VISIBLE);
                hora2c.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesB1a.contains("carregarB1a") || sharedPreferencesB2a.contains("carregarB2a")) {
                    Conversa.B1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.B2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.B1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.B2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesB1 = getSharedPreferences(ARQUIVOSHAREDB1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesB1a.contains("carregarB1a")) {
            if (sharedPreferencesB1.contains("carregarB1")) {
                String recuperarB1 = sharedPreferencesB1.getString("carregarB1", "carregar");
                Conversa.dB.setVisibility(View.VISIBLE);
                horaB.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoB.setText(R.string.dialogoB1);//coloca o texto antes de mostrar
                Conversa.d3.setVisibility(View.VISIBLE);
                hora3.setText(hora.calculaHora());// funcao da hora
                Conversa.d3a.setVisibility(View.VISIBLE);
                hora3a.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesC1a.contains("carregarC1a") || sharedPreferencesC2a.contains("carregarC2a")) {
                    Conversa.C1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.C2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.C1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.C2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesB2 = getSharedPreferences(ARQUIVOSHAREDB2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesB2a.contains("carregarB2a")) {
            if (sharedPreferencesB2.contains("carregarB2")) {
                String recuperarB2 = sharedPreferencesB2.getString("carregarB2", "carregar");
                Conversa.dB.setVisibility(View.VISIBLE);
                horaB.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoB.setText(R.string.dialogoB2);//coloca o texto antes de mostrar
                Conversa.d3.setVisibility(View.VISIBLE);
                hora3.setText(hora.calculaHora());// funcao da hora
                Conversa.d3a.setVisibility(View.VISIBLE);
                hora3a.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesC1a.contains("carregarC1a") || sharedPreferencesC2a.contains("carregarC2a")) {
                    Conversa.C1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.C2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.C1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.C2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesC1 = getSharedPreferences(ARQUIVOSHAREDC1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesC1a.contains("carregarC1a")) {
            if (sharedPreferencesC1.contains("carregarC1")) {
                String recuperarC1 = sharedPreferencesC1.getString("carregarC1", "carregar");
                Conversa.dC.setVisibility(View.VISIBLE);
                horaC.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoC.setText(R.string.dialogoC1);//coloca o texto antes de mostrar
                Conversa.d4.setVisibility(View.VISIBLE);
                hora4.setText(hora.calculaHora());// funcao da hora
                Conversa.d4a.setVisibility(View.VISIBLE);
                hora4a.setText(hora.calculaHora());// funcao da hora
                Conversa.d4b.setVisibility(View.VISIBLE);
                hora4b.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesC2Aa.contains("carregarC2Aa")) {
                    Conversa.C2a.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.C2a.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesC2 = getSharedPreferences(ARQUIVOSHAREDC2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesC2a.contains("carregarC2a")) {
            if (sharedPreferencesC2.contains("carregarC2")) {
                String recuperarC2 = sharedPreferencesC2.getString("carregarC2", "carregar");
                Conversa.dC.setVisibility(View.VISIBLE);
                horaC.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoC.setText(R.string.dialogoC2);//coloca o texto antes de mostrar
                Conversa.d5.setVisibility(View.VISIBLE);
                hora5.setText(hora.calculaHora());// funcao da hora
                Conversa.d5a.setVisibility(View.VISIBLE);
                hora5a.setText(hora.calculaHora());// funcao da hora
                Conversa.d5b.setVisibility(View.VISIBLE);
                hora5b.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesD1a.contains("carregarD1a") || sharedPreferencesD2a.contains("carregarD2a")) {
                    Conversa.D1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.D2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.D1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.D2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesC2A = getSharedPreferences(ARQUIVOSHAREDC2A, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesC2Aa.contains("carregarC2Aa")) {
            if (sharedPreferencesC2A.contains("carregarC2A")) {
                String recuperarC2A = sharedPreferencesC2A.getString("carregarC2A", "carregar");
                Conversa.dC.setVisibility(View.VISIBLE);
                horaC.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoC.setText(R.string.dialogoC2);//coloca o texto antes de mostrar
                Conversa.d5.setVisibility(View.VISIBLE);
                hora5.setText(hora.calculaHora());// funcao da hora
                Conversa.d5a.setVisibility(View.VISIBLE);
                hora5a.setText(hora.calculaHora());// funcao da hora
                Conversa.d5b.setVisibility(View.VISIBLE);
                hora5b.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesD1a.contains("carregarD1a") || sharedPreferencesD2a.contains("carregarD2a")) {
                    Conversa.D1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.D2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.D1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.D2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesD1 = getSharedPreferences(ARQUIVOSHAREDD1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesD1a.contains("carregarD1a")) {
            if (sharedPreferencesD1.contains("carregarD1")) {
                String recuperarD1 = sharedPreferencesD1.getString("carregarD1", "carregar");
                Conversa.dD.setVisibility(View.VISIBLE);
                horaD.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoD.setText(R.string.dialogoD1);//coloca o texto antes de mostrar
                Conversa.d6.setVisibility(View.VISIBLE);
                hora6.setText(hora.calculaHora());// funcao da hora
                Conversa.d6a.setVisibility(View.VISIBLE);
                hora6a.setText(hora.calculaHora());// funcao da hora
                Conversa.d6b.setVisibility(View.VISIBLE);
                hora6b.setText(hora.calculaHora());// funcao da hora
                Conversa.d6c.setVisibility(View.VISIBLE);
                hora6c.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesE1a.contains("carregarE1a") || sharedPreferencesE2a.contains("carregarE2a")) {
                    Conversa.E1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.E2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.E1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.E2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesD2 = getSharedPreferences(ARQUIVOSHAREDD2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesD2a.contains("carregarD2a")) {
            if (sharedPreferencesD2.contains("carregarD2")) {
                String recuperarD2 = sharedPreferencesD2.getString("carregarD2", "carregar");
                Conversa.dD.setVisibility(View.VISIBLE);
                horaD.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoD.setText(R.string.dialogoD2);//coloca o texto antes de mostrar
                Conversa.d6.setVisibility(View.VISIBLE);
                hora6.setText(hora.calculaHora());// funcao da hora
                Conversa.d6a.setVisibility(View.VISIBLE);
                hora6a.setText(hora.calculaHora());// funcao da hora
                Conversa.d6b.setVisibility(View.VISIBLE);
                hora6b.setText(hora.calculaHora());// funcao da hora
                Conversa.d6c.setVisibility(View.VISIBLE);
                hora6c.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesE1a.contains("carregarE1a") || sharedPreferencesE2a.contains("carregarE2a")) {
                    Conversa.E1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.E2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.E1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.E2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesE1 = getSharedPreferences(ARQUIVOSHAREDE1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesE1a.contains("carregarE1a")) {
            if (sharedPreferencesE1.contains("carregarE1")) {
                String recuperarE1 = sharedPreferencesE1.getString("carregarE1", "carregar");
                Conversa.dE.setVisibility(View.VISIBLE);
                horaE.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoE.setText(R.string.dialogoE1);//coloca o texto antes de mostrar
                Conversa.d9.setVisibility(View.VISIBLE);
                hora9.setText(hora.calculaHora());// funcao da hora
                Conversa.d9a.setVisibility(View.VISIBLE);
                hora9a.setText(hora.calculaHora());// funcao da hora
                Conversa.d9b.setVisibility(View.VISIBLE);
                hora9b.setText(hora.calculaHora());// funcao da hora
                Conversa.d9c.setVisibility(View.VISIBLE);
                hora9c.setText(hora.calculaHora());// funcao da hora
                hora9d.setText(hora.calculaHora());// funcao da hora
                Conversa.d9d.setVisibility(View.VISIBLE);
                hora9e.setText(hora.calculaHora());// funcao da hora
                Conversa.d9e.setVisibility(View.VISIBLE);
                if (sharedPreferencesG1a.contains("carregarG1a") || sharedPreferencesG2a.contains("carregarG2a")) {
                    Conversa.G1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.G2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.G1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.G2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesE2 = getSharedPreferences(ARQUIVOSHAREDE2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesE2a.contains("carregarE2a")) {
            if (sharedPreferencesE2.contains("carregarE2")) {
                String recuperarE2 = sharedPreferencesE2.getString("carregarE2", "carregar");
                Conversa.dE.setVisibility(View.VISIBLE);
                horaE.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoE.setText(R.string.dialogoE2);//coloca o texto antes de mostrar
                Conversa.d7.setVisibility(View.VISIBLE);
                hora7.setText(hora.calculaHora());// funcao da hora
                Conversa.d7a.setVisibility(View.VISIBLE);
                hora7a.setText(hora.calculaHora());// funcao da hora
                Conversa.d7b.setVisibility(View.VISIBLE);
                hora7b.setText(hora.calculaHora());// funcao da hora
                Conversa.d7c.setVisibility(View.VISIBLE);
                hora7c.setText(hora.calculaHora());// funcao da hora
                hora7d.setText(hora.calculaHora());// funcao da hora
                Conversa.d7d.setVisibility(View.VISIBLE);
                hora7e.setText(hora.calculaHora());// funcao da hora
                Conversa.d7e.setVisibility(View.VISIBLE);
                if (sharedPreferencesF1a.contains("carregarF1a") || sharedPreferencesF2a.contains("carregarF2a")) {
                    Conversa.F1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.F2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.F1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.F2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesF1 = getSharedPreferences(ARQUIVOSHAREDF1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesF1a.contains("carregarF1a")) {
            if (sharedPreferencesF1.contains("carregarF1")) {
                String recuperarF1 = sharedPreferencesF1.getString("carregarF1", "carregar");
                Conversa.dF.setVisibility(View.VISIBLE);
                horaF.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoF.setText(R.string.dialogoF1);//coloca o texto antes de mostrar
                Conversa.d8.setVisibility(View.VISIBLE);
                hora8.setText(hora.calculaHora());// funcao da hora
                Conversa.d8a.setVisibility(View.VISIBLE);
                hora8a.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesF2 = getSharedPreferences(ARQUIVOSHAREDF2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesF2a.contains("carregarF2a")) {
            if (sharedPreferencesF2.contains("carregarF2")) {
                String recuperarF2 = sharedPreferencesF2.getString("carregarF2", "carregar");
                Conversa.dF.setVisibility(View.VISIBLE);
                horaF.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoF.setText(R.string.dialogoF2);//coloca o texto antes de mostrar
                Conversa.d9.setVisibility(View.VISIBLE);
                hora9.setText(hora.calculaHora());// funcao da hora
                Conversa.d9a.setVisibility(View.VISIBLE);
                hora9a.setText(hora.calculaHora());// funcao da hora
                Conversa.d9b.setVisibility(View.VISIBLE);
                hora9b.setText(hora.calculaHora());// funcao da hora
                Conversa.d9c.setVisibility(View.VISIBLE);
                hora9c.setText(hora.calculaHora());// funcao da hora
                hora9d.setText(hora.calculaHora());// funcao da hora
                Conversa.d9d.setVisibility(View.VISIBLE);
                hora9e.setText(hora.calculaHora());// funcao da hora
                Conversa.d9e.setVisibility(View.VISIBLE);
                if (sharedPreferencesG1a.contains("carregarG1a") || sharedPreferencesG2a.contains("carregarG2a")) {
                    Conversa.G1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.G2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.G1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.G2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesG1 = getSharedPreferences(ARQUIVOSHAREDG1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesG1a.contains("carregarG1a")) {
            if (sharedPreferencesG1.contains("carregarG1")) {
                String recuperarG1 = sharedPreferencesG1.getString("carregarG1", "carregar");
                Conversa.dG.setVisibility(View.VISIBLE);
                horaG.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoG.setText(R.string.dialogoG1);//coloca o texto antes de mostrar
                Conversa.d29.setVisibility(View.VISIBLE);
                hora29.setText(hora.calculaHora());// funcao da hora
                Conversa.d29a.setVisibility(View.VISIBLE);
                hora29a.setText(hora.calculaHora());// funcao da hora
                Conversa.d29b.setVisibility(View.VISIBLE);
                hora29b.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesG1Aa.contains("carregarG1Aa")) {
                    Conversa.G1a.setVisibility(View.GONE); // mostra o proximo botao 1
                }else{
                    Conversa.G1a.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesG2 = getSharedPreferences(ARQUIVOSHAREDG2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesG2a.contains("carregarG2a")) {
            if (sharedPreferencesG2.contains("carregarG2")) {
                String recuperarG2 = sharedPreferencesG2.getString("carregarG2", "carregar");
                Conversa.dG.setVisibility(View.VISIBLE);
                horaG.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoG.setText(R.string.dialogoG2);//coloca o texto antes de mostrar
                Conversa.d10.setVisibility(View.VISIBLE);
                hora10.setText(hora.calculaHora());// funcao da hora
                Conversa.d11.setVisibility(View.VISIBLE);
                hora11.setText(hora.calculaHora());// funcao da hora
                Conversa.d12.setVisibility(View.VISIBLE);
                hora12.setText(hora.calculaHora());// funcao da hora
                Conversa.d13.setVisibility(View.VISIBLE);
                hora13.setText(hora.calculaHora());// funcao da hora
                Conversa.d14.setVisibility(View.VISIBLE);
                hora14.setText(hora.calculaHora());// funcao da hora

                if (sharedPreferencesH1a.contains("carregarH1a") || sharedPreferencesH2a.contains("carregarH2a")) {
                    Conversa.H1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.H2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.H1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.H2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesG1A = getSharedPreferences(ARQUIVOSHAREDG1A, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesG1Aa.contains("carregarG1Aa")) {
            if (sharedPreferencesG1A.contains("carregarG1A")) {
                String recuperarG1A = sharedPreferencesG1A.getString("carregarG1A", "carregar");
                Conversa.dGa.setVisibility(View.VISIBLE);
                horaGa.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoGa.setText(R.string.dialogoG1a);//coloca o texto antes de mostrar
                Conversa.d30.setVisibility(View.VISIBLE);
                hora30.setText(hora.calculaHora());// funcao da hora
                Conversa.d30a.setVisibility(View.VISIBLE);
                hora30a.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesL1a.contains("carregarL1a") || sharedPreferencesL2a.contains("carregarL2a")) {
                    Conversa.L1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.L2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.L1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.L2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesH1 = getSharedPreferences(ARQUIVOSHAREDH1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesH1a.contains("carregarH1a")) {
            if (sharedPreferencesH1.contains("carregarH1")) {
                String recuperarH1 = sharedPreferencesH1.getString("carregarH1", "carregar");
                Conversa.dH.setVisibility(View.VISIBLE);
                horaH.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoH.setText(R.string.dialogoH1);//coloca o texto antes de mostrar
                Conversa.d16.setVisibility(View.VISIBLE);
                hora16.setText(hora.calculaHora());// funcao da hora
                Conversa.d16a.setVisibility(View.VISIBLE);
                hora16a.setText(hora.calculaHora());// funcao da hora
                Conversa.d16b.setVisibility(View.VISIBLE);
                hora16b.setText(hora.calculaHora());// funcao da hora
                Conversa.d16c.setVisibility(View.VISIBLE);
                hora16c.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesH1Aa.contains("carregarH1Aa")) {
                    Conversa.H1a.setVisibility(View.GONE); // mostra o proximo botao 1
                }else{
                    Conversa.H1a.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesH2 = getSharedPreferences(ARQUIVOSHAREDH2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesH2a.contains("carregarH2a")) {
            if (sharedPreferencesH2.contains("carregarH2")) {
                String recuperarH2 = sharedPreferencesH2.getString("carregarH2", "carregar");
                Conversa.dH.setVisibility(View.VISIBLE);
                horaH.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoH.setText(R.string.dialogoH2);//coloca o texto antes de mostrar
                Conversa.d15.setVisibility(View.VISIBLE);
                hora15.setText(hora.calculaHora());// funcao da hora
                Conversa.d15a.setVisibility(View.VISIBLE);
                hora15a.setText(hora.calculaHora());// funcao da hora
                Conversa.d15b.setVisibility(View.VISIBLE);
                hora15b.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesH1A = getSharedPreferences(ARQUIVOSHAREDH1A, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesH1Aa.contains("carregarH1Aa")) {
            if (sharedPreferencesH1A.contains("carregarH1A")) {
                String recuperarH1A = sharedPreferencesH1A.getString("carregarH1A", "carregar");
                Conversa.dHa.setVisibility(View.VISIBLE);
                horaHa.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoHa.setText(R.string.dialogoH1a);//coloca o texto antes de mostrar
                Conversa.d17.setVisibility(View.VISIBLE);
                hora17.setText(hora.calculaHora());// funcao da hora
                Conversa.d17a.setVisibility(View.VISIBLE);
                hora17a.setText(hora.calculaHora());// funcao da hora
                Conversa.d17b.setVisibility(View.VISIBLE);
                hora17b.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesI1a.contains("carregarI1a") || sharedPreferencesI2a.contains("carregarI2a")) {
                    Conversa.I1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.I2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.I1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.I2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesI1 = getSharedPreferences(ARQUIVOSHAREDI1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesI1a.contains("carregarI1a")) {
            if (sharedPreferencesI1.contains("carregarI1")) {
                String recuperarI1 = sharedPreferencesI1.getString("carregarI1", "carregar");
                Conversa.dI.setVisibility(View.VISIBLE);
                horaI.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoI.setText(R.string.dialogoI1);//coloca o texto antes de mostrar
                Conversa.d27.setVisibility(View.VISIBLE);
                hora27.setText(hora.calculaHora());// funcao da hora
                Conversa.d27a.setVisibility(View.VISIBLE);
                hora27a.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesI1Aa.contains("carregarI1Aa")) {
                    Conversa.I1a.setVisibility(View.GONE); // mostra o proximo botao 1
                }else{
                    Conversa.I1a.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesI2 = getSharedPreferences(ARQUIVOSHAREDI2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesI2a.contains("carregarI2a")) {
            if (sharedPreferencesI2.contains("carregarI2")) {
                String recuperarI2 = sharedPreferencesI2.getString("carregarI2", "carregar");
                Conversa.dI.setVisibility(View.VISIBLE);
                horaI.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoI.setText(R.string.dialogoI2);//coloca o texto antes de mostrar
                Conversa.d19.setVisibility(View.VISIBLE);
                hora19.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesJ1a.contains("carregarJ1a") || sharedPreferencesJ2a.contains("carregarJ2a")) {
                    Conversa.J1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.J2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.J1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.J2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesI1A = getSharedPreferences(ARQUIVOSHAREDI1A, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesI1Aa.contains("carregarI1Aa")) {
            if (sharedPreferencesI1A.contains("carregarI1A")) {
                String recuperarI1A = sharedPreferencesI1A.getString("carregarI1A", "carregar");
                Conversa.dIa.setVisibility(View.VISIBLE);
                horaIa.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoIa.setText(R.string.dialogoI1a);//coloca o texto antes de mostrar
                Conversa.d28.setVisibility(View.VISIBLE);
                hora28.setText(hora.calculaHora());// funcao da hora
                Conversa.d28a.setVisibility(View.VISIBLE);
                hora28a.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesJ1 = getSharedPreferences(ARQUIVOSHAREDJ1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesJ1a.contains("carregarJ1a")) {
            if (sharedPreferencesJ1.contains("carregarJ1")) {
                String recuperarJ1 = sharedPreferencesJ1.getString("carregarJ1", "carregar");
                Conversa.dJ.setVisibility(View.VISIBLE);
                horaJ.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoJ.setText(R.string.dialogoJ1);//coloca o texto antes de mostrar
                Conversa.d20.setVisibility(View.VISIBLE);
                hora20.setText(hora.calculaHora());// funcao da hora
                Conversa.d21.setVisibility(View.VISIBLE);
                hora21.setText(hora.calculaHora());// funcao da hora
                Conversa.d22.setVisibility(View.VISIBLE);
                hora22.setText(hora.calculaHora());// funcao da hora
                Conversa.d22a.setVisibility(View.VISIBLE);
                hora22a.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesK1a.contains("carregarK1a") || sharedPreferencesK2a.contains("carregarK2a")) {
                    Conversa.K1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.K2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.K1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.K2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesJ2 = getSharedPreferences(ARQUIVOSHAREDJ2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesJ2a.contains("carregarJ2a")) {
            if (sharedPreferencesJ2.contains("carregarJ2")) {
                String recuperarJ2 = sharedPreferencesJ2.getString("carregarJ2", "carregar");
                Conversa.dJ.setVisibility(View.VISIBLE);
                horaJ.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoJ.setText(R.string.dialogoJ2);//coloca o texto antes de mostrar
                Conversa.d26.setVisibility(View.VISIBLE);
                hora26.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesK1 = getSharedPreferences(ARQUIVOSHAREDK1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesK1a.contains("carregarK1a")) {
            if (sharedPreferencesK1.contains("carregarK1")) {
                String recuperarK1 = sharedPreferencesK1.getString("carregarK1", "carregar");
                Conversa.dK.setVisibility(View.VISIBLE);
                horaK.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoK.setText(R.string.dialogoK1);//coloca o texto antes de mostrar
                Conversa.d24.setVisibility(View.VISIBLE);
                hora24.setText(hora.calculaHora());// funcao da hora
                Conversa.d24a.setVisibility(View.VISIBLE);
                hora24a.setText(hora.calculaHora());// funcao da hora
                Conversa.d25.setVisibility(View.VISIBLE);
                hora25.setText(hora.calculaHora());// funcao da hora
                Conversa.d25a.setVisibility(View.VISIBLE);
                hora25a.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesK2 = getSharedPreferences(ARQUIVOSHAREDK2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesK2a.contains("carregarK2a")) {
            if (sharedPreferencesK2.contains("carregarK2")) {
                String recuperarK2 = sharedPreferencesK2.getString("carregarK2", "carregar");
                Conversa.dK.setVisibility(View.VISIBLE);
                horaK.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoK.setText(R.string.dialogoK2);//coloca o texto antes de mostrar
                Conversa.d23.setVisibility(View.VISIBLE);
                hora23.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesL1 = getSharedPreferences(ARQUIVOSHAREDL1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesL1a.contains("carregarL1a")) {
            if (sharedPreferencesL1.contains("carregarL1")) {
                String recuperarL1 = sharedPreferencesL1.getString("carregarL1", "carregar");
                Conversa.dL.setVisibility(View.VISIBLE);
                horaL.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoL.setText(R.string.dialogoL1);//coloca o texto antes de mostrar
                Conversa.d33.setVisibility(View.VISIBLE);
                hora33.setText(hora.calculaHora());// funcao da hora
                Conversa.d33a.setVisibility(View.VISIBLE);
                hora33a.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesM1a.contains("carregarM1a") || sharedPreferencesM2a.contains("carregarM2a")) {
                    Conversa.M1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.M2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.M1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.M2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesL2 = getSharedPreferences(ARQUIVOSHAREDL2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesL2a.contains("carregarL2a")) {
            if (sharedPreferencesL2.contains("carregarL2")) {
                String recuperarL2 = sharedPreferencesL2.getString("carregarL2", "carregar");
                Conversa.dL.setVisibility(View.VISIBLE);
                horaL.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoL.setText(R.string.dialogoL2);//coloca o texto antes de mostrar
                Conversa.d31.setVisibility(View.VISIBLE);
                hora31.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesL2Aa.contains("carregarL2Aa")) {
                    Conversa.L2a.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.L2a.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }

        SharedPreferences sharedPreferencesL2A = getSharedPreferences(ARQUIVOSHAREDL2A, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesL2Aa.contains("carregarL2Aa")) {
            if (sharedPreferencesL2A.contains("carregarL2A")) {
                String recuperarL2A = sharedPreferencesL2A.getString("carregarL2A", "carregar");
                Conversa.dLa.setVisibility(View.VISIBLE);
                horaLa.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoLa.setText(R.string.dialogoL2a);//coloca o texto antes de mostrar
                Conversa.d31a.setVisibility(View.VISIBLE);
                hora31a.setText(hora.calculaHora());// funcao da hora
                Conversa.d31b.setVisibility(View.VISIBLE);
                hora31b.setText(hora.calculaHora());// funcao da hora
                Conversa.d32.setVisibility(View.VISIBLE);
                hora32.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesM1 = getSharedPreferences(ARQUIVOSHAREDM1, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesM1a.contains("carregarM1a")) {
            if (sharedPreferencesM1.contains("carregarM1")) {
                String recuperarM1 = sharedPreferencesM1.getString("carregarM1", "carregar");
                Conversa.dM.setVisibility(View.VISIBLE);
                horaM.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoM.setText(R.string.dialogoM1);//coloca o texto antes de mostrar
                Conversa.d34.setVisibility(View.VISIBLE);
                hora34.setText(hora.calculaHora());// funcao da hora
                Conversa.d34a.setVisibility(View.VISIBLE);
                hora34a.setText(hora.calculaHora());// funcao da hora
                Conversa.d34b.setVisibility(View.VISIBLE);
                hora34b.setText(hora.calculaHora());// funcao da hora
                Conversa.d34c.setVisibility(View.VISIBLE);
                hora34c.setText(hora.calculaHora());// funcao da hora
            }
        }

        SharedPreferences sharedPreferencesM2 = getSharedPreferences(ARQUIVOSHAREDM2, 0);
        if(Menu.btncarregarvariavel == "1" && sharedPreferencesM2a.contains("carregarM2a")) {
            if (sharedPreferencesM2.contains("carregarM2")) {
                String recuperarM2 = sharedPreferencesM2.getString("carregarM2", "carregar");
                Conversa.dM.setVisibility(View.VISIBLE);
                horaM.setText(hora.calculaHora());// funcao da hora
                Conversa.dialogoM.setText(R.string.dialogoM2);//coloca o texto antes de mostrar
                Conversa.d11.setVisibility(View.VISIBLE);
                hora11.setText(hora.calculaHora());// funcao da hora
                Conversa.d12.setVisibility(View.VISIBLE);
                hora12.setText(hora.calculaHora());// funcao da hora
                Conversa.d13.setVisibility(View.VISIBLE);
                hora13.setText(hora.calculaHora());// funcao da hora
                Conversa.d14.setVisibility(View.VISIBLE);
                hora14.setText(hora.calculaHora());// funcao da hora
                if (sharedPreferencesH1a.contains("carregarH1a") || sharedPreferencesH2a.contains("carregarH2a")) {
                    Conversa.H1.setVisibility(View.GONE); // mostra o proximo botao 1
                    Conversa.H2.setVisibility(View.GONE);//mostra o proximo botao 2
                }else{
                    Conversa.H1.setVisibility(View.VISIBLE); // mostra o proximo botao 1
                    Conversa.H2.setVisibility(View.VISIBLE);//mostra o proximo botao 2
                }
                Conversa.caixaresposta.setVisibility(View.GONE);
            }
        }




    }
}