package com.grandroid.android.beatbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Patrick on 7/5/2016.
 */
public class BeatBoxFragment extends Fragment {
    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beat_box, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_beatbox_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return view;
    }

    private class SoundHolder extends RecyclerView.ViewHolder {
        private Button mButton;

        public SoundHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_sound, container, false));

            mButton = (Button) itemView.findViewById(R.id.list_item_sound_button);
        }
    }
}
