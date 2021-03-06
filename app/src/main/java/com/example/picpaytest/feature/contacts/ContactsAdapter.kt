package com.example.picpaytest.feature.contacts

import android.view.View
import com.example.picpaytest.R
import com.example.picpaytest.base.BaseAdapter
import com.example.picpaytest.base.loadImage
import com.example.picpaytest.data.model.User
import kotlinx.android.synthetic.main.itemlist.view.*

class ContactsAdapter: BaseAdapter<User>() {
    override val layoutResource: Int
        get() = R.layout.itemlist

    override fun bind(itemView: View, item: User) {
        itemView.nameUser.text= item.name
        itemView.nickUser.text= item.username
        itemView.photoUser.loadImage(item.img)
    }
}