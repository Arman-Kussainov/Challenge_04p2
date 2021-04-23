package com.example.challenge_04p2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String mOrderMessage = "";
    private String LongMessage = "";
    int box_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBoxChecked(View view) {
        mOrderMessage = getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
        ;
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("NonConstantResourceId")
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.chocolate_syrup:
                if (checked) {
                    mOrderMessage = getString(R.string.chocolate_syrup);
                    box_count++;
                    if(box_count>=1)
                        displayToast(String.valueOf(LongMessage+=mOrderMessage));
                    else
                        displayToast(String.valueOf(mOrderMessage));
                }
                break;
            case R.id.sprinkles:
                if (checked) {
                    mOrderMessage = getString(R.string.sprinkles);
                    box_count++;
                    if(box_count>=1)
                        displayToast(String.valueOf(LongMessage+=mOrderMessage));
                    else
                        displayToast(String.valueOf(mOrderMessage));
                }
                break;
            case R.id.cherries:
                if (checked) {
                    mOrderMessage = getString(R.string.cherries);
                    box_count++;
                    if(box_count>=1)
                        displayToast(String.valueOf(LongMessage+=mOrderMessage));
                    else
                        displayToast(String.valueOf(mOrderMessage));
                }
                break;
            case R.id.crushed_nuts:
                if (checked) {
                    mOrderMessage = getString(R.string.crushed_nuts);
                    box_count++;
                    if(box_count>=1)
                        displayToast(String.valueOf(LongMessage+=mOrderMessage));
                    else
                        displayToast(String.valueOf(mOrderMessage));
                }
                break;
            case R.id.orio_cookie_crumbles:
                if (checked) {
                    mOrderMessage = getString(R.string.orio_cookie_crumbles);
                    box_count++;
                    if(box_count>=1)
                        displayToast(String.valueOf(LongMessage+=mOrderMessage));
                    else
                        displayToast(String.valueOf(mOrderMessage));
                }
                break;

        }
    }
}