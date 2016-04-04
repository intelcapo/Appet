package Class;

import android.app.Activity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.example.diegoh.appet.*;
/**
 * Created by DIEGOH on 2/04/2016
 * Copyright 2016 Sinapsis Soft.
 */
public  class AnimationGeneral {
    private static Animation animations;

    public AnimationGeneral(){

        animations=null;
    }

    public static Animation selectAnimation(Activity activity,int iSelect){
        switch(iSelect){

            case 0:
                animations= AnimationUtils.loadAnimation(activity,R.anim.blink);
                break;
            case 1:
                animations= AnimationUtils.loadAnimation(activity,R.anim.clockwise);
                break;
            case 2:
                animations= AnimationUtils.loadAnimation(activity,R.anim.fade);
                break;
            case 3:
                animations= AnimationUtils.loadAnimation(activity,R.anim.move);
                break;
            case 4:
                animations= AnimationUtils.loadAnimation(activity,R.anim.slide);
                break;
            case 5:
                animations= AnimationUtils.loadAnimation(activity,R.anim.pull_in_left);
                break;
            case 6:
                animations= AnimationUtils.loadAnimation(activity,R.anim.pull_in_right);
                break;
            case 7:
                animations= AnimationUtils.loadAnimation(activity,R.anim.push_out_left);
                break;
            case 8:
                animations= AnimationUtils.loadAnimation(activity,R.anim.push_out_right);
                break;
        }
        return animations;

    }


}
