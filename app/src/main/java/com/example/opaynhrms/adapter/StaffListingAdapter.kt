package com.example.opaynhrms.adapter

import com.example.opaynhrms.R
import com.example.opaynhrms.base.KotlinBaseActivity
import com.example.opaynhrms.extensions.isNotNull
import com.example.opaynhrms.model.ListingModel
import com.example.opaynhrms.model.UserListJson
import com.example.opaynhrms.ui.AddUser
import com.example.opaynhrms.ui.StaffDetail
import com.example.opaynhrms.utils.Keys
import com.ieltslearning.base.BaseAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_staff.view.*


class StaffListingAdapter(val baseActivity: KotlinBaseActivity, val itemClick: (Int) -> Unit) :
    BaseAdapter<UserListJson.Data>(R.layout.item_list_staff)
{
    override fun onBindViewHolder(holder: IViewHolder, position: Int)
    {
        holder.itemView.apply {
            tvStaffleave_days.text=list[position].name
            if (list[position].roles.size>0)
            {
                tvStaffleave_type.text=list[position].roles[0].name
            }
            if (list[position].profile.isNotNull() &&list[position].profile.image.isNotNull())
            {
                Picasso.get().load(list[position].profile.image).placeholder(R.drawable.placeholder).into(ivStaffProfile)
            }
            ivdelete.setOnClickListener {
                itemClick(position)
            }
            ivedit.setOnClickListener {
                baseActivity.bundle.putSerializable(Keys.USERDATA,list[position])
                baseActivity.openA(AddUser::class,baseActivity.bundle)
            }
            clstaftListcontainer.setOnClickListener {
                baseActivity.bundle.putSerializable(Keys.USERDATA,list[position])
                baseActivity.openA(StaffDetail::class,baseActivity.bundle)
            }

        }
    }

}
