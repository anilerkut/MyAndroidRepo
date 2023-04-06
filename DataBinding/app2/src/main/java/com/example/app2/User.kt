package com.example.app2

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class User : BaseObservable() {

    @get : Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}