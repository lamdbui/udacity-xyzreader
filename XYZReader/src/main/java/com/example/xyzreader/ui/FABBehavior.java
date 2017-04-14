package com.example.xyzreader.ui;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;

import com.example.xyzreader.R;

/**
 * Created by lamdbui on 4/14/17.
 */

public class FABBehavior extends CoordinatorLayout.Behavior {

    public FABBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        if(dependency instanceof AppBarLayout)
            return true;

        return false;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {

        if(child.getId() == R.id.share_fab &&
                dependency.getId() == R.id.appbar) {
            FloatingActionButton fab = (FloatingActionButton) parent.findViewById(R.id.share_fab);
            fab.show();
        }

        return super.onDependentViewChanged(parent, child, dependency);
    }
}
