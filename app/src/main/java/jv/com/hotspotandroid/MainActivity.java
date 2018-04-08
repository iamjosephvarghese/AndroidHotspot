package jv.com.hotspotandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Boolean bool = ApManager.isApOn(MainActivity.this); // check Ap state :boolean
        Boolean change = ApManager.configApState(MainActivity.this); // change Ap state :boolean

        Log.d("status",bool.toString());
        Log.d("change",change.toString());
    }
}
