package com.example.jiangzhiguo.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

/**
 * Created by jiangzhiguo on 17/12/16.
 */

public class MyButton extends Button{
    private static final String TAG = "MyButton";

    public MyButton(Context context) {
        super(context);
        getX();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Log.d(TAG,"dispatchDraw");
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d(TAG,"onDraw");
        super.onDraw(canvas);
    }
}
