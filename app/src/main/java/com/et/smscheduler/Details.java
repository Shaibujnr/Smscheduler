package com.et.smscheduler;

import java.util.Date;

/**
 * Created by AbdulGafar on 4/27/2016.
 */
public class Details {
    private String mTitle;
    private String mAddress;
    private String mContent;
    private String mDate;
    private String mTime;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }



    Details(String title, String message, String time, String date){
        this.mTitle = title;
//        this.mAddress = address;
        this.mContent = message;
        this.mDate = date;
        this.mTime = time;
    }
    Details(String title, String message, String time){
        this.mTitle = title;
//        this.mAddress = address;
        this.mContent = message;
        this.mTime = time;
    }
}
