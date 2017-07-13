package com.bignerdranch.android.beatbox;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/* Defines RecyclerView
*  Relevant ViewHolder and Adapter*/
public class BeatBoxFragment extends Fragment {

    private BeatBox mBeatBox;

    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBeatBox = new BeatBox(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beat_box, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_beat_box_recycler_view);
        //Recycler - GridLayout, width of 3
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setAdapter(new SoundAdapter());

        return view;
    }

    /* ViewHolder */
    private class SoundHolder extends RecyclerView.ViewHolder {
        private Button mButton;

        public SoundHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_sound, container, false));

            mButton = (Button) itemView.findViewById(R.id.list_item_sound_button);
        }
    }

    /* Adapter
    *  Provides binding utility between data set and Views displayed in Recycler */
    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {
        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new SoundHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(SoundHolder soundHolder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

}