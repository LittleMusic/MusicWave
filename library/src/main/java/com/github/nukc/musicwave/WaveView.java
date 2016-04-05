package com.github.nukc.musicwave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.github.nukc.musicwave.util.Utils;

import java.util.List;

/**
 * Created by C on 2015/10/30.
 */
public class WaveView extends View{

    private List<Integer> mWaveDate;
    private int mRectWidth;
    private int mBaseLine = 300;

    private Paint mPaint;

    public WaveView(Context context, List<Integer> waveDate) {
        this(context, null, waveDate);
    }

    public WaveView(Context context, AttributeSet attrs, List<Integer> waveDate) {
        super(context, attrs);
        this.mWaveDate = waveDate;

        mRectWidth = Utils.convertDpToPixel(context, 3);
        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(mRectWidth / 2);
    }

    public List<Integer> getWaveDate() {
        return mWaveDate;
    }

    public void setWaveDate(List<Integer> waveDate) {
        this.mWaveDate = waveDate;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int left = 0;
        for (int waveHeight : mWaveDate){
//            canvas.drawRect(left, waveHeight * 10, left + mRectWidth, 0, mPaint);
//            canvas.drawRect(left + mRectWidth/2, 0, left + mRectWidth, waveHeight, mPaint);
            canvas.drawLine(left, mBaseLine, left, mBaseLine - waveHeight, mPaint);

            left += mRectWidth;
        }
    }
}
