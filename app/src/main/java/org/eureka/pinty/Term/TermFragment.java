package org.eureka.pinty.Term;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.eureka.pinty.R;

/**
 * Created by QCheng on 2016/9/1.
 */
public class TermFragment extends Fragment implements TermContract.View{
    private TermContract.Presenter mPresenter;
    public void showAddTerm() {

    }

    @Override
    public void setPresenter(TermContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FloatingActionButton fab =
                (FloatingActionButton) getActivity().findViewById(R.id.fab);
//        fab.setImageResource(R.drawable.);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"hello floating button",Toast.LENGTH_SHORT).show();
            }
        });
        return inflater.inflate(R.layout.fragment_term, container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
