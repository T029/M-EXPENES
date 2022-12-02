package vn.edu.greenwich.cw_1_sample;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.edu.greenwich.cw_1_sample.ui.info.AboutUsFragment;
import vn.edu.greenwich.cw_1_sample.ui.trip.TripRegisterFragment;
import vn.edu.greenwich.cw_1_sample.ui.trip.list.TripListFragment;

public class HomeFragment extends Fragment {

    public CardView cv2, cv3, cv4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        cv2 = (CardView) view.findViewById(R.id.cv2);
        cv3 = (CardView) view.findViewById(R.id.cv3);
        cv4 = (CardView) view.findViewById(R.id.cv4);

//        cv2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragment, new TripRegisterFragment())
//                        .commit();
//            }
//        });
//
//        cv3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragmentContainerView, new TripListFragment())
//                        .commit();
//            }
//        });
//
//        cv4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragmentContainerView, new AboutUsFragment())
//                        .commit();
//            }
//        });

        return view;
    }
}