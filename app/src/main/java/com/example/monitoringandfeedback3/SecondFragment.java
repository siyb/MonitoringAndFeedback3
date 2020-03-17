package com.example.monitoringandfeedback3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        Bundle args = getArguments();

        SecondFragmentArgs secondFragmentArgs = null;
        if (args != null)
            secondFragmentArgs = SecondFragmentArgs.fromBundle(args);

        if (secondFragmentArgs != null) {
            TextView tv = v.findViewById(R.id.textView);
            tv.setText(secondFragmentArgs.getDisplayString());
        }

        return v;
    }
}
