package com.edingacan.helloworld;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eding on 21/10/2015.
 */
public class TextFragment extends Fragment {

    private  static TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment, container, false);

        textView = (TextView) view.findViewById(R.id.textFragment_textView);

        return view;
    }

    public void changeTextProperties(int fontsize, String text) {
        textView.setTextSize(fontsize);
        textView.setText(text);
    }
}
