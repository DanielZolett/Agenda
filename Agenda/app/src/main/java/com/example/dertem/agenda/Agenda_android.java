package com.example.dertem.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Agenda_android extends Activity {

    Spinner sistemas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_android);

        sistemas = (Spinner) findViewById(R.id.salvar);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Salvar,android.R.layout.simple_spinner_item);
        sistemas.setAdapter(adapter);

        sistemas = (Spinner) findViewById(R.id.Mobiles);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.Mobiles,android.R.layout.simple_spinner_item);
        sistemas.setAdapter(adapter1);

        sistemas = (Spinner) findViewById(R.id.Residencial);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.Residencial,android.R.layout.simple_spinner_item);
        sistemas.setAdapter(adapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_agenda_android, menu);
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
}
