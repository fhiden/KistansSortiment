package org.filip.hiden.sortement.kistan.sortement.model.FragmentManagers;

/**
 * Created by fhiden on 2017-03-20.
 */

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.filip.hiden.sortement.kistan.sortement.R;
import org.filip.hiden.sortement.kistan.sortement.model.adapters.SortementAdapter;
import org.filip.hiden.sortement.kistan.sortement.model.SortementItem;

import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class SortementFragment extends Fragment {
    ArrayList<SortementItem> items;
    ListView sortement;
    String categoryType;


    @SuppressLint("ValidFragment")
    public SortementFragment(String categoryType){
        this.categoryType = categoryType; // Som öl, cider och sådana kategorier.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sortement, container, false);

        sortement = (ListView) rootView.findViewById(R.id.sortment_view);
        items = new ArrayList<>();
        items.add(new SortementItem("item1", categoryType, 30.0, "kr st"));
        items.add(new SortementItem("item2", categoryType, 20.0, "kr st"));
        items.add(new SortementItem("item3", categoryType, 60.0, "kr st"));
        items.add(new SortementItem("item4", categoryType, 10.0, "kr st"));
        items.add(new SortementItem("item5", categoryType, 30.0, "kr st"));
        items.add(new SortementItem("item6", categoryType, 20.0, "kr st"));
        items.add(new SortementItem("item7", categoryType, 60.0, "kr st"));
        items.add(new SortementItem("item8", categoryType, 10.0, "kr st"));
        items.add(new SortementItem("item9", categoryType, 30.0, "kr st"));
        items.add(new SortementItem("item10",categoryType, 20.0, "kr st"));
        items.add(new SortementItem("item11",categoryType, 60.0, "kr st"));
        items.add(new SortementItem("item12",categoryType, 10.0, "kr st"));

        SortementAdapter adapter = new SortementAdapter(getContext(), R.id.sortement_item, items );
        sortement.setAdapter(adapter);
        return rootView;
    }
}