package mariam.hashash.test3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by user on 9/30/2017.
 */

public class Seconed extends AppCompatActivity{
   TextView txt1,txt2;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seconed);
        txt1 = (TextView)findViewById(R.id.txuser);
        txt2 = (TextView)findViewById(R.id.txpass);
        if (!getIntent().getStringExtra("user").equals(null) && !getIntent().getStringExtra("pass").equals(null)) {
            String n1 = getIntent().getStringExtra("user").toString();
            String p1 = getIntent().getStringExtra("pass").toString();
            txt1.setText(n1);
            txt2.setText(p1);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        MenuItem item = menu.findItem(R.id.nextId);
        item.setVisible(false);
        return super.onCreateOptionsMenu(menu);
        //return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id =item.getItemId();
        if (id == R.id.backId)
        {
            Intent i2 = new Intent(Seconed.this,MainActivity.class);
            startActivity(i2);
        }

        return super.onOptionsItemSelected(item);
    }

}
