package com.example.retrofitcountriesapp.data.domain.model.error

import com.example.retrofitcountriesapp.data.domain.model.BaseModel

class ErrorModel(
    var error: String = "unknow",
    var errorCode: String = "",
    var message: String = "unknow"
) : BaseModel()