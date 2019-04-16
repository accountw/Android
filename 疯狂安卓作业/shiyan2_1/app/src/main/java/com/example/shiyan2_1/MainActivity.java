package com.example.shiyan2_1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    //定义飞机移动速度
    private  int speed=15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //创建PlaneView组件
        final planView planView=new planView(this);
        setContentView(planView);
        planView.setBackgroundResource(R.drawable.back);
        //获取窗口管理器
        WindowManager windowManager=getWindowManager();
        Display display=windowManager.getDefaultDisplay();
        DisplayMetrics metrics=new DisplayMetrics();
        //获取屏幕宽和高
        display.getMetrics(metrics);
        //设置飞机的初始位置
        planView.currentX=metrics.widthPixels/2-30;
        planView.currentY=metrics.heightPixels-240;
        //为planeview组件绑定键盘监听器
        planView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View source, int keyCode, KeyEvent event) {
                //获取由哪个键触发的事件
                switch (event.getKeyCode()){
                    //控制飞机下移
                    case KeyEvent.KEYCODE_S:
                        planView.currentY+=speed;
                        break;
                    //控制飞机上移
                    case KeyEvent.KEYCODE_W:
                        planView.currentY-=speed;
                        break;
                    //控制飞机左移
                    case KeyEvent.KEYCODE_A:
                        planView.currentX-=speed;
                        break;
                    //控制飞机右移
                    case KeyEvent.KEYCODE_D:
                        planView.currentX+=speed;
                        break;


                }
                planView.invalidate();
                return false;
            }
        });
    }
}
