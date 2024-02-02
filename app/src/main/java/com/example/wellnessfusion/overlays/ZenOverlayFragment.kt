package com.example.wellnessfusion.overlays

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import com.example.wellnessfusion.R

@Suppress("DEPRECATION")
class ZenOverlayFragment : DialogFragment() {

    override fun onCreateView (
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.zen_layout, container, false)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dialog?.window?.apply {
            addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            setDimAmount(0.5f)
        }
        val selectexsbtnZen = view?.findViewById<View>(R.id.buttonSelectZen)

        selectexsbtnZen?.setOnClickListener {
            dismiss()
        }
    }
}