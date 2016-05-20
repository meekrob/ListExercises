package madman.david.listexercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by david on 5/20/16.
 */
public class ComputersArrayAdapter extends ArrayAdapter{
    private Context context;
    //private ArrayList<Computers> arrayList;
    private int resource;
    private LayoutInflater inflater;

    public ComputersArrayAdapter(Context context, int resourceId, List objects) {
        super(context, resourceId, objects);
        this.resource = resourceId;
        this.context = context;
        //this.arrayList = objects;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View instantiatedRow, ViewGroup parent) {

        ComputerHolder holder;
        if (instantiatedRow == null) { // if row hasn't been created
            // create the row UI
            instantiatedRow = inflater.inflate(resource, null);
            holder = new ComputerHolder(instantiatedRow);
            instantiatedRow.setTag(holder);
        }
        else {

            holder = (ComputerHolder)instantiatedRow.getTag();
        }

        //Computers computer = arrayList.get(position);
        Computers computer = (Computers) getItem(position);
        holder.populateFrom(computer);


        return instantiatedRow;
    }

    static class ComputerHolder {
        TextView primaryText = null;
        TextView secondaryText = null;
        ComputerHolder(View row) {
            primaryText = (TextView)row.findViewById(R.id.primaryText);
            secondaryText = (TextView)row.findViewById(R.id.secondaryText);
        }

        void populateFrom(Computers computer) {
            primaryText.setText(computer.os);
            secondaryText.setText(computer.type);
        }
    }


}
