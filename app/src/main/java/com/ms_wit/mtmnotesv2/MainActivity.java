package com.ms_wit.mtmnotesv2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView trektext = (TextView) findViewById(R.id.trektext);
//        ImageView trekpic = (ImageView) findViewById(R.id.trekpic);

        Resources res = getResources();
        String[] texts = res.getStringArray(R.array.pnptext);

/*        for (int i = 0; i <= texts.length; i++) {
            trektext.setText(texts[i]);

        }*/

        String[] pics = res.getStringArray(R.array.pnppics);
//        trekpic.setImageDrawable();

        // get reference to linear layout
        // loop through the array
        // inflate a view for every item in the array
        // attach the views to the linear layout
    }
}
