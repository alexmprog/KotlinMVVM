package com.renovavision.kotlinmvvm.di.module

import com.renovavision.kotlinmvvm.data.remote.Api
import com.renovavision.kotlinmvvm.domain.repository.UserRepository
import com.renovavision.kotlinmvvm.utils.BaseScheduler
import com.renovavision.kotlinmvvm.utils.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

@Module(includes = [(ViewModelModule::class)])
class AppModule {

    @Provides
    @Singleton
    fun provideApi(): Api {
        return Api()
    }

    @Provides
    @Singleton
    fun provideUserRepository(api: Api): UserRepository {
        return UserRepository(api)
    }

    @Provides
    @Singleton
    fun provideScheduler(): BaseScheduler {
        return SchedulerProvider()
    }

}