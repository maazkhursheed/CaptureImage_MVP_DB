package com.digimaklabs.captureimage.views;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Maaz Khursheed on 12/02/19.
 */
public interface ImageUploadView {

    ImageView getImageContainer();
    Context getContext();
    void showSnackBar(String message);

    void setLocationText(CharSequence text);
    void setAddressText(CharSequence text);
    void showProgressLayout(boolean show);
    void showLocationDetails(boolean show);
    void showUpdateButton(boolean show);

    void showProcessingDialog();
    void dismissProcessingDialog();

    void lockOrientation();
    void unlockOrientation();

    void showCancelConfirmationDialog();
    void sendResult(Bundle extras, int resultCode);
}
