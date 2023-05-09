package it.primoprogetto.orario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /** Il metodo onCreate() e' eseguito quando l'utente avvia l'applicazione */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Codice sviluppato da me
        Date date = new Date(); // la classe Date e' necessaria per leggere l'ora corrente
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); // con la DateFormat do una formattazione alla data
        String strOrario = dateFormat.format(date); // trasformo ora la data in una stringa grazie alla DateFormat

        /** L'etichetta e' stata identificata nel file di layout con il nome txt_orario e puo' essere
         *  utilizzata nel codice Java cercando il riferimento con il metodo findViewById */
        TextView txtOrario = (TextView) findViewById(R.id.txt_orario);
        txtOrario.setText(strOrario);
    }
}