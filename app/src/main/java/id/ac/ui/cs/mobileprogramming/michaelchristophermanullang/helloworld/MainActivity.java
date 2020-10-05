package id.ac.ui.cs.mobileprogramming.michaelchristophermanullang.helloworld;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import static android.Manifest.permission.FOREGROUND_SERVICE;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this, new String[]{FOREGROUND_SERVICE}, PackageManager.PERMISSION_GRANTED);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("Counter");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Integer integerTime = intent.getIntExtra("TimeRemaining", 0);
                textView.setText(integerTime.toString());
            }
        };
        registerReceiver(broadcastReceiver, intentFilter);
    }

    public void startButton(View view){
        Intent intentService = new Intent(this, MyService.class);
        Integer integerTimeSet = Integer.parseInt(editText.getText().toString());
        intentService.putExtra("TimeValue", integerTimeSet);
        startService(intentService);
    }

    @Override
    public void onBackPressed() {

    }
}