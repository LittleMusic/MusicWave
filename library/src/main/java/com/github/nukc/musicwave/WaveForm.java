package com.github.nukc.musicwave;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by C on 2015/10/30.
 */
public class WaveForm extends FrameLayout {


    public WaveForm(Context context) {
        this(context, null);
    }

    public WaveForm(Context context, AttributeSet attrs) {
        super(context, attrs);

        WaveView waveView = new WaveView(context, WaveData.getWaveDate());
        addView(waveView);
    }

}
