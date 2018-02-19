package com.renovavision.kotlinmvvm.ui.users

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.kotlinmvvm.R
import com.renovavision.kotlinmvvm.domain.model.User
import com.renovavision.kotlinmvvm.ui.base.BaseAdapter

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

class ListUsersAdapter constructor(list: List<User>) : BaseAdapter<User>(list) {

    override fun onCreateViewHolderBase(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ListUsersViewHolder(LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.list_users_item, parent, false))
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as ListUsersViewHolder).binding
        val user = list[position]
        binding.user = user
    }

}