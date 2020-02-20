package com.justmvp.presenter

import com.justmvp.model.Model
import com.justmvp.model.ModelContract
import com.justmvp.view.ViewContract

class Presenter {

    private var view : ViewContract? = null
    private val model : ModelContract = Model()


    fun attachView(view : ViewContract)
    {
        this.view = view
    }

    fun detachView ()
    {
        this.view = null
    }

    fun doWork()
    {
        val message = model.doJob()
        view?.showMessage(message)
    }



}