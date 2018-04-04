package cn.hycun.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.hycun.androiddemo.R.layout.activity_main);

//        Button button=(Button)findViewById(R.id.CellButton);
//        button.setOnClickListener(new MyButtonListener());
    }

    //监听器类
    class MyButtonListener implements View.OnClickListener {
        public void onClick(View v){
            // 生成一个Intent对象
            Intent intent=new Intent();
            intent.putExtra("testIntent", "123");
            intent.setClass(MainActivity.this, Cell.class); //设置跳转的Activity
            MainActivity.this.startActivity(intent);
        }
    }
}
