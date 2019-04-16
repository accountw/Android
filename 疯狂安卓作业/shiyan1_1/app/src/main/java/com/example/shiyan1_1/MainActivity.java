package com.example.shiyan1_1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.shiyan1_1.R;

import java.security.PublicKey;

public class MainActivity extends Activity {
    /*GridLayout gridLayout;
    String[] chars = new String[]
            {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    ".", "0", "=", "+"
            };*/

    String str1=null;
    String str2=null;
    String str3=null;

    int s=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*gridLayout = (GridLayout) findViewById(R.id.root);
        for (int i = 0; i < chars.length; i++) {
            Button bn = new Button(this);
            bn.setText(chars[i]);
            //设置该按钮的字号大小
            bn.setTextSize(40);
            //设置按钮四周的空白区域
            bn.setPadding(5, 35, 5,
                    35);
            bn.setId(i);
            //指定该组件所在的行
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            //指定该组件所在列
            GridLayout.Spec columanSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columanSpec);
            //指定组件占满父容器
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bn, params);*/
        Button b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(listener);
        Button b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(listener);
        Button b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(listener);
        Button b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(listener);
        Button b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(listener);
        Button b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(listener);
        Button b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(listener);
        Button b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(listener);
        Button b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(listener);
        Button b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(listener);
        Button he=(Button)findViewById(R.id.he);
        he.setOnClickListener(listener);
        Button cha=(Button)findViewById(R.id.cha);
        cha.setOnClickListener(listener);
        Button deng=(Button)findViewById(R.id.deng);
        deng.setOnClickListener(listener);
        Button chen=(Button)findViewById(R.id.chen);
        chen.setOnClickListener(listener);
        Button chu=(Button)findViewById(R.id.chu);
        chu.setOnClickListener(listener);
        Button dian=(Button)findViewById(R.id.dian);
        dian.setOnClickListener(listener);
        Button del=(Button)findViewById(R.id.del);
        del.setOnClickListener(listener);




        }
        View.OnClickListener listener=new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                TextView tx=(TextView)findViewById(R.id.t);
                System.out.print(v.getId());
                switch (v.getId()){
                    case  R.id.b0:
                        tx.setText(tx.getText()+"0");
                        System.out.print("sda");
                        break;
                    case R.id.b1:
                        tx.setText(tx.getText()+"1");
                        break;
                    case R.id.b2:
                        tx.setText(tx.getText()+"2");
                        break;
                    case R.id.b3:
                        tx.setText(tx.getText()+"3");
                        break;
                    case R.id.b4:
                        tx.setText(tx.getText()+"4");
                        break;
                    case R.id.b5:
                        tx.setText(tx.getText()+"5");
                        break;
                    case R.id.b6:
                        tx.setText(tx.getText()+"6");
                        break;
                    case R.id.b7:
                        tx.setText(tx.getText()+"7");
                        break;
                    case R.id.b8:
                        tx.setText(tx.getText()+"8");
                        break;
                    case R.id.b9:
                        tx.setText(tx.getText()+"9");
                        break;
                    case  R.id.del:
                        tx.setText("0");
                        break;
                    case R.id.chen:
                        str1=(String)tx.getText();
                        str3="*";
                        tx.setText("0");
                        break;
                    case R.id.chu:
                        str1=(String)tx.getText();
                        str3="/";
                        tx.setText("0");
                        break;
                    case R.id.he:
                        str1=(String)tx.getText();
                        str3="+";
                        tx.setText("0");
                        break;
                    case R.id.cha:
                        str1=(String)tx.getText();
                        str3="-";
                        tx.setText("0");
                        break;
                    case  R.id.dian:
                        tx.setText(tx.getText()+".");
                        break;
                    case R.id.deng:
                        str2=(String)tx.getText();

                        int s2=Integer.parseInt(str2);
                        int s1=Integer.parseInt(str1);
                        if(str3=="+"){
                             s=s1+s2;
                        }
                        if(str3=="-"){
                             s=s1-s2;
                        }
                        if(str3=="*"){
                             s=s1*s2;
                        }
                        if(str3=="/"){
                             s=s1/s2;
                        }
                        String sum=Integer.toString(s);
                        tx.setText(sum);
                        break;


                }
            }
        };

    }


