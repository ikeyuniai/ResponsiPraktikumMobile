package com.gmail.ikeyunia62.responsipraktikummobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class Main2Activity extends AppCompatActivity {
    EditText fieldnama, fieldnim, fieldjurusan, fieldalamat;
    Button tombolok;
    String var_nama, var_nim, var_jurusan, var_alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fieldnama = (EditText) findViewById(R.id.nama);
        fieldnim = (EditText) findViewById(R.id.nim);
        fieldjurusan = (EditText) findViewById(R.id.jurusan);
        fieldalamat = (EditText) findViewById(R.id.alamat);
        tombolok = (Button) findViewById(R.id.ok);
        Button tombolok = (Button) findViewById(R.id.ok);
        tombolok.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                var_nama = fieldnama.getText().toString();
                var_nim = fieldnim.getText().toString();
                Intent i = null;
                i = new Intent(Main2Activity.this, Main3Activity.class);

                Bundle b = new Bundle();

                b.putString("parse_nama", var_nama);
                b.putString("parse_nim", var_nim);
                b.putString("parse_jurusan", var_jurusan);
                b.putString("parse_alamat", var_alamat);
                i.putExtras(b);

                startActivity(i);

            }
        });
    }


    }

