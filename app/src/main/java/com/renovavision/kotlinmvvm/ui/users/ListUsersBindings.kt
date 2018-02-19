package com.renovavision.kotlinmvvm.ui.users

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.renovavision.kotlinmvvm.domain.model.User

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

object ListUsersBindings {

    @JvmStatic
    @BindingAdapter("load_users")
    fun loadUsers(recyclerView: RecyclerView, users: List<User>?) {
        recyclerView.adapter = if (users != null) ListUsersAdapter(users) else ListUsersAdapter(emptyList())
    }

    @JvmStatic
    @BindingAdapter("load_user_avatar")
    fun loadUserAvatar(imageView: ImageView, user: User?) {
        Glide.with(imageView.context)
                .load(user?.avatar)
                .into(imageView)
    }

}