package com.renovavision.kotlinmvvm.di.module

import com.renovavision.kotlinmvvm.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

@Module
interface ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    fun contributeMainActivity(): MainActivity

}