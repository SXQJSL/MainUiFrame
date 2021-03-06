package com.cyxk.wrframelibrary.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;


/**
 * 通过 setIsScroll() 方法来控制viewPager是否能够进行滑动
 */
public class ViewPagerMain  extends ViewPager{
    private boolean mIsScroll=true;

    public ViewPagerMain(Context context) {
        super(context);
    }

    public ViewPagerMain(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mIsScroll==true){
            return super.onInterceptTouchEvent(ev);
        }else{
            return mIsScroll;
        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (mIsScroll==true){
            return super.onTouchEvent(ev);
        }else{
            return mIsScroll;
        }

    }

    public void setIsScroll(boolean isScroll){
        mIsScroll = isScroll;
    }
}
