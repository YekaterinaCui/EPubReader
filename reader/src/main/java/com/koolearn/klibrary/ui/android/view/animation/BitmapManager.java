package com.koolearn.klibrary.ui.android.view.animation;

import android.graphics.*;

import com.koolearn.klibrary.core.view.ZLViewEnums;

public interface BitmapManager {
    Bitmap getBitmap(ZLViewEnums.PageIndex index);

    void drawBitmap(Canvas canvas, int x, int y, ZLViewEnums.PageIndex index, Paint paint);

    void shift(boolean forward);
}