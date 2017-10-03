package mariam.hashash.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText edna,edpa;
    Button btu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edna = (EditText)findViewById(R.id.edname);
        edpa = (EditText)findViewById(R.id.edpass);
        btu = (Button)findViewById(R.id.edbutton);
        btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edna.getText().toString();
                String passward = edpa.getText().toString();
                Intent i = new Intent(MainActivity.this,Seconed.class);
                i.putExtra("user",name);
                i.putExtra("pass",passward);
                startActivity(i);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.backId)
        {
            System.exit(-1);
        }
        else if (item.getItemId() == R.id.nextId)
        {
            Intent i = new Intent(MainActivity.this,Seconed.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);

    }


}
