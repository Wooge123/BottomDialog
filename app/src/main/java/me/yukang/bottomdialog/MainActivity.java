package me.yukang.bottomdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bottomDialog(View v) {
        Dialog dialog = new Dialog(this, R.style.my_dialog);
        dialog.setContentView(LayoutInflater.from(this).inflate(R.layout.dialog_layout, null));
        Window window = dialog.getWindow();
        if (window != null)
            window.setGravity(Gravity.BOTTOM);
        dialog.show();
    }
}
