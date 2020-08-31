package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice6DrawLineView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int startX, startY, endX, endY;

    {
        paint.setStrokeWidth(Utils.dp2px(5));
    }

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        startX = getWidth() / 2 - ((int) Utils.dp2px(50));
        startY = getHeight() / 2 - ((int) Utils.dp2px(50));
        endX = getWidth() / 2 + ((int) Utils.dp2px(50));
        endY = getWidth() / 2 + ((int) Utils.dp2px(50));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线
        canvas.drawLine(startX, startY, endX, endY, paint);
    }
}
