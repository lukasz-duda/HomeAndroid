package greenit.home.ui.cat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import greenit.home.R;

public class CatFragment extends Fragment {

    private CatViewModel catViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        catViewModel = ViewModelProviders.of(this).get(CatViewModel.class);
        return inflater.inflate(R.layout.cat_fragment, container, false);
    }

}
