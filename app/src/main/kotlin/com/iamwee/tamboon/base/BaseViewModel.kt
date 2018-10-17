package com.iamwee.tamboon.base

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    protected val failure: LiveData<Exception> = MutableLiveData()

}