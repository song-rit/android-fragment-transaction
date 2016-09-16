package app.awitcha.fragmenttransaction;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class CFragment extends Fragment {

    private Button buttonBackToB;
    private Button buttonBackToA;

    private static final String sTAG = CFragment.class.getSimpleName();

    public static CFragment newInstance() {
        CFragment fragment = new CFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("onCreateView", sTAG);
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("onViewCreated", sTAG);

        buttonBackToB = (Button) view.findViewById(R.id.button_back_to_B_fragment_c);
        buttonBackToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.popBackStack("B", FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
        });

        buttonBackToA = (Button) view.findViewById(R.id.button_back_to_A_fragment_c);
        buttonBackToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.popBackStack("A", FragmentManager.POP_BACK_STACK_INCLUSIVE);
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
