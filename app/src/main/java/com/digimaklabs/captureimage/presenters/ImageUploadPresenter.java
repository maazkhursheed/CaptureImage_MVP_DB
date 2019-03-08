package com.digimaklabs.captureimage.presenters;

import android.os.Bundle;

/**
 * Created by Maaz Khursheed on 12/02/19.
 */
public interface ImageUploadPresenter {
    void attachView();
    void resume(Bundle extras);
    void saveInstance(Bundle outState);
    void restoreInstance(Bundle savedInstanceState);
    void registerForEvents();
    void unregisterForEvents();
    void detachView();

    void cancel();
    void discard();
    void update();
}
