package com.sphydro.spaece_activity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sphydro.spaece_activity.Model.consultantDetail;
import com.sphydro.spaece_activity.R;

import java.util.List;

public class ConsultantDetailRecyclerView extends RecyclerView.Adapter<ConsultantDetailRecyclerView.ViewHolder>{
    List<consultantDetail> consultantDetailsList ;

    public ConsultantDetailRecyclerView(List<consultantDetail> consultantDetailsList) {
        this.consultantDetailsList = consultantDetailsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.consultant_detail_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConsultantDetailRecyclerView.ViewHolder holder, int position) {

        String username  = consultantDetailsList.get(position).getUserName();
        String licenseNo  = consultantDetailsList.get(position).getLicenceNo();
        String email  = consultantDetailsList.get(position).getEmail();
        String phoneNum  = consultantDetailsList.get(position).getPhoneNum();
        holder.UserName.setText(username);
        holder.LicenseNo.setText(licenseNo);
        holder.Email.setText(email);
        holder.PhoneNo.setText(phoneNum);
    }

    @Override
    public int getItemCount() {
        return consultantDetailsList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView UserName , LicenseNo , Email , PhoneNo ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            UserName = (TextView) itemView.findViewById(R.id.username);
            LicenseNo = (TextView) itemView.findViewById(R.id.licnesNo);
            Email = (TextView) itemView.findViewById(R.id.email);
            PhoneNo = (TextView) itemView.findViewById(R.id.phoneNo);
        }
    }

}
