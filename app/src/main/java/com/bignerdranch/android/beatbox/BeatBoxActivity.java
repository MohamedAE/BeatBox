package com.bignerdranch.android.beatbox;

import android.app.Fragment;

/* Container activity */
public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }

}