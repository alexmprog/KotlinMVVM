package com.renovavision.kotlinmvvm.di.module;

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.renovavision.kotlinmvvm.di.keys.ViewModelKey
import com.renovavision.kotlinmvvm.ui.base.ViewModelFactory
import com.renovavision.kotlinmvvm.ui.users.ListUsersViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ListUsersViewModel::class)
    fun bindListUsersViewModel(listUsersViewModel: ListUsersViewModel): ViewModel

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}