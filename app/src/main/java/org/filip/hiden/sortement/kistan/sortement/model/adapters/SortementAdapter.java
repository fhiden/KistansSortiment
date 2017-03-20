package org.filip.hiden.sortement.kistan.sortement.model.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.filip.hiden.sortement.kistan.sortement.R;
import org.filip.hiden.sortement.kistan.sortement.model.SortementItem;

import java.util.ArrayList;

/**
 * Created by fhiden on 2017-03-14.
 */

public class SortementAdapter extends ArrayAdapter<SortementItem> {

    private static class ViewHolder {
        TextView txtName;
        TextView txtType;
        TextView txtPrice;
        TextView txtUnit;
        //ImageView info;
    }
    Context mContext;
    ArrayList<SortementItem> items;
    public SortementAdapter(Context context, int resource, ArrayList<SortementItem> sortement ){
        super(context, resource, sortement);
        this.items = sortement;
        this.mContext=context;

    }

    private int lastPosition = -1;

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        SortementItem item = getItem(position);

        // view lookup cache to be stored in tag.
        ViewHolder viewHolder;

        final  View result;

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.sortement_item, parent,false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.item_name);
            viewHolder.txtType = (TextView) convertView.findViewById(R.id.item_type);
            viewHolder.txtPrice = (TextView) convertView.findViewById(R.id.item_price);
            viewHolder.txtUnit = (TextView) convertView.findViewById(R.id.item_unit);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }
        //Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.top_to_down : R.anim.down_to_top);
        //result.startAnimation(animation);
        lastPosition = position;

        viewHolder.txtName.setText(item.getName());
        viewHolder.txtType.setText(item.getType());
        viewHolder.txtPrice.setText(" "+item.getPrice());
        viewHolder.txtUnit.setText(item.getUnit());
        return convertView;
    }
}
