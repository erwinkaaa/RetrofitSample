package com.example.retrofitsample

data class UserModel (val id:Int,
                      val name:String,
                      val username:String,
                      val email:String,
                      val address:UserAddressModel,
                      val phone:String,
                      val website:String,
                      val company:UserCompanyModel)

data class UserAddressModel (val street:String,
                             val suite:String,
                             val city:String,
                             val zipcode:String,
                             val geo:UserAddressGeoModel)

data class UserAddressGeoModel (val lat:String,
                                val lng:String)

data class UserCompanyModel (val name:String,
                             val catchPhrase:String,
                             val bs:String)