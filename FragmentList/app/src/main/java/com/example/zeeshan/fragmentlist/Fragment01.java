package com.example.zeeshan.fragmentlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment01 extends Fragment implements View.OnClickListener{
    Button button1, button2, button3, button4, button5;
    String buttonText;
    CharSequence text;
    Toast toast;
    View rootView;
    MainActivity activity = (MainActivity) getActivity();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        rootView = inflater.inflate(R.layout.my_fragment01, container, false);
        button1 = (Button) rootView.findViewById(R.id.frg_01_button01);
        button2 = (Button) rootView.findViewById(R.id.frg_01_button02);
        button3 = (Button) rootView.findViewById(R.id.frg_01_button03);
        button4 = (Button) rootView.findViewById(R.id.frg_01_button04);
        button5 = (Button) rootView.findViewById(R.id.frg_01_button05);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        return rootView;
    }





    public void setTextInActivity(String s) {
        ((MainActivity) getActivity()).setUpdateText(s);
        ((MainActivity) getActivity()).changeFragmentTextView();

    }

    @Override
    public void onClick(View v) {
        showMyToast(v);
//        Toast.makeText(getView().getContext(), button1.getText(), Toast.LENGTH_LONG).show();
    }

    public void showMyToast(View view){
        buttonText = view.getTag().toString();
        text = "Selected Button is : "+buttonText;
        setTextInActivity((String) text);
        int duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(getView().getContext(), text, duration);
        toast.show();
        Log.i("LOG: BUTTON CLICKED : ",buttonText.toUpperCase());
    }
}