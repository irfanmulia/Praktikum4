package id.ac.unsyiah.elektro.mobile.aplikasipertama;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void onClickTombolTerjemah (View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.buttonIndonesia);
        bahasaIndonesia = false;
        String apakabar = getString(R.string.apa_kabar);
        txtTulisan.setText(apakabar);

        bahasaIndonesia = true;

    }
    public void onClickTombolTerjemah2 (View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.buttonIndonesia);
        bahasaIndonesia = false;
        String hello = getString(R.string.hello_world);
        txtTulisan.setText(hello);

        bahasaIndonesia = true;
    }
    public void onClickTombolTerjemah3 (View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.buttonIndonesia);
        bahasaIndonesia = false;
        String puhaba = getString(R.string.pu_haba);
        txtTulisan.setText(puhaba);

        bahasaIndonesia = true;
    }
    private boolean bahasaIndonesia = false;
}
