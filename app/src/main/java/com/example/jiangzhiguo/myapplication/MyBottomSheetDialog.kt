package com.example.jiangzhiguo.myapplication

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by jiangzhiguo on 18/9/15.
 */
class MyBottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_dialog,container,false)
    }
    override fun onDismiss(dialog: DialogInterface?) {
        super.onDismiss(dialog)
    }
}