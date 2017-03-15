package com.skyline.demo.rcl;

import android.os.Bundle;
import android.widget.SeekBar;
import android.support.v7.app.AppCompatActivity;

import com.skyline.widget.layout.RoundCornerLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    @BindView(R.id.main_round_layout_1)
    RoundCornerLayout mRoundLayout1 = null;

    @BindView(R.id.main_round_layout_2)
    RoundCornerLayout mRoundLayout2 = null;

    @BindView(R.id.main_round_layout_3)
    RoundCornerLayout mRoundLayout3 = null;

    @BindView(R.id.main_round_layout_4)
    RoundCornerLayout mRoundLayout4 = null;

    @BindView(R.id.main_round_layout_5)
    RoundCornerLayout mRoundLayout5 = null;

    @BindView(R.id.main_seek_radius)
    SeekBar mSeekRadius = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setupViews();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (fromUser) {
            final float percent = progress / 100.0f;
            final int height = mRoundLayout1.getMeasuredHeight();
            mRoundLayout1.setRadius(percent * height / 2);
            mRoundLayout2.setRadius(percent * height);
            mRoundLayout3.setRadius(percent * height);
            mRoundLayout4.setRadius(percent * height);
            mRoundLayout5.setRadius(percent * height);
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // Nothing to do
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // Nothing to do
    }

    private void setupViews() {
        ButterKnife.bind(this);

        mRoundLayout1.post(new Runnable() {
            @Override
            public void run() {
                final int height = mRoundLayout1.getMeasuredHeight();
                final int progress = (int)(mRoundLayout1.getRadius() / height * 100.0f);
                mSeekRadius.setProgress(progress);
            }
        });

        mSeekRadius.setOnSeekBarChangeListener(this);
    }
}
