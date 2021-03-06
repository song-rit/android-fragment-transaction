package app.awitcha.fragmenttransaction;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button buttonNext;

    private static final String sTAG = AFragment.class.getSimpleName();

    public AFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AFragment newInstance(String param1, String param2) {
        AFragment fragment = new AFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate", sTAG);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("onCreateView", sTAG);
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.i("onViewCreated", sTAG);

        buttonNext = (Button) view.findViewById(R.id.button_next);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = BFragment.newInstance("", "");
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                transaction.replace(R.id.fragment_main, fragment);
                transaction.addToBackStack("A");
                transaction.commit();
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause", sTAG);

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume", sTAG);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("onActivityCreated", sTAG);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("onAttach", sTAG);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", sTAG);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.i("onDestroyView", sTAG);
    }

    public void onDetach() {
        super.onDetach();
        Log.i("onDetach", sTAG);
    }

    public void onStart() {
        super.onStart();
        Log.i("onStart", sTAG);
    }

    public void onStop() {
        super.onStop();
        Log.i("onStop", sTAG);
    }
}
