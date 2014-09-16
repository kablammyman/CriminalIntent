package com.example.student.criminalintent;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**_title
 * Created by student on 9/16/2014.
 */
public class CrimeFragment extends android.support.v4.app.Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence c, int start, int before, int count){
                mCrime.setTitle(c.toString());
            }
            public void beforeTextChanged(CharSequence c, int start, int count, int after){}
            public void afterTextChanged(Editable c){}
        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMM dd yyyy HH:mm");
        String formattedDate = dateFormat.format(mCrime.getDate());

        mDateButton.setText(formattedDate);
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                mCrime.setSolved(isChecked);

            }
        });

        return v;
    }
}
