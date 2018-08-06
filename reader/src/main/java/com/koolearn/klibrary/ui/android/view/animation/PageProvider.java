package com.koolearn.klibrary.ui.android.view.animation;

import com.koolearn.klibrary.core.view.ZLView;
import com.koolearn.klibrary.ui.android.curl.CurlPage;

public interface PageProvider {
    boolean hasNextPage();

    boolean hasPreviousPage();

    /*CURL_LEFT = 1;
      CURL_NONE = 0;
      CURL_RIGHT = 2;*/
    void shift(int param);

    void updatePage(CurlPage curlPage, int width, int height, ZLView.PageIndex pageIndex);
}