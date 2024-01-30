package com.plcoding.contactscomposemultiplatform.contacts.domain

data class Contact(
    val id: Long? = null,
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val phoneNumber: String = "",
    val photoBytes: ByteArray? = null
)
