package net.catzie.densitychecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "DensityChecker";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkDensity();
    }

    protected void checkDensity(){
        textView = (TextView) findViewById(R.id.textView);
        float density = getResources().getDisplayMetrics().density;
        String label = null;

        if(density <= 0.75) {
            label = "LDPI";
        } else if(density <= 1.0) {
            label = "MDPI";
        } else if(density <= 1.5) {
            label = "HDPI";
        } else if(density <= 2.0) {
            label = "XHDPI";
        } else if(density <= 3.0) {
            label = "XXHDPI";
        } else if(density <= 4.0) {
            label = "XXXHDPI";
        }

        textView.setText("Density=" + density + "(" + label + ")");
    }
}
