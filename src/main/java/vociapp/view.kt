package vociapp

import java.util.*

interface View {
    fun showInitialMenue()
    fun showAddMenue()
    fun showRemoveMenue()
    fun vociUpdated(fremdsprache:String)
}

