package com.nicolas.singlefloatingdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.nicolas.library.SingleFloatingDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SingleFloatingDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> choices = new ArrayList<>();
        choices.add("item1");
        choices.add("item2");
        choices.add("item3");
        choices.add("item4");
        dialog = new SingleFloatingDialog(this, 80, choices, new SingleFloatingDialog.OnSortChoiceListener() {
            @Override
            public void OnSortChoice(int position) {
                Toast.makeText(MainActivity.this, choices.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSingleFloatingDialog();
            }
        });
    }

    private void showSingleFloatingDialog() {
        if (dialog != null && dialog.canShow()) {
            dialog.show();
        }
    }
}
