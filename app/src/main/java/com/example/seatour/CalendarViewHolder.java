package com.example.seatour;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public final TextView dayOfMonth;
    private final CalendarAdapter.OnItemListener onItemListener;
    public CalendarViewHolder(@NonNull View itemView, CalendarAdapter.OnItemListener onItemListener)
    {
        super(itemView);
        dayOfMonth = itemView.findViewById(R.id.cellDayText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        onItemListener.onItemClick(getAdapterPosition(), (String) dayOfMonth.getText());
    }
}