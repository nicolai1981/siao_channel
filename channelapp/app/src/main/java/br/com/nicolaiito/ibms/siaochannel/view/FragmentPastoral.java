package br.com.nicolaiito.ibms.siaochannel.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.nicolaiito.ibms.siaochannel.R;

public class FragmentPastoral extends Fragment {
    public FragmentPastoral() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}
