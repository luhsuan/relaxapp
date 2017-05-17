package com.book.aandali.bear_up;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by Aanda Li on 2017/5/16.
 */

public class voice extends ArrayAdapter<String> {

    Context c;
    String[] songs;
    int[] imgbtn;
    LayoutInflater inflater;

    public voice(Context context, String[] songs,int[] imgbtn) {

        super(context, R.layout.voice3,songs);
        this.c=context;
        this.songs=songs;
        this.imgbtn=imgbtn;
    }
    @Override
    public View getView(int position,View convertView, ViewGroup parent)
    {

        if(convertView==null)
        {
            inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.voice3,parent, false);
        }
        TextView textView=(TextView) convertView.findViewById(R.id.ItemWinName);
        ImageButton imageButton=(ImageButton) convertView.findViewById(R.id.Itemplay);
        textView.setText(songs[position]);
        imageButton.setImageResource(imgbtn[position]);
        return convertView;
    }
}
