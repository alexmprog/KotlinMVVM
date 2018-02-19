package com.renovavision.kotlinmvvm.ui.users

import android.support.v7.widget.RecyclerView
import android.view.View
import android.databinding.DataBindingUtil
import com.renovavision.kotlinmvvm.databinding.ListUsersItemBinding

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

class ListUsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding: ListUsersItemBinding = DataBindingUtil.bind(view)

}