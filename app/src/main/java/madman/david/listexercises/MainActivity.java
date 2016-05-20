package madman.david.listexercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList list = new ArrayList();
        list.add(new Computers("dell", "Windows8"));
        list.add(new Computers("hp", "Windows7"));
        list.add(new Computers("macbook", "osx"));

        ListView listView = (ListView)findViewById(R.id.listView);
        ComputersArrayAdapter adapter = new ComputersArrayAdapter(this, R.layout.row, list);
        listView.setAdapter(adapter);
    }
}
