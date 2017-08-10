package lynn.example.com.javalearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lynn on 2017/8/10.
 */

public class ListAdapter extends BaseAdapter{
    Context context;
    LayoutInflater inflater;
    String[] str;
    public ListAdapter(Context context, String[] arraylist) {
        this.context = context;
        str = arraylist;
    }
    @Override
    public int getCount() {
        return str.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        TextView text;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.list_item, parent, false);
        text = (TextView) itemView.findViewById(R.id.text1);
        text.setText(str[position]);

        return itemView;
    }
}
