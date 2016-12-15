package android.com.co.marcianito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}
