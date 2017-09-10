package site.ngeno.uzagari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CarDetails extends AppCompatActivity {
    @Bind(R.id.name_text) TextView nameTextView;
    @Bind(R.id.price_text) TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");

        nameTextView.setText(name);
        priceTextView.setText(price);


    }
}
