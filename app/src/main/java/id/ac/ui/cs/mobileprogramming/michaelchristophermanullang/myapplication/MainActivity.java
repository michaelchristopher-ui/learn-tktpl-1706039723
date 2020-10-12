package id.ac.ui.cs.mobileprogramming.michaelchristophermanullang.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentA = new FragmentA();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainLayout, fragmentA)
                .commit();
    }

    @Override
    public void onBackPressed(){
        if (getSupportFragmentManager().findFragmentById(R.id.mainLayout) instanceof FragmentB){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.mainLayout, fragmentA);
            transaction.commit();
        }
    }

}