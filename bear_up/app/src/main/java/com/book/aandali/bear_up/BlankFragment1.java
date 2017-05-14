package com.book.aandali.bear_up;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */

//class MP3Filter implements FilenameFilter{
//    public  boolean accept(File dir,String name)
//    {
//        return (name.endsWith(".mp3"));
//    }
//}

public class BlankFragment1 extends Fragment {

    private  static final   String sdpath=new String("/sdcard/");
    private List<String> songs=new ArrayList<String>();
    private MediaPlayer mp=new MediaPlayer();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView(inflater, container);

        //updatePlayList();

    }

//    private void updatePlayList() {
//
//        File home=new File(sdpath);
//        if(home.listFiles(new MP3Filter()).length>0)
//        {
//            for(File file:home.listFiles(new MP3Filter()))
//            {
//                songs.add(file.getName());
//
//            }
//            ArrayAdapter<String>songList=new ArrayAdapter<String>(this,R.layout.fragment_blank,songs);
//            setListAdapter(songList);
//        }
//
//
//    }

    private View initView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        return view;

    }
}