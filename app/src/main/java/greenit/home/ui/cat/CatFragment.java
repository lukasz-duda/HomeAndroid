package greenit.home.ui.cat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import greenit.home.R;

public class CatFragment extends Fragment implements View.OnClickListener {

    private CatViewModel catViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        catViewModel = ViewModelProviders.of(this).get(CatViewModel.class);
        View root = inflater.inflate(R.layout.cat_fragment, container, false);
        final Button pee = root.findViewById(R.id.pee);
        pee.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "ok", Toast.LENGTH_SHORT).show();
    }
}
