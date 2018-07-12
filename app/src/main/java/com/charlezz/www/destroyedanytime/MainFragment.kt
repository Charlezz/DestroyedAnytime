package com.charlezz.www.destroyedanytime

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    val TAG = MainFragment::class.java.simpleName

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        print.setOnClickListener {
            result.text = edit_text.text
        }
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e(TAG,"onSaveInstanceState")
        outState.putString("my_text", result.text.toString())//TextView의 text를 저장
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e(TAG,"onViewStateRestored")
        result.text = savedInstanceState?.getString("my_text")//미리 저장해둔 text를 복구
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG,"onDestroyView")
    }
}