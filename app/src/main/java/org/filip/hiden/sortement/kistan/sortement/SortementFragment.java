package org.filip.hiden.sortement.kistan.sortement;

/**
 * Created by fhiden on 2017-03-20.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class SortementFragment extends Fragment {
    ArrayList<SortementItem> items;
    ListView sortement;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sortement, container, false);

        sortement = (ListView) rootView.findViewById(R.id.sortment_view);
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

        SortementAdapter adapter = new SortementAdapter(getContext(), R.id.sortement_item, items );
        sortement.setAdapter(adapter);
        return rootView;
    }
}