package ie.ul.libraryfinder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LibraryMap#newInstance} factory method to
 * create an instance of this fragment.
 */

/*
* Fragment used for map
*
* */
public class LibraryMap extends Fragment {


    public LibraryMap() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LibraryMap newInstance(String param1, String param2) {
        LibraryMap fragment = new LibraryMap();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library_map, container, false);
    }
}