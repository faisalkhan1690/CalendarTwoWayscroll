package co.faisal.customtwowayscroll;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by faisal.khan on 30-03-2016.
 */
public class CustomTableAdapter extends BaseTableAdapter {

    private Context context;
    private List<String[]> list;
    private ArrayList<String> headers;
    private int itemHW;
    private int headerH;

    public CustomTableAdapter(Context context,List<String[]> list,ArrayList<String> headers,int headerH,int itemHW) {

        this.context=context;
        this.list=list;
        this.headers=headers;
        this.itemHW=itemHW;
        this.headerH=headerH;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return headers.size()-1;
    }

    @Override
    public View getView(int row, int column, View convertView, ViewGroup parent) {
        final View view;
        switch (getItemViewType(row, column)) {
            case 0:
                view = getFirstHeader(row, column, convertView, parent);
                break;
            case 1:
                view = getHeader(row, column, convertView, parent);
                break;
            case 2:
                view = getFirstBody(row, column, convertView, parent);
                break;
            case 3:
                view = getBody(row, column, convertView, parent);
                break;
            default:
                throw new RuntimeException("wtf?");
        }
        return view;
    }

    private View getFirstHeader(int row, int column, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_table_header_first, parent, false);
        }
        return convertView;
    }

    private View getHeader(int row, int column, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_table_header, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.tv_room_type)).setText(headers.get(column + 1));
        return convertView;
    }

    private View getFirstBody(int row, int column, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_table_first, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.tv_day)).setText(list.get(row)[column + 1]);
        return convertView;
    }

    private View getBody(int row, int column, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_table, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.tv_status)).setText(list.get(row)[column + 1]);
        return convertView;
    }


    @Override
    public int getWidth(int column) {
        return itemHW;
    }

    @Override
    public int getHeight(int row) {
        if (row == -1) {
            return headerH;
        } else {
            return itemHW;
        }
    }

    @Override
    public int getItemViewType(int row, int column) {
        final int itemViewType;
        if (row == -1 && column == -1) {
            itemViewType = 0;
        } else if (row == -1) {
            itemViewType = 1;
        }  else if (column == -1) {
            itemViewType = 2;
        } else {
            itemViewType = 3;
        }
        return itemViewType;
    }


    @Override
    public int getViewTypeCount() {
        return 5;
    }
}
