package com.example.yvonne.hair;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ListView listView1 = (ListView) findViewById(R.id.hair_list);

            String[] items = { "TWA", "Awkward Stage", "Medium Long", "Big Ass Afro"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);

            listView1.setAdapter(adapter);
        }
    }