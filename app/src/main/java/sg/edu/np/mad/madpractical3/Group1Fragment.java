package sg.edu.np.mad.madpractical3;  // Correct package

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class Group1Fragment extends Fragment {  // Class name matches file name
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_group1, container, false);  // Inflate layout for this fragment
    }
}
