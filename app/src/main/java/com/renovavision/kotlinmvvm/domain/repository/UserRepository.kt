package com.renovavision.kotlinmvvm.domain.repository;

import com.renovavision.kotlinmvvm.data.remote.Api
import com.renovavision.kotlinmvvm.domain.model.User
import io.reactivex.Single
import javax.inject.Inject

class UserRepository @Inject constructor(private val api: Api) {

    fun getUsers(): Single<MutableList<User>> {
        return api.fetchUsers()
    }

}