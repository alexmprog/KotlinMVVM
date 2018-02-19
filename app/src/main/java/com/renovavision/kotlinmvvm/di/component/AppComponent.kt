package com.renovavision.kotlinmvvm.di.component

import com.renovavision.kotlinmvvm.App
import com.renovavision.kotlinmvvm.di.module.ActivityBuildersModule
import com.renovavision.kotlinmvvm.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuildersModule::class,
    AppModule::class
])

interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}