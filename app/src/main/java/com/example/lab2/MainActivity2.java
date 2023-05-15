package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {
EditText edt_hoten = findViewById(R.id.edt_hoten);
EditText edt_msv = findViewById(R.id.edt_msv);
EditText edt_tuoi = findViewById(R.id.edt_tuoi);
RadioButton rdon_Nam = findViewById(R.id.rdo_Nam);
RadioButton rdon_Nu = findViewById(R.id.rdo_Nu);
CheckBox chk_Football = findViewById(R.id.chk_Football);
CheckBox chk_Game = findViewById(R.id.chk_Game);
Button btn_luu=findViewById(R.id.btn_luu);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public Button getBtn_luu() {
        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoten=edt_hoten.getText().toString();
                String msv = edt_msv.getText().toString();
                String tuoi =edt_tuoi.getText().toString();
                String gioitinh=rdon_Nam.isChecked()
                        ?rdon_Nam.getText().toString()
                        :rdon_Nu.isChecked()
                        ?rdon_Nu.getText().toString()
                        :"Chua chon gioi tinh";
                String sothich =chk_Football.isChecked()&&chk_Game.isChecked()
                        ?"Da bong va choi game";
                        :chk_Football.isChecked()
                        ?chk_Football.getText().toString()
                        :chk_Game.isChecked()
                        ?chk_Game.getText().toString()


            }
        });
    }
}