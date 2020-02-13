package com.kotlin.mvvmkotlink.fragment


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kotlin.mvvmkotlink.R

/**
 * A simple [Fragment] subclass.
 */
class WorkFragment : Fragment() {
    private val TAG: String = "LifeCycleFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate WorkFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated WorkFragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView WorkFragment")
        return inflater.inflate(R.layout.fragment_work, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart WorkFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume WorkFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView WorkFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause WorkFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop WorkFragment")
    }
}
