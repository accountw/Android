package com.example.shiyan1_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;
import java.util.jar.Attributes;

public class DrawView extends View {
    public float curreentX=40;
    public float curreentY=50;
    //定义并创建画笔
    Paint p=new Paint();
    public  DrawView(Context context,AttributeSet set)
    {
        super(context,set);
    }

    @Override
    public  void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        //设置画笔颜色

        Random random = new Random();
        int ranColor = 0xff000000 | random.nextInt(0x00ffffff);

        p.setColor(ranColor);
        //绘制一个小圆
        canvas.drawCircle(curreentX,curreentY,15,p);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        //修改currentX,currentY两个属性
        this.curreentX=event.getX();
        this.curreentY=event.getY();
        //通知当前组件重绘自己
        this.invalidate();
        //返回true表明处理方法已经处理该事件
        return  true;
    }
}