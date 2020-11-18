package com.yun.map;

import android.view.View;

/**
 * 显示在地图上的view
 */
public class ShowInfoWindowData {
    private View view;
    private Location location;
    private int height;

    public ShowInfoWindowData(View view, Location location, int height) {
        this.view = view;
        this.location = location;
        this.height = height;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
