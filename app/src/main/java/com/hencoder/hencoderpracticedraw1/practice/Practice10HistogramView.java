package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public static final float PADDING = Utils.dp2px(50);
    public static final float OFFSET_WIDTH = Utils.dp2px(10);
    private int rectWidth = 0;
    private int[] lengths = {50, 50, 80, 200, 500, 1000, 400};

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int width, height;

    {
        paint.setStrokeWidth(5);
    }


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = getWidth();
        height = getHeight();

        rectWidth = (int) ((width - PADDING * 2 - (lengths.length + 1) * OFFSET_WIDTH) / lengths.length);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        canvas.drawLine(PADDING, (height - PADDING * 2), width - PADDING, (height - PADDING * 2), paint);
        canvas.drawLine(PADDING, (height - PADDING * 2), PADDING, PADDING * 2, paint);

//        for (int i = 0; i < lengths.length; i++) {
//            canvas.drawRect(PADDING + OFFSET_WIDTH * (i + 1) + rectWidth * i
//                    ,
//                    , PADDING + OFFSET_WIDTH * (i + 1) + rectWidth * (i + 1)
//                    , (height - PADDING * 2), paint);
//        }
    }
}
