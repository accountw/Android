package com.example.shiyan2_1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class planView extends View {
    public float currentX;
    public float currentY;
    Bitmap plane;

    public planView(Context context){
        super(context);
        //定义飞机图片
        plane= BitmapFactory.decodeResource(context.getResources(), R.drawable.plane);
        setFocusable(true);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //创建画笔
        Paint p=new Paint();
        //绘制飞机
        canvas.drawBitmap(plane,currentX,currentY,p);
    }
}
