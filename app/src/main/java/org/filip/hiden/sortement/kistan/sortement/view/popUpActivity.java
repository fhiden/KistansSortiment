package org.filip.hiden.sortement.kistan.sortement.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RatingBar;
import android.widget.TextView;

import org.filip.hiden.sortement.kistan.sortement.R;
import org.filip.hiden.sortement.kistan.sortement.model.SortementItem;

public class popUpActivity extends Activity {

    DisplayMetrics metrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_pop_up);
        Intent in = getIntent();
        final SortementItem item = (SortementItem) in.getParcelableExtra("ITEM");

        ((TextView)findViewById(R.id.item_name)).setText(item.getName());
        ((ImageView)findViewById(R.id.item_pic)).setImageBitmap(item.getImage());
        ((TextView)findViewById(R.id.item_price)).setText(item.getPrice()+" "+item.getUnit());
        ((TextView)findViewById(R.id.item_disc)).setText(item.getType());
        ((RatingBar)findViewById(R.id.ratingBar2)).setRating(item.getRating());

        ((RatingBar)findViewById(R.id.ratingBar2)).setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean fromuser) {
                if (fromuser){
                    item.setRating(v);
                    Log.v("item", "item changed");
                }
            }
        });

    }

}
