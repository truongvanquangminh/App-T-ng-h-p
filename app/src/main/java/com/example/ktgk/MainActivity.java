package com.example.ktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button bt;
    TextView signup;
    private EditText username,password;
        String correct_username= "admin";
        String correct_password= "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.btlg);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền. Mời nhập lại",Toast.LENGTH_LONG).show();
                } else if(username.getText().toString().equals(correct_username)){
                    if(password.getText().toString().equals(correct_password)){
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công",Toast.LENGTH_LONG).show();
                        open(view);
                    }else{
                        Toast.makeText(MainActivity.this, "Sai tên đăng nhập hoặc mật khẩu. Nhập lại",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Sai tên đăng nhập hoặc mật khẩu. Nhập lại",Toast.LENGTH_LONG).show();
                }
            }
        });
        username=(EditText) findViewById(R.id.edittextuser);
        password=(EditText) findViewById(R.id.edittextpass);

        signup = (TextView) findViewById(R.id.textViewSignUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp(view);
            }
        });
    }

    void open(View v) {
        Intent dsp = new Intent(this, listviewTraiCay.class);
        startActivity(dsp);
    }

    void openSignUp(View v) {
        Intent dsp = new Intent(this, SignUp.class);
        startActivity(dsp);
    }

}