package com.noprom.materialdesignstudy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by noprom.
 */
public class SampleRecyclerAdapter extends RecyclerView.Adapter<SampleRecyclerAdapter.ViewHolder> {

    private final ArrayList<SampleModel> sampleData = DemoApp.getSampleData(20);


    /**
     * 创建控件
     *
     * @param viewGroup 父类的viewGroup
     * @param position  指定位置
     * @return 一个ViewHolder
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {

        // 获得列表项的控件(LinearLayout)

        // list_basic_item.xml 布局中只有一个LinearLayout
        // 这个LinearLayout中只有1个TextView
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_basic_item, viewGroup, false);

        return new ViewHolder(item);
    }


    /**
     * 绑定数据到控件
     *
     * @param viewHolder viewHolder
     * @param position   位置
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // 获得当前列表项的数据
        final SampleModel rowData = sampleData.get(position);

        // 设置要显示的数据
        viewHolder.mTextView.setText(rowData.getSampleText());
        viewHolder.itemView.setTag(rowData);
    }

    /**
     * 获得列表项的总数
     *
     * @return 列表项数目
     */
    @Override
    public int getItemCount() {
        return sampleData.size();
    }

    /**
     * 删除某个列表项的数据
     *
     * @param position 位置
     */
    public void removeData(int position) {
        sampleData.remove(position);
        // 通知RecyclerView某个控件已经被删除
        notifyItemRemoved(position);
    }

    /**
     * 在指定的位置的后面添加一个Item
     *
     * @param position 指定位置
     */
    public void addItem(int position) {
        sampleData.add(position, new SampleModel("新的列表项" + new Random().nextInt(10000)));
        // 通知RecyclerView控件插入了某个数据
        notifyItemInserted(position);
    }

    /**
     * ViewHolder 用来容纳数据
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textViewSample);
        }
    }
}
