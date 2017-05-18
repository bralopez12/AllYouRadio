package co.edu.udem.softwareiii.allyouradio.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import co.edu.udem.softwareiii.allyouradio.R;

public class RegisterListener_Activity extends AppCompatActivity implements View.OnClickListener {


    EditText etRegisterListener_email,etRegisterListener_name,etRegisterListener_password;
    Button btnRegister_Listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_listener);

        etRegisterListener_email = (EditText)findViewById(R.id.etRegisterListener_email);
        etRegisterListener_name = (EditText)findViewById(R.id.etRegisterListener_name);
        etRegisterListener_password = (EditText)findViewById(R.id.etRegisterListener_password);

        btnRegister_Listener = (Button)findViewById(R.id.btnRegister_listener);

        btnRegister_Listener.setOnClickListener(this);

    }

    public boolean ValidarDatosOyente(String email,String nombre,String contraseña){

        return true;
    }

    public void RegistrarOyente(String email,String nombre,String contraseña){



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register_listener, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnRegister_listener:

                break;


        }


    }
}
