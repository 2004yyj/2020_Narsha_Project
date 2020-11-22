package com.example.guji.retroFit

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Model(
    @SerializedName("id")               // 고유 아이디
    var id: Int,

    @SerializedName("name")             // 위치 이름
    var name: String,

    @SerializedName("category")         // 위치 카테고리
    var category: String,

    @SerializedName("sub_category")     // 위치 카테고리(한국어)
    var sub_category: String,

    @SerializedName("address")          // 위치 주소
    var address: String,

    @SerializedName("image_url")        // 위치 이미지 URL
    var image_url: String?,

    @SerializedName("coord_x")          // 위치 x좌포
    var coord_x: Double,

    @SerializedName("coord_y")          // 위치 y좌표
    var coord_y: Double,

    @SerializedName("longitude")        // 위치 경도
    var longitude: Double,

    @SerializedName("latitude")         // 위치 위도
    var latitude: Double,
) : Parcelable {
    
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString().toString(),
            parcel.readString().toString(),
            parcel.readString().toString(),
            parcel.readString().toString(),
            parcel.readString().toString(),
            parcel.readDouble(),
            parcel.readDouble(),
            parcel.readDouble(),
            parcel.readDouble(),
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {

        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(category)
        parcel.writeString(sub_category)
        parcel.writeString(address)
        image_url?.let { parcel.writeString(it) }
        coord_x.let { parcel.writeDouble(it) }
        coord_y.let { parcel.writeDouble(it) }
        longitude.let { parcel.writeDouble(it) }
        latitude.let { parcel.writeDouble(it) }

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Model> {
        override fun createFromParcel(parcel: Parcel): Model {
            return Model(parcel)
        }

        override fun newArray(size: Int): Array<Model?> {
            return arrayOfNulls(size)
        }
    }
}