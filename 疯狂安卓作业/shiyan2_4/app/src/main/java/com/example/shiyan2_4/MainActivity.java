package com.example.shiyan2_4;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    String[] items=new String[]{
            "第一行",
            "第二行",
            "第三行",
            "第四行",
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void simple(View source){
        AlertDialog.Builder builder=new AlertDialog.Builder(this)
        //设置对话框标题
        .setTitle("简单对话框")
        //设置图标
        .setIcon(R.drawable.tools)
        .setMessage("对话框的测试内容\n 第二行内容");
        //为alerdialog.builder添加确定按钮
        setPositveButton(builder);
        //为alerdialog.builder添加取消按钮
        setNegativeButton(builder)
        .create()
        .show();
    }
    private AlertDialog.Builder setPositveButton(AlertDialog.Builder builder){
        //调用setPositveButton方法添加确定按钮
        return  builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //show.setText("单击了确定按钮");
                Toast.makeText(MainActivity.this,
                        "单击了确定按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder){
        //调用setNegativeButton方法添加取消按钮
        return  builder.setNegativeButton("取消",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //show.setText("单击了取消按钮");
                Toast.makeText(MainActivity.this,
                        "单击了取消按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public  void SingleChoice(View source){
        AlertDialog.Builder builder=new AlertDialog.Builder(this)
                //设置对话框标题
                .setTitle("单项列表对话框")
                //设置图标
                .setIcon(R.drawable.tools)

                //设置单选列表项，默认选中第二项
                .setSingleChoiceItems(items, 1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //show.setText("你选中了《"+items[which]+"》");
                Toast.makeText(MainActivity.this,
                        "你选中了《"+items[which]+"》", Toast.LENGTH_SHORT).show();
            }
        });
        //为alerdialog.builder添加确定按钮
        setPositveButton(builder);
        //为alerdialog.builder添加取消按钮
        setNegativeButton(builder)
                .create()
                .show();

    }
    public  void customView(View source){

        TableLayout loginForm=(TableLayout)getLayoutInflater().inflate(R.layout.login,null);
        new AlertDialog.Builder(this)
                //设置对话框标题
                .setTitle("自定义view对话框")
                //设置图标
                .setIcon(R.drawable.tools)
                //设置对话框显示的view对象
                .setView(loginForm)
                //为对话框设置一个确定按钮
                .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //此处课执行登录操作
                    }
                })
                //设置一个取消按钮
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //此处课执行取消操作
                    }
                })
                .create()
                .show();
    }
}
