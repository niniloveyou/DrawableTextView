package com.deadline.drawabletextview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = (LinearLayout)findViewById(R.id.activity_main);

        //parent 是一个linearLayout
        //在只有文字没有图片的情况下, 不会显示任何东西
/*        TextView mDrawableTextView = new TextView(this);
        mDrawableTextView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDrawableTextView.setText("帖子");
        parent.addView(mDrawableTextView);*/

        //只显示一个图片
/*        TextView mDrawableTextView = new TextView(this);
        mDrawableTextView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDrawableTextView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.mipmap.camera), null, null, null);
        mDrawableTextView.setText("帖子");*/


        //显示半遮盖的图片，半遮盖的文字，因为DrawableTextView只是简单的对画布做了位移操作
        DrawableTextView mDrawableTextView = new DrawableTextView(this);
        mDrawableTextView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDrawableTextView.setDrawable(DrawableTextView.RIGHT, ContextCompat.getDrawable(this, R.mipmap.camera), 50, 50);
        mDrawableTextView.setText("帖子");

        parent.addView(mDrawableTextView);
    }
}
