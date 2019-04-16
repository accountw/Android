package com.example.shiyan2_3;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button simple=(Button)findViewById(R.id.simple);
        //为按钮的单击事件绑定事件监听器
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建一个toast提示信息
                Toast toast=Toast.makeText(MainActivity.this,"简单的提示信息",
                        Toast.LENGTH_SHORT);
                toast.show();
            }

        });
        Button bn=(Button)findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建一个toast提示信息
                Toast toast=new Toast(MainActivity.this);
                //设置toast的显示位置
                toast.setGravity(Gravity.CENTER,0,0);
                //创建一个imageview
                ImageView imageView=new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.tools);
                //创建一个linearlayout
                LinearLayout ll=new LinearLayout(MainActivity.this);
                //向linearlayout中添加原有的view,图片
                ll.addView(imageView);
                //创建一个textview
                TextView textView=new TextView(MainActivity.this);
                textView.setText("带图片的提示信息");
                //设置文本框内字号的大小和字体颜色
                textView.setTextSize(24);
                textView.setTextColor(Color.MAGENTA);
                ll.addView(textView);
                //设置toast显示自定义view
                toast.setView(ll);
                //设置toast的显示时间
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }
}
