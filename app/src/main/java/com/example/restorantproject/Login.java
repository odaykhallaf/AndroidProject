package com.example.restorantproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Class<Connection> connect;
    private Button logbt;
    private Button logbt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_login);
        logbt=(Button)findViewById(R.id.btn2);

        logbt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                openOrder();
            }
        });
        logbt2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                openOrderStatus();
            }
        });
    }

    public void GetTextFromdatabase(View V){
        EditText edt1=(EditText) findViewById(R.id.logedt1);
        EditText edt2=(EditText) findViewById(R.id.logedt2);
        String name = edt1.getText().toString();
        String Password = edt2.getText().toString();
        try {
            Connection connection=new Connection();
            if(connect !=null){

                String SQSelect = "SELECT * FROM employe WHERE  ( name, password , ) values ('"
                        +  name + "','" +  Password+ "','" + "')";




            }
        }
        catch (Exception ex){

        }
    }
    public void openOrder(){
        Intent intent=new Intent(this, OrdarList.class);
        startActivity(intent);
    }
    public void  openOrderStatus(){
        Intent intent=new Intent(this, OrderStatus.class);
        startActivity(intent);
    }

}