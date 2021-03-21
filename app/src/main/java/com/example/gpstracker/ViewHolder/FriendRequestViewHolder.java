package com.example.gpstracker.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gpstracker.R;

import de.hdodenhof.circleimageview.CircleImageView;
import com.example.gpstracker.Interface.IRecycItemListerner;


public class FriendRequestViewHolder extends RecyclerView.ViewHolder  {

    public TextView txt_user_email;
    public ImageView btn_accept,btn_decline;
    public CircleImageView friend_request_image;



    public FriendRequestViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_user_email = (TextView) itemView.findViewById(R.id.txt_user_email);

        btn_accept=(ImageView) itemView.findViewById(R.id.btn_accept);
        btn_decline=(ImageView) itemView.findViewById(R.id.btn_decline);
        friend_request_image=(CircleImageView)itemView.findViewById(R.id.new_friend_request_image);


    }


}