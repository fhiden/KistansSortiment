package org.filip.hiden.sortement.kistan.sortement.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.filip.hiden.sortement.kistan.sortement.R;
import org.filip.hiden.sortement.kistan.sortement.model.adapters.SortementAdapter;
import org.filip.hiden.sortement.kistan.sortement.model.SortementItem;

import java.util.ArrayList;

public class SortementActivity extends AppCompatActivity {
    ArrayList<SortementItem> items;
    ListView sortement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortement);

        sortement = (ListView) findViewById(R.id.sortment_view);
        items = new ArrayList<>();
        items.add(new SortementItem("item1", "cider", 30.0, "kr st"));
        items.add(new SortementItem("item2", "öl", 20.0, "kr st"));
        items.add(new SortementItem("item3", "vin", 60.0, "kr st"));
        items.add(new SortementItem("item4", "märke", 10.0, "kr st"));
        items.add(new SortementItem("item5", "cider", 30.0, "kr st"));
        items.add(new SortementItem("item6", "öl", 20.0, "kr st"));
        items.add(new SortementItem("item7", "vin", 60.0, "kr st"));
        items.add(new SortementItem("item8", "märke", 10.0, "kr st"));

        items.add(new SortementItem("item9", "cider", 30.0, "kr st"));
        items.add(new SortementItem("item10", "öl", 20.0, "kr st"));
        items.add(new SortementItem("item11", "vin", 60.0, "kr st"));
        items.add(new SortementItem("item12", "märke", 10.0, "kr st"));

        SortementAdapter adapter = new SortementAdapter(this, R.id.sortement_item, items );

        sortement.setAdapter(adapter);
    }
}
