package site.ngeno.uzagari;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.carListView) ListView carListView;
    private List<String[]> carList = new ArrayList<String[]>();
    private String[] car1 = new String[]{"Mercedes EClass","2000000", "pic_url"};
    private String[] car2 = new String[]{"Toyota MarkIX","2000000", "pic_url"};
    private String[] car3 = new String[]{"Tractor","2000000", "pic_url"};
    private String[] car4 = new String[]{"Mercedes SClass","2000000", "pic_url"};
    private String[] car5 = new String[]{"Tesla","2000000", "pic_url"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        final ArrayAdapter arrayAdapter = new CarListArrayAdapter(this, R.layout.main_list_item, carList);

        carListView.setAdapter(arrayAdapter);

        carListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = ((TextView)view).getText().toString();
                Intent intent = new Intent(MainActivity.this, CarDetails.class);
                intent.putExtra("name", name);
                intent.putExtra("price", name);
                startActivity(intent);
            }
        });
    }
}
