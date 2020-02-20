package com.justmvp.model

import android.os.Handler

class Model : ModelContract {
    override fun doJob(): String {
        return "Job finished"
    }
}