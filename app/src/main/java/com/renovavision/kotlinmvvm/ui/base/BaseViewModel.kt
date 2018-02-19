package com.renovavision.kotlinmvvm.ui.base;

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

abstract class BaseViewModel<T> : ViewModel() {

    val result: MutableLiveData<T> = MutableLiveData()

    val loadingStatus: MutableLiveData<Boolean> = MutableLiveData()

    abstract fun loadData()

}
