package com.tasneembohra.mvvpdatabinding.viewmodel;

import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;

import com.tasneembohra.mvvpdatabinding.model.User;

/**
 * Created by tasneem on 13/10/16.
 */

public class Handlers {
    public void onSaveClick(User user) {
        Log.d("Handlers", "onSaveClick");
        Log.d("onSaveClick", user.firstName);
        Log.d("onSaveClick", user.lastName);
    }
}
