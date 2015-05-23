package com.example.pc.mhealth.fragments;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pc.mhealth.R;
import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;

/**
 * Created by pc on 03/05/2015.
 */
public class NoticiasFragment extends ListFragment {
    /*ListView tweets;
    TweetView tweetView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.noticias_fragment,container,false);

        TwitterAuthConfig authConfig = new TwitterAuthConfig("IB9c9tzBix4FGvJlTfzac2Iqb","7c3kpp4jOmdDglGew7HDvm7Xu1Y7A82lr8Qpod4OCBucMyDu53");
        Fabric.with(getActivity(), new TwitterCore(authConfig), new TweetUi());

        tweets = (ListView) v.findViewById(R.id.list_tweets);
        tweetView = (TweetView) v.findViewById(R.id.photo_default_tweet);

        final UserTimeline userTimeline = new UserTimeline.Builder().screenName("fabric").build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter(v.getContext(),userTimeline);
        tweets.setAdapter(adapter);
        setListAdapter(adapter);
        return v;

    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final SearchTimeline searchTimeline = new SearchTimeline.Builder()
                .query("#twitterflock")
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter(getActivity(),
                searchTimeline);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.noticias_fragment, container, false);
    }
}
