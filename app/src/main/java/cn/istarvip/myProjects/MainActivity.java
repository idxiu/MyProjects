package cn.istarvip.myProjects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(listener);
        findViewById(R.id.btn_2).setOnClickListener(listener);
        findViewById(R.id.btn_3).setOnClickListener(listener);
        findViewById(R.id.btn_4).setOnClickListener(listener);
        findViewById(R.id.btn_5).setOnClickListener(listener);

    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int r_msg=R.string.btn_1;
            switch (view.getId()) {
                case R.id.btn_1:
                    r_msg=R.string.btn_1;
                    break;
                case R.id.btn_2:
                    r_msg=R.string.btn_2;
                    break;
                case R.id.btn_3:
                    r_msg=R.string.btn_3;
                    break;
                case R.id.btn_4:
                    r_msg=R.string.btn_4;
                    break;
                case R.id.btn_5:
                    r_msg=R.string.btn_5;
                    break;
                default:
                    r_msg=R.string.btn_1;
                    break;
            }
            show(r_msg);

        }
    };
    private static Toast mToast=null;
    private void show(int resId){
        if(mToast==null){
            mToast=Toast.makeText(this,resId,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(resId);
        }
        mToast.show();
    }
}
