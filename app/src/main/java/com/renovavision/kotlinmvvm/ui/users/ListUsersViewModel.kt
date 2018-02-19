package com.renovavision.kotlinmvvm.ui.users

import com.renovavision.kotlinmvvm.domain.model.User
import com.renovavision.kotlinmvvm.domain.repository.UserRepository
import com.renovavision.kotlinmvvm.ui.base.BaseViewModel
import com.renovavision.kotlinmvvm.utils.BaseScheduler
import javax.inject.Inject

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

class ListUsersViewModel
@Inject constructor(
        private val scheduler: BaseScheduler,
        private val userRepository: UserRepository
) : BaseViewModel<List<User>>() {

    override fun loadData() {
        userRepository.getUsers()
                .subscribeOn(scheduler.operation())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({ value ->
                    result.setValue(value)
                }, { throwable ->
                    result.setValue(null)
                })

    }

}