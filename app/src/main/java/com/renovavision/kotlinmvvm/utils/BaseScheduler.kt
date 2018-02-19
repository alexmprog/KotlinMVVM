package com.renovavision.kotlinmvvm.utils;

import io.reactivex.Scheduler;

interface BaseScheduler {

	fun operation(): Scheduler

    fun ui(): Scheduler

}