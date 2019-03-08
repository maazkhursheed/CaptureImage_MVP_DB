package com.digimaklabs.captureimage.presenters;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Maaz Khursheed on 11/02/19.
 */
public interface ImageListPresenter {

    void attachView(Bundle savedInstanceState);
    void restoreInstance(Bundle savedInstanceState);
    void saveInstance(Bundle unsavedInstanceState);
    void detachView();

    void feedOldEntries();

    void onCameraImageRequested();
    void onCameraImageCaptured();
    void onImageUploaded(int resultCode, Intent data);

}
