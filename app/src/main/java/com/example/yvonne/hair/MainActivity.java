package com.example.yvonne.hair;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

            listView1.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String cities = String.valueOf(parent.getItemAtPosition(position));
                            Toast.makeText(MainActivity.this, cities, Toast.LENGTH_LONG).show();

                            if (position == 0) {
                                //code specific to first list item
                                Intent myIntent = new Intent(view.getContext(), Twa.class);
                                startActivityForResult(myIntent, 0);


                            } else if (position == 1) {
                                Intent myIntent = new Intent(view.getContext(), AwkwardStage.class);
                                startActivityForResult(myIntent, 0);
                            } else if (position == 2) {
                                Intent myIntent = new Intent(view.getContext(), MediumLong.class);
                                startActivityForResult(myIntent, 0);
                            } else if (position == 3) {
                                Intent myIntent = new Intent(view.getContext(), Baafro.class);
                                startActivityForResult(myIntent, 0);
                            }
                        }
                    }
            );


        }
                    }
