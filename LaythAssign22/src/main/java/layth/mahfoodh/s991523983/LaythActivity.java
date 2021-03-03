/*
Layth Mahfoodh s991523983 PROG38448
 */

package layth.mahfoodh.s991523983;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LaythActivity extends AppCompatActivity {
    private Button btnNext;
    RadioButton rBtnPizzaPizza, rBtnPizzaNova, rBtnPizzaHut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        rBtnPizzaPizza = (RadioButton)findViewById(R.id.rBtnPizzaPizza);
        rBtnPizzaNova = (RadioButton)findViewById(R.id.rBtnPizzaNova);
        rBtnPizzaHut = (RadioButton)findViewById(R.id.rBtnPizzaHut);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overview_menu, menu);
        return true;
    }
    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.help:
             //   Toast.makeText(this, "You selected start!", Toast.LENGTH_LONG).show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.doordash.com/en-CA"));
                startActivity(intent);
                break;

            case R.id.icon:
              //  Toast.makeText(this, "You selected Play!", Toast.LENGTH_LONG).show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.dominos.ca/"));
                startActivity(intent);
                break;

            case R.id.name:
                Toast.makeText(this, "This is a pizza restaurants app!", Toast.LENGTH_LONG).show();
                break;


/*
            case R.id.stop:
                Toast.makeText(this, "You selected stop!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this, "You selected help!", Toast.LENGTH_LONG).show();
                break;
            case R.id.nothelp:
                Toast.makeText(this, "You selected nothelp!", Toast.LENGTH_LONG).show();
                break;

 */
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;

    }

    public void callAction(View view) {
        Intent intent = null;
        if(rBtnPizzaPizza.isChecked()==true){
            intent = new Intent(this, MahfoodhActivity2.class);
                startActivity(intent);
        }
        else if(rBtnPizzaPizza.isChecked()==true){
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.cp24.ca/"));
            startActivity(intent);
        }
        else{
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.cbc.ca/"));
            startActivity(intent);
        }

        //   public void onRadioButtonClicked(View view){
        //  boolean checked = ((RadioButton) view).isChecked();
       //    intent = new Intent(this, MahfoodhActivity2.class);
       //    startActivity(intent);

    }

     //   }
   // }
/*
    public void onRadioButtonClicked(View view) {
    // Is the button now checked?
    boolean checked = ((RadioButton) view).isChecked();

    // Check which radio button was clicked
        Intent intent = null;
    switch(view.getId()) {
        case R.id.rBtnPizzaPizza:
            if (checked)
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.dominos.ca/"));
            startActivity(intent);
            break;
        case R.id.rBtnPizzaNova:
            if (checked)
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.cp24.ca/"));
            startActivity(intent);
            break;
        case R.id.rBtnPizzaHut:
            if (checked)
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.cbc.ca/"));
            startActivity(intent);
                break;

    }

}
*/


}