package com.example.countermvp

import com.example.countermvp.model.CounterModel
import com.example.countermvp.presenter.Presenter

class Injector {

    companion object{
        fun getPresenter():Presenter{
        return Presenter()
    }
        fun getModel():CounterModel{
            return CounterModel()

        }        }
}