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
class HomeFragment : Fragment() {
    private val TAG:String = "LifeCycleFragment"
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop HomeFragment")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate HomeFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated HomeFragment")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart HomeFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume HomeFragment")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView HomeFragment")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView HomeFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause HomeFragment")
    }
}
