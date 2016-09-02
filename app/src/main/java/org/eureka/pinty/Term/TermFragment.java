package org.eureka.pinty.term;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.eureka.pinty.R;
import org.eureka.pinty.addterm.CardviewActivity;
import org.eureka.pinty.term.viewutils.MyRecyclerAdapter;

/**
 * Created by QCheng on 2016/9/1.
 */
public class TermFragment extends Fragment implements TermContract.View {
    private TermContract.Presenter mPresenter;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] myDataset = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Nith", "Tenth"};

    public void showAddTerm() {

    }

    @Override
    public void setPresenter(TermContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_term, container, false);

        mRecyclerView = (RecyclerView) root.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true); // improve performance ; dont know yet

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(root.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        mAdapter = new MyRecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        // set animator
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // set divider


        FloatingActionButton fab =
                (FloatingActionButton) getActivity().findViewById(R.id.fab);
//        fab.setImageResource(R.drawable.);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hello floating button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), CardviewActivity.class);
                startActivity(intent);
            }
        });
        return root;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
