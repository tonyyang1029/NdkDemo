/**
 * https://blog.csdn.net/dengweijunkedafu/article/details/82713402
 */

package com.ty.android.ndkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView = null;
    private NdkLib mJni = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJni = new NdkLib();
        mTextView = findViewById(R.id.ID_MAIN_TEXTVIEW);
        mTextView.setText(mJni.getStringFromNdk());
    }
}
