package site.ngeno.uzagari;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.carListView) ListView carListView;
    private List<String[]> carList = new ArrayList<String[]>();
    private String[] car1 = new String[]{"Mercedes","2000000", "pic_url"};
    private String[] car2 = new String[]{"Mercedes","2000000", "pic_url"};
    private String[] car3 = new String[]{"Mercedes","2000000", "pic_url"};
    private String[] car4 = new String[]{"Mercedes","2000000", "pic_url"};
    private String[] car5 = new String[]{"Mercedes","2000000", "pic_url"};

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


        ArrayAdapter arrayAdapter = new CarListArrayAdapter(this, android.R.layout.simple_list_item_1, carList);
        carListView.setAdapter(arrayAdapter);
    }
}
