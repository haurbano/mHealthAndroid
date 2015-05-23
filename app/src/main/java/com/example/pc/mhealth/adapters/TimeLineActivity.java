package com.example.pc.mhealth.adapters;

import android.app.ListActivity;
import android.os.Bundle;

import com.example.pc.mhealth.R;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by DianaM on 23/05/15.
 */
public class TimeLineActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticias_fragment);

        final UserTimeline userTimeline = new UserTimeline.Builder().screenName("Ha_Urbano").build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter(this,userTimeline);
        setListAdapter(adapter);
    }
}
