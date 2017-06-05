package com.book.aandali.bear_up;


import android.app.ListActivity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends DialogFragment{

    public static BlankFragment3 newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        BlankFragment3 firstFragment = new BlankFragment3();
        firstFragment.setArguments(args);
        return firstFragment;
    }

    String[] songs={"抗衰老眼部按摩操.mp3","眼睛按摩.mp3","臉部按摩及眼睛放鬆法.mp3"};
    int[]  imgbtn={R.drawable.ic_menu_camera,R.drawable.ic_menu_camera,R.drawable.ic_menu_camera};
    int[]  imgbtnlove={R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery};
    ListView listView;
    Context context;
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//    }
//
//    public BlankFragment3() {
//        // Required empty public constructor
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.voice3, container, false);
//       listView=(ListView) view.findViewById(R.id.list);
//        voice adapter=new voice(getActivity(),songs,imgbtn,imgbtnlove);
//        listView.setAdapter(adapter);
//        ImageButton btn  = (ImageButton)getView().findViewById(R.id.itemlove);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MediaPlayer paratha = MediaPlayer.create(context, R.raw.a);
//                paratha.start();
//            }
//        ArrayAdapter<String> ListViewAdapter=new ArrayAdapter<String>(getActivity(),songs,imgbtn);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
////                Audio audio = new Audio(context);
////                audio.playmp301();
//                Toast.makeText(getActivity(),songs[position],Toast.LENGTH_SHORT).show();
//            }
//        });
//        });
        return view;
            }

//    public class Audio {
//
//        MediaPlayer mp;
//        Context context;
//
//        public Audio(Context ct) {
//            this.context = ct;
//        }
//
//        public void playmp301() {
//            mp = MediaPlayer.create(context, R.raw.a);
//            mp.start();
//        }
//        public void playmp302() {
//            mp = MediaPlayer.create(context, R.raw.b);
//            mp.start();
//        }
//        public void playmp303() {
//            mp = MediaPlayer.create(context, R.raw.c);
//            mp.start();
//        }
//    }

        }

