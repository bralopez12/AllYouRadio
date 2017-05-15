package co.edu.udem.softwareiii.allyouradio.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import co.edu.udem.softwareiii.allyouradio.R;

public class TypeRegister_Activity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnOyenteRegister, btnEmisoraRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_register);

        btnOyenteRegister = (ImageButton)findViewById(R.id.btnOyenteRegister);
        btnEmisoraRegister = (ImageButton)findViewById(R.id.btnEmisoraRegister);

        btnOyenteRegister.setOnClickListener(this);
        btnEmisoraRegister.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_type_register, menu);
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

            case R.id.btnOyenteRegister:

                break;

            case R.id.btnEmisoraRegister:

                break;


        }

    }
}
