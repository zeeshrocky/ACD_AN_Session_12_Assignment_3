package com.example.zeeshan.fragmentlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Fragment01 fragment01;
    private Fragment02 fragment02;

    public String getUpdateText() {
        return updateText;
    }

    public void setUpdateText(String updateText) {
        this.updateText = updateText;
        Log.i("MA : ",updateText.toUpperCase());
    }

    String updateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment01 = new Fragment01();
        fragment02 = new Fragment02();

        if (findViewById(R.id.fragment_container01) != null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container01, fragment01).commit();
        }

        if (findViewById(R.id.fragment_container02) != null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container02, fragment02).commit();
        }


    }

    public void changeFragmentTextView() {
        ((TextView) fragment02.getView().findViewById(R.id.frag_02_tv)).setText(getUpdateText());
    }
}