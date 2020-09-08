package tryme.gohoof.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView name, description, rating;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        extras = getIntent().getExtras();

        name = (TextView) findViewById(R.id.dnameID);
        description = (TextView) findViewById(R.id.ddescriptionID);
        rating= (TextView) findViewById(R.id.dratingID);

        if(extras!=null)
        {
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
            rating.setText(extras.getString("rating"));
        }
    }
}