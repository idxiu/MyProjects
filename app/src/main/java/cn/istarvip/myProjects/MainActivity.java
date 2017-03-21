package cn.istarvip.myProjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.btn_1);
        btn2= (Button) findViewById(R.id.btn_2);
        btn3= (Button) findViewById(R.id.btn_3);
        btn4= (Button) findViewById(R.id.btn_4);
        btn5= (Button) findViewById(R.id.btn_5);
        //set OnClickListener
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
    }
    private View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String showTips="";
            switch (view.getId()){
                case R.id.btn_1:
                    showTips=getResources().getString(R.string.btn_1);
                    break;
                case R.id.btn_2:
                    showTips=getResources().getString(R.string.btn_2);
                    break;
                case R.id.btn_3:
                    showTips=getResources().getString(R.string.btn_3);
                    break;
                case R.id.btn_4:
                    showTips=getResources().getString(R.string.btn_4);
                    break;
                case R.id.btn_5:
                    showTips=getResources().getString(R.string.btn_5);
                    break;
                default:
                    showTips="view 被点击了";
                    break;
            }
            Toast.makeText(MainActivity.this,showTips,Toast.LENGTH_SHORT).show();
        }
    };
}
