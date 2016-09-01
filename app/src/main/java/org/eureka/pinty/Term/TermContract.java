package org.eureka.pinty.Term;

import org.eureka.pinty.BasePresenter;
import org.eureka.pinty.BaseView;

/**
 * Created by QCheng on 2016/9/1.
 */
public interface TermContract {

    interface View extends BaseView<Presenter> {

        void showAddTerm();
    }

    interface Presenter extends BasePresenter {

        void addTerm();
    }

}
