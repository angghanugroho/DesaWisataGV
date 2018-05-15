package com.example.acer.desawisatagv;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Acer on 14/05/2018.
 */

public class SpaceItemGridView extends RecyclerView.ItemDecoration {
    private final int mSpace;

    public SpaceItemGridView(int space) {
        this.mSpace = space;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;
        outRect.top = mSpace;
    }
}
