package com.renovavision.kotlinmvvm.di.module

import com.renovavision.kotlinmvvm.ui.users.ListUsersFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

@Module
interface FragmentBuildersModule {

    @ContributesAndroidInjector
    fun contributeListUsersFragment(): ListUsersFragment

}