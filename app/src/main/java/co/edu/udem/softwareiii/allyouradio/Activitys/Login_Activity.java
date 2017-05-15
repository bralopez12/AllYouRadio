package co.edu.udem.softwareiii.allyouradio.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.edu.udem.softwareiii.allyouradio.R;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {


    EditText etUsuario, etPassword;
    Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = (EditText)findViewById(R.id.etUsuario);
        etPassword = (EditText)findViewById(R.id.etPassword);

        btnSignIn = (Button)findViewById(R.id.btnSingIn);
        btnSignUp = (Button)findViewById(R.id.btnSingUp);

        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(Login_Activity.this, "RTF 4 - ING.SOFTWARE III", Toast.LENGTH_SHORT).show();
            Toast.makeText(Login_Activity.this, "Universidad de Medellín", Toast.LENGTH_SHORT).show();
            Toast.makeText(Login_Activity.this, "Por:", Toast.LENGTH_SHORT).show();
            Toast.makeText(Login_Activity.this, "Andres Felipe Granda", Toast.LENGTH_SHORT).show();
            Toast.makeText(Login_Activity.this, "Sebastian Moncada", Toast.LENGTH_SHORT).show();
            Toast.makeText(Login_Activity.this, "Brayan López", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){



            case R.id.btnSingIn:

                break;


            case R.id.btnSingUp:

                break;



        }


    }
}
