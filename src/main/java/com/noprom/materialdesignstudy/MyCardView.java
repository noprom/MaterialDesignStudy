package com.noprom.materialdesignstudy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.support.v7.Cardview;
public class MyCardView extends Activity {

    MyCardView mCardView;
    SeekBar mRadiusSeekBar;
    SeekBar mElevationSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        mCardView = (MyCardView) findViewById(R.id.cardview);
        mRadiusSeekBar = (SeekBar) findViewById(R.id.cardview_radius_seekbar);
        mRadiusSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                mCardView.setRadius(progress);

            }
        });


        mElevationSeekBar = (SeekBar) findViewById(R.id.cardview_elevation_seekbar);
        mElevationSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                mCardView.setElevation(progress);

            }
        });

    }


}
