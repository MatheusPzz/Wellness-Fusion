package com.example.wellnessfusion.overlays

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import com.example.wellnessfusion.R

@Suppress("DEPRECATION")
class PhysicalOverlayFragment : DialogFragment() {

    override fun onCreateView (
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.physical_overlay, container, false)
    }

    @SuppressLint("SuspiciousIndentation")
    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dialog?.window?.apply {
            addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            setDimAmount(0.5f)
        }
        val selectexsbtnPhys = view?.findViewById<View>(R.id.buttonSelect)

            selectexsbtnPhys?.setOnClickListener {
            dismiss()
        }
    }
}