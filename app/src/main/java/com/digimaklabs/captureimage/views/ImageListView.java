package com.digimaklabs.captureimage.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.digimaklabs.captureimage.models.wrappers.ImageModelWrapper;

import java.util.List;

/**
 * Created by Maaz Khursheed on 11/02/19.
 */
public interface ImageListView {

    Context getContext();
    void setData(List<ImageModelWrapper> items);
    void createActivityForResult(Intent intent, int requestCode);
    void showSnackBar(String message);
}
