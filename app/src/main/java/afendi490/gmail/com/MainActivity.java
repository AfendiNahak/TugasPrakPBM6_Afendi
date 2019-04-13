package afendi490.gmail.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Todo 1 : deklarasi objek Button dan objek EditText
    Button bttn1;
    EditText username, passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Todo 2 : menginisialisasi objek dengan id
        username = (EditText) findViewById(R.id.editText);
        passwd = (EditText) findViewById(R.id.editText2);
        bttn1 = (Button) findViewById(R.id.button);
        bttn1.setOnClickListener(this);
    }

    @Override

    //Todo 3 : membuat method untuk memanggil method login()
    public void onClick(View v) {
        Login();
    }

    //Todo 4 : method untuk login
    public void Login(){

        //Todo 5 : jika kondisi username dan password sama dengan TRUE maka akan masuk ke ListView
        if(username.getText().toString().equals("Afendi Nahak")&&passwd.getText().toString().equals("165410135")){
            Intent masuk = new Intent(this, List.class);
            startActivity(masuk);

            //Todo 6 : jika Salah maka akan menampilkan pesan "Username/Password Salah".
        }else {
            Toast.makeText(MainActivity.this, "Username/Password Salah", Toast.LENGTH_SHORT).show();
        }
    }

    //Todo 7 : method untuk melakukan registrasi yang mengacuh pada halaman activity registrasi
    public void Registarasi (View view){
        Intent regis = new Intent(MainActivity.this, Registrasi.class);
        startActivity(regis);
    }
}