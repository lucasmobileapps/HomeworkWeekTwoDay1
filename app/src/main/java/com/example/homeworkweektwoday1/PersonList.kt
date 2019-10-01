package com.example.homeworkweektwoday1

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PersonList(
    var Person1: String ,
    var Person2: String,
    var Person3: String ,
    var Person4: String ) : Parcelable
