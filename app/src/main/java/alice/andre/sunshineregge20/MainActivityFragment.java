package alice.andre.sunshineregge20;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//
//
//
//        return inflater.inflate(R.layout.fragment_main, container, false);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Wed - Cloudy",
                "Thur - Asteroids",
                "Fri - Heavy Rain",
                "Sat - HELP",
                "Sun - Sunny"
        };

        //Creo Array List de los climas desde arreglo estatico
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(), //contexto
//                android.R.layout.simple_list_item_1,
                R.layout.list_item_forecast, // layout que describe el row
                R.id.list_item_forecast_textview, // el elemento del row
                weekForecast // datos
        );

        //listView_forecast
        ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);
        listView.setAdapter(mForecastAdapter);
//        Toast.makeText(getActivity(), listView.getCount() + "", Toast.LENGTH_LONG).show();
        return rootView;
    }
}
