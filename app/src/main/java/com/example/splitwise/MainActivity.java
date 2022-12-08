package com.example.splitwise;

import static com.example.splitwise.DetailActivity.name_amount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView detlistview;
    static List printBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setdetAdapter();
    }

    private void setdetAdapter() {

        DetailsAdapter detailsAdapter = new DetailsAdapter(getApplicationContext(), Detail.detailsArrayList);
        detlistview.setAdapter(detailsAdapter);
    }

    private void initWidgets() {
        detlistview = findViewById(R.id.group_listview);
    }


    public void newDet(View view) {

        Intent newDetIntent = new Intent(this, DetailActivity.class);
        startActivity(newDetIntent);
    }



    public void FINDPATH(View view) {

        Intent splitIntent = new Intent(this, Splitwise.class);
        startActivity(splitIntent);
    }
}