package com.gmail.ikeyunia62.responsipraktikummobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends Activity {

    TextView tnama,tnim, tjurusan, talamat;
    String get_nama,get_nim, get_jurusan, get_alamat;
    Button menu;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        menu=(Button)findViewById(R.id.kembali);
        tnama = (TextView) findViewById(R.id.tvnama);
        tnim = (TextView) findViewById(R.id.tvnim);
        tjurusan = (TextView) findViewById(R.id.tvjurusan);
        talamat = (TextView) findViewById(R.id.tvalamat);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");
        get_nim = b.getString("parse_nim");
        get_jurusan = b.getString("parse_jurusan");
        get_alamat = b.getString("parse_alamat");

        tnim.setText("Nama : "+get_nama);
        tnama.setText("Nim : "+get_nim);
        tjurusan.setText("Jurusan : "+get_jurusan);
        talamat.setText("Alamat : "+get_alamat);


    }
    public void onClick(View v) {
        Intent intent = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(intent);

    }
}

