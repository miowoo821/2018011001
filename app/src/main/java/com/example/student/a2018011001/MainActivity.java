package com.example.student.a2018011001;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler=new Handler();
        tv=(TextView)findViewById(R.id.textView);
//        MyThread t=new MyThread();
//        t.start();
        handler.post(r);

    }

    //下面程式執行時，其他的東西不會卡住，可同時執行
    Runnable r=new Runnable() {
        @Override
        public void run() {
            tv.setText(String.valueOf(Integer.valueOf(tv.getText().toString())+1));
            handler.postDelayed(r,10);
        }
    };



//    class MyThread extends Thread{
//        @Override
//        public void run() {
//            super.run();
//            while (true){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv.setText(String.valueOf(Integer.valueOf(tv.getText().toString())+1));
//                    }
//                });
//            }
//
//        }
//    }


}
