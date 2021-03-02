/*
Layth Mahfoodh s991523983 PROG38448
 */

package layth.mahfoodh.s991523983;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class LaythActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}