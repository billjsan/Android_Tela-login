package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText _et_username, _et_password;
    Button _bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //faz referencia aos elementos de layout comos objetos criados
    _et_username = findViewById(R.id.et_username);
    _et_password = findViewById(R.id.et_password);
    _bt_login = findViewById(R.id.bt_login);


    //cria o evento de clique no botão
    _bt_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String username = _et_username.getText().toString();
            String password = _et_password.getText().toString();


            if(username.equals("user") && password.equals("pass")){

                Toast.makeText(MainActivity.this, "Login válido", Toast.LENGTH_LONG).show();

                Intent changeActivity = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(changeActivity);
            }
            else{
                Toast.makeText(MainActivity.this, "Login inválido", Toast.LENGTH_SHORT).show();
            }

            _et_username.setText("");
            _et_password.setText("");
        }
    });





    }
}