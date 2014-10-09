package verona1024.com.cafe.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import verona1024.com.cafe.R;

/**
 * Created by verona1024 on 09.10.14.
 */
public class BillFragment extends Fragment {

    public BillFragment (){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.page_bill_views, container, false);

        ListView list = (ListView) v.findViewById(R.id.listView);

        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity().getApplicationContext(),"Ура", Toast.LENGTH_LONG);
            }
        });
//        TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
//        tv.setText(getArguments().getString("msg"));

        return v;
    }
}